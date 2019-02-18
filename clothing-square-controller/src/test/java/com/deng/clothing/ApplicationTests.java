package com.deng.clothing;

import com.deng.clothing.DTO.WrapperZk;
import com.deng.clothing.api.DistributedLock;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;
import org.apache.curator.retry.RetryNTimes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Resource
    private DistributedLock distributedLockImpl;

    @Resource
    private WrapperZk wrapperZk;

    public static final ExecutorService executorService = new ThreadPoolExecutor(100, 200, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque());

    @Test
    public void contextLoads() {
        System.out.println("xxxx");
    }

    @Test
    public void testWrapperZk() {
        for (int i = 0; i < 2; i++) {
            executorService.execute(new Runnable() {

                @Override
                public void run() {
                    distributedLockImpl.printLock();
                }
            });

        }
    }

    @Test
    public void testRedisson() {
        for (int i = 0; i < 100; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    distributedLockImpl.printLock();
                }
            });
        }
    }

    @Test
    public void testLock(){
        CuratorFramework curatorFramework =CuratorFrameworkFactory.newClient(
                wrapperZk.getConnectString(),
                wrapperZk.getSessionTimeoutMs(),
                wrapperZk.getConnectionTimeoutMs(),
                new RetryNTimes(wrapperZk.getRetryCount(), wrapperZk.getElapsedTimeMs()));
        curatorFramework.start();
        for (int i = 0; i <100 ; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("尝试获取锁。。。");

                    InterProcessMutex lock = new InterProcessMutex(curatorFramework, "/lock/myLock");
                    try {
                        lock.acquire();
                    } catch (Exception e) {
                        System.out.println("获取锁失败");
                    }
                    System.out.println("获得锁");

                    try {
                        System.out.println("执行中。。。。。。。。。。");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("执行完，释放锁");
                    try {
                        lock.release();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("释放成功");
                }
            });
        }
    }
}