package com.subway.eqClass;

import com.subway.service.app.BaseService;
import com.subway.utils.search.SortedSearchable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * �豸����ҵ���ѯ��
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class EqClassSearchService extends BaseService implements SortedSearchable {

    @Autowired
    EqClassRepository eqClassRepository;


    /**
     * @param searchPhrase 搜索关键字组合
     * @param paramsSize
     * @return
     */
    public List<EqClass> findByConditions(String searchPhrase, int paramsSize) {
        String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
        return eqClassRepository.findAll();
    }


    /**
     * @param searchPhrase 搜索关键字组合
     * @param paramsSize
     * @param pageable
     * @return
     */
    public Page<EqClass> findByConditions(String searchPhrase, int paramsSize, Pageable pageable) {
        String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
        return eqClassRepository.findAll(pageable);
    }

}