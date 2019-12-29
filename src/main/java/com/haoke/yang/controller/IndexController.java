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
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request){
        User user = loginService.userLogin(username,password);
        if(user != null){  //登录成功
            request.getSession().setAttribute("userName",user.getUsername());     //将用户信息放入session
            if (user.getUsername().equals("admin"))
                return "index";
            else
                return "index-2";
        }
        request.setAttribute("loginMessage","账号或密码错误");
        return "login";
    }
    @RequestMapping("/userLogout")
    public String userLogout(HttpServletRequest request){
        request.getSession().setAttribute("userName",null);
        return "login";
    }
}
