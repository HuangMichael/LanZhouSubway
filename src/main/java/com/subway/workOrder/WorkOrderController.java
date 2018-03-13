package com.subway.workOrder;

import com.subway.controller.common.BaseController;
import com.subway.domain.app.MyPage;
import com.subway.service.app.ResourceService;
import com.subway.utils.ConstantUtils;
import com.subway.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.subway.object.ReturnObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * ������Ϣ
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/workOrder")
public class WorkOrderController extends BaseController {

    @Autowired
    ResourceService resourceService;
    @Autowired
    WorkOrderService workOrderService;
    @Autowired
    WorkOrderSearchService workOrderSearchService;


    @RequestMapping(value = "/data", method = RequestMethod.POST)
    @ResponseBody
    public MyPage data(HttpSession session, HttpServletRequest request, @RequestParam(value = "current", defaultValue = "0") int current, @RequestParam(value = "rowCount", defaultValue = "10") Long rowCount, @RequestParam(value = "searchPhrase", required = false) String searchPhrase) {
        Map
                <String, String[]> parameterMap = request.getParameterMap();
        Pageable pageable = new PageRequest(current - 1, rowCount.intValue(), super.getSort(parameterMap));
        return new PageUtils().searchBySortService(workOrderSearchService, searchPhrase, 1, current, rowCount, pageable);
    }


    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    @ResponseBody
    public WorkOrder findById(@PathVariable("id") Long id) {
        return workOrderService.findById(id);
    }


    /**
     * @param id
     * @return ɾ����Ϣ
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ReturnObject delete(@PathVariable("id") Long id) {
        return workOrderService.delete(id);
    }


    /**
     * @param workOrder ��Ϣ
     * @return ������Ϣ
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public ReturnObject save(WorkOrder workOrder) {
        return workOrderService.save(workOrder);
    }


    @ResponseBody
    @RequestMapping(value = "/exportExcel", method = RequestMethod.GET)
    public void exportExcel(HttpServletRequest request, HttpServletResponse response, @RequestParam("param") String param, @RequestParam("docName") String docName, @RequestParam("titles") String titles[], @RequestParam("colNames") String[] colNames) {
        List<WorkOrder> dataList = workOrderSearchService.findByConditions(param, 2);
        workOrderService.setDataList(dataList);
        workOrderService.exportExcel(request, response, docName, titles, colNames);
    }


    /**
     * @param type      报修类别
     * @param id        id
     * @param orderDesc 报修描述
     * @param reporter  报修人
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/reportFix", method = RequestMethod.POST)
    public ReturnObject reportFix(@RequestParam("type") String type, @RequestParam("id") Long id, @RequestParam("orderDesc") String orderDesc, @RequestParam("reporter") String reporter) {
        WorkOrder workOrder = workOrderService.reportFix(type, id, orderDesc, reporter);
        return commonDataService.getReturnType(workOrder != null, ConstantUtils.REPORT_FIX_SUCCESS, ConstantUtils.REPORT_FIX_FAILURE);
    }


}
