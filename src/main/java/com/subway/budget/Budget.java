package com.subway.budget;

import com.subway.eqClass.EqClass;
import com.subway.location.Location;
import lombok.Data;

import javax.persistence.*;

/**
 * 采购申请单
 *
 **/
@Entity
@Table(name = "T_BUDGET")
@Data
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  //id

    @Column(length = 20)
    private String applyDate;// 申购日期

    @Column(length = 50)
    private String accessoryName; //配件名称

    @Column(length = 50)
    private String applicant; //申请人

    @Column(length = 50)
    private String applyDep; //申请部门

    @Column(length = 50)
    private String purpose; //用途

    @Column(length = 50)
    private String specifications; //规格

    @Column(length = 10)
    private Integer amount; //采购数量

    @Column(length = 10)
    private String approver; //批准人

    @Column(length = 10)
    private String handler; //经办人

    @Column(length = 10)
    private String receiver; //接收人

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location; //位置


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eq_class_id", referencedColumnName = "id")
    private EqClass eqClass; //设备分类

    @Column(length = 20)
    private String authKey; //状态

    @Column(length = 1)
    private String status; //状态

}
