package org.dsp.oa.xinjiangzzqpast;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��8�� ����9:33:38 
 * ��˵�� 
 */
public class AspectStypeTest {
	public static void main(String[] args)  {
	  
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-dsp.xml" );
		AspectStyleService aspectStyleService = (AspectStyleService)context.getBean("AspectStyleServiceName");
		aspectStyleService.save("HealerJean",24); 
	
		  
	
	}
}
