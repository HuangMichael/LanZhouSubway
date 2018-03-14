package com.subway.workOrder;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * 工单查询数据接口
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface WorkOrderRepository extends JpaRepository<WorkOrder, Long> {


    /**
     * @param orderDesc  故障描述
     * @param orderState 工单状态
     * @param status     状态
     * @param authKey    授权码
     * @return
     */
    List<WorkOrder> findByOrderDescContainingAndOrderStateAndStatusAndAuthKeyStartingWith(String orderDesc, String orderState, String status, String authKey);


    /**
     * @param orderDesc  故障描述
     * @param orderState 工单状态
     * @param status     状态
     * @param authKey    授权码
     * @param pageable   分页
     * @return
     */
    Page<WorkOrder> findByOrderDescContainingAndOrderStateAndStatusAndAuthKeyStartingWith(String orderDesc, String orderState, String status, String authKey, Pageable pageable);

}
