package com.hlj.Tow;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.hlj.Tow.SimpleAsync.AsyncService;
import com.hlj.springTestSuccess.TestService;
import com.hlj.util.ApplicaionContextUtil;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年11月14日 下午3:33:24 
 * 类说明 
 */
public class SimpleAsyncTestMain {
	   
	    @Test    
	    public void testAsync() throws Exception {    
	    	
			ApplicationContext applicationContext = ApplicaionContextUtil.getApplicationContext();
			
			AsyncService service = (AsyncService) applicationContext.getBean("daoService");
			
	        System.out.println("start" );    
	        service.update(); // ★ 假设这个方法会比较耗时，需要异步执行    
	        System.out.println("end");    
	            
	         //主线程testAsync 休眠 
	        Thread.sleep(3000); // 因为junit结束会结束jvm，所以让它等会异步线程    
	    }   
	    
}
