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

		messageHelper.setSubject("测试邮件中嵌套图片!！");
		// true 表示启动HTML格式的邮件
		messageHelper.setText(
				"<html><head></head><body><h1>hello!!spring image html mail</h1>"
					+"<a href=http://www.baidu.com>baidu</a>"	+ "<img src=cid:image/></body></html>", true);

		FileSystemResource img = new FileSystemResource(new File("单.png"));

		messageHelper.addAttachment("单.png", img);//添加到附件

		sender.send(mailMessage);
		System.out.println("邮件发送成功...");

	}
}