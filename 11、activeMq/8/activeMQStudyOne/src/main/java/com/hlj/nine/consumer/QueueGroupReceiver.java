package com.hlj.nine.consumer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQMessageConsumer;

public class QueueGroupReceiver {
	public static void main(String[] args) throws Exception {
		String linuxIp = "myLinuxQj";
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		Connection connection = connectionFactory.createConnection();
		
		connection.start();

		final Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("GroupQueue");

		for(int i=0;i<2;i++){
			//final MessageConsumer consumer = session.createConsumer(destination);
			final MessageConsumer consumer = session.createConsumer(destination,"age >=23");
				consumer.setMessageListener(new MessageListener() {				
				public void onMessage(Message m) {
					TextMessage msg = (TextMessage)m;
					try {
						System.out.println(consumer+ " ==QR1111111==="+msg.getText());
						session.commit();
					} catch (JMSException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

}
