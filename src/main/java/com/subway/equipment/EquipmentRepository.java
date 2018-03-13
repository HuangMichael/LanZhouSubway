package com.subway.equipment;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * �豸��Ϣ���ݿ���ʽӿ�
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {

    /**
     * @param description
     * @param status
     * @param authKey
     * @return
     */
    List<Equipment> findByDescriptionContainingAndStatusAndAuthKeyContaining(String description,String status,String authKey);

    /**
     * @param description
     * @param status
     * @param authKey
     * @param pageable
     * @return
     */
    Page<Equipment> findByDescriptionContainingAndStatusAndAuthKeyContaining(String description, String status, String authKey, Pageable pageable);
}

