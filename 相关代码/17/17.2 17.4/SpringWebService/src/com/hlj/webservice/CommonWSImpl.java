package com.hlj.webservice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;



public class CommonWSImpl implements CommonWSInter{

	@Override
	public String receiveOARequestFromTransfer(String name) {
		System.out.println("receiveOARequestFromTransfer 方法名字打印");
	
		return "receiveOARequestFromTransfer name = "+name;
	}

	/**
	 * 测试传入的参数为map类型
	 */
	@Override
	public String setMapParam(Map<String, Object> map) {
	
		System.out.println(map.toString());
		
		return "Success";
	}

	/**
	 * 测试取得webservice结果为Map
	 */
	@Override
	public Map<String, Object> getReturnMap(String name) {

		System.out.println("正在被调用getMap方法");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name",name);
		map.put("age", 23);
		return map;
	}




	
}
