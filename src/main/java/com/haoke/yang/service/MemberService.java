package com.haoke.yang.service;

import com.haoke.yang.bean.Customer;
import com.haoke.yang.bean.HouseOwner;
import com.haoke.yang.bean.User;
import com.haoke.yang.dao.CustomerMapper;
import com.haoke.yang.dao.HouseOwnerMapper;
import com.haoke.yang.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.service
 * @date 2019/12/29 15:45
 */
@Service
public class MemberService {

    private CustomerMapper customerMapper;
    private HouseOwnerMapper houseOwnerMapper;

    @Autowired
    public MemberService(CustomerMapper customerMapper,HouseOwnerMapper houseOwnerMapper){
        this.customerMapper = customerMapper;
        this.houseOwnerMapper = houseOwnerMapper;
    }

    public List<Customer> customerList() {
        return customerMapper.selectAll();
    }
    public List<HouseOwner> houseOwnersList() {
        return houseOwnerMapper.selectAll();
    }
}
