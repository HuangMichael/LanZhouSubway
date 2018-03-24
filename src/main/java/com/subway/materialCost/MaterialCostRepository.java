package com.subway.materialCost;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 物料消耗数据库访问接口
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface MaterialCostRepository extends JpaRepository<MaterialCost, Long> {

    /**
     * @param ecName
     * @param status
     * @param authKey
     * @return
     */
    List<MaterialCost> findByEcNameContainingAndStatusAndAuthKeyStartingWith(String ecName, String status, String authKey);



    /**
     * @param ecName
     * @param status
     * @param authKey
     * @param pageable
     * @return
     */
    Page<MaterialCost> findByEcNameContainingAndStatusAndAuthKeyStartingWith(String ecName, String status, String authKey, Pageable pageable);

}
