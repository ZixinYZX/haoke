package com.haoke.yang.dao;

import com.haoke.yang.bean.Contract;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Contract record);

    int insertSelective(Contract record);

    Contract selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}