package com.subway.eqClass;

import java.util.List;
import java.util.Map;

import com.subway.service.app.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import com.subway.service.commonData.CommonDataService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.subway.object.ReturnObject;
/**
* 设备分类业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class EqClassService extends BaseService {


@Autowired
EqClassRepository eqClassRepository;


@Autowired
CommonDataService commonDataService;

public List
<EqClass> findAll() {
return  eqClassRepository.findAll();
}


public Page< EqClass> findAll(Pageable pageable) {
return  eqClassRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
eqClassRepository.delete(id);
EqClass eqClass = eqClassRepository.getOne(id);
return commonDataService.getReturnType(eqClass == null, "记录删除成功", "记录删除失败");
}


/**
* @param eqClass
* @return 保存信息
*/
public ReturnObject save(EqClass eqClass) {

eqClass = eqClassRepository.save(eqClass);
return commonDataService.getReturnType(eqClass != null, "记录保存成功！", "记录删除失败!");
}


public  EqClass findById(Long id) {
return  eqClassRepository.getOne(id);
}

}
