package com.hlj.service.impl;

import javax.annotation.Resource;

import com.hlj.bean.DemoInfo;
import com.hlj.service.DemoInfoService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class DemoInfoServiceImpl implements DemoInfoService {
	

    @Override
    @Cacheable(value="HealerJeanCache",key="#id + 'findById'")	
	public DemoInfo findById(long id) {
		System.err.println("DemoInfoServiceImpl.findById()========id="+id);
		DemoInfo demoInfo = new DemoInfo();
		demoInfo.setId(1);
		demoInfo.setName("HealerJean");
		demoInfo.setPwd("123456");
		return demoInfo; 
	}
    
    @Override
    @CacheEvict(value="HealerJeanCache",key="#demoInfo.id + 'findById'")	
	public void deleteFromCache(DemoInfo demoInfo) {
		System.out.println("DemoInfoServiceImpl.delete()."+demoInfo.getId());
	}
	
}
