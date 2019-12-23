package com.haoke.yang.controller;

import com.haoke.yang.service.LoginService;
import com.haoke.yang.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.controller
 * @date 2019/12/23 21:41
 */
@Controller
public class UserManageController {

    private UserManageService userManageService;

    @Autowired
    public UserManageController(UserManageService userManageService){ this.userManageService = userManageService;}
}
