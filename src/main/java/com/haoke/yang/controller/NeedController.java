package com.haoke.yang.controller;

import com.haoke.yang.service.NeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.controller
 * @date 2019/12/29 17:33
 */
@Controller
public class NeedController {
    private NeedService needService;

    @Autowired
    public NeedController(NeedService needService) {
        this.needService = needService;
    }

    @RequestMapping("/picture-list")
    public String needList(HttpServletRequest request){
        return "picture-list";
    }
}
