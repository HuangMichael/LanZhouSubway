package com.subway.eqClass;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


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
    List<EqClass> findByNameContainingAndStatus(String name, String status);


    /**
     * @param name
     * @param status
     * @param pageable
     * @return
     */
    Page<EqClass> findByNameContainingAndStatus(String name, String status, Pageable pageable);


    /**
     * @param classLevel 级别
     * @param status     状态
     * @return
     */
    List<EqClass> findByClassLevelGreaterThanAndStatus(Long classLevel, String status);
}
