package com.subway.eqUpdate;

import com.subway.equipment.Equipment;
import lombok.Data;

import javax.persistence.*;

/**
 * 设备更新申请
 **/
@Entity
@Table(name = "T_EQ_UPDATE")
@Data

public class EqUpdate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  //id

    @Column(length = 20)
    private String applyDate;// 申购日期

    @Column(length = 50)
    private String applicant; //申请人

    @Column(length = 50)
    private String applyDep; //申请部门

    @Column(length = 50)
    private String purpose; //用途

    @Column(length = 10)
    private String approver; //批准人

    @Column(length = 10)
    private String handler; //经办人

    @Column(length = 10)
    private String receiver; //接收人


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_id", referencedColumnName = "id")
    private Equipment equipment; //设备位置

    @Column(length = 1)
    private String dataType; //数据分类 1为新置  2为更新


    @Column(length = 20)
    private String authKey; //授权码


    @Column(length = 1)
    private String status; //状态

}
