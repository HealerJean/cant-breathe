package com.hlj.myEmail;

public class SendMailToSomeone {
	static String password = "147094";
	public static void main(String []args){
		
		SendMailToSomeone sts=new SendMailToSomeone();
		sts.send("�ʼ�*******************���� ", "666", "mxzdhealer@163.com",
				"zyj18842637651@sohu.com", "147094", "smtp.sohu.com");
	}
	  
	/**
	 * ���͵����ʼ���ָ��������
	 * @param title �ʼ����� 
	 * @param mailbody �ʼ����ݡ�һ����ҳ�����ok��
	 * @param sendTo ���͸�˭ hanshunping@tsinghua.org.cn
	 * @param from ����Щ���� admin@sohu.com
	 * @param passwd ���� 123456
	 * @param sendStmp �����ʼ���smtp smtp.sohu.com [smtp.163.com] [smtp.sina.com]
	 */
	public void send(String title,String mailbody,String sendTo,String from,String passwd,String sendStmp){
		
		//ָ�����Ǹ�smtpת��(�Ѻ�)
		MysendMail themail = new MysendMail(sendStmp);
		
		//У�����
		themail.setNeedAuth(true);
		
		//�ʼ�����
		if(themail.setSubject(title) == false) return;
		//��Ҫ���͵� ���ݷ����ʼ��� 
		if(themail.setBody(mailbody) == false) return;
		
		//���͵�����
		if(themail.setTo(sendTo) == false) return;
		
		//˭���͵�
		if(themail.setFrom(from) == false) return;
	
	
		//����sohu��վ�ϵ��ʼ��û����� ���� �����ʼ��� 
		themail.setNamePass("zyj18842637651@sohu.com",passwd); 
		
		//����
		if(themail.sendout() == false) return;
	}
}
