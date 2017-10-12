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
		
		Map<String,String>  map = new HashMap<String,String> ();
		
		map.put("name", "zhang");
		map.put("xml", "xml");
		map.put("age", "34");
		
	//	String a = client.receiveOARequestFromTransfer("zhang");
		client.sendMap(map);
	//	System.out.println(a); 
	}
}
