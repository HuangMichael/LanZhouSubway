package com.subway.woMaterialCost;

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
* 工单物料消耗业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class WoMaterialCostService extends BaseService {


@Autowired
WoMaterialCostRepository woMaterialCostRepository;


@Autowired
CommonDataService commonDataService;

public List
<WoMaterialCost> findAll() {
return  woMaterialCostRepository.findAll();
}


public Page< WoMaterialCost> findAll(Pageable pageable) {
return  woMaterialCostRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
woMaterialCostRepository.delete(id);
WoMaterialCost woMaterialCost = woMaterialCostRepository.getOne(id);
return commonDataService.getReturnType(woMaterialCost == null, DELETE_SUCCESS, DELETE_FAILURE);
}


/**
* @param woMaterialCost
* @return 保存信息
*/
public ReturnObject save(WoMaterialCost woMaterialCost) {

woMaterialCost = woMaterialCostRepository.save(woMaterialCost);
return commonDataService.getReturnType(woMaterialCost != null, SAVE_SUCCESS, SAVE_FAILURE);
}


public  WoMaterialCost findById(Long id) {
return  woMaterialCostRepository.getOne(id);
}

}
