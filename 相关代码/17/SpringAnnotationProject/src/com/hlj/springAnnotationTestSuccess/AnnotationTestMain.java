package com.hlj.springAnnotationTestSuccess;



import org.springframework.context.ApplicationContext;

import com.hlj.util.ApplicaionContextUtil;


/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��11�� ����10:05:22 
 * ��˵�� 
 */
public class AnnotationTestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = ApplicaionContextUtil.getApplicationContext();
		
		TestService testService = (TestService) applicationContext.getBean("idtestService");
		//��������Ǵ���ģ���Ϊnew�Ļ������ܹ����������resource ע���ȥ
		//	TestService testService = new TestService();
		testService.test();
	}
	

}
