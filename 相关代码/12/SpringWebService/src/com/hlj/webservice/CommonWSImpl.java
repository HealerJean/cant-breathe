package com.hlj.webservice;

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

	@Override
	public Map<String, String> sendMap(Map<String, String> map) {
		System.out.println("sendOAResult 方法名字打印");

		return map;
	}

	
}
