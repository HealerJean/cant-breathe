package com.hlj.webservice;

import java.util.Map;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.hlj.util.MapAdapter;



@WebService(targetNamespace="http://healerjean/")
public interface CommonWSInter {

	
   public String receiveOARequestFromTransfer(@WebParam(name = "name") String name);

	
   //测试传入的参数为map类型
	public String setMapParam(@XmlJavaTypeAdapter(MapAdapter.class)Map<String ,Object> map) ;
	
	//测试取得webservice结果为Map
	public @XmlJavaTypeAdapter(MapAdapter.class)Map<String ,Object> getReturnMap(String name);

	
}
