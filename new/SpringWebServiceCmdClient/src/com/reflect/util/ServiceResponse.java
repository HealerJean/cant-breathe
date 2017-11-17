package com.reflect.util;

/**
 * Copyright:http://www.picc.com.cn All rights reserved.
 * 
 * @author:huangshuren
 * @date:2012-7-9
 * @Description: 
 * 调用外部服务反馈
 */
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
