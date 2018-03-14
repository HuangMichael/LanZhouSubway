package com.subway.woMaterialCost;
import com.subway.service.app.BaseService;
import com.subway.utils.search.SortedSearchable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* ������������ҵ���ѯ��
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class  WoMaterialCostSearchService extends BaseService implements SortedSearchable {

@Autowired
WoMaterialCostRepository  woMaterialCostRepository;


public List< WoMaterialCost> findByConditions(String searchPhrase, int paramsSize) {
String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
return  woMaterialCostRepository.findAll();
}


public Page< WoMaterialCost> findByConditions(String searchPhrase, int paramsSize, Pageable pageable) {
String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
return  woMaterialCostRepository.findAll( pageable);
}

}