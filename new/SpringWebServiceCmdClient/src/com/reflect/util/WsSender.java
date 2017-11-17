package com.reflect.util;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;


public abstract class WsSender<T> {
	
	

	@Autowired
	protected IWsService wsService;
	
	
	
	@Autowired
	private WsInvoker invoker;
	

	private String senderName;
	
	public WsSender() {
		String simpleName = getClass().getSimpleName();
		senderName = simpleName.substring(0, 1).toLowerCase() + simpleName.substring(1);
	}
	
	/**
	 * 默认为短类名首字母小写
	 * @return
	 */
	protected String getSenderName() {
		return senderName;
	}
	
	public abstract WsDestInfo getWsDestInfo();
	
	public abstract QName getOperationQName();
	
	/**
	 * 处理调用结果
	 * @param wsInvokeResult 调用结果
	 * @return
	 */
	protected WsResponse handleInvokeResult(WsInvokeResult wsInvokeResult) {
		// 默认情况下，简单返回调用结果
		WsResponse response = new WsResponse();
		response.setRespResult(wsInvokeResult.getInvokeResult());
		response.setRespInfo(wsInvokeResult.getInvokeInfo());
		response.setRespClob(wsInvokeResult.getInvokeClob());
		response.setReturnObject(wsInvokeResult.getReturnObject());
		return response;
	}
	
	@SuppressWarnings("unchecked")
	protected JAXBElement<T> buildParam(T param) {
		// 兼容重复的情况
		if (param instanceof JAXBElement<?>) {
			return (JAXBElement<T>) param;
		}
		JAXBElement<T> element = new JAXBElement<T>(
				getOperationQName(), 
				(Class<T>) param.getClass(), 
				param);
		return element;
	}
	
	public WsResponse send(SendReasonVO reason, T param) {
		JAXBElement<T> element = buildParam(param);
		return sendIndependenceTrasaction(reason, element);
	}
	
	public WsResponse send(SendReasonVO reason, JAXBElement<?> param) {
		return sendIndependenceTrasaction(reason, param);
	}

	public void sendAsyn(final SendReasonVO reason, T param) {
		final JAXBElement<T> element = buildParam(param);
		//  此处简单启动异步线程处理，后期需要统一异步方式
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				sendIndependenceTrasaction(reason, element);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
	private WsResponse sendIndependenceTrasaction(final SendReasonVO reason, final JAXBElement<?> param) {
				return execute(reason, param, getWsDestInfo());
	}
	
	private WsResponse execute(SendReasonVO reason, JAXBElement<?> param, WsDestInfo destInfo) {

		
		
		String invokeResult = null;
		String invokeInfo = null;
		String invokeClob = null;
		Object returnObj = null;
		String respStatus = "";
		try {
			Object obj = invoker.invoke(param, destInfo);
			if (obj instanceof JAXBElement) {
				returnObj = ((JAXBElement<?>) obj).getValue();
			} else {
				returnObj = obj;
			}
			respStatus = RespStatus.Normal.getCode();
			invokeResult = YesOrNo.YES.getCode();
			invokeInfo = "调用成功";
			invokeClob = destInfo.marshal(obj); // 正常响应报文，此报文不包含SOAP信封信息
		} catch (Exception e) {
			e.printStackTrace();
			invokeResult = YesOrNo.NO.getCode();
			respStatus = RespStatus.Exception.getCode();
		} 
		
	
			WsInvokeResult wsInvokeResult = new WsInvokeResult();
			wsInvokeResult.setInvokeResult(invokeResult);
			wsInvokeResult.setInvokeInfo(invokeInfo);
			wsInvokeResult.setInvokeClob(invokeClob);
			wsInvokeResult.setReturnObject(returnObj);
				
		
		// 处理调用结果
		WsResponse response = handleInvokeResult(wsInvokeResult);
		
		return response;
	}
}
