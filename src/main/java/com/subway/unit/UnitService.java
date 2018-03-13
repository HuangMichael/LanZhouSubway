package com.subway.unit;

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
 * ��ί��λҵ����
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class UnitService extends BaseService {


    @Autowired
    UnitRepository unitRepository;


    @Autowired
    CommonDataService commonDataService;

    /**
     * @return
     */
    public List<Unit> findAll() {
        return unitRepository.findAll();
    }


    /**
     * @param pageable
     * @return
     */
    public Page<Unit> findAll(Pageable pageable) {
        return unitRepository.findAll(pageable);
    }


    /**
     * @param id id
     * @return 删除外委单位信息
     */
    public ReturnObject delete(Long id) {
        unitRepository.delete(id);
        Unit unit = unitRepository.getOne(id);
        return commonDataService.getReturnType(unit == null, DELETE_SUCCESS, DELETE_FAILURE);
    }


    /**
     * @param unit
     * @return 保存外委单位信息
     */
    public ReturnObject save(Unit unit) {

        unit = unitRepository.save(unit);
        return commonDataService.getReturnType(unit != null, SAVE_SUCCESS, SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public Unit findById(Long id) {
        return unitRepository.getOne(id);
    }

}
