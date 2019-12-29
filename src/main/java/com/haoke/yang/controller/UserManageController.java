package com.haoke.yang.controller;

import com.haoke.yang.bean.User;
import com.haoke.yang.service.LoginService;
import com.haoke.yang.service.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.Iterator;
import java.util.List;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.controller
 * @date 2019/12/23 21:41
 */
@Controller
public class UserManageController {

    private UserManageService userManageService;
    private int userId;
    private List<User> list;
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Autowired
    public UserManageController(UserManageService userManageService){ this.userManageService = userManageService;}

    @RequestMapping("/adminList")
    public String userManage(HttpServletRequest request){
        list = userManageService.adminList();
        request.setAttribute("adminList",list);
        return "admin-list";
    }
    @RequestMapping("/addAdmin")
    public String addAdmin(User user,HttpServletRequest request){
        System.out.println(user.toString());
        Boolean add = userManageService.addAdmin(user);
        System.out.println("addAdmin:" +add);
        list = userManageService.adminList();
        request.setAttribute("adminList",list);
        return "";
    }

    @RequestMapping("/admin-add")
    public String adminAdd(){
        return "admin-add";
    }

    @RequestMapping("/admin-password")
    public String adminPassword(@RequestParam("id") int id, HttpServletRequest request){
        System.out.println(id);
        this.setUserId(id);
        return "admin-password-edit";
    }

    @RequestMapping("/admin-password-edit")
    public String adminPasswordEdit(HttpServletRequest request){
        System.out.println(this.getUserId());
        request.setAttribute("userId",this.getUserId());
        return "admin-password-edit";
    }

    @RequestMapping("/adminDel")
    public String adminDel(@RequestParam("id") int id, HttpServletRequest request){
        System.out.println(id);
        Boolean del = userManageService.delAdmin(id);
        System.out.println("delAdmin:" +del);
        list = userManageService.adminList();
        request.setAttribute("adminList",list);
        return "admin-list";
    }

    @RequestMapping("/passwordUpdate")
    public String passwordUpdate(@RequestParam("oldPassword") String oldPassword,
                                 @RequestParam("newPassword") String newPassword, HttpServletRequest request){
        int id = this.getUserId()-1;
        list = userManageService.adminList();
        System.out.println(list.get(id).toString());
        if(list.get(id).getPassword().equals(oldPassword)){
            list.get(id).setPassword(newPassword);
            userManageService.updateByPrimaryKey(list.get(id));
            request.setAttribute("adminList",list);
            return "admin-list";
        }
        request.setAttribute("userId",this.getUserId());
        return "admin-password-edit";
    }


}
