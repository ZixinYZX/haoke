package com.haoke.yang.dao;

import com.haoke.yang.bean.HouseOwner;
import com.haoke.yang.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HouseOwnerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HouseOwner record);

    int insertSelective(HouseOwner record);

    HouseOwner selectByPrimaryKey(Integer id);

    List<HouseOwner> selectAll();

    int updateByPrimaryKeySelective(HouseOwner record);

    int updateByPrimaryKey(HouseOwner record);
}