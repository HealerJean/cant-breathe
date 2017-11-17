package com.reflect.util;


public enum RespStatus {

	Normal("Normal", "Õý³£"),
	
	Exception("Exception", "Òì³£");

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