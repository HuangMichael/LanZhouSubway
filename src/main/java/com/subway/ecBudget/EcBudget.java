package com.subway.ecBudget;

import com.subway.location.Location;
import lombok.Data;

import javax.persistence.*;


/**
 * 易耗品采购申请单
 **/
@Entity
@Table(name = "T_EC_BUDGET")
@Data
public class EcBudget {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  //id
    @Column(length = 20)
    private String applyDate;// 申请日期
    @Column(length = 20)
    private String applicant;// 
    @Column(length = 20)
    private String ecName;//
    @Column(length = 20)
    private String amount;// 
    @Column(length = 20)
    private String permitted;//
    @Column(length = 20)
    private String updateReason;// 
    @Column(length = 20)
    private String auditDate;// 
    @Column(length = 20)
    private String auditor;// 
    @Column(length = 20)
    private String confirmReason;// 
    @Column(length = 20)
    private String fixAdvice;// 
    @Column(length = 20)
    private String leaderAdvice;// 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location; //位置

    @Column(length = 20)
    private String authKey; //授权码

    @Column(length = 1)
    private String status; //状态

}
