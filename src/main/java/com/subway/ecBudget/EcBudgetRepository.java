package com.subway.ecBudget;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface EcBudgetRepository extends JpaRepository<EcBudget, Long> {


    /**
     * @param purpose 申请原因
     * @param status  状态
     * @return
     */
    List<EcBudget> findByEcNameContainingAndStatusAndAuthKeyContaining(String purpose, String status, String authKey);


    /**
     * @param purpose 申请原因
     * @param status  状态
     * @return
     */
    Page<EcBudget> findByEcNameContainingAndStatusAndAuthKeyContaining(String purpose, String status, String authKey, Pageable pageable);


}
