package com.hlj.client;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hlj.webservice.CommonWSInter;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月11日 下午1:41:18 
 * 类说明 
 */
public class ClientMain {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("module/client-beans.xml");
		
		CommonWSInter client = (CommonWSInter) context.getBean("commonClient");
		

	//	String a = client.receiveOARequestFromTransfer("zhang");

		/**
		 * 测试得到map类型的webservice ,不需要像之前自己的webservice的转化也能够成功
		 */
		/*
		Map<String ,Object> map = client.getReturnMap("HealerJean");
		String mapString = (String)map.get("name");
		System.out.println(mapString); 
		*/
		
		/**
		 * 测试传入的参数为map
		 */
		Map<String ,Object> mapParam = new HashMap<String, Object>();
		mapParam.put("name", "mapParam");
		mapParam.put("name", "HealerJean");
		String reString = client.setMapParam(mapParam);
		System.out.println("客户端调用 setMapParam "+reString);
		
	}
}
