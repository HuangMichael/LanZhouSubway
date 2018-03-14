package com.subway.materialCost;

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
 * 物料消耗业务类
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class MaterialCostService extends BaseService {


    @Autowired
    MaterialCostRepository materialCostRepository;


    @Autowired
    CommonDataService commonDataService;

    /**
     * @return
     */
    public List<MaterialCost> findAll() {
        return materialCostRepository.findAll();
    }


    /**
     * @param pageable
     * @return
     */
    public Page<MaterialCost> findAll(Pageable pageable) {
        return materialCostRepository.findAll(pageable);
    }


    /**
     * @param id id
     * @return 根据id删除对象
     */
    public ReturnObject delete(Long id) {
        materialCostRepository.delete(id);
        MaterialCost materialCost = materialCostRepository.getOne(id);
        return commonDataService.getReturnType(materialCost == null, DELETE_SUCCESS, DELETE_FAILURE);
    }


    /**
     * @param materialCost
     * @return 保存信息
     */
    public ReturnObject save(MaterialCost materialCost) {

        materialCost = materialCostRepository.save(materialCost);
        return commonDataService.getReturnType(materialCost != null, SAVE_SUCCESS, SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public MaterialCost findById(Long id) {
        return materialCostRepository.getOne(id);
    }

}
