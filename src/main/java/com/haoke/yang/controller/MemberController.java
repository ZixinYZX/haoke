package com.haoke.yang.controller;

import com.haoke.yang.bean.Customer;
import com.haoke.yang.bean.HouseOwner;
import com.haoke.yang.bean.User;
import com.haoke.yang.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.controller
 * @date 2019/12/29 15:45
 */
@Controller
public class MemberController {
        private MemberService memberService;
        private int userId;
        private List<Customer> list1;
        private List<HouseOwner> list2;
        public int getUserId() {
                return userId;
        }

        public void setUserId(int userId) {
                this.userId = userId;
        }

        @Autowired
        public MemberController(MemberService memberService){ this.memberService = memberService;}

        @RequestMapping("/member-list")
        public String memberList(HttpServletRequest request){
                list1 = memberService.customerList();
                list2 = memberService.houseOwnersList();
                System.out.println(list1.get(0).toString());
                System.out.println(list1.get(1).toString());
                System.out.println(list2.get(0).toString());
                System.out.println(list2.get(1).toString());
                request.setAttribute("list1",list1);
                request.setAttribute("list2",list2);
                return "member-list";
        }
        @RequestMapping("/member-add")
        public String memberAdd(HttpServletRequest request){
                return "member-add";
        }
}
