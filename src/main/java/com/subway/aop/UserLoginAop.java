package com.subway.aop;


import com.subway.domain.log.UserLog;
import com.subway.domain.user.User;
import com.subway.domain.userLog.UserLogService;
import com.subway.eqAppend.EqAppend;
import com.subway.eqUpdate.EqUpdate;
import com.subway.object.ReturnObject;
import com.subway.service.user.UserService;
import com.subway.utils.ConstantUtils;
import com.subway.utils.DateUtils;
import com.subway.workOrder.WorkOrder;
import com.subway.workOrderLog.WorkOrderLog;
import com.subway.workOrderLog.WorkOrderLogService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 用户日志aop
 */
@Component
@Aspect
@Slf4j
public class UserLoginAop {
    @Autowired
    UserLogService userLogService;

    @Autowired
    WorkOrderLogService workOrderLogService;


    @Autowired
    UserService userService;

    /**
     * @param joinPoint   结合点
     * @param loginResult 登录结果
     */
    @AfterReturning(value = "execution(* com.subway.controller.app.LoginController.login(..))", returning = "loginResult")
    public void doAfterReturningAdvice(JoinPoint joinPoint, Object loginResult) {
        String userName = (String) joinPoint.getArgs()[1];
        log.info("userName------------" + userName);
        ReturnObject returnObject = (ReturnObject) loginResult;
        boolean result = returnObject.getResult();
        Object[] args = joinPoint.getArgs();
        HttpServletRequest request = (HttpServletRequest) args[0];
        String ip = request.getRemoteHost();
        UserLog userLog = new UserLog();
        userLog.setUserName(userName);
        userLog.setLoginIp(ip);
        userLog.setOperation("登录");
        userLog.setOperationTime(new Date());
        userLog.setStatus(result ? "登录成功" : "登录失败");
        userLogService.createUserLog(userLog);
    }


    /**
     * 前置通知，方法调用前被调用
     *
     * @param joinPoint
     */
    @Before(value = "execution(* com.subway.controller.app.LoginController.logout(..))")
    public void doBeforeAdvice(JoinPoint joinPoint) {
//        //获取目标方法的参数信息
//        Object[] obj = joinPoint.getArgs();
//        HttpServletRequest request = (HttpServletRequest) obj[0];
//        String ip = request.getRemoteHost();
//        HttpSession session = request.getSession();
//        User user = (User) session.getAttribute("user");
//        UserLog userLog = new UserLog();
//        userLog.setUserName(user.getUserName());
//        userLog.setLoginIp(ip);
//        userLog.setOperation("退出");
//        userLog.setOperationTime(new Date());
//        userLog.setStatus("退出系统");
//        userLogService.createUserLog(userLog);
    }


    /**
     * @param joinPoint    结合点
     * @param returnObject
     */
    @AfterReturning(value = "execution(* com.subway.workOrder.WorkOrderController.reportFix(..))", returning = "returnObject")
    public void writeWorkOrderReportLog(JoinPoint joinPoint, ReturnObject returnObject) {
        Object[] args = joinPoint.getArgs();
        String type = (String) args[0];
        WorkOrder workOrder = (WorkOrder) returnObject.getObject();
        WorkOrderLog workOrderLog = new WorkOrderLog();
        if (type.equals("w")) {
            workOrderLog.setContent(workOrder.getLocation().getLocName() + "[" + workOrder.getOrderDesc() + "]" + "设备报修");
        } else if (type.equals("s")) {
            workOrderLog.setContent(workOrder.getEquipment().getLocation().getLocName() + "[" + workOrder.getOrderDesc() + "]" + "位置报修");
        }
        workOrderLog.setAuthKey("BJ10");
        workOrderLog.setCreator("huangbin");
        workOrderLog.setOrderState("0");
        workOrderLog.setOrderStateTime(DateUtils.convertDate2Str(new Date(), "yyyy-MM-dd HH:mm:ss"));
        workOrderLog.setWorkOrder(workOrder);
        workOrderLog.setSortNo(1l);
        workOrderLog.setStatus("1");
        workOrderLogService.save(workOrderLog);
    }


    /**
     * @param joinPoint    结合点
     * @param returnObject
     */
    @AfterReturning(value = "execution(* com.subway.workOrder.WorkOrderController.removeReport(..))", returning = "returnObject")
    public void writeWorkOrderAbortLog(JoinPoint joinPoint, ReturnObject returnObject) {
        Object[] args = joinPoint.getArgs();
        String reason = (String) args[1];
        WorkOrder workOrder = (WorkOrder) returnObject.getObject();
        WorkOrderLog workOrderLog = new WorkOrderLog();
        workOrderLog.setContent("工单" + workOrder.getOrderLineNo() + reason + "已取消");
        workOrderLog.setAuthKey("BJ10");
        workOrderLog.setCreator("huangbin");
        workOrderLog.setOrderState(ConstantUtils.ORDER_STATUS_ABORTED);
        workOrderLog.setOrderStateTime(DateUtils.convertDate2Str(new Date(), "yyyy-MM-dd HH:mm:ss"));
        workOrderLog.setWorkOrder(workOrder);
        workOrderLog.setSortNo(1l);
        workOrderLog.setStatus("1");
        workOrderLogService.save(workOrderLog);
    }

    /**
     * @param joinPoint
     */
    @Before(value = "execution(* com.subway.eqUpdate.EqUpdateController.save(..))")
    public void writeAuthKeyBeforeSave(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        EqUpdate eqUpdate = (EqUpdate) args[0];
        log.info(args[0].getClass().getName());
        eqUpdate.setAuthKey("BJ10");
        eqUpdate.setStatus(ConstantUtils.STATUS_YES);
        log.info("set authKey before save");
    }


    /**
     * @param joinPoint
     */
    @Before(value = "execution(* com.subway.eqAppend.EqAppendController.save(..))")
    public void writeAuthKeyBeforeSaveEqAppend(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        EqAppend append = (EqAppend) args[0];
        log.info(args[0].getClass().getName());
        append.setAuthKey("BJ10");
        append.setStatus(ConstantUtils.STATUS_YES);
        log.info("set authKey before save");
    }


    /**
     * @param joinPoint
     */
    @Before(value = "execution(* com.subway.controller.user.UserController.save(..))")
    public void writeAuthKeyBeforeSaveUser(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        User user = (User) args[0];
        log.info(args[0].getClass().getName());
        if (user.getPassword() == null || user.getPassword().equals("")) {
            user.setPassword("e10adc3949ba59abbe56e057f20f883e");
        }
        user.setAuthKey("BJ10");
        user.setStatus(ConstantUtils.STATUS_YES);
        log.info("set authKey before save");
    }


}
