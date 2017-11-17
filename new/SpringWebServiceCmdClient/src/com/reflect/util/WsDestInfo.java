package com.reflect.util;

import java.io.Reader;
import java.io.StringWriter;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.Service.Mode;


public class WsDestInfo {
	
	private WsDestEO wsDestEO;
	
    private JAXBContext context;
	
	private Dispatch<Object> dispatch;
	
    public void init() {
    	try {
    		QName serviceQname = new QName(wsDestEO.getNamespace(), wsDestEO.getServiceName());
    		QName portQname = new QName(wsDestEO.getNamespace(), wsDestEO.getPortName());
    		context = JAXBContext.newInstance(Class.forName(wsDestEO.getObjFacy()));
			Service create = Service.create(new URL(wsDestEO.getWsdlAddr()), serviceQname);
			dispatch = create.createDispatch(portQname, context, Mode.PAYLOAD);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    public Marshaller getMarshaller() {
    	try {
    		Marshaller marshaller = context.createMarshaller();
    		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true); // 省略xml头信息
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false); // 格式化生成的xml串
			return marshaller;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
    }
    
    public Unmarshaller getUnmarshaller() {
    	try {
			return context.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
    }
    
    public Dispatch<Object> getDispatch() {
		return dispatch;
	}
    
    public String marshal(Object obj) {
    	StringWriter writer = new StringWriter();
    	try {
    		getMarshaller().marshal(obj, writer);
			return writer.toString();
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
    	
    }
    
    public JAXBElement<?> unmarshal(Reader reader) {
    	try {
			return (JAXBElement<?>) getUnmarshaller().unmarshal(reader);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
    }

	public WsDestEO getWsDestEO() {
		return wsDestEO;
	}

	public void setWsDestEO(WsDestEO wsDestEO) {
		this.wsDestEO = wsDestEO;
	}
	
}
