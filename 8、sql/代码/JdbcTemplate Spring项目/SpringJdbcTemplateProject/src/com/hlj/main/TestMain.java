package com.hlj.main;

import org.springframework.context.ApplicationContext;

import com.hlj.jdbctemplate.ISequenceDao;
import com.hlj.jdbctemplate.SequenceDaoImp;
import com.hlj.util.ApplicaionContextUtil;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月24日 下午3:42:47 
 * 类说明 
 */
public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = ApplicaionContextUtil.getApplicationContext();
		
		ISequenceDao iSequenceDao = (ISequenceDao)context.getBean(ISequenceDao.class);
		
		System.out.println(iSequenceDao.getFlowNo());
		
		System.out.println(iSequenceDao.getBySql().toString());
	}
}
