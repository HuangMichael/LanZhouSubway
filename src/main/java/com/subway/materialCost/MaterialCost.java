package com.subway.materialCost;


import com.subway.location.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by huangbin
 * 2016年10月14日09:26:04
 * 工单物料消耗信息
 */
@Entity
@Table(name = "T_MATERIAL_COST")
@Data
public class MaterialCost implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    private Location location; //位置描述

    @Column(length = 50)
    private String ecName; //易耗品名称

    @Column(length = 3)
    private Integer amount; //位置描述

    @Column(length = 20)
    private String applyDate; //位置描述

    @Column(length = 20)
    private String applicant; //申请人

    @Column(length = 1)
    private String status; //状态

    @Column(length = 20)
    private String authKey; //授权码

}