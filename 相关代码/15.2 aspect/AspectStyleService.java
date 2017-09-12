package org.dsp.oa.xinjiangzzqpast;

import org.springframework.stereotype.Service;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年9月8日 上午9:43:06 
 * 类说明 
 */
@Service("AspectStyleServiceName")
public class AspectStyleService {
 
	   public AspectEntry save(String name,int age) {
	        System.out.println("save方法");
	        AspectEntry person = new AspectEntry(name, age);
	        System.out.println("接下来会有1/0");
	        int i = 1/0;
	      //当使用@Aspect 中捕获了异常之后，around中必须给一个返回值，那还执行这个干什么，就不会执行这个了
	        System.out.println("1/0在我上面"); 		
	        return person;		
	   }
}
