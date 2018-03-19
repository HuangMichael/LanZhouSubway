package com.subway.eqAppend;
import com.subway.service.app.BaseService;
import com.subway.utils.search.SortedSearchable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

/**
* 设备新置申请表业务查询类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class  EqAppendSearchService extends BaseService implements SortedSearchable {

@Autowired
EqAppendRepository  eqAppendRepository;


public List< EqAppend> findByConditions(String searchPhrase, int paramsSize) {
String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
return  eqAppendRepository.findAll();
}


public Page< EqAppend> findByConditions(String searchPhrase, int paramsSize, Pageable pageable) {
String array[] = super.assembleSearchArray(searchPhrase, paramsSize);
return  eqAppendRepository.findAll( pageable);
}

}