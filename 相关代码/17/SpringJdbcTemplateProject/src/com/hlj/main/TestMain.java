package com.hlj.main;

import org.springframework.context.ApplicationContext;

import com.hlj.jdbctemplate.ISequenceDao;
import com.hlj.jdbctemplate.SequenceDaoImp;
import com.hlj.util.ApplicaionContextUtil;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��24�� ����3:42:47 
 * ��˵�� 
 */
public class TestMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = ApplicaionContextUtil.getApplicationContext();
		
		ISequenceDao iSequenceDao = (ISequenceDao)context.getBean(ISequenceDao.class);
		
		System.out.println(iSequenceDao.getFlowNo());
		
		System.out.println(iSequenceDao.getBySql().toString());
	}
}
