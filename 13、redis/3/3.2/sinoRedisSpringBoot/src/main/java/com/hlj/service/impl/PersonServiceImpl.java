package com.hlj.service.impl;

import com.hlj.bean.Person;
import com.hlj.repository.DemoInfoRepository;
import com.hlj.repository.PersonRepository;
import com.hlj.service.PersonService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PersonServiceImpl implements PersonService {
	
	@Resource
	private PersonRepository personRepository;
/*

	@Cacheable(value="person") //缓存,这里没有指定key.
	@Override
	public Person findById(long id) {
		System.err.println("PersonServiceImpl.findById()=========从数据库中进行获取的....id="+id);
		return personRepository.findOne(id);
	}
*/
	@CacheEvict(value="person")
	@Override
	public void deleteFromCache(long id) {
		System.out.println("PersonServiceImpl.delete().从缓存中删除."+id);
	}




	//将缓存保存进andCache，并使用参数中的userId加上一个字符串(这里使用方法名称)作为缓存的key
    @Cacheable(value="HealerJeanCache",key="#id + 'findById'")
	@Override
	public Person findById(long id) {
		System.err.println("PersonServiceImpl.findById()=========从数据库中进行获取的....id="+id);
		return personRepository.findOne(id);
	}



	//清除掉指定key的缓存
	@CacheEvict(value="HealerJeanCache",key="#person.id + 'findById'")
	@Override
	public void deleteFromCacheForPerson(Person person) {
		System.out.println("PersonServiceImpl.delete().从缓存中删除."+person.getId());
		}

}
