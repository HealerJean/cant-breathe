package com.hlj.mail.other;

import java.io.UnsupportedEncodingException;  
 

import javax.mail.MessagingException;  
import javax.mail.internet.MimeMessage;  
 

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.mail.javamail.JavaMailSenderImpl;  
import org.springframework.mail.javamail.MimeMessageHelper;  
import org.springframework.stereotype.Service;  

import com.hlj.mail.bean.MailBean;
@Service  
public class MailSenderService {  
   @Autowired  
   private JavaMailSenderImpl javaMailSenderImpl;  
     
   /**  
    * ´´½¨MimeMessage  
    * @param mailBean  
    * @return  
    * @throws MessagingException   
    * @throws UnsupportedEncodingException   
    */  
   public MimeMessage createMimeMessage(MailBean mailBean) throws MessagingException, UnsupportedEncodingException{  
       MimeMessage mimeMessage = javaMailSenderImpl.createMimeMessage();  
       MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");  
       messageHelper.setFrom(mailBean.getFrom(), mailBean.getFromName());   
       messageHelper.setSubject(mailBean.getSubject());    
       messageHelper.setTo(mailBean.getToEmails());    
       messageHelper.setText(mailBean.getContext(), true); // html: true   
       return mimeMessage;  
   }  
     
   public void sendMail(MailBean mailBean) throws UnsupportedEncodingException, MessagingException{  
       MimeMessage msg = createMimeMessage(mailBean);  
       javaMailSenderImpl.send(msg);  
   }  
}  