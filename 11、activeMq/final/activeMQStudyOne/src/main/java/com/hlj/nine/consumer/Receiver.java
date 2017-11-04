package com.hlj.nine.consumer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MapMessage;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQMessageConsumer;
import org.apache.activemq.RedeliveryPolicy;

/**
 * 测试 接收次数
 * @author HealerJean
 *
 */
public class Receiver {
	public static void main(String[] args) throws Exception {

		String linuxIp = "myLinuxQj";
		ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		
		
		RedeliveryPolicy policy = new RedeliveryPolicy();
		policy.setMaximumRedeliveries(3);
		cf.setRedeliveryPolicy(policy);
		
		Connection connection = cf.createConnection();
		connection.start();


		final Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("CountTestQueue");

		ActiveMQMessageConsumer consumer = (ActiveMQMessageConsumer)session.createConsumer(destination);
		int i = 0;
		while (i < 2) {
			
			MapMessage message = (MapMessage) consumer.receive();

//			
			System.out.println("收到消 息：" + message.getString("messageAA--" + i) 
					+" , property=="+message.getStringProperty("extra"));
			
			i++;

		}
		session.close();
		connection.close();
	}

}
