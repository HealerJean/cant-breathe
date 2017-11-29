package com.kfit.config;

import java.lang.reflect.Method;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
//@Configuration
//@EnableCaching
public class RedisCacheConfig3 extends CachingConfigurerSupport {

	@Bean
	public KeyGenerator keyGenerator() {
		System.out.println("RedisCacheConfig.keyGenerator()");
		return new KeyGenerator() {
			@Override
			public Object generate(Object o, Method method, Object... objects) {
				// This will generate a unique key of the class name, the method
				// name,
				// and all method parameters appended.
				StringBuilder sb = new StringBuilder();
				sb.append(o.getClass().getName());
				sb.append(method.getName());
				for (Object obj : objects) {
					sb.append(obj.toString());
				}
				System.out.println("RedisCacheConfig.keyGenerator().new KeyGenerator() {...}.generate()=" + sb);
				return sb.toString();
			}
		};
	}

	/**
	 * 自定义key的生成策略(非必須的.)
	 * 
	 * @return
	 */
	// @Bean(name="keyGenerator")
	// public KeyGenerator keyGenerator() {
	// //结果：com.kfit.service.impl.DemoInfoServiceImplfindById2
	// return new KeyGenerator() {
	// @Override
	// public Object generate(Object target, Method method, Object... params) {
	// StringBuilder sb = new StringBuilder();
	// sb.append(target.getClass().getName());
	// sb.append(method.getName());
	// for (Object obj : params) {
	// sb.append(obj.toString());
	// }
	// System.out.println(sb.toString());
	// return sb.toString();
	// }
	// };
	// }

	@Bean
	public CacheManager cacheManager(RedisTemplate<?,?> redisTemplate) {
		CacheManager cacheManager = new RedisCacheManager(redisTemplate);
		return cacheManager;
	}

	/**
	 * 
	 * 
	 * RedisConnectionFactory 使用默认进行注入，也可以自己使用 （注入：）
	 * 
	 * @Bean public JedisConnectionFactory redisConnectionFactory() {
	 *       JedisConnectionFactory redisConnectionFactory = new
	 *       JedisConnectionFactory();
	 * 
	 *       // Defaults redisConnectionFactory.setHostName("127.0.0.1");
	 *       redisConnectionFactory.setPort(6379); return
	 *       redisConnectionFactory; }
	 * @param factory
	 * @return
	 */
	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
		RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
		redisTemplate.setConnectionFactory(factory);
		RedisSerializer<String> redisSerializer = new StringRedisSerializer();//Long类型不可以会出现异常信息;
		
		//key序列化方式;
		redisTemplate.setKeySerializer(redisSerializer);
		redisTemplate.setHashKeySerializer(redisSerializer);
		
		return redisTemplate;
	}

}