package com.hlj.springAnnotationTestSuccess;

import javax.annotation.Resource;

/** 
 * @author 作者 HealerJean
 * @version 创建时间：2017年10月11日 上午11:19:14 
 * 类说明 
 */
public class TestService {
	
	@Resource
	public AnnotationServiceInter nameService;
	
	public void test (){
		nameService.testSpringAnnotationBean();
	}
}
