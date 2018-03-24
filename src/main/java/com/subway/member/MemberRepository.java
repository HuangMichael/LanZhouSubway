package com.subway.member;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 会员信息表数据库访问接口
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface MemberRepository extends JpaRepository<Member, Long> {


}
