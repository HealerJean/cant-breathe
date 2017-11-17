package com.reflect.bean;


public class ServiceResponse {
	
	public static final String SUCCESS = "01";
	
	public static final String FAIL = "02";

	private String code;
	
	private String msg;
	
	public ServiceResponse() {
		
	}
	
	public ServiceResponse(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
