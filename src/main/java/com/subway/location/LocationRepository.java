package com.subway.location;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 位置名称数据接口类
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-12
 */

public interface LocationRepository extends JpaRepository<Location, Long> {


    /**
     * @param locName 位置名称
     * @param status  状态
     * @param authKey 授权码
     * @return
     */
    List<Location> findByLocNameContainingAndStatusAndAuthKeyStartingWith(String locName, String status, String authKey);


    /**
     * @param locName  位置名称
     * @param status   状态
     * @param authKey  授权码
     * @param pageable 分页
     * @return
     */
    Page<Location> findByLocNameContainingAndStatusAndAuthKeyStartingWith(String locName, String status, String authKey, Pageable pageable);


}
