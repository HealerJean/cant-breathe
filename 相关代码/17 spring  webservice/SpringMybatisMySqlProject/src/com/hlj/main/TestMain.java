package com.hlj.main;

import org.springframework.context.ApplicationContext;

import com.bean.service.ServiceMybatis;
import com.hlj.util.ApplicaionContextUtil;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��24�� ����3:42:47 
 * ��˵�� 
 */
public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = ApplicaionContextUtil.getApplicationContext();
		
		ServiceMybatis serviceMybatis = (ServiceMybatis)context.getBean(ServiceMybatis.class);
		
		System.out.println("����Ϊ��"+serviceMybatis.findById(1).toString());
	}
}
