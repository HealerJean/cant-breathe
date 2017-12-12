package com.hlj.main;

import java.io.IOException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hlj.service.DemoService;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月12日 下午5:28:38 
 * @Description:
 */
public class TestMain {
	
	public static void main(String[] args) throws IOException {
		
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
	             new String[] { "applicationContext.xml" });  
	     context.start();   

	     DemoService demoService = (DemoService) context.getBean("demoService");  
	     String hello = demoService.sayHello("hejingyuan");  
	     System.out.println(hello);  

	     List list = demoService.getUsers();  
	     if (list != null && list.size() > 0) {  
	         for (int i = 0; i < list.size(); i++) {  
	             System.out.println(list.get(i));  
	         }  
	     }  
	     System.in.read();
	}  
}
