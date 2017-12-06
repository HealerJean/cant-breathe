package com.hlj.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.JedisCluster;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月6日 上午11:13:12 
 * @Description:
 */
public class JedisClusterSpringMain {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext-jedisCluster.xml");

		JedisCluster jedisCluster = (JedisCluster) context.getBean("jedisCluster");
		
		jedisCluster.set("name", "HealerJean");
		String value = jedisCluster.get("name");
		System.out.println(value);
		
		jedisCluster.del("name");
		String delvalue = jedisCluster.get("name");
		System.out.println(delvalue);

	}
}
