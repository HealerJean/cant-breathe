package com.hlj.service;


import com.hlj.bean.DemoInfo;


public interface DemoInfoService {
	
	public DemoInfo findById(long id);
	
	public void deleteFromCache(DemoInfo demoInfo);

}
