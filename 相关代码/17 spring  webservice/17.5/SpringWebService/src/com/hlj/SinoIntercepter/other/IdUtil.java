package com.hlj.SinoIntercepter.other;

import java.util.UUID;

public class IdUtil {

	private IdUtil() {
		
	}
	
	/**
	 * uuid��ʽ����Ψһ��ʶ������-���ָ����ţ�����36λ
	 * @return
	 */
	public static String uuid36() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * uuid��ʽ����Ψһ��ʶ��������-���ָ����ţ�����32λ
	 * @return
	 */
	public static String uuid32() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
