package com.subway.ecBudget;

import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.subway.utils.ConstantUtils.*;


/**
 * �ɹ�����ҵ����
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class EcBudgetService extends BaseService {


    @Autowired
    EcBudgetRepository ecBudgetRepository ;


    @Autowired
    CommonDataService commonDataService;

    public List<EcBudget> findAll() {
        return budgetRepository.findAll();
    }


    public Page<EcBudget> findAll(Pageable pageable) {
        return budgetRepository.findAll(pageable);
    }


    /**
     * @param id
     * @return
     */
    public ReturnObject delete(Long id) {
        budgetRepository.delete(id);
        EcBudget budget = budgetRepository.getOne(id);
        return commonDataService.getReturnType(budget == null, DELETE_SUCCESS, DELETE_FAILURE);
    }


    /**
     * @param budget
     * @return
     */
    public ReturnObject save(EcBudget budget) {

        budget = budgetRepository.save(budget);
        return commonDataService.getReturnType(budget != null, SAVE_SUCCESS, SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public EcBudget findById(Long id) {
        return budgetRepository.getOne(id);
    }

}
