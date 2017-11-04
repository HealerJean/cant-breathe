package com.hlj.four.spring.prepetries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class QueuePropetriesReceiver {
	@Autowired
	private JmsTemplate activeMqJmsTemplate = null;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-mq-propetries.xml");
		QueuePropetriesReceiver queueReceiver = (QueuePropetriesReceiver) context.getBean(QueuePropetriesReceiver.class);
		
		String msg = (String) queueReceiver.activeMqJmsTemplate.receiveAndConvert();
	
		System.out.println("msg===" + msg);		
	}

}
