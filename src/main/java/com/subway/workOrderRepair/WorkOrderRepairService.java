package com.subway.workOrderRepair;

import com.subway.equipment.EquipmentRepository;
import com.subway.location.LocationRepository;
import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import com.subway.workOrder.WorkOrder;
import com.subway.workOrder.WorkOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.subway.utils.ConstantUtils.*;


/**
 * 查询维修单信息
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class WorkOrderRepairService extends BaseService {


    @Autowired
    EquipmentRepository equipmentRepository;


    @Autowired
    LocationRepository locationRepository;


    @Autowired
    WorkOrderRepository workOrderRepository;


    @Autowired
    CommonDataService commonDataService;


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

}
