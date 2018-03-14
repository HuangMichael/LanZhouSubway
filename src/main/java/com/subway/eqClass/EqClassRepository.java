package com.subway.eqClass;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 设备分类
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface EqClassRepository extends JpaRepository<EqClass, Long> {


    /**
     * @param name
     * @param status
     * @return
     */
    List<EqClass> findByNameContainingAndStatus(String name,String status);




    /**
     * @param name
     * @param status
     * @param pageable
     * @return
     */
    Page<EqClass> findByNameContainingAndStatus(String name, String status, Pageable pageable);
}
