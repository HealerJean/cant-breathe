package com.kfit.config;

import java.io.Serializable;
import java.lang.reflect.Method;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

//@Configuration
//@EnableCaching
public class RedisCacheConfig2{


	
	
	/**
	 * 自定义key的生成策略(非必須的.)
	 * 
	 * @return
	 */
	@Bean(name="myKeyGenerator")
	public KeyGenerator myKeyGenerator() {
		//结果：com.kfit.service.impl.DemoInfoServiceImplfindById2
		return new KeyGenerator() {
			@Override
			public Object generate(Object target, Method method, Object... params) {
				StringBuilder sb = new StringBuilder();
				sb.append(target.getClass().getName());
				sb.append(method.getName());
				for (Object obj : params) {
					sb.append(obj.toString());
				}
				System.out.println(sb.toString());
				return sb.toString();
			}
		};
	}

	@Bean
	public CacheManager cacheManager(RedisTemplate<?, ?> redisTemplate) {
		CacheManager  cacheManager  = new RedisCacheManager(redisTemplate);
		return cacheManager;
	}

	@Bean
	public RedisTemplate<Serializable, Serializable> redisTemplate(RedisConnectionFactory factory) {
//		StringRedisTemplate template = new StringRedisTemplate(factory);
		// template.setValueSerializer(new
		// Jackson2JsonRedisSerializer<SysUser>(SysUser.class)); //请注意这里
//		return template;
		RedisTemplate<Serializable,Serializable> template = new RedisTemplate<Serializable,Serializable>();
		template.setConnectionFactory(factory);
		
		//序列化. 主要是key需要序列化，不然在redis是乱码.
//		RedisSerializer<Object> redisSerializer = new JdkSerializationRedisSerializer();//乱码.
//		RedisSerializer redisSerializer = new StringRedisSerializer();//Long类型不可以.
//		RedisSerializer<Object> redisSerializer = new ObjectRedisSerializer();//Long类型不可以.
		
		RedisSerializer<String> objectKeySerializer = new Jackson2JsonRedisSerializer<String>(String.class);
		//无论如何，建议key/hashKey采用StringRedisSerializer。
		template.setKeySerializer(objectKeySerializer);
		template.setHashKeySerializer(objectKeySerializer);
		
//		template.setValueSerializer(new Jackson2JsonRedisSerializer<>(Serializable.class));
//		template.setHashValueSerializer(stringSerializer);
		return template;
	}


}