package com.subway.materialCost;

import com.subway.service.app.BaseService;
import com.subway.utils.search.SortedSearchable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 物料消耗业务查询类
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class MaterialCostSearchService extends BaseService implements SortedSearchable {

    @Autowired
    MaterialCostRepository materialCostRepository;


    /**
     * @param searchPhrase 搜索关键字组合
     * @param paramsSize
     * @return
     */
    public List<MaterialCost> findByConditions(String searchPhrase, int paramsSize) {
        String array[] = super.assembleSearchArrayWithAuthKey(searchPhrase, paramsSize);
        return materialCostRepository.findByEcNameContainingAndStatusAndAuthKeyStartingWith(array[0], array[1], array[2]);
    }


    /**
     * @param searchPhrase 搜索关键字组合
     * @param paramsSize
     * @param pageable
     * @return
     */
    public Page<MaterialCost> findByConditions(String searchPhrase, int paramsSize, Pageable pageable) {
        String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
        return materialCostRepository.findByEcNameContainingAndStatusAndAuthKeyStartingWith(array[0], array[1], array[2], pageable);
    }

}