package org.dsp.oa.xinjiangzzqpast;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月8日 上午9:33:38 
 * 类说明 
 */
public class AspectStypeTest {
	public static void main(String[] args)  {
	  
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dsp.xml" );
		AspectStyleService aspectStyleService = (AspectStyleService)context.getBean("AspectStyleServiceName");
		aspectStyleService.save("HealerJean",24); 
	
		  
	
	}
}
