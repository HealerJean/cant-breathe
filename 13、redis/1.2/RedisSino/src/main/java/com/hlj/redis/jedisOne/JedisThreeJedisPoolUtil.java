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
					//�������jedisʵ����
				poolConfig.setMaxTotal(1000);
					//������Դ�����������
				poolConfig.setMaxIdle(200);
					//�ȴ��������ӵ����ʱ��
				poolConfig.setMaxWaitMillis(10000);
		        
				//��borrowһ��jedisʵ��ʱ���Ƿ���ǰ����validate���������Ϊtrue����õ���jedisʵ�����ǿ��õ�
				poolConfig.setTestOnBorrow(true);
				
				jedisPool = new JedisPool(poolConfig,"127.0.0.1",6379);
				}
			} 
		}
		return jedisPool;
	}

	////�ͷ�Jedis��Դ
	public static void release(JedisPool jedisPool)
	{
		if(null != jedisPool)
		{
			jedisPool.close();
		}
	}
	
}
