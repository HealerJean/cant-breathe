package com.hlj.util;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

final public class ApplicaionContextUtil {

	private static ApplicationContext ac=null;
	
	private ApplicaionContextUtil(){
		
	}
	 
	
	private  static synchronized void installAc(){
		if(ac==null){
			ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		}
	}
	
	public static ApplicationContext getApplicationContext(){
		if(ac==null){
			installAc();
		}
		return ac;
	}
	
}
