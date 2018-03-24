package com.subway.unit;

import com.subway.eqClass.EqClass;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by huangbin on 2018/03/14 0023.
 * 外委单位
 */

@Entity
@Table(name = "T_UNIT")
@Data
public class Unit implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50, nullable = false)
    private String name;//外委单位名称

    @Column(length = 200)
    private String unitDesc;//外委单位名称

    @Column(length = 20)
    private String contact;//责任人

    @Column(length = 20)
    private String telephone;//联系电话

    @Column(length = 1)
    private String workDays;  //工作制



    @Column(length = 1, columnDefinition = "default 1")
    private String isOut; //外部标识 默认为外部

    @Column(length = 1, columnDefinition = "default '1'", nullable = false)
    private String status;  //使用状态
}