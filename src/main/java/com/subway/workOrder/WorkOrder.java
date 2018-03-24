package com.subway.workOrder;

import com.subway.eqClass.EqClass;
import com.subway.equipment.Equipment;
import com.subway.location.Location;
import com.subway.unit.Unit;
import lombok.Data;

import javax.persistence.*;

/**
 * 工单信息
 */
@Entity
@Table(name = "T_WORK_ORDER")
@Data
public class WorkOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 20, unique = true, nullable = false)
    private String orderLineNo; //工单编号行号

    @Column(length = 200)
    private String orderDesc;  //故障描述

    @ManyToOne
    @JoinColumn(name = "equipment_id", referencedColumnName = "id")
    private Equipment equipment;


    @ManyToOne
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location;


    @ManyToOne
    @JoinColumn(name = "eq_class_id", referencedColumnName = "id")
    private EqClass eqClass;


    @ManyToOne
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    Unit unit;

    @Column(length = 20)
    private String reporter; //报修人

    private String reportTime;  //故障描述

    @Column(length = 1)
    private String reportType; //报修方式 S为设备 W位置

    @Column(length = 20)
    private String creator; //录入人

    @Column(length = 20)
    private String deadline;  //维修期限

    @Column(length = 1)
    private boolean expired;

    @Column(length = 1)
    private String orderState;


    @Column(length = 1)
    private String status;

    @Column(length = 20)
    private String authKey; //授权码
}
