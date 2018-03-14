package com.subway.woMaterialCost;


import com.subway.workOrder.WorkOrder;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by huangbin
 * 2016年10月14日09:26:04
 * 工单物料消耗信息
 */
@Entity
@Table(name = "T_WO_MATERIAL_COST")
@Data
public class WoMaterialCost implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "work_order_id", referencedColumnName = "id")
    private WorkOrder workOrder; //位置描述

    @Column(length = 50)
    private String matName; //物资名称

    @Column(length = 30)
    private String matModel; //物资型号

    @Column(length = 20)
    private Long matAmount; //数量

    @Column(length = 10)
    private Double matPrice; //单价

    @Column(length = 1)
    private String status; //状态

    @Column(length = 20)
    private String authKey; //授权码


}