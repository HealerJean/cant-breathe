package com.reflect.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


import com.hlj.client.SetMapParam;
import com.hlj.client.SetMapParamResponse;
import com.reflect.sender.SetMapParamSender;
import com.reflect.util.SendReasonVO;
import com.reflect.util.WsResponse;


/** 
 * @author : HealerJean
 * @date   ： 2017年11月17日 下午5:02:30 
 * @Description:
 */
public class SetMapParamService {
	
	
	@Autowired
	public SetMapParamSender setMapParamSender;
	/**
	 * 
	 * @author :HealerJean: 
	 * @date   :2017年11月17日 上午9:47:18 
	 * @Description:  调用受托的服务，让受托进行代理人发来数据的业务校验
	 * @param map 
	 * @return    
	 * Result
	 */
	public String receiveOrBackSender(Map<String, Object> map){
		com.hlj.client.MapConvertor clientConvertor = new com.hlj.client.MapConvertor();
		com.reflect.util.MapAdapter adapter = new com.reflect.util.MapAdapter();
		try {
			com.reflect.util.MapConvertor marshaled = adapter.marshal(map);
			List<com.reflect.util.MapConvertor.MapEntry> entries = marshaled.getList();
				for (com.reflect.util.MapConvertor.MapEntry mapEntry : entries) {
					com.hlj.client.MapEntry entry = new com.hlj.client.MapEntry ();
				if (mapEntry.getKey().toUpperCase().equals("INSTITUTIONID")
					|| mapEntry.getKey().toUpperCase().equals("BUSINESSCODE")
					|| mapEntry.getKey().toUpperCase().equals("APPSERIONO")
					|| mapEntry.getKey().toUpperCase().equals("APPCODE")
					|| mapEntry.getKey().toUpperCase().equals("APPCODE")) {
	// entry之间值交换
					entry.setKey(mapEntry.getKey());
					entry.setValue(mapEntry.getValue());
					clientConvertor.getList().add(entry);
				}
			}	
		} catch (Exception e) {
			e.printStackTrace();
		// 组装发送参数
		}
		/**
		 * 发送的日志记录 Reason 用来存储报文的主键相关
		 */
		SendReasonVO reason = new SendReasonVO();
		
		SetMapParam setMapParam = new SetMapParam();
		setMapParam.setArg0(clientConvertor);
		
		WsResponse response = setMapParamSender.send(reason, setMapParam);
		SetMapParamResponse setMapParamResponse = (SetMapParamResponse) response.getReturnObject();
		return setMapParamResponse.getReturn();

	}

}
