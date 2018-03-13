package com.subway.equipment;

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
 * �豸��Ϣҵ����
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class EquipmentService extends BaseService {


    @Autowired
    EquipmentRepository equipmentRepository;


    @Autowired
    CommonDataService commonDataService;

    /**
     * @return
     */
    public List<Equipment> findAll() {
        return equipmentRepository.findAll();
    }


    /**
     * @param pageable
     * @return
     */
    public Page<Equipment> findAll(Pageable pageable) {
        return equipmentRepository.findAll(pageable);
    }


    /**
     * @param id id
     * @return ����idɾ������
     */
    public ReturnObject delete(Long id) {
        equipmentRepository.delete(id);
        Equipment equipment = equipmentRepository.getOne(id);
        return commonDataService.getReturnType(equipment == null, DELETE_SUCCESS, DELETE_FAILURE);
    }


    /**
     * @param equipment
     * @return ������Ϣ
     */
    public ReturnObject save(Equipment equipment) {

        equipment = equipmentRepository.save(equipment);
        return commonDataService.getReturnType(equipment != null, SAVE_SUCCESS, SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public Equipment findById(Long id) {
        return equipmentRepository.getOne(id);
    }

}
