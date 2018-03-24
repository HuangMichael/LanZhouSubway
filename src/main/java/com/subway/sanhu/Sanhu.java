package com.subway.sanhu;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
* 散户信息表实体类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Entity
@Table(name = "t_sanhu")
@Data
public class Sanhu  implements Serializable {


//表之间的关联注解  请自行添加判断
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
    @Column( length = 20)
    private String name;
    @Column( length = 200)
    private String mark;
    @Column( length = 1)
    private String status;

}
