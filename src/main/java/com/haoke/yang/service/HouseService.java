package com.haoke.yang.service;

import com.haoke.yang.bean.House;
import com.haoke.yang.dao.HouseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yangzixin
 * @version V1.0
 * @Package com.haoke.yang.service
 * @date 2019/12/29 17:17
 */
@Service
public class HouseService {
    private HouseMapper houseMapper;

    @Autowired
    public HouseService(HouseMapper houseMapper){this.houseMapper = houseMapper;}

    public List<House> selectAll(){
        return houseMapper.selectAll();
    }
}
