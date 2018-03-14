package com.subway.budget;

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
* 采购申请业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class BudgetService extends BaseService {


@Autowired
BudgetRepository budgetRepository;


@Autowired
CommonDataService commonDataService;

public List
<Budget> findAll() {
return  budgetRepository.findAll();
}


public Page< Budget> findAll(Pageable pageable) {
return  budgetRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
budgetRepository.delete(id);
Budget budget = budgetRepository.getOne(id);
return commonDataService.getReturnType(budget == null, DELETE_SUCCESS, DELETE_FAILURE);
}


/**
* @param budget
* @return 保存信息
*/
public ReturnObject save(Budget budget) {

budget = budgetRepository.save(budget);
return commonDataService.getReturnType(budget != null, SAVE_SUCCESS, SAVE_FAILURE);
}


public  Budget findById(Long id) {
return  budgetRepository.getOne(id);
}

}
