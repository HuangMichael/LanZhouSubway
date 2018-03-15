package com.subway.preMaintPlan;
import com.subway.service.app.BaseService;
import com.subway.utils.search.SortedSearchable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* 预防性维护计划业务查询类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class  PreMaintPlanSearchService extends BaseService implements SortedSearchable {

@Autowired
PreMaintPlanRepository  preMaintPlanRepository;


public List< PreMaintPlan> findByConditions(String searchPhrase, int paramsSize) {
String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
return  preMaintPlanRepository.findAll();
}


public Page< PreMaintPlan> findByConditions(String searchPhrase, int paramsSize, Pageable pageable) {
String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
return  preMaintPlanRepository.findAll( pageable);
}

}