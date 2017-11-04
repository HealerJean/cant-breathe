package com.hlj.four.spring.prepetries;

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

import com.alibaba.fastjson.JSONObject;

@Service("QueuePropetriesSender")
public class QueuePropetriesSender {
	@Autowired
	private JmsTemplate activeMqJmsTemplate = null;
	
	public static void main(String[] args)throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mq-propetries.xml");
		QueuePropetriesSender queueSender = (QueuePropetriesSender)ctx.getBean("QueuePropetriesSender");

		queueSender.activeMqJmsTemplate.send(new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				TextMessage msg = session.createTextMessage("Spring activemq mail 创建成功");
				System.out.println("Spring activemq mail 创建成功");

				return msg;
			}
		});
	}  
}
