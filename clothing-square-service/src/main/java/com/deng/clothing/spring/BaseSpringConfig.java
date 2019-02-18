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
package com.deng.clothing.spring;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseSpringConfig {
    @Bean(name = "redisson")
    public RedissonClient initRedissonClient(){
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379")
                .setConnectTimeout(3000)
                .setRetryInterval(2000)
                .setRetryAttempts(2);
        RedissonClient redisson = Redisson.create(config);
        return redisson;
    }
}
