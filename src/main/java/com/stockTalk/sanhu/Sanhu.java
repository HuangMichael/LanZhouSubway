package stockTalk.sanhu;

import lombok.Data;

import javax.persistence.*;

/**
 * 散户信息表
 **/
@Entity
@Table(name = "T_SANHU")
@Data

public class Sanhu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;  //id

    @Column(length = 20)
    private String name;// 申购日期


    @Column(length = 200)
    private String mark;// 备注信息


    @Column(length = 1)
    private String status; //状态

}
