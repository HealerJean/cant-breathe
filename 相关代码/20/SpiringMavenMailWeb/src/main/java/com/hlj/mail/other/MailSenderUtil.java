package com.hlj.mail.other;

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

import com.hlj.mail.bean.MailBean;
  
public class MailSenderUtil {  
    /**  
     * ²Î¿¼£ºhttp://wang3065.iteye.com/blog/1718381  
     * @param args  
     * @throws Exception  
     */  
    public static void main(String[] args) throws Exception{  
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
        MailSenderService mailSenderService = (MailSenderService) ac.getBean("mailSenderService");  
        MailBean mailBean = new MailBean();  
        mailBean.setFrom("783023438@qq.com");  
        mailBean.setFromName("XXX");  
        mailBean.setSubject("ÄãºÃ");  
        mailBean.setToEmails(new String[]{"729088240@qq.com","182957182222@139.com"});  
        mailBean.setContext("<a href='www.baidu.com'><font color='red'>fdsfdsf</font></a>");  
        mailSenderService.sendMail(mailBean);  
    }  
}  