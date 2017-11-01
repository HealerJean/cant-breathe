package com.hlj.mail;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

public class AttachmentMail {
	public static void main(String[] args) throws MessagingException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		JavaMailSenderImpl sender = (JavaMailSenderImpl) ctx
				.getBean("mailSender");
		MimeMessage mailMessage = sender.createMimeMessage();
		MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true);
		messageHelper.setFrom("783023438@qq.com");
		messageHelper.setTo("783023438@qq.com");

		messageHelper.setSubject("�����ʼ���Ƕ��ͼƬ!��");
		// true ��ʾ����HTML��ʽ���ʼ�
		messageHelper.setText(
				"<html><head></head><body><h1>hello!!spring image html mail</h1>"
					+"<a href=http://www.baidu.com>baidu</a>"	+ "<img src=cid:image/></body></html>", true);

		FileSystemResource img = new FileSystemResource(new File("��.png"));

		messageHelper.addAttachment("��.png", img);//��ӵ�����

		sender.send(mailMessage);
		System.out.println("�ʼ����ͳɹ�...");

	}
}