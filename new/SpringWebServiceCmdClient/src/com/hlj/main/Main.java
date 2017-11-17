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
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��23�� ����6:12:53 
 * ��˵�� 
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
	 * @date   :2017��11��17�� ����5:18:57 
	 * @Description:    ʹ������е���Զ�̷���
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
	 * 3��
	 * map��Ϊ�������� 
	 * ���÷���ʵ�� 
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
			
			
		// ����Ҫ���䣬�����Ϳ��Է��ͳɹ���
		//mapConvertorFinal.getList().add(mapEntry);
		String reString = commonWSInter.setMapParam(mapConvertorFinal);
		
		System.out.println("�ͻ��˵��� setMapParam "+reString);
	
	}

	/**
	 * 2��
	 * ȡ��map���ؽ�� 
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
	 * 1��String
	 * 
	 */
	private static void  setAndgetStringWs() {
		CommonWSInter commonWSInter =new CommonWSInterService().getCommonWSInterPort();
		
		/**
		 * ���ô���string ����
		 */
		String string = commonWSInter.receiveOARequestFromTransfer("HealerJean");
		System.out.println(string); 
		

	}
}


