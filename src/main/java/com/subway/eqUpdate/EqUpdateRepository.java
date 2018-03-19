package com.subway.eqUpdate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * 设备更新表数据库访问接口
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface EqUpdateRepository extends JpaRepository<EqUpdate, Long> {


    /**
     * @param applicant
     * @param status
     * @param authKey
     * @return
     */
    List<EqUpdate> findByApplicantContainingAndStatusAndAuthKeyStartingWith(String applicant, String status, String authKey);


    /**
     * @param applicant
     * @param status
     * @param authKey
     * @return
     */
    Page<EqUpdate> findByApplicantContainingAndStatusAndAuthKeyStartingWith(String applicant, String status, String authKey, Pageable pageable);

}
