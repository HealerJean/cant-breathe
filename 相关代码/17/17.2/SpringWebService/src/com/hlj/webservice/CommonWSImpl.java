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
		System.out.println("receiveOARequestFromTransfer �������ִ�ӡ");
	
		return "receiveOARequestFromTransfer name = "+name;
	}

	/**
	 * ���Դ���Ĳ���Ϊmap����
	 */
	@Override
	public String setMapParam(Map<String, Object> map) {
	
		System.out.println(map.toString());
		
		return "Success";
	}

	/**
	 * ����ȡ��webservice���ΪMap
	 */
	@Override
	public Map<String, Object> getReturnMap(String name) {

		System.out.println("���ڱ�����getMap����");
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name",name);
		map.put("age", 23);
		return map;
	}




	
}
