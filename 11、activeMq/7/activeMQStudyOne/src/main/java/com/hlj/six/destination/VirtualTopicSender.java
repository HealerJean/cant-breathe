package com.hlj.six.destination;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;


public class VirtualTopicSender {
	public static void main(String[] args) throws Exception {

		String linuxIp = "myLinuxQj";
		ConnectionFactory cf = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		Connection connection = cf.createConnection();
		connection.start();

		Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		
		 Destination destination = session.createTopic("VirtualTopic.Orders");


		
		MessageProducer producer = session.createProducer(destination);
		
		for (int i = 0; i < 3; i++) {
			TextMessage message = session.createTextMessage("messageCC--" + i);
			producer.send(message);
		}
		
		session.commit();
		session.close();
		connection.close();
	}
}