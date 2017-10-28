package com.hlj.two.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;

public class NoPersistenceReceiver {
	public static void main(String[] args) throws Exception {
		
		
		String linuxIp = "myLinuxQj";
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		Connection connection = connectionFactory.createConnection();
		connection.start();
		
		final Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createTopic("advisory_MyTopic");

		
		MessageConsumer consumer = session.createConsumer(destination);
		System.out.println("创建 advisory_MyTopic 消费者");
		Message message = consumer.receive();
	    while(message!=null) {  
	        TextMessage txtMsg = (TextMessage)message;  
	        System.out.println("收到消 息：" + txtMsg.getText());        
	        message = consumer.receive(1000L);
	    } 
	    session.commit();
		session.close();
		connection.close();
	}

}
