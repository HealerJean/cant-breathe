package com.hlj.mail.bean;

import java.util.Map;

public class MailBean {
	    private String from;  //发送者邮箱   
	    private String fromName;    //收件箱列表显示标题
	    private String[] toEmails;  //接受者邮箱，设置数组，可以同时发送给多个人  
	    private String subject;    //邮件主题
	    private String text;		//邮件内容
	    private Map<String,Object> attachment; //附件
	    private Map<String,Object> imageAttachment; //链接中的图片

	     
		public MailBean() {
		}

		public MailBean(String from, String fromName, String[] toEmails,
				String subject, String text, Map<String, Object> attachment,
				Map<String, Object> imageAttachment) {
			super();
			this.from = from;
			this.fromName = fromName;
			this.toEmails = toEmails;
			this.subject = subject;
			this.text = text;
			this.attachment = attachment;
			this.imageAttachment = imageAttachment;
		}







		public String getFrom() {
			return from;
		}


		public void setFrom(String from) {
			this.from = from;
		}


		public String getFromName() {
			return fromName;
		}


		public void setFromName(String fromName) {
			this.fromName = fromName;
		}


		public String[] getToEmails() {
			return toEmails;
		}


		public void setToEmails(String[] toEmails) {
			this.toEmails = toEmails;
		}


		public String getSubject() {
			return subject;
		}


		public void setSubject(String subject) {
			this.subject = subject;
		}


		public String getText() {
			return text;
		}


		public void setText(String text) {
			this.text = text;
		}


		public Map<String, Object> getAttachment() {
			return attachment;
		}




		public void setAttachment(Map<String, Object> attachment) {
			this.attachment = attachment;
		}




		public Map<String, Object> getImageAttachment() {
			return imageAttachment;
		}




		public void setImageAttachment(Map<String, Object> imageAttachment) {
			this.imageAttachment = imageAttachment;
		}

	    
	    
}
