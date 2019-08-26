package com.example.dbresolve.mapper.test02;

import com.example.dbresolve.model.mdContractNew;

import java.util.List;

public interface mdContractNewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(mdContractNew record);

    int insertSelective(mdContractNew record);

    mdContractNew selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(mdContractNew record);

    int updateByPrimaryKey(mdContractNew record);

    int batchAdd(List<mdContractNew> contactList);
}