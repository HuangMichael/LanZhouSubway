package com.subway.equipment;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


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
    List<Equipment> findByDescriptionContainingAndStatusAndAuthKeyStartingWith(String description,String status,String authKey);

    /**
     * @param description
     * @param status
     * @param authKey
     * @param pageable
     * @return
     */
    Page<Equipment> findByDescriptionContainingAndStatusAndAuthKeyStartingWith(String description, String status, String authKey, Pageable pageable);
}

