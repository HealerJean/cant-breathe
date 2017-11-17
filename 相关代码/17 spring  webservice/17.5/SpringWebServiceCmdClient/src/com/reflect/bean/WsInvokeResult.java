package com.reflect.bean;

public class WsInvokeResult {

	private String invokeResult;

    private String invokeInfo;
    
    private String invokeClob;
    
    private Object returnObject;

	public String getInvokeResult() {
		return invokeResult;
	}

	public void setInvokeResult(String invokeResult) {
		this.invokeResult = invokeResult;
	}

	public String getInvokeInfo() {
		return invokeInfo;
	}

	public void setInvokeInfo(String invokeInfo) {
		this.invokeInfo = invokeInfo;
	}

	public String getInvokeClob() {
		return invokeClob;
	}

	public void setInvokeClob(String invokeClob) {
		this.invokeClob = invokeClob;
	}

	public Object getReturnObject() {
		return returnObject;
	}

	public void setReturnObject(Object returnObject) {
		this.returnObject = returnObject;
	}
}
