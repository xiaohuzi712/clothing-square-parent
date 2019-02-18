/* Project of UGC team

======================
Authors:zhuhuchao
======================
Description:
TODO

======================
Major changs:

Added by zhuhuchao on 2019/2/17

*/
package com.deng.clothing.Impl;

import com.deng.clothing.DTO.WrapperZk;
import com.deng.clothing.api.DistributedLock;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.RetryNTimes;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class DistributedLockImpl implements DistributedLock {

    public  final Logger logger = LoggerFactory.getLogger(DistributedLockImpl.class);

    private CuratorFramework curatorFramework;

    @Resource
    private WrapperZk wrapperZk;

    @Resource(name = "redisson")
    private RedissonClient redisson;

    @PostConstruct
    public void initCuratorFramework(){
        curatorFramework =CuratorFrameworkFactory.newClient(
                wrapperZk.getConnectString(),
                wrapperZk.getSessionTimeoutMs(),
                wrapperZk.getConnectionTimeoutMs(),
                new RetryNTimes(wrapperZk.getRetryCount(), wrapperZk.getElapsedTimeMs()));
        curatorFramework.start();
    }
    @Override
    public void printLock() {
        System.out.println("xxxx");
        //InterProcessMutex lock = new InterProcessMutex(curatorFramework, "/locks/myLock");
        RLock lock = redisson.getLock("lock");
        try{
            //lock.acquire(1000,TimeUnit.MILLISECONDS);
            lock.lock();
            System.out.println("获取锁成功");
        }catch (Exception e){
            logger.error("lock failed",e);
//        }finally {
//            try{
//                //lock.release();
//                lock.unlock();
//                System.out.println("释放锁成功");
//            }catch (Exception e){
//                logger.error("release failed",e);
//            }
        }
    }
}
