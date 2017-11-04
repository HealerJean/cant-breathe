package com.hlj.servenMessageDispatch;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class NoPerSender {
	public static void main(String[] args) throws Exception {

		String linuxIp = "myLinuxQj";
		ConnectionFactory cf = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		
		Connection connection = cf.createConnection();
		connection.start();

		Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createTopic("MyTopic");
		for(int i=0;i<2;i++){
			MessageProducer producer = session.createProducer(destination);
			
			for (int j = 0; j < 3; j++) {
				TextMessage message = session.createTextMessage("第"+i+"个生产者，第" + j+"条消息");
				
				// 通过消息生产者发出消息
				producer.send(message);
			}
			session.commit();
		}		
		session.close();
		connection.close();
	}
}