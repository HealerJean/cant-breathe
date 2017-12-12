package com.hlj.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @author : HealerJean
 * @date   ： 2017年12月12日 下午5:28:38 
 * @Description:
 */
public class TestMain {
	
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "applicationContext.xml" });  
        context.start();  
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }  
}
