package com.dubbo.main;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.service.DubboProvide;

 
public class CustomerMain {
	 public static void main(String[] args) throws InterruptedException{  
	        ClassPathXmlApplicationContext cfig = new ClassPathXmlApplicationContext("classpath:config/ApplicationContextCustomer.xml");  
	        DubboProvide test = (DubboProvide) cfig.getBean("dubboProvider");  
	        System.out.println("consumer connect to service begin");  
	        test.sayHello();  
	        Thread.sleep(100000);  
	        System.out.println("consumer connect to service end");  
	    }  
}
