package com.hlj.SinoIntercepter.other;

import java.io.PrintWriter;
import java.io.StringWriter;

public class ExceptionUtil {

	/**
	 * ��CheckedExceptionת��ΪUncheckedException
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
	 * ��StackTraceת��ΪString
	 * @param e
	 * @return
	 */
	public static String getStackTraceAsString(Exception e) {
		StringWriter stringWriter = new StringWriter();
		e.printStackTrace(new PrintWriter(stringWriter));
		return stringWriter.toString();
	}
	
	/**
	 * ��ȡ�쳣��Ϣ
	 * @param e
	 * @param length��С�ڵ��� 0 ʱ�������г�������
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
