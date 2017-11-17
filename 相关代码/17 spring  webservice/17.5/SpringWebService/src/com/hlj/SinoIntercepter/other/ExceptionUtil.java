package com.hlj.SinoIntercepter.other;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {

	/**
	 * 将CheckedException转换为UncheckedException
	 * @param e
	 * @return
	 */
	public static RuntimeException toUncheckedException(Exception e) {
		if (e instanceof RuntimeException) {
			return (RuntimeException) e;
		} else {
			return new RuntimeException(e);
		}
	}

	/**
	 * 将StackTrace转化为String
	 * @param e
	 * @return
	 */
	public static String getStackTraceAsString(Exception e) {
		StringWriter stringWriter = new StringWriter();
		e.printStackTrace(new PrintWriter(stringWriter));
		return stringWriter.toString();
	}
	
	/**
	 * 获取异常消息
	 * @param e
	 * @param length，小于等于 0 时，不进行长度限制
	 * @return
	 */
	public static String getExceptionMessage(Exception e, Integer length) {
		String msg = null;
		if (e instanceof NullPointerException) {
			msg = "java.lang.NullPointerException";
		} else {
			msg = e.getMessage();
		}
		if (length == null || length <= 0) {
			return msg;
		}
		if (msg.length() > length) {
			msg = msg.substring(0, length);
		}
		return msg;
	}

}
