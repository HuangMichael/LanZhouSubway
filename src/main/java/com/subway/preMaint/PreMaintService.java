package com.subway.preMaint;

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
* 预防性维护业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class PreMaintService extends BaseService {


@Autowired
PreMaintRepository preMaintRepository;


@Autowired
CommonDataService commonDataService;

public List
<PreMaint> findAll() {
return  preMaintRepository.findAll();
}


public Page< PreMaint> findAll(Pageable pageable) {
return  preMaintRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
preMaintRepository.delete(id);
PreMaint preMaint = preMaintRepository.getOne(id);
return commonDataService.getReturnType(preMaint == null, DELETE_SUCCESS, DELETE_FAILURE);
}


/**
* @param preMaint
* @return 保存信息
*/
public ReturnObject save(PreMaint preMaint) {

preMaint = preMaintRepository.save(preMaint);
return commonDataService.getReturnType(preMaint != null, SAVE_SUCCESS, SAVE_FAILURE);
}


public  PreMaint findById(Long id) {
return  preMaintRepository.getOne(id);
}

}
