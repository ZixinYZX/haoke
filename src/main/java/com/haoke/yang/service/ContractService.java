package com.haoke.yang.service;

import com.haoke.yang.bean.Contract;
import com.haoke.yang.bean.House;
import com.haoke.yang.dao.ContractMapper;
import com.haoke.yang.dao.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.service
 * @date 2019/12/29 17:27
 */
@Service
public class ContractService {
    private ContractMapper contractMapper;

    @Autowired
    public ContractService(ContractMapper contractMapper){this.contractMapper = contractMapper;}

    public List<Contract> selectAll(){
        return contractMapper.selectAll();
    }
}
