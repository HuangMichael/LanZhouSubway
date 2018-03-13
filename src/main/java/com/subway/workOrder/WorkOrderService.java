package com.subway.workOrder;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.subway.equipment.Equipment;
import com.subway.equipment.EquipmentRepository;
import com.subway.location.Location;
import com.subway.location.LocationRepository;
import com.subway.service.app.BaseService;
import com.subway.service.reportFix.WorkOrderReport;
import com.subway.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.subway.service.commonData.CommonDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.subway.object.ReturnObject;

import static com.subway.utils.ConstantUtils.*;


/**
 * ������Ϣҵ����
 *
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
    WorkOrderRepository workOrderRepository;


    @Autowired
    CommonDataService commonDataService;

    public List
            <WorkOrder> findAll() {
        return workOrderRepository.findAll();
    }


    public Page<WorkOrder> findAll(Pageable pageable) {
        return workOrderRepository.findAll(pageable);
    }


    /**
     * @param id id
     * @return ����idɾ������
     */
    public ReturnObject delete(Long id) {
        workOrderRepository.delete(id);
        WorkOrder workOrder = workOrderRepository.getOne(id);
        return commonDataService.getReturnType(workOrder == null, DELETE_SUCCESS, DELETE_FAILURE);
    }


    /**
     * @param workOrder
     * @return ������Ϣ
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
     * @param type 报修方式 按照设备报修  按照位置报修
     * @param id
     * @param orderDesc
     * @param reporter
     * @return
     */
    public WorkOrder reportFix(String type, Long id, String orderDesc, String reporter) {

        Equipment equipment;
        Location location = null;
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
        } else {
            location = locationRepository.getOne(id);
            workOrder.setLocation(location);
        }

        workOrder.setLocation(location);
        workOrder.setReportTime(DateUtils.convertDate2Str(new Date(), "yyyy-MM-dd HH:mm:ss"));
        workOrder.setReporter(reporter);
        workOrder.setStatus("1");
        workOrder.setOrderState("0");
        return workOrderRepository.save(workOrder);
    }
}
