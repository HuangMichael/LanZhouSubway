package com.subway.woMaterialCost;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface WoMaterialCostRepository extends JpaRepository<WoMaterialCost, Long> {


    /**
     * @param ecName
     * @param status
     * @param authKey
     * @return
     */
    List<WoMaterialCost> findByEcNameContainingAndStatusAndAuthKeyStartingWith(String ecName, String status, String authKey);


    /**
     * @param ecName
     * @param status
     * @param authKey
     * @param pageable
     * @return
     */
    Page<WoMaterialCost> findByEcNameContainingAndStatusAndAuthKeyStartingWith(String ecName, String status, String authKey, Pageable pageable);

}




