package com.hlj.springAnnotationTestSuccess;



import org.springframework.context.ApplicationContext;

import com.hlj.util.ApplicaionContextUtil;


/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月11日 上午10:05:22 
 * 类说明 
 */
public class AnnotationTestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = ApplicaionContextUtil.getApplicationContext();
		
		TestService testService = (TestService) applicationContext.getBean("idtestService");
		//下面这个是错误的，因为new的话，不能够将它里面的resource 注入进去
		//	TestService testService = new TestService();
		testService.test();
	}
	

}
