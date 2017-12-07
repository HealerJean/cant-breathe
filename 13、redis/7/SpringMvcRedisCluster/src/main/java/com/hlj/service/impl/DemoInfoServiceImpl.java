package com.hlj.service.impl;


import com.hlj.bean.mapper.TbUserMapper;
import com.hlj.bean.pojo.TbUser;
import com.hlj.service.DemoInfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class DemoInfoServiceImpl implements DemoInfoService {
	
	@Autowired
	TbUserMapper tbUserMapper;
	
    @Cacheable(value="common",key="#id + 'findById'")	
	public TbUser findById(long id) {
		System.err.println("DemoInfoServiceImpl.findById()========id="+id);
		TbUser tbUser = tbUserMapper.selectByPrimaryKey(id);

		return tbUser; 
	}
    
    @CacheEvict(value="common",key="#tbUser.id + 'findById'")	
	public void deleteFromCache(TbUser tbUser) {
		System.out.println("DemoInfoServiceImpl.delete()."+tbUser.getId());
	}
	
}
