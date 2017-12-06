package com.hlj.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/** 
 * @author : HealerJean
 * @date   ： 2017年12月6日 上午10:46:16 
 * @Description:
 */
public class JedisPoolMain {
	
	static Jedis jedis = null;
	
	public static void main(String[] args) {
			
			ApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext-redis.xml");
			 
			JedisPool pool = (JedisPool) context.getBean("jedisPool");
			try  {
			jedis = pool.getResource();
			jedis.set("name", "spring jedis pool");
			String name = jedis.get("name");
			System.out.println(name);
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(jedis != null){
				//关闭连接
				jedis.close();
			}
		}
	}
}
