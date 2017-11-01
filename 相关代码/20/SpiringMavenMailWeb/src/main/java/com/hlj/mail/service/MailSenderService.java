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
	//����ϵͳ�������ļ����ɣ�����ֱ��ʹ��
   @Autowired  
   private JavaMailSenderImpl javaMailSenderImpl;  
     
   /**  
    * ����MimeMessage  
    */  
   public MimeMessage createMimeMessage(MailBean mailBean) throws MessagingException, UnsupportedEncodingException{  
       MimeMessage mimeMessage = javaMailSenderImpl.createMimeMessage();  
       MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");  
      
       /**
        * ˭���͵�
        */
       messageHelper.setFrom(mailBean.getFrom(), mailBean.getFromName());   
       // ��ָ��FromName�������ռ����б��У����Զ���ʾ����ǰ�벿�ֱ��� mxzdhealer �����ʡ��
       //messageHelper.setFrom(mailBean.getFrom()); 
       messageHelper.setTo(mailBean.getToEmails());    
       //����ֻ��һ���˷�
       //messageHelper.setTo("mxzdhealer@163.com"); 
       messageHelper.setSubject(mailBean.getSubject());   //���� 
       messageHelper.setText(mailBean.getText(), true); //���� html: true
       
       /**
        * ���͸�������ӵ�����
        */
		Map<String,Object> attachment = mailBean.getAttachment();
		if(attachment!=null){
			for(String key:attachment.keySet()){
				 messageHelper.addAttachment(key, (FileSystemResource)attachment.get(key));
			}
		}
		/**
		 * �����е�ͼƬ
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