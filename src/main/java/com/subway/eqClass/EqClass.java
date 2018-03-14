package com.subway.eqClass;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.subway.unit.Unit;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by huangbin on 2016/03/13 0023.
 * 设备分类信息
 */
@Entity
@Table(name = "T_EQ_CLASS")
@Data
public class EqClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 20)
    private String name;

    @Column(length = 1)
    private String hasChild;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    EqClass parent;


    @JsonBackReference("classList")
    @OneToMany(targetEntity = EqClass.class, cascade = CascadeType.ALL, mappedBy = "parent")
    List<EqClass> classList = new ArrayList<>();


    @ManyToMany
    @JoinTable(name = "t_unit_class", joinColumns = {@JoinColumn(name = "class_id")}, inverseJoinColumns = {@JoinColumn(name = "unit_id")})
    private Set<Unit> unitSet;

    @Column(length = 1)
    private Long classLevel;

    @Column(length = 4)
    private Long limitHours; //时限单位小时

    @Column(length = 20)
    private Long sortNo;

    @Column(length = 1)
    private String status; //设备分类状态


}

