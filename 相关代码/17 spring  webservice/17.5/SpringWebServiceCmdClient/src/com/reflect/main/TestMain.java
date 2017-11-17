package com.reflect.main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月17日 下午5:25:00 
 * @Description:
 */
public class TestMain {
	

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		
		TestSetMapParamService service=(TestSetMapParamService)context.getBean(TestSetMapParamService.class);
		
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("INSTITUTIONID", "INSTITUTIONID");
		map.put("BUSINESSCODE", "2110");
		map.put("APPSERIONO", "454564654165");
		map.put("APPCODE", 0000);
		map.put("APPMSG", "成功");
		String str  = service.receiveOrBackSender(map);

		System.out.println(str);	
	}
}
