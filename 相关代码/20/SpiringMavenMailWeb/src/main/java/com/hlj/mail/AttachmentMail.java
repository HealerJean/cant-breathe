package com.hlj.mail;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.hlj.mail.bean.MailBean;
import com.hlj.mail.service.MailSenderService;

/**
 * 测试发送附件
 * @author HealerJean
 *
 */
public class AttachmentMail {
	

	public static void main(String[] args) throws MessagingException, UnsupportedEncodingException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		
		  MailSenderService mailSenderService = (MailSenderService) ctx.getBean("mailSenderService");  
	       MailBean mailBean = new MailBean();  
	     
	        mailBean.setFrom("zyj18842637651@sohu.com");  
	        mailBean.setFromName("你好 HealerJean");  
	        mailBean.setSubject("测试附件的发送!！");  
	        mailBean.setToEmails(new String[]{"729088240@qq.com","mxzdhealer@163.com"});  
	        mailBean.setText("<a href='www.baidu.com'><font color='red'>fdsfdsf</font></a>");  
	        mailBean.setText(
					"<html><head></head><body><h1>hello!!spring image html mail</h1>"
						+"<a href=http://www.baidu.com>百度</a>"	+ "</body></html>");
			
	    	//整个项目的路径下,添加附件
			FileSystemResource img = new FileSystemResource(new File("a.jpg"));
			Map<String,Object> attachment = new HashMap<String, Object>();
			attachment.put("a.jpg", img);//添加到附件
			attachment.put("b.jpg", img);//添加到附件

			mailBean.setAttachment(attachment);
	        
			
			mailSenderService.sendMail(mailBean);  
	      
		
		
		
	
	/*	// true 表示启动HTML格式的邮件
		messageHelper.setText(
				"<html><head></head><body><h1>hello!!spring image html mail</h1>"
					+"<a href=http://www.baidu.com>百度</a>"	+ "</body></html>", true);
	
		//附件名字任意
		messageHelper.addAttachment("a.jpg", img);//添加到附件

		sender.send(mailMessage);*/
		System.out.println("邮件发送成功...");

	}
}