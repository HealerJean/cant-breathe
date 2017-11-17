package com.reflect.util;

import java.io.StringReader;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.Dispatch;
import org.springframework.stereotype.Component;


@Component
public class WsInvoker {
	
	public Object invoke(JAXBElement<?> param, WsDestInfo destInfo) {
		Dispatch<Object> dispatch = destInfo.getDispatch();
		Object returnObj = dispatch.invoke(param);
		return returnObj;
	}
	
	public Object invoke(String payload, WsDestInfo destInfo) {
		Dispatch<Object> dispatch = destInfo.getDispatch();
		Object param = destInfo.unmarshal(new StringReader(payload));
		Object returnObj = dispatch.invoke(param);
		return returnObj;
	}
	
}
