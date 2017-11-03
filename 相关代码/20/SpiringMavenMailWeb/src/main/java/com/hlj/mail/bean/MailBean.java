package com.hlj.mail.bean;

import java.util.Map;

public class MailBean {
	    private String from;  //����������   
	    private String fromName;    //�ռ����б���ʾ����
	    private String[] toEmails;  //���������䣬�������飬����ͬʱ���͸������  
	    private String subject;    //�ʼ�����
	    private String text;		//�ʼ�����
	    private Map<String,Object> attachment; //����
	    private Map<String,Object> imageAttachment; //�����е�ͼƬ

	     
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
