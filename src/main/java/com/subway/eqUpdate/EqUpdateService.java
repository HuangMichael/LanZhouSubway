package com.subway.eqUpdate;

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
* 设备更新表业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class EqUpdateService extends BaseService {


@Autowired
EqUpdateRepository eqUpdateRepository;


@Autowired
CommonDataService commonDataService;

public List
<EqUpdate> findAll() {
return  eqUpdateRepository.findAll();
}


public Page< EqUpdate> findAll(Pageable pageable) {
return  eqUpdateRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
eqUpdateRepository.delete(id);
EqUpdate eqUpdate = eqUpdateRepository.getOne(id);
return commonDataService.getReturnType(eqUpdate == null, DELETE_SUCCESS, DELETE_FAILURE);
}


/**
* @param eqUpdate
* @return 保存信息
*/
public ReturnObject save(EqUpdate eqUpdate) {

eqUpdate = eqUpdateRepository.save(eqUpdate);
return commonDataService.getReturnType(eqUpdate != null, SAVE_SUCCESS, SAVE_FAILURE);
}


public  EqUpdate findById(Long id) {
return  eqUpdateRepository.getOne(id);
}

}
