package com.hlj.service;


import com.hlj.bean.pojo.TbUser;


public interface DemoInfoService {
	
	public TbUser findById(long id);
	
	public void deleteFromCache(TbUser tbUser);

}
