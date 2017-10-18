package com.hlj.four.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class QueueReceiver {
	@Autowired
	private JmsTemplate jmsTemplate = null;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-queue-applicationContext.xml");
		QueueReceiver queueReceiver = (QueueReceiver) context.getBean("queueReceiver");
		
		String msg = (String) queueReceiver.jmsTemplate.receiveAndConvert();
	
		System.out.println("msg===" + msg);		
	}

}
