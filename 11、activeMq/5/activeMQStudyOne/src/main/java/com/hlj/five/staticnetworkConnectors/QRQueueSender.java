package com.hlj.five.staticnetworkConnectors;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;


public class QRQueueSender {
	public static void main(String[] args) throws Exception {

		String linuxIp = "myLinuxQj";
		ConnectionFactory cf = new ActiveMQConnectionFactory(
				"failover:(tcp://"+linuxIp+":61616,tcp://"+linuxIp+":61617)?randomize=false");
		Connection connection = cf.createConnection();
		connection.start();

		Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createQueue("QR");
		
		
		MessageProducer producer = session.createProducer(destination);
		
		for (int i = 0; i < 30; i++) {
			TextMessage message = session.createTextMessage("messageCC--" + i);
			producer.send(message);
		}
		
		session.commit();
		session.close();
		connection.close();
	}
}