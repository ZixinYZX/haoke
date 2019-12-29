package com.haoke.yang.dao;

import com.haoke.yang.bean.House;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface HouseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Integer id);

    List<House> selectAll();

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);
}