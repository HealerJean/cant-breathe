package com.hlj.activemqOne;

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
		
//		Enumeration names = connection.getMetaData().getJMSXPropertyNames();
//		while(names.hasMoreElements()){
//			String name = (String)names.nextElement();
//			System.out.println("jmsx name==="+name);
//		}
		

		final Session session = connection.createSession(Boolean.FALSE,
				Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("my-queue3");

		ActiveMQMessageConsumer consumer = (ActiveMQMessageConsumer)session.createConsumer(destination);
		
		
		int i = 0;
		while (i < 3) {
//			i++;
//			TextMessage message = (TextMessage) consumer.receive();
			
			
			
			MapMessage message = (MapMessage) consumer.receive();
			
			
			
			
//			session.commit();
			
//			if(i==2){
//				message.acknowledge();
//			}
//			
			System.out.println("收到消 息：" + message.getString("messageAA--" + i) 
					+" , property=="+message.getStringProperty("extra"));
			
			i++;
			
//			session.commit();
		}
		session.close();
		connection.close();
	}

}
