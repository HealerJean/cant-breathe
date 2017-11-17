package com.reflect.util;



public enum YesOrNo  {

	YES("Y", "³É¹¦"),

	NO("N", "Ê§°Ü");
	
	private String code;

	private String label;

	private YesOrNo(String code, String label) {
		this.code = code;
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public String getCode() {
		return code;
	}

}
