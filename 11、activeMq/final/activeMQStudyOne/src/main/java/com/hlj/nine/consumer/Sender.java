package com.hlj.nine.consumer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQMessageProducer;
import org.apache.activemq.MessageTransformer;
import org.apache.activemq.RedeliveryPolicy;


public class Sender {
	public static void main(String[] args) throws Exception {
		String linuxIp = "myLinuxQj";
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616"); 
		
	
		Connection connection = connectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createQueue("CountTestQueue");
		
		
		ActiveMQMessageProducer producer = (ActiveMQMessageProducer)session.createProducer(destination);
		
		for (int i = 0; i < 2; i++) {
			TextMessage message = session.createTextMessage("messageAA--" + i);
	
			producer.setTransformer(new MessageTransformer() {
				
				public Message producerTransform(Session session, MessageProducer producer,
						Message msg) throws JMSException {
					
					MapMessage message = session.createMapMessage();
					message.setString(((TextMessage)msg).getText(), "my map message AAA=="+((TextMessage)msg).getText());
					message.setStringProperty("extra", "okok");
					return message;
				}
				
				public Message consumerTransform(Session arg0, MessageConsumer arg1,
						Message arg2) throws JMSException {
					// TODO Auto-generated method stub
					return null;
				}
			});
			

			producer.send(message);
		}
		
		session.commit();
		session.close();
		connection.close();
	}
}