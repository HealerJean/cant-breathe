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
 * 2、发送带有图片的邮件，以嵌入HTML的方式
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
	      
	      mailBean.setSubject("测试邮件中嵌套图片!！");
	      mailBean.setText(
				"<html><head></head><body><h1>hello!!spring image html mail</h1>"
					+"<a href=http://www.baidu.com>baidu</a>"	+ "<img src=cid:image/></body></html>");
	      //可以发送给多人
	      mailBean.setToEmails(new String[]{"mxzdhealer@163.com"});

	      /**
	       * 添加上述链接中的图片
	       */
		  FileSystemResource img = new FileSystemResource(new File("a.jpg"));
		  Map<String,Object> imageaAttachment = new HashMap<String, Object>();
		  imageaAttachment.put("image", img);//添加图片链接
		  mailBean.setImageAttachment(imageaAttachment);
	        
		  mailSenderService.sendMail(mailBean);  

		  System.out.println("邮件发送成功...");
	}
}
