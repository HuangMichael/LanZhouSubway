package com.subway.eqAppend;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * 设备新置申请表数据库访问接口
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface EqAppendRepository extends JpaRepository<EqAppend, Long> {



    /**
     * @param applicant
     * @param status
     * @param authKey
     * @return
     */
    List<EqAppend> findByApplicantContainingAndStatusAndAuthKeyStartingWith(String applicant, String status, String authKey);


    /**
     * @param applicant
     * @param status
     * @param authKey
     * @return
     */
    Page<EqAppend> findByApplicantContainingAndStatusAndAuthKeyStartingWith(String applicant, String status, String authKey, Pageable pageable);



}
