package com.duodian.youhui.admin.utils;

import java.io.UnsupportedEncodingException;  
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import com.duodian.youhui.data.utils.MailData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;  
import org.springframework.mail.javamail.MimeMessageHelper;  
import org.springframework.stereotype.Service;  


@Service
public class EmailUtils {
    //利用系统的配置文件生成，可以直接使用
    @Autowired
    private JavaMailSenderImpl javaMailSenderImpl;

    private static EmailUtils mailSenderUtils ;

    @PostConstruct
    private void init(){
        mailSenderUtils = this;
        mailSenderUtils.javaMailSenderImpl = this.javaMailSenderImpl;
    }

    /**
     * 创建MimeMessage
     */
    public static MimeMessage createMimeMessage(MailData mailData) throws MessagingException, UnsupportedEncodingException{
        MimeMessage mimeMessage = mailSenderUtils.javaMailSenderImpl.createMimeMessage();
        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

        /**
         * 谁发送的
         */
        messageHelper.setFrom(mailData.getFrom(), mailData.getFromName());
        // 不指定FromName，到了收件人列表中，会自动显示邮箱前半部分比如 mxzdhealer 后面的省略
//        messageHelper.setFrom(mailData.getFromName());

        messageHelper.setTo(mailData.getToEmails());
        //可以只给一个人发
        //messageHelper.setTo("mxzdhealer@163.com");

        messageHelper.setSubject(mailData.getSubject());   //主题
        messageHelper.setText(mailData.getText(), true); //内容 html: true

        /**
         * 发送附件，添加到附件
         */
        Map<String,Object> attachment = mailData.getAttachment();
        if(attachment!=null){
            for(String key:attachment.keySet()){
                messageHelper.addAttachment(key, (FileSystemResource)attachment.get(key));
            }
        }
        /**
         * 链接中的图片
         */
        Map<String,Object> imageAttachment = mailData.getImageAttachment();
        if(imageAttachment!=null){
            for(String key:imageAttachment.keySet()){
                messageHelper.addInline(key, (FileSystemResource)imageAttachment.get(key));
            }
        }

        return mimeMessage;
    }

    public  static void sendMail(MailData mailData) {
        MimeMessage msg = null;
        try {
            msg = createMimeMessage(mailData);
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        mailSenderUtils.javaMailSenderImpl.send(msg);
    }
}  