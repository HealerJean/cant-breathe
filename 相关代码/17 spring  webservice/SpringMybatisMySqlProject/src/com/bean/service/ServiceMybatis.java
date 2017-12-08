package com.bean.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.mapper.PersonMapper;
import com.bean.pojo.Person;
import com.sun.org.apache.regexp.internal.recompile;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月28日 下午4:12:06 
 * @Description:
 */
@Service
public class ServiceMybatis {
	
	@Autowired
	public PersonMapper personMapper;
	
	public Person findById(long id){
		
		return personMapper.selectByPrimaryKey(id);
	}
}
