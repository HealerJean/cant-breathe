package com.hlj.main;

import org.springframework.context.ApplicationContext;

import com.bean.service.ServiceMybatis;
import com.hlj.util.ApplicaionContextUtil;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月24日 下午3:42:47 
 * 类说明 
 */
public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = ApplicaionContextUtil.getApplicationContext();
		
		ServiceMybatis serviceMybatis = (ServiceMybatis)context.getBean(ServiceMybatis.class);
		
		System.out.println("主键为："+serviceMybatis.findById(1).toString());
	}
}
