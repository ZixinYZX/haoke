package com.haoke.yang.dao;

import com.haoke.yang.bean.Customer;
import com.haoke.yang.bean.HouseOwner;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    List<Customer> selectAll();

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}