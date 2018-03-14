package com.subway.budget;
import com.subway.service.app.BaseService;
import com.subway.utils.search.SortedSearchable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* 采购申请业务查询类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class  BudgetSearchService extends BaseService implements SortedSearchable {

@Autowired
BudgetRepository  budgetRepository;


public List< Budget> findByConditions(String searchPhrase, int paramsSize) {
String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
return  budgetRepository.findAll();
}


public Page< Budget> findByConditions(String searchPhrase, int paramsSize, Pageable pageable) {
String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
return  budgetRepository.findAll( pageable);
}

}