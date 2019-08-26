package com.example.dbresolve.mapper.test01;

import com.example.dbresolve.model.mdContract;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface mdContractMapper {
    int deleteByPrimaryKey(Integer contractId);

    int insert(mdContract record);

    int insertSelective(mdContract record);

    mdContract selectByPrimaryKey(Integer contractId);


    int updateByPrimaryKeySelective(mdContract record);

    int updateByPrimaryKey(mdContract record);

    long getMaxSid();

    long getTotalNumber(@Param("maxSid") long maxSid);

    List<mdContract> getSynData(long currentPage, long currentSid,  long maxSid,long pageSize);
}