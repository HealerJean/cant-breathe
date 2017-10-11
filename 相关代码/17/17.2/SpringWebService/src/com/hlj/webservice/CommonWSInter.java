package com.hlj.webservice;

import java.util.List;
import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;



@WebService(targetNamespace="http://healerjean/")
public interface CommonWSInter {

	
   public String receiveOARequestFromTransfer(@WebParam(name = "name") String name);

	
   
	public Map<String ,String> sendMap(Map<String ,String> map) ;
}
