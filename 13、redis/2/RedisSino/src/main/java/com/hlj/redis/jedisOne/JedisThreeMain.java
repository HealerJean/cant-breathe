package com.hlj.redis.jedisOne;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisThreeMain {

	public static void main(String[] args) {
		JedisPool jedisPool = JedisThreeJedisPoolUtil.getJedisPoolInstance();
		JedisPool jedisPool2 = JedisThreeJedisPoolUtil.getJedisPoolInstance();
		
		System.out.println(jedisPool == jedisPool2);
		

		Jedis jedis1 = null;
		Jedis jedis2 = null;
		try {
			jedis1 = jedisPool.getResource();
			jedis1.set("aa","bb");
			jedis2 = jedisPool2.getResource();
			System.out.println(jedis2.get("aa"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JedisThreeJedisPoolUtil.release(jedisPool); //这个方法我自己编的不靠谱
		}
	}
}
