package com.hlj.four.spring;

import javax.jms.MessageConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class TopicReceiver {
	@Autowired
	private JmsTemplate jmsTemplate = null;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-queue-applicationContext.xml");
		TopicReceiver queueReceiver = (TopicReceiver) context.getBean("topicReceiver");
		
		String msg = (String) queueReceiver.jmsTemplate.receiveAndConvert();
	
		/**
		 * 采用MessageListerer监听 （自带的）
		 * 
		 */
		
		
		System.out.println("msg===" + msg);		
	}

}
