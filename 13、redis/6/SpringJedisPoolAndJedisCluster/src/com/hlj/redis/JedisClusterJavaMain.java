package com.hlj.redis;

import java.util.HashSet;
import java.util.Set;


import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

/** 
 * @author : HealerJean
 * @date   �� 2017��12��6�� ����11:13:12 
 * @Description:
 */
public class JedisClusterJavaMain {


	public static void main(String[] args) {


		JedisPoolConfig config = new JedisPoolConfig();
		// ���������
		config.setMaxTotal(30);
		// ������ӿ�����
		config.setMaxIdle(2);

		//��Ⱥ���
		Set<HostAndPort> jedisClusterNode = new HashSet<HostAndPort>();
		jedisClusterNode.add(new HostAndPort("127.0.0.1", 7000));
		jedisClusterNode.add(new HostAndPort("127.0.0.1", 7001));
		jedisClusterNode.add(new HostAndPort("127.0.0.1", 7002));
		jedisClusterNode.add(new HostAndPort("127.0.0.1", 7003));
		jedisClusterNode.add(new HostAndPort("127.0.0.1", 7004));
		jedisClusterNode.add(new HostAndPort("127.0.0.1", 7005));
		JedisCluster jc = new JedisCluster(jedisClusterNode, config);
		
		JedisCluster jcd = new JedisCluster(jedisClusterNode);
		jcd.set("name", "zhangsan");
		String value = jcd.get("name");
		System.out.println(value);
	}

}
