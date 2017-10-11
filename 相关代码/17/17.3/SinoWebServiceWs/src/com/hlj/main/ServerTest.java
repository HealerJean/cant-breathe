package com.hlj.main;

import javax.xml.ws.Endpoint;

import com.hlj.myws.HelloWSImpl;


/*
 * 发布Web Service
 */
public class ServerTest {

	public static void main(String[] args) {

		String address = "http://localhost:1111/day01_ws/hellows";
	
		Endpoint.publish(address , new HelloWSImpl());
		System.out.println("发布webservice成功!");
		
		//E:\\WorkSpace\\JspWorkSpace\\MyeclipseWebService\\SinoWebServiceWsClient
		//wsimport -s E:\\WorkSpace\\JspWorkSpace\\MyeclipseWebService\\SinoWebServiceWsClient\\src -p com.hlj.client -keep http://localhost:1111/day01_ws/hellows?wsdl

	}
}
