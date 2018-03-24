package com.subway.preMaint;

import com.subway.equipment.Equipment;
import com.subway.unit.Unit;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 预防性维护实体类
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Entity
@Table(name = "t_pre_maint")
@Data
public class PreMaint implements Serializable {
    //表之间的关联注解  请自行添加判断
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(length = 20)
    private String pmCode;
    @Column(length = 20)
    private String createBy;
    @Column(length = 20)
    private String createTime;
    @Column(length = 20)
    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_id", referencedColumnName = "id")
    private Equipment equipment;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private Unit unit;
    @Column(length = 1)
    private String status;
    @Column(length = 20)
    private String authKey;

}
