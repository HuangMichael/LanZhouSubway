package com.subway.workOrderLog;

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

public List
<WorkOrderLog> findAll() {
return  workOrderLogRepository.findAll();
}


public Page< WorkOrderLog> findAll(Pageable pageable) {
return  workOrderLogRepository.findAll(pageable);
}


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


public  WorkOrderLog findById(Long id) {
return  workOrderLogRepository.getOne(id);
}

}
