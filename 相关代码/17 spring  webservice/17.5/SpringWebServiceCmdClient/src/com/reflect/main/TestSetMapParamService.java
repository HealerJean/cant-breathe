package com.reflect.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.hlj.client.SetMapParam;
import com.hlj.client.SetMapParamResponse;
import com.reflect.bean.SendReasonVO;
import com.reflect.bean.WsResponse;
import com.reflect.sender.SetMapParamSender;


/** 
 * @author : HealerJean
 * @date   �� 2017��11��17�� ����5:02:30 
 * @Description:
 */
@Component
public class TestSetMapParamService {
	
	
	@Autowired
	public SetMapParamSender setMapParamSender;
	/**
	 * 
	 * @author :HealerJean: 
	 * @date   :2017��11��17�� ����9:47:18 
	 * @Description:  �������еķ��������н��д����˷������ݵ�ҵ��У��
	 * @param map 
	 * @return    
	 * Result
	 */
	public String receiveOrBackSender(Map<String, Object> map){
		com.hlj.client.MapConvertor clientConvertor = new com.hlj.client.MapConvertor();
		com.reflect.mapconver.MapAdapter adapter = new com.reflect.mapconver.MapAdapter();
		try {
			com.reflect.mapconver.MapConvertor marshaled = adapter.marshal(map);
			List<com.reflect.mapconver.MapConvertor.MapEntry> entries = marshaled.getList();
				for (com.reflect.mapconver.MapConvertor.MapEntry mapEntry : entries) {
					com.hlj.client.MapEntry entry = new com.hlj.client.MapEntry ();
				if (mapEntry.getKey().toUpperCase().equals("INSTITUTIONID")
					|| mapEntry.getKey().toUpperCase().equals("BUSINESSCODE")
					|| mapEntry.getKey().toUpperCase().equals("APPSERIONO")
					|| mapEntry.getKey().toUpperCase().equals("APPCODE")
					|| mapEntry.getKey().toUpperCase().equals("APPCODE")) {
	// entry֮��ֵ����
					entry.setKey(mapEntry.getKey());
					entry.setValue(mapEntry.getValue());
					clientConvertor.getList().add(entry);
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
		// ��װ���Ͳ���
		}
		/**
		 * ���͵���־��¼ Reason �����洢���ĵ��������
		 */
		SendReasonVO reason = new SendReasonVO();
		
		SetMapParam setMapParam = new SetMapParam();
		setMapParam.setArg0(clientConvertor);
		
		WsResponse response = setMapParamSender.send(reason, setMapParam);
		SetMapParamResponse setMapParamResponse = (SetMapParamResponse) response.getReturnObject();
		return setMapParamResponse.getReturn();

	}

}
