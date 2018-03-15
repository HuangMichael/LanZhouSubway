package com.subway.preMaintPlan;

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
* 预防性维护计划业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class PreMaintPlanService extends BaseService {


@Autowired
PreMaintPlanRepository preMaintPlanRepository;


@Autowired
CommonDataService commonDataService;

public List
<PreMaintPlan> findAll() {
return  preMaintPlanRepository.findAll();
}


public Page< PreMaintPlan> findAll(Pageable pageable) {
return  preMaintPlanRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
preMaintPlanRepository.delete(id);
PreMaintPlan preMaintPlan = preMaintPlanRepository.getOne(id);
return commonDataService.getReturnType(preMaintPlan == null, DELETE_SUCCESS, DELETE_FAILURE);
}


/**
* @param preMaintPlan
* @return 保存信息
*/
public ReturnObject save(PreMaintPlan preMaintPlan) {

preMaintPlan = preMaintPlanRepository.save(preMaintPlan);
return commonDataService.getReturnType(preMaintPlan != null, SAVE_SUCCESS, SAVE_FAILURE);
}


public  PreMaintPlan findById(Long id) {
return  preMaintPlanRepository.getOne(id);
}

}
