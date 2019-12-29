package com.haoke.yang.controller;

import com.haoke.yang.bean.House;
import com.haoke.yang.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.controller
 * @date 2019/12/29 17:20
 */
@Controller
public class HouseController {

    private HouseService houseService;
    private List<House> list;
    @Autowired
    public HouseController(HouseService houseService){this.houseService = houseService;}

    @RequestMapping("/product-list")
    public String memberList(HttpServletRequest request){
        list = houseService.selectAll();
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());
        request.setAttribute("list",list);
        return "product-list";
    }
}
