package com.hlj.SinoIntercepter.other;


public enum InOutType {

	Request("Request", "����"),
	
	Response("Response", "��Ӧ");

	private String code;

	private String label;

	private InOutType(String code, String label) {
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