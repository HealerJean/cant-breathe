package com.hlj.two.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ScheduledMessage;

public class NoPersistenceSender {
	public static void main(String[] args) throws Exception {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"tcp://localhost:61616");
		
		Connection connection = connectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createTopic("MyTopic");
		
		MessageProducer producer = session.createProducer(destination);
		System.out.println("创建 Mytopic 生产者");
		for (int i = 0; i < 3; i++) {
			TextMessage message = session.createTextMessage("message111--" + i);
			
			// 通过消息生产者发出消息
			producer.send(message);
		}
		
		session.commit();
		session.close();
		connection.close();
	}
}