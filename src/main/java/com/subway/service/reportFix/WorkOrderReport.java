package com.subway.service.reportFix;

import com.subway.workOrder.WorkOrder;

/**
 * 报修
 */
public interface WorkOrderReport {


    /**
     * @param type 报修方式 按照设备报修s 按照位置报修 w
     * @param id
     * @param orderDesc
     * @param reporter
     * @param eqClassId
     * @return
     */
    WorkOrder reportFix(String type, Long id,String orderDesc, String reporter, Long eqClassId);

}
