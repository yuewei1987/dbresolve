package com.example.dbresolve;

import com.example.dbresolve.mapper.test01.mdContractMapper;
import com.example.dbresolve.mapper.test02.mdContractNewMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.alibaba.fastjson.*;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbresolveApplicationTests {
    Logger log = LoggerFactory.getLogger(DbresolveApplicationTests.class);
    @Resource
    private SynchronizationData synchronizationData;
    @Resource
    private mdContractMapper contractMapper;

    @Resource
    private com.example.dbresolve.mapper.test02.mdContractNewMapper mdContractNewMapper;
    @Test
    public void contextLoads() {
        synchronizationData.startSynData();
    }

}
