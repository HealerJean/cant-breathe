package com.hlj.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.NewsAddress;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.hlj.client.CommonWSInter;
import com.hlj.client.CommonWSInterService;
import com.hlj.client.MapConvertor;
import com.hlj.client.MapEntry;
import com.hlj.client.SetMapParam;
import com.hlj.client.SetMapParamResponse;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月23日 下午6:12:53 
 * 类说明 
 */
public class Main {
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchFieldException {
		//setAndgetStringWs();
		//getMapWs();
	//	setMapParamWs();
		setMapParamWsTwo();
	}
	
	/**
	 * 
	 * @author :HealerJean: 
	 * @date   :2017年11月17日 下午5:18:57 
	 * @Description:    使用类进行调用远程服务
	 * void
	 */
	private static void setMapParamWsTwo(){

			CommonWSInter ics =null;
			JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
			factory.setServiceClass(CommonWSInter.class);
			factory.setAddress("http://localhost:8080/SpringWebService/services/CommonService?wsdl");
			
			ics = factory.create(CommonWSInter.class);
		
			MapConvertor value =new MapConvertor();
			MapEntry entry =new MapEntry();
			entry.setKey("nameField");
			entry.setValue("HealerJean");
			value.getList().add(entry);
			
			
			String  str =	ics.setMapParam(value)	;
		
			 System.out.println(str);
	}
	/**
	 * 3、
	 * map作为参数参入 
	 * 利用反射实现 
	 */
	private static void setMapParamWs() throws InstantiationException,
			IllegalAccessException, SecurityException, NoSuchFieldException {
	
		CommonWSInter commonWSInter =new CommonWSInterService().getCommonWSInterPort();

		List<MapEntry> mapEntries = new ArrayList<MapEntry>();
		MapEntry mapEntry  = new MapEntry();
		mapEntry.setKey("nameField");
		mapEntry.setValue("HealerJean");
		
		mapEntries.add(mapEntry);
		Class mapConvertorClass = MapConvertor.class;
		MapConvertor mapConvertorFinal  =(MapConvertor) mapConvertorClass.newInstance(); 
		
			Field list = mapConvertorClass.getDeclaredField("list");
			list.setAccessible(true);
			list.set(mapConvertorFinal, mapEntries);
			
			
		// 不需要反射，这样就可以发送成功。
		//mapConvertorFinal.getList().add(mapEntry);
		String reString = commonWSInter.setMapParam(mapConvertorFinal);
		
		System.out.println("客户端调用 setMapParam "+reString);
	
	}

	/**
	 * 2、
	 * 取得map返回结果 
	 */
	
	private static void getMapWs() {
		CommonWSInter commonWSInter =new CommonWSInterService().getCommonWSInterPort();
		MapConvertor mapConvertor = commonWSInter.getReturnMap("HealerJean") ;
		for(MapEntry mapEntry :mapConvertor.getList()){
			System.out.println("key:"+mapEntry.getKey()+" ---value:"+mapEntry.getValue());			
		}
		System.out.println("**********************");
	}

	/**
	 * 1、String
	 * 
	 */
	private static void  setAndgetStringWs() {
		CommonWSInter commonWSInter =new CommonWSInterService().getCommonWSInterPort();
		
		/**
		 * 调用传入string 参数
		 */
		String string = commonWSInter.receiveOARequestFromTransfer("HealerJean");
		System.out.println(string); 
		

	}
}


