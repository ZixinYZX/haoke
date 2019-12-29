package com.haoke.yang.controller;

import com.haoke.yang.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.controller
 * @date 2019/12/29 17:28
 */
@Controller
public class ContractController {

    private ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @RequestMapping("/article-list")
    public String contractAdd(HttpServletRequest request){
        return "article-list";
    }
}
