package com.hlj.two.topic;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicSubscriber;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class PersistenceReceiver {
	public static void main(String[] args) throws Exception {
		
		String linuxIp = "myLinuxQj";
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		Connection connection = connectionFactory.createConnection();
		//设置连接客户端 id 
		connection.setClientID("HealerJean");
		
		final Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		
		Topic topic = session.createTopic("MyTopic");

		TopicSubscriber consumer = session.createDurableSubscriber(topic, "name");
		System.out.println("创建 MyTopic4 消费者");

		connection.start();
		
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
