package com.subway.preMaintPlan;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
* 预防性维护计划数据库访问接口
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/

public interface PreMaintPlanRepository extends JpaRepository<PreMaintPlan, Long> {


    /**
     * @param planDesc
     * @param status
     * @return
     */
    List<PreMaintPlan>  findByPlanDescContainingAndStatus(String planDesc,String status);



    /**
     * @param planDesc
     * @param status
     * @param pageable
     * @return
     */
    Page<PreMaintPlan> findByPlanDescContainingAndStatus(String planDesc, String status, Pageable pageable);



}
