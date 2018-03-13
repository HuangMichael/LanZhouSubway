package com.subway.workOrder;

import java.util.List;
import java.util.Map;

import com.subway.service.app.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import com.subway.service.commonData.CommonDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.subway.object.ReturnObject;
import static com.subway.utils.ConstantUtils.*;


/**
* 工单信息业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class WorkOrderService extends BaseService {


@Autowired
WorkOrderRepository workOrderRepository;


@Autowired
CommonDataService commonDataService;

public List
<WorkOrder> findAll() {
return  workOrderRepository.findAll();
}


public Page< WorkOrder> findAll(Pageable pageable) {
return  workOrderRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
workOrderRepository.delete(id);
WorkOrder workOrder = workOrderRepository.getOne(id);
return commonDataService.getReturnType(workOrder == null, DELETE_SUCCESS, DELETE_FAILURE);
}


/**
* @param workOrder
* @return 保存信息
*/
public ReturnObject save(WorkOrder workOrder) {

workOrder = workOrderRepository.save(workOrder);
return commonDataService.getReturnType(workOrder != null, SAVE_SUCCESS, SAVE_FAILURE);
}


public  WorkOrder findById(Long id) {
return  workOrderRepository.getOne(id);
}

}
