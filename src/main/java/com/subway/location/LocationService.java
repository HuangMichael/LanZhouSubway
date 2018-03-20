package com.subway.location;

import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import com.subway.utils.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * λ����Ϣҵ����
 *
 * @author huangbin
 * @generate by autoCode
 * @Date 2018-3-1
 */
@Service
public class LocationService extends BaseService {


    @Autowired
    LocationRepository locationRepository;


    @Autowired
    CommonDataService commonDataService;

    public List
            <Location> findAll() {
        return locationRepository.findAll();
    }


    public Page<Location> findAll(Pageable pageable) {
        return locationRepository.findAll(pageable);
    }


    /**
     * @param id
     * @return
     */
    public ReturnObject delete(Long id) {
        locationRepository.delete(id);
        Location location = locationRepository.getOne(id);
        return commonDataService.getReturnType(location == null, ConstantUtils.DELETE_SUCCESS, ConstantUtils.DELETE_FAILURE);
    }


    /**
     * @param location
     * @return 保存位置信息
     */
    public ReturnObject save(Location location) {
        location = locationRepository.save(location);
        return commonDataService.getReturnType(location != null, ConstantUtils.SAVE_SUCCESS, ConstantUtils.SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public Location findById(Long id) {
        return locationRepository.getOne(id);
    }


    /**
     * @param authKey 授权码
     * @return 根据授权码查询树结构 模糊查询
     */
    public List<Object> findTree(String authKey) {
        System.out.println("authKey-------------"+authKey);
        return locationRepository.findTree(authKey + "%");
    }

}
