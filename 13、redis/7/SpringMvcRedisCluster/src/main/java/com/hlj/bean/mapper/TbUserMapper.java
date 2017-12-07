package com.hlj.bean.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hlj.bean.pojo.TbUser;
import com.hlj.bean.pojo.TbUserone;

public interface TbUserMapper {
/**
	//下面是一个完整的案列
	 TbUserExample example = new TbUserExample();
	 Criteria criteria = example.createCriteria();
	 criteria.andUsernameEqualTo("joe");
	 int count = tbUserMapper.countByExample(example);
	 相当于：select count(*) from user where username='joe'
*/
    int countByExample(TbUserone example);

    int deleteByExample(TbUserone example);

    int deleteByPrimaryKey(Long id);

    /**
        TbUser record=new TbUser();  
        record.setName("sansan");  
     // 使用所有的属性作为字段使用  
        this.tbUserMapper.insert(record);  
  	 相当于 INSERT INTO tb_user (AGE,USER_NAME,ID,NAME,BIRTHDAY,SEX,PASSWORD,UPDATED,CREATED) VALUES ( ?,?,?,?,?,?,?,?,? ) 
     */
    int insert(TbUser record);

    /**
        TbUser record=new TbUser();  
        record.setName("sansan");  
     // 使用所有的属性作为字段使用  
        this.tbUserMapper.insert(record);  
    	INSERT INTO tb_user ( ID,NAME ) VALUES ( ?,? ) 
     */
    int insertSelective(TbUser record);

    
    /**
     * List<TbUser> selectByExample(TbUserExample example);
     * 
      语句逻辑上存在问题，但是语句是正确的
    serExample example = new UserExample();  
	Criteria criteria = example.createCriteria();  
	criteria.andUsernameEqualTo("joe");  
	criteria.andUsernameIsNull();  
	example.setOrderByClause("username asc,email desc");  
	List<?>list = ##tbUserMapper.selectByExample(example);  
	相当于：select * from user where username = 'joe' and username is null order  
	  
     */
    List<TbUser> selectByExample(TbUserone example);

    /**
     * Mapper.selectByPrimaryKey(100); 
     * 相当于select * from user where  id = 100  
     * @param id
     * @return
     */
    TbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserone example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserone example);
    
    /**
     * 如果你只想更新某一字段，可以用这个方法。
     */
    int updateByPrimaryKeySelective(TbUser record);
   
    /**
     * updateByPrimaryKey对你注入的字段全部更新
     */
    int updateByPrimaryKey(TbUser record);
}