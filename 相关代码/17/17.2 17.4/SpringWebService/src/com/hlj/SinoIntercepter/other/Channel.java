package com.hlj.SinoIntercepter.other;


public enum Channel{

	Webservice("WebService", "WebService"),
	
	JMS("JMS", "JMS");

	private String code;

	private String label;

	private Channel(String code, String label) {
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