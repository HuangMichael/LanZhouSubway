package com.subway.role;

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
* 角色信息业务类
*
* @author huangbin
* @generate by autoCode
* @Date 2018-3-1
*/
@Service
public class RoleService extends BaseService {


@Autowired
RoleRepository roleRepository;


@Autowired
CommonDataService commonDataService;

public List
<Role> findAll() {
return  roleRepository.findAll();
}


public Page< Role> findAll(Pageable pageable) {
return  roleRepository.findAll(pageable);
}


/**
* @param id id
* @return 根据id删除对象
*/
public ReturnObject delete(Long id) {
roleRepository.delete(id);
Role role = roleRepository.getOne(id);
return commonDataService.getReturnType(role == null, DELETE_SUCCESS, DELETE_FAILURE);
}


/**
* @param role
* @return 保存信息
*/
public ReturnObject save(Role role) {

role = roleRepository.save(role);
return commonDataService.getReturnType(role != null, SAVE_SUCCESS, SAVE_FAILURE);
}


public  Role findById(Long id) {
return  roleRepository.getOne(id);
}

}
