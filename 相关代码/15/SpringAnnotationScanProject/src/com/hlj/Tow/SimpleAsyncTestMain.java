package com.hlj.Tow;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.hlj.Tow.SimpleAsync.AsyncService;
import com.hlj.springTestSuccess.TestService;
import com.hlj.util.ApplicaionContextUtil;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��11��14�� ����3:33:24 
 * ��˵�� 
 */
public class SimpleAsyncTestMain {
	   
	    @Test    
	    public void testAsync() throws Exception {    
	    	
			ApplicationContext applicationContext = ApplicaionContextUtil.getApplicationContext();
			
			AsyncService service = (AsyncService) applicationContext.getBean("daoService");
			
	        System.out.println("start" );    
	        service.update(); // �� �������������ȽϺ�ʱ����Ҫ�첽ִ��    
	        System.out.println("end");    
	            
	         //���߳�testAsync ���� 
	        Thread.sleep(3000); // ��Ϊjunit���������jvm�����������Ȼ��첽�߳�    
	    }   
	    
}
