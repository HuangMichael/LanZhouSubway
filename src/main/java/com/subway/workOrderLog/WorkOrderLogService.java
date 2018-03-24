package com.subway.workOrderLog;

import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.subway.utils.ConstantUtils.*;


/**
 * 工单日志信息业务类
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class WorkOrderLogService extends BaseService {


    @Autowired
    WorkOrderLogRepository workOrderLogRepository;


    @Autowired
    CommonDataService commonDataService;


    /**
     * @param id id
     * @return 根据id删除对象
     */
    public ReturnObject delete(Long id) {
        workOrderLogRepository.delete(id);
        WorkOrderLog workOrderLog = workOrderLogRepository.getOne(id);
        return commonDataService.getReturnType(workOrderLog == null, DELETE_SUCCESS, DELETE_FAILURE);
    }


    /**
     * @param workOrderLog
     * @return 保存信息
     */
    public ReturnObject save(WorkOrderLog workOrderLog) {

        workOrderLog = workOrderLogRepository.save(workOrderLog);
        return commonDataService.getReturnType(workOrderLog != null, SAVE_SUCCESS, SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public WorkOrderLog findById(Long id) {
        return workOrderLogRepository.getOne(id);
    }

}
