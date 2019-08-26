package com.example.dbresolve.mapper.test01;

import com.example.dbresolve.model.mdContract;
import com.example.dbresolve.model.mdContractAccount;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface mdContractAccountMapper {
    int deleteByPrimaryKey(Integer contractAccountId);

    int insert(mdContractAccount record);

    int insertSelective(mdContractAccount record);

    mdContractAccount selectByPrimaryKey(Integer contractAccountId);

    int updateByPrimaryKeySelective(mdContractAccount record);

    int updateByPrimaryKey(mdContractAccount record);
    long getMaxSid();

    long getTotalNumber(@Param("maxSid") long maxSid);

    List<mdContractAccount> getSynData(long currentPage, long currentSid, long maxSid, long pageSize);
}