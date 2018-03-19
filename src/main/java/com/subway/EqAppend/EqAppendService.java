package com.subway.eqAppend;

import java.util.List;
import java.util.Map;

import com.subway.service.app.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import com.subway.service.commonData.CommonDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.subway.object.ReturnObject;
import static com.subway.utils.ConstantUtils.*;


/**
* 设备新置申请表业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class EqAppendService extends BaseService {


@Autowired
EqAppendRepository eqAppendRepository;


@Autowired
CommonDataService commonDataService;

public List
<EqAppend> findAll() {
return  eqAppendRepository.findAll();
}


public Page< EqAppend> findAll(Pageable pageable) {
return  eqAppendRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
eqAppendRepository.delete(id);
EqAppend eqAppend = eqAppendRepository.getOne(id);
return commonDataService.getReturnType(eqAppend == null, DELETE_SUCCESS, DELETE_FAILURE);
}


/**
* @param eqAppend
* @return 保存信息
*/
public ReturnObject save(EqAppend eqAppend) {

eqAppend = eqAppendRepository.save(eqAppend);
return commonDataService.getReturnType(eqAppend != null, SAVE_SUCCESS, SAVE_FAILURE);
}


public  EqAppend findById(Long id) {
return  eqAppendRepository.getOne(id);
}

}
