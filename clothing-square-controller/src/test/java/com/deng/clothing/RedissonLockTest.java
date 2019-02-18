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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedissonLockTest {

    @Resource(name = "redisson")
    private RedissonClient redisson;

    @Test
    public void testRedissonLock(){
        RLock lock = redisson.getLock("myLock");
        lock.lock(10,TimeUnit.SECONDS);
    }
}
