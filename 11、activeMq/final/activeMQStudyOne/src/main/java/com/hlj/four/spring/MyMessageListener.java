package com.hlj.four.spring;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMessageListener implements MessageListener {

	public void onMessage(Message msg) {
		TextMessage txtMsg = (TextMessage)msg;
		try {
			System.out.println("receive messgeListener监听成功 ==="+txtMsg.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
