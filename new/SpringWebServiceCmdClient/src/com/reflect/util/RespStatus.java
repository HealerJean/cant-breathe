package com.reflect.util;


public enum RespStatus {

	Normal("Normal", "����"),
	
	Exception("Exception", "�쳣");

	private String code;

	private String label;

	private RespStatus(String code, String label) {
		this.code = code;
		this.label = label;
	}

	public String getCode() {
		return code;
	}

	public String getLabel() {
		return label;
	}

}