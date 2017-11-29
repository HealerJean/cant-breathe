package com.hlj.service.impl;

import javax.annotation.Resource;

import com.hlj.bean.DemoInfo;
import com.hlj.repository.DemoInfoRepository;
import com.hlj.service.DemoInfoService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * 
 *DemoInfo数据处理类
 * 
 * @author Angel(QQ:412887952)
 * @version v.0.1
 */
@Service
public class DemoInfoServiceImpl implements DemoInfoService {
	
	@Resource
	private DemoInfoRepository demoInfoRepository;

	@Cacheable(value="demoInfo") //缓存,这里没有指定key.
	@Override
	public DemoInfo findById(long id) {
		System.err.println("DemoInfoServiceImpl.findById()=========从数据库中进行获取的....id="+id);
		return demoInfoRepository.findOne(id);
	}
	
	@CacheEvict(value="demoInfo")
	@Override
	public void deleteFromCache(long id) {
		System.out.println("DemoInfoServiceImpl.delete().从缓存中删除."+id);
	}
	
}
