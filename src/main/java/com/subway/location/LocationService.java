package com.subway.location;

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
        return commonDataService.getReturnType(location == null, "记录删除成功！", "记录删除失败!");
    }


    /**
     * @param location
     * @return 保存位置信息
     */
    public ReturnObject save(Location location) {


        location = locationRepository.save(location);
        return commonDataService.getReturnType(location != null, "记录保存成功！", "记录删除失败!");
    }


    /**
     * @param id
     * @return
     */
    public Location findById(Long id) {
        return locationRepository.getOne(id);
    }

}
