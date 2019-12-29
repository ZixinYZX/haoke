package com.haoke.yang.service;

import com.haoke.yang.bean.CustomerNeed;
import com.haoke.yang.dao.CustomerNeedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.service
 * @date 2019/12/29 17:31
 */
@Service
public class NeedService {
    private CustomerNeedMapper customerNeedMapper;

    @Autowired
    public NeedService(CustomerNeedMapper customerNeedMapper) {
        this.customerNeedMapper = customerNeedMapper;
    }

    public List<CustomerNeed> selectAll(){
        return customerNeedMapper.selectAll();
    }
}
