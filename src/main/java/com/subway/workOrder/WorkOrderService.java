package com.subway.workOrder;

import com.subway.eqClass.EqClass;
import com.subway.eqClass.EqClassRepository;
import com.subway.equipment.Equipment;
import com.subway.equipment.EquipmentRepository;
import com.subway.location.Location;
import com.subway.location.LocationRepository;
import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import com.subway.service.reportFix.WorkOrderReport;
import com.subway.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.subway.utils.ConstantUtils.*;


/**
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class WorkOrderService extends BaseService implements WorkOrderReport {


    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    LocationRepository locationRepository;


    @Autowired
    EqClassRepository eqClassRepository;

    @Autowired
    WorkOrderRepository workOrderRepository;

    @Autowired
    CommonDataService commonDataService;


    /**
     * @param id
     * @return
     */
    public ReturnObject delete(Long id) {
        workOrderRepository.delete(id);
        WorkOrder workOrder = workOrderRepository.getOne(id);
        return commonDataService.getReturnType(workOrder == null, DELETE_SUCCESS, DELETE_FAILURE);
    }


    /**
     * @param workOrder
     * @return
     */
    public ReturnObject save(WorkOrder workOrder) {
        workOrder = workOrderRepository.save(workOrder);
        return commonDataService.getReturnType(workOrder != null, SAVE_SUCCESS, SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public WorkOrder findById(Long id) {
        return workOrderRepository.getOne(id);
    }

    /**
     * @param type      报修方式 按照设备报修  按照位置报修
     * @param id        设备id
     * @param orderDesc 故障描述
     * @param reporter  报修人
     * @return
     */
    public WorkOrder reportFix(String type, Long id, String orderDesc, String reporter, Long eqClassId) {

        Equipment equipment;
        Location location;
        EqClass eqClass = null;
        //创建 一个工单
        String orderLineNo = DateUtils.convertDate2Str(new Date(), "yyyyMMddHHmmss");
        WorkOrder workOrder = new WorkOrder();
        workOrder.setAuthKey("01");
        workOrder.setCreator("huangbin");
        workOrder.setOrderDesc(orderDesc);
        workOrder.setExpired(false);
        workOrder.setOrderLineNo(orderLineNo);
        if (type.equals("s")) {
            equipment = equipmentRepository.findOne(id);
            workOrder.setEquipment(equipment);
            workOrder.setEqClass(equipment.getEqClass());
            workOrder.setLocation(equipment.getLocation());
        } else if (type.equals("w")) {
            eqClass = eqClassRepository.getOne(eqClassId);
            location = locationRepository.getOne(id);
            workOrder.setLocation(location);
            workOrder.setEqClass(eqClass);
        }

        workOrder.setReportType(type);
        workOrder.setReportTime(DateUtils.convertDate2Str(new Date(), "yyyy-MM-dd HH:mm:ss"));
        workOrder.setReporter(reporter);
        workOrder.setStatus("1");
        workOrder.setOrderState("0");
        return workOrderRepository.save(workOrder);
    }
}
