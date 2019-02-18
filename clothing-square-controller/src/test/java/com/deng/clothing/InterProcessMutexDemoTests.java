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
package com.deng.clothing;

import com.deng.clothing.DTO.FakeLimitedResource;
import com.deng.clothing.DTO.InterProcessMutexDemo;
import com.deng.clothing.DTO.WrapperZk;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InterProcessMutexDemoTests {
    private static final int QTY = 5;

    private static final int REPETITIONS = QTY * 10;

    private static final String PATH = "/examples/locks";

    @Resource
    private WrapperZk wrapperZk;

    @Test
    public void  testInterProcessMutexLock(){
        final FakeLimitedResource resource = new FakeLimitedResource();
        ExecutorService service = Executors.newFixedThreadPool(QTY);
            for (int i = 0; i < QTY; ++i) {
                final int index = i;
                Callable<Void> task = new Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        CuratorFramework client = CuratorFrameworkFactory.newClient(wrapperZk.getConnectString(), new ExponentialBackoffRetry(1000, 3));
                        try {
                            client.start();
                            final InterProcessMutexDemo example = new InterProcessMutexDemo(client, PATH, resource, "Client " + index);
                            for (int j = 0; j < REPETITIONS; ++j) {
                                example.doWork(10, TimeUnit.SECONDS);
                            }
                        } catch (Throwable e) {
                            e.printStackTrace();
                        }
                        return null;
                    }
                };
                service.submit(task);
            }
    }

}
