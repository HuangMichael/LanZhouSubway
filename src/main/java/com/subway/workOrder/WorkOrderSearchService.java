package com.subway.workOrder;

import com.subway.service.app.BaseService;
import com.subway.utils.search.SortedSearchable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class WorkOrderSearchService extends BaseService implements SortedSearchable {

    @Autowired
    WorkOrderRepository workOrderRepository;


    /**
     * @param searchPhrase 搜索关键字组合
     * @param paramsSize
     * @return
     */
    public List<WorkOrder> findByConditions(String searchPhrase, int paramsSize) {
        String array[] = super.assembleSearchArrayWithAuthKey(searchPhrase, paramsSize);
        return workOrderRepository.findByOrderDescContainingAndOrderStateAndStatusAndAuthKeyStartingWith(array[0], array[1], array[2], array[3]);
    }


    /**
     * @param searchPhrase 搜索关键字组合
     * @param paramsSize
     * @param pageable
     * @return
     */
    public Page<WorkOrder> findByConditions(String searchPhrase, int paramsSize, Pageable pageable) {
        String array[] = super.assembleSearchArrayWithAuthKey(searchPhrase, paramsSize);
        return workOrderRepository.findByOrderDescContainingAndOrderStateAndStatusAndAuthKeyStartingWith(array[0], array[1], array[2], array[3], pageable);
    }

}