package com.haoke.yang.dao;

import com.haoke.yang.bean.CustomerNeed;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerNeedMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CustomerNeed record);

    int insertSelective(CustomerNeed record);

    CustomerNeed selectByPrimaryKey(Integer id);

    List<CustomerNeed> selectAll();

    int updateByPrimaryKeySelective(CustomerNeed record);

    int updateByPrimaryKey(CustomerNeed record);
}