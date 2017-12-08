package com.bean.mapper;

import com.bean.pojo.Person;
import com.bean.pojo.PersonCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
    int countByExample(PersonCriteria example);

    int deleteByExample(PersonCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonCriteria example);

    Person selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonCriteria example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonCriteria example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}