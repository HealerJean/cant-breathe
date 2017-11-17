package com.reflect.util;



public enum YesOrNo  {

	YES("Y", "�ɹ�"),

	NO("N", "ʧ��");
	
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
