package com.subway.preMaint;


import com.subway.equipment.Equipment;
import com.subway.unit.Unit;
import lombok.Data;

import javax.persistence.*;

/**
 * Created by huangbin on 2016年10月9日11:42:09
 * 预防性维修
 */
@Entity
@Table(name = "T_PRE_MAINT")
@Data
public class PreMaint {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;  //id

    @Column(length = 20, unique = true)
    private String pmCode; //维修编号


    @Column(length = 20)
    private String description; //


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_id", referencedColumnName = "id")
    private Equipment equipment;  //设备

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unit; //外委单位


    @Column(length = 20)
    private String createBy; //创建人


    @Column(length = 20)
    private String createTime; //创建时间

    @Column(length = 20)
    private String authKey; //授权码


    @Column(length = 20)
    private String status; //创建时间
}
