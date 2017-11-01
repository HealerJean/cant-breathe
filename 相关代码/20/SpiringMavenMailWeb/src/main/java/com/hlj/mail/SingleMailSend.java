package com.hlj.mail;

import javax.mail.MessagingException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class SingleMailSend {


	static ApplicationContext context = new ClassPathXmlApplicationContext(
			"module/applicationMail.xml");
	static MailSender sender = (MailSender) context.getBean("mailSender");
	static SimpleMailMessage mailMessage = (SimpleMailMessage) context.getBean("mailMessage");
	public static void main(String args[]) throws MessagingException {		
		mailMessage.setSubject("���");
		mailMessage.setText("�����һ��ͨ��Spring����������ʼ���С����");
		mailMessage.setTo("mxzdhealer@163.com");
		sender.send(mailMessage);
	}
}