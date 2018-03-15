package com.subway.role;

import com.subway.dao.user.UserRepository;
import com.subway.domain.user.User;
import com.subway.object.ReturnObject;
import com.subway.service.app.BaseService;
import com.subway.service.commonData.CommonDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.subway.utils.ConstantUtils.*;


/**
 * 角色业务类
 */
@Service
public class RoleService extends BaseService {

    @Autowired
    RoleRepository roleRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    CommonDataService commonDataService;


    /**
     * 查询出不在当前角色中的人员
     */

    public List<Object> findUsersNotInRole(Long roleId) {
        return userRepository.findUsersNotInRole(roleId);
    }

    /**
     * @param roleId
     * @param usersIdStr
     * @return 添加用户
     */

    public ReturnObject addUsers(Long roleId, String usersIdStr) {
        ReturnObject returnObject = new ReturnObject();
        Role role = roleRepository.getOne(roleId);
        if (usersIdStr != null && !usersIdStr.equals("")) {
            String[] ids = usersIdStr.split(",");
            List<User> userList = role.getUserList();
            for (String id : ids) {
                User user = userRepository.getOne(Long.parseLong(id));
                if (!userList.contains(user)) {
                    userList.add(user);
                }
            }
            role.setUserList(userList);
            roleRepository.save(role);
        }
        returnObject.setResult(true);
        returnObject.setResultDesc("角色添加用户成功");

        return returnObject;
    }


    /**
     * @param roleId
     * @return
     */
    public List<User> findUsersOfRole(Long roleId) {
        List<User> userList = new ArrayList<User>();
        if (roleId != null) {
            userList = userRepository.findUserListByRoleId(roleId);
        }
        return userList;
    }


    /**
     * @param roleId 角色id
     * @param userId 用户id
     * @return 移除用户
     */
    public ReturnObject removeUser(Long roleId, Long userId) {
        ReturnObject returnObject = new ReturnObject();
        Role role = roleRepository.getOne(roleId);
        List<User> usersOfRole = role.getUserList();
        User user = userRepository.getOne(userId);
        if (usersOfRole.contains(user)) {
            usersOfRole.remove(user);
            role.setUserList(usersOfRole);
            roleRepository.save(role);
            returnObject.setResult(true);
            returnObject.setResultDesc("角色移除用户成功!");
        } else {
            returnObject.setResult(false);
            returnObject.setResultDesc("角色移除用户失败!");
        }
        return returnObject;
    }

    /**
     * @param id id
     * @return 删除角色信息
     */
    public ReturnObject delete(Long id) {
        boolean result = false;
        String message = "数据有关联,不能删除!";
        Role role = roleRepository.getOne(id);
        if (!role.getResourceList().isEmpty() && !role.getUserList().isEmpty()) {
            message = "菜单信息" + message;
        } else {
            roleRepository.delete(id);
            result = true;
        }
        return commonDataService.getReturnType(result, DELETE_SUCCESS, message);
    }


    /**
     * @param role
     * @return 保存角色信息
     */
    public ReturnObject save(Role role) {
        role = roleRepository.save(role);
        return commonDataService.getReturnType(role != null, SAVE_SUCCESS, SAVE_FAILURE);
    }


    /**
     * @param id
     * @return
     */
    public Role findById(Long id) {

        return roleRepository.getOne(id);
    }


    /**
     * @param status
     * @return
     */
    public List<Role> findByStatus(String status) {

        return roleRepository.findByStatus(status);
    }


}
