package com.example.dbresolve.mapper.test02;

import com.example.dbresolve.model.mdContractAccountNew;
import com.example.dbresolve.model.mdContractNew;

import java.util.List;

public interface mdContractAccountNewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(mdContractAccountNew record);

    int insertSelective(mdContractAccountNew record);

    mdContractAccountNew selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(mdContractAccountNew record);

    int updateByPrimaryKey(mdContractAccountNew record);

    int batchAdd(List<mdContractAccountNew> contactList);
}