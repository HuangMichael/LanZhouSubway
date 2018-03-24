package com.subway.eqClass;

import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import com.subway.unit.Unit;
import com.subway.unit.UnitRepository;
import com.subway.utils.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

import static com.subway.utils.ConstantUtils.*;

/**
 * �豸����ҵ����
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


    @Autowired
    UnitRepository unitRepository;

    /**
     * @return
     */
    public List<EqClass> findAll() {
        return eqClassRepository.findAll();
    }


    /**
     * @param pageable
     * @return
     */
    public Page<EqClass> findAll(Pageable pageable) {
        return eqClassRepository.findAll(pageable);
    }


    /**
     * @param id id
     * @return ����idɾ������
     */
    public ReturnObject delete(Long id) {
        eqClassRepository.delete(id);
        EqClass eqClass = eqClassRepository.getOne(id);
        return commonDataService.getReturnType(eqClass == null, DELETE_SUCCESS, DELETE_FAILURE);
    }


    /**
     * @param eqClass
     * @return
     */
    public ReturnObject save(EqClass eqClass) {
        eqClass = eqClassRepository.save(eqClass);
        return commonDataService.getReturnType(eqClass != null, SAVE_SUCCESS, SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public EqClass findById(Long id) {
        return eqClassRepository.getOne(id);
    }


    /**
     * @param eqClassId
     * @param unitId
     * @return
     */
    public ReturnObject addUnit(Long eqClassId, String unitId) {
        EqClass eqClass = eqClassRepository.getOne(eqClassId);
        String unitArray[] = unitId.split(",");
        Set<Unit> unitSet = eqClass.getUnitSet();
        Unit unit;
        for (String id : unitArray) {
            unit = unitRepository.getOne(Long.parseLong(id));
            unitSet.add(unit);
        }
        eqClass.setUnitSet(unitSet);
        eqClassRepository.save(eqClass);
        return commonDataService.getReturnType(eqClass != null, "外委单位关联成功", "外委单位关联失败");
    }


    /**
     * @return 查询 设备分类
     */
    public List<EqClass> findEqClasses() {
        return eqClassRepository.findByClassLevelGreaterThanAndStatus(1L, ConstantUtils.STATUS_YES);
    }

}
