package com.hlj.springTestSuccess;


import org.springframework.context.ApplicationContext;

import com.hlj.util.ApplicaionContextUtil;


/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��11�� ����10:05:22 
 * ��˵�� 
 */
public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = ApplicaionContextUtil.getApplicationContext();
		
		TestService testService = (TestService) applicationContext.getBean("testService");
		testService.testSpringBean();
	}
}
