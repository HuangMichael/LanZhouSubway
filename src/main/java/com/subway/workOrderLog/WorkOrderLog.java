package com.subway.workOrderLog;

import com.subway.workOrder.WorkOrder;
import lombok.Data;

import javax.persistence.*;

/**
 * 工单信息日志
 */
@Entity
@Table(name = "T_WORK_ORDER_LOG")
@Data
public class WorkOrderLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 200)
    private String content;

    @ManyToOne
    @JoinColumn(name = "work_order_id", referencedColumnName = "id")
    private WorkOrder workOrder;

    @Column(length = 1)
    private String orderState; //状态

    @Column(length = 20)
    private String orderStateTime; //状态时间


    @Column(length = 20)
    private String creator; //创建人

    @Column(length = 10)
    private Long sortNo;

    @Column(length = 1)
    private String status;

    @Column(length = 20)
    private String authKey; //授权码
}
