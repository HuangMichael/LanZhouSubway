package com.subway.role;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
* 角色信息实体类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Entity
@Table(name = "t_role")
@Data
public class Role  implements Serializable {


//表之间的关联注解  请自行添加判断
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
    @Column( length = 20,nullable = false)
    private String roleName;
    @Column( length = 50,nullable = false)
    private String roleDesc;
    @Column( length = 0)
    private Long sortNo;
    @Column( length = 1,nullable = false)
    private String status;

}
