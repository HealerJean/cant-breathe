package com.hlj.repository;

import com.hlj.bean.Person;
import org.springframework.data.repository.CrudRepository;



public interface PersonRepository extends CrudRepository<Person,Long> {

}
