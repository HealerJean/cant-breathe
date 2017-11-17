package com.reflect.util;


public class WsResponse {

	private String respResult;
	
	private String respCode;
	
	private String respInfo;
	
	private String respClob;

	private Object returnObject;
	
	public boolean isSuccess() {
		return YesOrNo.YES.getCode().equals(respResult);
	}
	
	public String getRespResult() {
		return respResult;
	}

	public void setRespResult(String respResult) {
		this.respResult = respResult;
	}

	public String getRespCode() {
		return respCode;
	}

	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}

	public String getRespInfo() {
		return respInfo;
	}

	public void setRespInfo(String respInfo) {
		this.respInfo = respInfo;
	}

	public String getRespClob() {
		return respClob;
	}

	public void setRespClob(String respClob) {
		this.respClob = respClob;
	}

	public Object getReturnObject() {
		return returnObject;
	}

	public void setReturnObject(Object returnObject) {
		this.returnObject = returnObject;
	}

}
