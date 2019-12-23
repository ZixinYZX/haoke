package com.haoke.yang.service;

import com.haoke.yang.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
