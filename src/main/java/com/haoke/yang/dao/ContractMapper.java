package com.haoke.yang.dao;

import com.haoke.yang.bean.Contract;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Integer id);

    List<Contract> selectAll();

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}