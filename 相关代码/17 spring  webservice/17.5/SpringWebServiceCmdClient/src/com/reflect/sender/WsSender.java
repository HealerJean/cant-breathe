package com.reflect.sender;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;









import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;

import com.reflect.bean.RespStatus;
import com.reflect.bean.SendReasonVO;
import com.reflect.bean.WsInvokeResult;
import com.reflect.bean.WsResponse;
import com.reflect.bean.YesOrNo;
import com.reflect.service.IWsService;
import com.reflect.util.WsDestInfo;
import com.reflect.util.WsInvoker;


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
	 * Ĭ��Ϊ����������ĸСд
	 * @return
	 */
	protected String getSenderName() {
		return senderName;
	}
	
	public abstract WsDestInfo getWsDestInfo();
	
	public abstract QName getOperationQName();
	
	/**
	 * ������ý��
	 * @param wsInvokeResult ���ý��
	 * @return
	 */
	protected WsResponse handleInvokeResult(WsInvokeResult wsInvokeResult) {
		// Ĭ������£��򵥷��ص��ý��
		WsResponse response = new WsResponse();
		response.setRespResult(wsInvokeResult.getInvokeResult());
		response.setRespInfo(wsInvokeResult.getInvokeInfo());
		response.setRespClob(wsInvokeResult.getInvokeClob());
		response.setReturnObject(wsInvokeResult.getReturnObject());
		return response;
	}
	
	@SuppressWarnings("unchecked")
	protected JAXBElement<T> buildParam(T param) {
		// �����ظ������
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
			invokeInfo = "���óɹ�";
			// ������Ӧ���ģ��˱��Ĳ�����SOAP�ŷ���Ϣ
			invokeClob = destInfo.marshal(obj); 
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
				
		
		// ������ý��
		WsResponse response = handleInvokeResult(wsInvokeResult);
		
		return response;
	}
}
