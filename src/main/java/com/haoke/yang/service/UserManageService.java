package com.haoke.yang.service;

import com.haoke.yang.bean.User;
import com.haoke.yang.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.service
 * @date 2019/12/23 21:41
 */
@Service
public class UserManageService {
    private UserMapper userMapper;

    @Autowired
    public UserManageService(UserMapper userMapper){ this.userMapper = userMapper;}

    public List<User> adminList(){
        return userMapper.selectAll();
    }

    public boolean addAdmin(User user) {
        try {
            userMapper.insert(user);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean delAdmin(int id){
        try {
            userMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    public boolean updateByPrimaryKey(User user){
        try {
            userMapper.updateByPrimaryKey(user);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
