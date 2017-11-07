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
	
	
	private static void setMapParamWsTwo(){

	/*ICommonWS ics =null;
	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
	factory.setServiceClass(ICommonWS.class);
	factory.setAddress("http://192.168.2.56:8080/dsp/services/CommonService?wsdl");
	ics = factory.create(ICommonWS.class);
	ReceiveOARequestFromTransferParam parameters =new ReceiveOARequestFromTransferParam();
	MapConvertor value =new MapConvertor();
	MapEntry entry =new MapEntry();
	entry.setKey("xml");
	entry.setValue(FileUtils.readFileToString(new File("C:\\Users\\komenj\\Desktop\\NJB01201_20160627145344976_ZYNJ.xml")));
	value.getEntry().add(entry);
	
	
		MapEntry file =new MapEntry();
		file.setKey("filecontent");
		file.setValue(FileUtils.readFileToByteArray(new File("E:\\java\\dtcp_xin\\WebRoot\\businessfiles\\recv\\zynj\\20160419\\20160419151037279\\file\\RS1000000ToST11111_NJF02001_20160419_229.txt")));
		value.getEntry().add(file);
	
	parameters.setRequests(value);
	
	ReceiveOARequestFromTransferResponse eaRequestFromTransferResponse =		ics.receiveOARequestFromTransfer(parameters);
	if(eaRequestFromTransferResponse.getResult().getExtInfo().getEntry().get(0).getKey().equals("xml")){
		System.out.println(new String((byte[])  eaRequestFromTransferResponse.getResult().getExtInfo().getEntry().get(0).getValue())); 
	}*/
	
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


