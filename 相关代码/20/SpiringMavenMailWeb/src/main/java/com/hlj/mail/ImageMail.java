package com.hlj.mail;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.hlj.mail.bean.MailBean;
import com.hlj.mail.service.MailSenderService;

/**
 * 2�����ʹ���ͼƬ���ʼ�����Ƕ��HTML�ķ�ʽ
 *
 */
public class ImageMail {

	public static void main(String[] args) throws MessagingException, UnsupportedEncodingException {

		 ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
	
		
		  MailSenderService mailSenderService = (MailSenderService) ctx.getBean("mailSenderService");  
	      MailBean mailBean = new MailBean();  
	     
	      mailBean.setFrom("zyj18842637651@sohu.com");  
	      mailBean.setFromName(null);  
	      
	      mailBean.setSubject("�����ʼ���Ƕ��ͼƬ!��");
	      mailBean.setText(
				"<html><head></head><body><h1>hello!!spring image html mail</h1>"
					+"<a href=http://www.baidu.com>baidu</a>"	+ "<img src=cid:image/></body></html>");
	      //���Է��͸�����
	      mailBean.setToEmails(new String[]{"mxzdhealer@163.com"});

	      /**
	       * ������������е�ͼƬ
	       */
		  FileSystemResource img = new FileSystemResource(new File("a.jpg"));
		  Map<String,Object> imageaAttachment = new HashMap<String, Object>();
		  imageaAttachment.put("image", img);//���ͼƬ����
		  mailBean.setImageAttachment(imageaAttachment);
	        
		  mailSenderService.sendMail(mailBean);  

		  System.out.println("�ʼ����ͳɹ�...");
	}
}
