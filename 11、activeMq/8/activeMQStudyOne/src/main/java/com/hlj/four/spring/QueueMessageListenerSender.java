package com.hlj.four.spring;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class QueueMessageListenerSender {
	@Autowired
	private JmsTemplate jmsTemplate = null;
	
	public static void main(String[] args)throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-msglistener-applicationContext.xml");
		QueueMessageListenerSender queueSender = (QueueMessageListenerSender)ctx.getBean("queueMessageListenerSender");

		queueSender.jmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				TextMessage msg = session.createTextMessage("Spring msg（ spring 创建生产者成功）");
				System.out.println("spring 创建 queque生产者成功");

				return msg;
			}
		});
	}

}
