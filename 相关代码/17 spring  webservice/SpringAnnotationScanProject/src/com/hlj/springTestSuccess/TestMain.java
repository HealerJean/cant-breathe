package com.hlj.springTestSuccess;


import org.springframework.context.ApplicationContext;

import com.hlj.util.ApplicaionContextUtil;


/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月11日 上午10:05:22 
 * 类说明 
 */
public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = ApplicaionContextUtil.getApplicationContext();
		
		TestService testService = (TestService) applicationContext.getBean("testService");
		testService.testSpringBean();
	}
}
