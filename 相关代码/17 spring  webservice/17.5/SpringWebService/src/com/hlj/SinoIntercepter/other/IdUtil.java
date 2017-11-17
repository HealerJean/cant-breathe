package com.hlj.SinoIntercepter.other;

import java.util.UUID;

public class IdUtil {

	private IdUtil() {
		
	}
	
	/**
	 * uuid方式生成唯一标识，含“-”分隔符号，长度36位
	 * @return
	 */
	public static String uuid36() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * uuid方式生成唯一标识，不含“-”分隔符号，长度32位
	 * @return
	 */
	public static String uuid32() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
