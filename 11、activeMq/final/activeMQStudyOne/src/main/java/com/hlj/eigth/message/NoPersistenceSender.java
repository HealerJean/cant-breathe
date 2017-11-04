package com.hlj.eigth.message;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.AdvisoryConsumer;
import org.apache.activemq.ScheduledMessage;
import org.apache.activemq.advisory.AdvisorySupport;
import org.springframework.aop.framework.AdvisedSupport;

public class NoPersistenceSender {
	public static void main(String[] args) throws Exception {
		
		
		String linuxIp = "myLinuxQj";
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
				"tcp://"+linuxIp+":61616");
		
		Connection connection = connectionFactory.createConnection();
		connection.start();

		Session session = connection.createSession(Boolean.TRUE,
				Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createTopic("advisory_MyTopic");
		
		
		MessageProducer producer = session.createProducer(destination);
		System.out.println("创建 advisory_MyTopic 生产者");
		for (int i = 0; i < 3; i++) {
		
			TextMessage message = session.createTextMessage("message111--" + i);
			
			long delay = 3 * 1000;  //延迟3秒
	        long period = 3 * 1000; //周期3秒
	        int repeat = 5;	   //重复5次
	        message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_DELAY, delay);
	        message.setLongProperty(ScheduledMessage.AMQ_SCHEDULED_PERIOD, period);
	        message.setIntProperty(ScheduledMessage.AMQ_SCHEDULED_REPEAT, repeat);
	        
			// 通过消息生产者发出消息
			producer.send(message);
		}
		
		session.commit();
		session.close();
		connection.close();
	}
}