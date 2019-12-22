package com.haoke.yang.dao;

import com.haoke.yang.bean.HouseOwner;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseOwnerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseOwner record);

    int insertSelective(HouseOwner record);

    HouseOwner selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HouseOwner record);

    int updateByPrimaryKey(HouseOwner record);
}