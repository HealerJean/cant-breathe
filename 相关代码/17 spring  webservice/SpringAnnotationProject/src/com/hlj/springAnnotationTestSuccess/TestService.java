package com.hlj.springAnnotationTestSuccess;

import javax.annotation.Resource;

/** 
 * @author ���� HealerJean
 * @version ����ʱ�䣺2017��10��11�� ����11:19:14 
 * ��˵�� 
 */
public class TestService {
	
	@Resource
	public AnnotationServiceInter nameService;
	
	public void test (){
		nameService.testSpringAnnotationBean();
	}
}
