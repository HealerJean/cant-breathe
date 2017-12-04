package com.hlj.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @Description
 * @Author HealerJean
 * @Date 2017/12/4  11:15.
 如果需要添加失效时间可以使用以下的写法：
 @EnableRedisHttpSession(maxInactiveIntervalInSeconds = 60) //1分钟失效
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}
