package com.hlj.redis.jedisOne;

import java.util.Set;

import redis.clients.jedis.Jedis;
/**
 * 
 * 1、测试Jedis 连接redis
 * 2、set get exists 方法
 */
public class JedisOneMain {

	public static void main(String[] args) {
		ConnectRedis();
		testKey();
	}
	/**
	 * 1、连接redis
	 */
	public  static  Jedis ConnectRedis(){
		Jedis jedis = new Jedis("127.0.0.1",6379);
		System.out.println(jedis.ping()+"连接成功");
		return  jedis;
	}

	/**
	 * 2、set get 
	 */
	public static void testKey()
	{
		Jedis jedis =ConnectRedis();
		
		System.out.println("1、********jedis.set(key,val)********");
		jedis.set("k1","v1");
		jedis.set("k2","v2");
		jedis.set("k3","v3");
		System.out.println("2、********jedis.keys('*')********");
		
		System.out.println("k3的值为："+jedis.get("k3"));
		Set<String> sets = jedis.keys("*");
	
		System.out.println("3、********sets.size********");
		System.out.println("key的数量为："+sets.size());
		//后续请参考脑图，家庭作业，敲一遍......
		System.out.println("k1存在吗："+jedis.exists("k1"));
		System.out.println("k4存在吗："+jedis.exists("k4"));


	}
	
	

}
