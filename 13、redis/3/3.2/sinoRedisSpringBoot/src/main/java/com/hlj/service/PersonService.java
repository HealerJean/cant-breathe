package com.hlj.service;


import com.hlj.bean.Person;



public interface PersonService {
	
	public Person findById(long id);
	
	public void deleteFromCache(long id);

	public void deleteFromCacheForPerson(Person person);

}
