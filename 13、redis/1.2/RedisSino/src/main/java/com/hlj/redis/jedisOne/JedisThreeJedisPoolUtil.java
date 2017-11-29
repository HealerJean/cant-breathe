package com.hlj.redis.jedisOne;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisThreeJedisPoolUtil 
{
	private static volatile JedisPool jedisPool = null;
	
	private JedisThreeJedisPoolUtil(){}
	
	public static JedisPool getJedisPoolInstance()
	{
		if(null == jedisPool)
		{
			synchronized (JedisThreeJedisPoolUtil.class)
			{
				if(null == jedisPool)
				{
				JedisPoolConfig poolConfig = new JedisPoolConfig();
					//配置最大jedis实例数
				poolConfig.setMaxTotal(1000);
					//配置资源池最大闲置数
				poolConfig.setMaxIdle(200);
					//等待可用连接的最大时间
				poolConfig.setMaxWaitMillis(10000);
		        
				//在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的
				poolConfig.setTestOnBorrow(true);
				
				jedisPool = new JedisPool(poolConfig,"127.0.0.1",6379);
				}
			} 
		}
		return jedisPool;
	}

	////释放Jedis资源
	public static void release(JedisPool jedisPool)
	{
		if(null != jedisPool)
		{
			jedisPool.close();
		}
	}
	
}
