package com.hlj.mail.bean;

public class MailBean {
	    private String from;    
	    private String fromName;    
	    private String[] toEmails;    
	    private String subject;  
	    private String context;
	    
	    
	    
		public MailBean() {
		}


		public MailBean(String from, String fromName, String[] toEmails,
				String subject, String context) {
			this.from = from;
			this.fromName = fromName;
			this.toEmails = toEmails;
			this.subject = subject;
			this.context = context;
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


		public String getContext() {
			return context;
		}


		public void setContext(String context) {
			this.context = context;
		}  
	    
	    
}
