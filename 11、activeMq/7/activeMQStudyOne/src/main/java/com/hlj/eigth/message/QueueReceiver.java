package com.hlj.eigth.message;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MapMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQMessageConsumer;
import org.apache.activemq.RedeliveryPolicy;

public class QueueReceiver {
	public static void main(String[] args) throws Exception {

		String linuxIp = "myLinuxQj";
		ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		
		
		RedeliveryPolicy policy = new RedeliveryPolicy();
		policy.setMaximumRedeliveries(3);
		cf.setRedeliveryPolicy(policy);
		
		Connection connection = cf.createConnection();
		connection.start();

		

		final Session session = connection.createSession(Boolean.FALSE,
				Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("my-queue3");

		ActiveMQMessageConsumer consumer = (ActiveMQMessageConsumer)session.createConsumer(destination);
		
		
		int i = 0;
		while (i < 3) {

			MapMessage message = (MapMessage) consumer.receive();
			System.out.println("收到消 息：" + message.getString("messageAA--" + i) 
					+" , property=="+message.getStringProperty("extra"));
			
			i++;
			

		}
		session.close();
		connection.close();
	}

}
