package com.subway.ecBudget;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/

public interface EcBudgetRepository extends JpaRepository<EcBudget, Long> {


    /**
     * @param purpose 申请原因
     * @param status 状态
     * @return
     */
    List<EcBudget> findByPurposeContainingAndStatus(String purpose, String status);



    /**
     * @param purpose 申请原因
     * @param status 状态
     * @return
     */
    Page<EcBudget> findByPurposeContainingAndStatus(String purpose, String status, Pageable pageable);






}
