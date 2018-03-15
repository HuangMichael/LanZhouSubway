package com.subway.preMaintPlan;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by huangbin on 2016年10月9日11:42:09
 * 预防性维修
 */
@Entity
@Table(name = "T_PRE_MAINT_PLAN")
@Data
public class PreMaintPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;  //id

    @Column(length = 20, unique = true)
    private String planCode; //维修编号

    @Column(length = 20)
    private String planDesc; //计划描述

    @Column(length = 20)
    private String cron; //调度表达式

    @Column(length = 1)
    private String exeState; //执行状态

    @Column(length = 20)
    private String authKey; //授权码

    @Column(length = 1)
    private String status; //创建时间
}
