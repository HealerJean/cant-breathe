package com.dubbo.main;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboProvideStart {

	 public static void main(String[] args) throws Exception {  
	        ClassPathXmlApplicationContext cfg = new ClassPathXmlApplicationContext("classpath:config/ApplicationContextProducror.xml");  
	        cfg.start();  
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	        Date date = new Date();   
	        System.out.println("provider service start time："+sdf.format(date));  
	        //保证服务始终开启  
	        System.in.read();  
	    }  
}
