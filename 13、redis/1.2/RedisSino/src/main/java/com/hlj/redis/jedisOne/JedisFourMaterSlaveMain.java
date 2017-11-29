package com.hlj.redis.jedisOne;


import redis.clients.jedis.Jedis;

public class JedisFourMaterSlaveMain {
	
	public static void main(String[] args) {
		masterForSlave();
	}
	
	@SuppressWarnings("resource")
	public static void masterForSlave() {
		//主从复制，配从不配主
		Jedis jedis_M = new Jedis("192.168.1.37",6000);
		jedis_M.auth("123456");

		Jedis jedis_S6001 = new Jedis("192.168.1.37",6001);
		jedis_S6001.auth("123456");
		jedis_S6001.slaveof("192.168.1.37",6000);
	
		
		Jedis jedis_S6002 = new Jedis("192.168.1.37",6002);
		jedis_S6002.auth("123456");
		jedis_S6002.slaveof("192.168.1.37",6000);
		
		jedis_M.set("class","1122V2");
		//jedis_M.del("class"); 
		String result1 = jedis_S6001.get("class");
		String result2 = jedis_S6002.get("class");

		System.out.println(result1+result2);
	}
	
	/**
	 * 不知为何没有成功，反正日志中是成功了
	 */
	public static void slaveBecomeMaster() {
		//主从复制，配从不配主
		Jedis jedis_M = new Jedis("192.168.1.37",6001);
		jedis_M.auth("123456");

		Jedis jedis_S6001 = new Jedis("192.168.1.37",6000);
		jedis_S6001.auth("123456");
		jedis_S6001.slaveof("192.168.1.37",6001);
	
		
		Jedis jedis_S6002 = new Jedis("192.168.1.37",6002);
		jedis_S6002.auth("123456");
		jedis_S6002.slaveof("192.168.1.37",6001);
		
		jedis_M.set("class","1122V2");
		//jedis_M.del("class"); 
		String result1 = jedis_S6001.get("class");
		String result2 = jedis_S6002.get("class");

		System.out.println(result1+result2);
	}
}
