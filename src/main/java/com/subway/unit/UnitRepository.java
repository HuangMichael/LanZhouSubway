package com.subway.unit;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * 外委单位数据接口
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-13
 */

public interface UnitRepository extends JpaRepository<Unit, Long> {

    /**
     * @param name
     * @param status
     * @return
     */
    List<Unit> findByNameContainingAndStatus(String name, String status);


    /**
     * @param name
     * @param status
     * @param pageable
     * @return
     */
    Page<Unit> findByNameContainingAndStatus(String name, String status, Pageable pageable);

}
