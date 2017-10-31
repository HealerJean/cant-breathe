package com.hlj.main;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.internet.NewsAddress;

import com.hlj.client.CommonWSInter;
import com.hlj.client.CommonWSInterService;
import com.hlj.client.MapConvertor;
import com.hlj.client.MapEntry;
import com.hlj.util.StringObjectMapAdapter;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��23�� ����6:12:53 
 * ��˵�� 
 */
public class Main {
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, SecurityException, NoSuchFieldException {
		//setAndgetStringWs();
		//getMapWs();
		setMapParamWs();

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
			
			

		String reString = commonWSInter.setMapParam(mapConvertorFinal);
		
		System.out.println("�ͻ��˵��� setMapParam "+reString);
	
	//	commonWSInter.setMapParam(arg0);
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


