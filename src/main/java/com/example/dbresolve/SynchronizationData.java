package com.example.dbresolve;

import com.example.dbresolve.mapper.test01.mdContractAccountMapper;
import com.example.dbresolve.mapper.test01.mdContractMapper;
import com.example.dbresolve.mapper.test02.mdContractAccountNewMapper;
import com.example.dbresolve.model.mdContract;
import com.example.dbresolve.model.mdContractAccount;
import com.example.dbresolve.model.mdContractAccountNew;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Component
public class SynchronizationData {
private static final Logger logger = LoggerFactory.getLogger(SynchronizationData.class);
//@Autowired
//private com.example.dbresolve.mapper.test01.mdContractMapper mdContractMapper;//需要同步的数据表（mybatis完成）
@Autowired
private com.example.dbresolve.mapper.test01.mdContractAccountMapper mdContractAccountMapper;//需要同步的数据表（mybatis完成）

//@Autowired
//private com.example.dbresolve.mapper.test02.mdContractNewMapper mdContractNewMapper;//需要插入的数据表一（mybatis完成）
@Autowired
private com.example.dbresolve.mapper.test02.mdContractAccountNewMapper mdContractAccountNewMapper;
//@Autowired
//private MiddleFieldMapper middleFieldMapper; //需要插入的数据表二（mybatis完成）

private static ExecutorService executor = Executors.newFixedThreadPool(200); //定义线程池用于多线程执行。

//需要同步总条数
private long totalNumber = 0;
//需要同步的最大进件id;
private long maxSid = 0;
//当前已经同步的sid
private long currentSid = 0;
private long currentPage = 0;
private long maxPage = 0;
private long pageSize =50000;

public void startSynData() {

    //获取当前系统中最大的sid
    maxSid = mdContractAccountMapper.getMaxSid();
    logger.info("需要同步的最大进件id(SID)为:"+ maxSid);
    //根据sid获取总条数
    totalNumber = mdContractAccountMapper.getTotalNumber(maxSid);
    logger.info("需要同步的进件总数为:"+ totalNumber);
    maxPage = totalNumber / pageSize + 1;
    logger.info("最大页数为:"+ maxPage);
    //判断能否开始执行，执行时间为晚上12点到早上8点
    boolean synStart = isSynStart(currentSid, maxSid);
    if (synStart) {
        //开始分页查询
        for (long i = 0; i <= maxPage;) {
            logger.info("当前页数为:"+ currentPage);
            logger.info("当前currentSid为:"+ currentSid);
            List<mdContractAccountNew> contactList = new ArrayList<mdContractAccountNew>();
            currentPage = i;
            //查询需要同步的数据集
            List<mdContractAccount> synDataList = mdContractAccountMapper.getSynData(currentPage, currentSid, maxSid,currentPage+pageSize);
            //遍历集合组装数据
            prepareDataForBatchInsert(contactList, synDataList);
            i = batchAddData(i, contactList, synDataList);
            if(currentPage != i){
                currentSid = synDataList.get(synDataList.size()-1).getContractAccountId();
            }

        }
    } else {
        //不符合同步条件，啥也不做
    }
}

@Transactional //通过事务控制同成功，同失败。
public long batchAddData(long i, List<mdContractAccountNew> contactList, List<mdContractAccount> synDataList) {
    //异步批量插入contactList
    Future<Integer> contactNumber = executor.submit(new mdContractCallable(contactList));
//    //异步批量插入middleList
//    Future<Integer> middleNumber = executor.submit(new middleFiledCallable(middleList));
    try {
        Integer number1 = contactNumber.get();
        //如果都成功则继续
        if (number1 != -1) {
         i++;
        } else {
            //失败则继续当前页执行
        }

    } catch (Exception e) {
        e.printStackTrace();
        //异常并记录当前的sid
        logger.info("异常最小的sid为:"+synDataList.get(0).getContractAccountId());
        logger.info("异常最大的sid为:"+synDataList.get(synDataList.size()-1).getContractAccountId());
    }
    return i;
}
//遍历要同步的数据集合组装要批量插入的数据集合
private void prepareDataForBatchInsert(List<mdContractAccountNew> contactList, List<mdContractAccount> synDataList) {
    for (mdContractAccount application : synDataList) {
        mdContractAccountNew phoneForSelf = new mdContractAccountNew();
        phoneForSelf.setCityId(application.getCityId());
        phoneForSelf.setContractId(application.getContractId());
        phoneForSelf.setAccountStatus(application.getAccountStatus());
        phoneForSelf.setContractAccountId(application.getContractAccountId());
        phoneForSelf.setCustomerId(application.getCustomerId());
        phoneForSelf.setDelFlag(application.getDelFlag());
        phoneForSelf.setHousePropertyId(application.getHousePropertyId());
        phoneForSelf.setMeterId(application.getMeterId());
        contactList.add(phoneForSelf);

    }
}
//判断是否可以开始同步，这里只允许晚上0点到早上八点允许执行
private boolean isSynStart(long currentSid, long maxSid) {
    Date date = new Date();
    int hours = date.getHours();
    if (currentSid < maxSid) {
        return true;
    } else {
        return false;
    }
}
//多线程执行任务一：给联系人表中批量插入数据
class mdContractCallable implements Callable<Integer> {
     private List<mdContractAccountNew> runList;

    public mdContractCallable(List<mdContractAccountNew> runList) {
        this.runList = runList;
    }

    @Override
    public Integer call() {
        try {
            int addNumber = mdContractAccountNewMapper.batchAdd(runList);
            return addNumber;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}

}