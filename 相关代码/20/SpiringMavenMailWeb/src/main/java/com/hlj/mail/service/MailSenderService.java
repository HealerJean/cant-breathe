package com.hlj.mail.service;

import java.io.UnsupportedEncodingException;  
 

import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;  
import javax.mail.internet.MimeMessage;  
 



import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;  
import org.springframework.mail.javamail.MimeMessageHelper;  
import org.springframework.stereotype.Service;  

import com.hlj.mail.bean.MailBean;
@Service  
public class MailSenderService {  
	//利用系统的配置文件生成，可以直接使用
   @Autowired  
   private JavaMailSenderImpl javaMailSenderImpl;  
     
   /**  
    * 创建MimeMessage  
    */  
   public MimeMessage createMimeMessage(MailBean mailBean) throws MessagingException, UnsupportedEncodingException{  
       MimeMessage mimeMessage = javaMailSenderImpl.createMimeMessage();  
       MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");  
      
       /**
        * 谁发送的
        */
       messageHelper.setFrom(mailBean.getFrom(), mailBean.getFromName());   
       // 不指定FromName，到了收件人列表中，会自动显示邮箱前半部分比如 mxzdhealer 后面的省略
       //messageHelper.setFrom(mailBean.getFrom()); 
       messageHelper.setTo(mailBean.getToEmails());    
       //可以只给一个人发
       //messageHelper.setTo("mxzdhealer@163.com"); 
       messageHelper.setSubject(mailBean.getSubject());   //主题 
       messageHelper.setText(mailBean.getText(), true); //内容 html: true
       
       /**
        * 发送附件，添加到附件
        */
		Map<String,Object> attachment = mailBean.getAttachment();
		if(attachment!=null){
			for(String key:attachment.keySet()){
				 messageHelper.addAttachment(key, (FileSystemResource)attachment.get(key));
			}
		}
		/**
		 * 链接中的图片
		 */
		Map<String,Object> imageAttachment = mailBean.getImageAttachment();
		if(imageAttachment!=null){
			for(String key:imageAttachment.keySet()){
				 messageHelper.addInline(key, (FileSystemResource)imageAttachment.get(key));
			}
		}
		
       return mimeMessage;  
   }  
     
   public void sendMail(MailBean mailBean) throws UnsupportedEncodingException, MessagingException{  
       MimeMessage msg = createMimeMessage(mailBean);  
       javaMailSenderImpl.send(msg);  
   }  
}  