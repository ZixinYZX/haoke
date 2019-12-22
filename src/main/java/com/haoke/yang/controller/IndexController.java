package com.haoke.yang.controller;

import com.haoke.yang.bean.User;
import com.haoke.yang.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.yang.controller
 * @date 2019/12/22 15:29
 */

@Controller
public class IndexController {

    private LoginService loginService;

    @Autowired
    public IndexController(LoginService loginService){ this.loginService = loginService;}


    @RequestMapping("/index")
    public String index(){
        return "hello";
    }

    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request){
        User user = loginService.userLogin(username,password);
        if(user != null){  //登录成功
            request.getSession().setAttribute("session_user",user);     //将用户信息放入session
            return "success";
        }
        return "hello";
    }
}
