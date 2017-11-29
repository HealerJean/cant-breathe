package com.hlj.service;


import com.hlj.bean.DemoInfo;

/**
 * demoInfo 服务接口
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
public interface DemoInfoService {
	
	public DemoInfo findById(long id);
	
	public void deleteFromCache(long id);


}
