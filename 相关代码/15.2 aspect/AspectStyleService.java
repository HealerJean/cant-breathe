package org.dsp.oa.xinjiangzzqpast;

import org.springframework.stereotype.Service;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��9��8�� ����9:43:06 
 * ��˵�� 
 */
@Service("AspectStyleServiceName")
public class AspectStyleService {
 
	   public AspectEntry save(String name,int age) {
	        System.out.println("save����");
	        AspectEntry person = new AspectEntry(name, age);
	        System.out.println("����������1/0");
	        int i = 1/0;
	      //��ʹ��@Aspect �в������쳣֮��around�б����һ������ֵ���ǻ�ִ�������ʲô���Ͳ���ִ�������
	        System.out.println("1/0��������"); 		
	        return person;		
	   }
}
