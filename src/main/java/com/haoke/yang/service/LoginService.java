package com.haoke.yang.service;

import com.haoke.yang.bean.User;
import com.haoke.yang.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.yang.servies
 * @date 2019/12/22 16:28
 */

@Service
public class LoginService {

    private UserMapper userMapper;

    @Autowired
    public LoginService(UserMapper userMapper){ this.userMapper = userMapper;}

    //用户登录
    public User userLogin(String username, String password){
        User user1 = userMapper.selectByPrimaryKey(1);
        System.out.println(user1.getUsername());
        User user = userMapper.userLogin(username,password);
        return user;
    }
}
