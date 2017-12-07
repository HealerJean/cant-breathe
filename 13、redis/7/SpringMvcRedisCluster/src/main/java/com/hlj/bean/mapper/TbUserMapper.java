package com.hlj.bean.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hlj.bean.pojo.TbUser;
import com.hlj.bean.pojo.TbUserone;

public interface TbUserMapper {
/**
	//������һ�������İ���
	 TbUserExample example = new TbUserExample();
	 Criteria criteria = example.createCriteria();
	 criteria.andUsernameEqualTo("joe");
	 int count = tbUserMapper.countByExample(example);
	 �൱�ڣ�select count(*) from user where username='joe'
*/
    int countByExample(TbUserone example);

    int deleteByExample(TbUserone example);

    int deleteByPrimaryKey(Long id);

    /**
        TbUser record=new TbUser();  
        record.setName("sansan");  
     // ʹ�����е�������Ϊ�ֶ�ʹ��  
        this.tbUserMapper.insert(record);  
  	 �൱�� INSERT INTO tb_user (AGE,USER_NAME,ID,NAME,BIRTHDAY,SEX,PASSWORD,UPDATED,CREATED) VALUES ( ?,?,?,?,?,?,?,?,? ) 
     */
    int insert(TbUser record);

    /**
        TbUser record=new TbUser();  
        record.setName("sansan");  
     // ʹ�����е�������Ϊ�ֶ�ʹ��  
        this.tbUserMapper.insert(record);  
    	INSERT INTO tb_user ( ID,NAME ) VALUES ( ?,? ) 
     */
    int insertSelective(TbUser record);

    
    /**
     * List<TbUser> selectByExample(TbUserExample example);
     * 
      ����߼��ϴ������⣬�����������ȷ��
    serExample example = new UserExample();  
	Criteria criteria = example.createCriteria();  
	criteria.andUsernameEqualTo("joe");  
	criteria.andUsernameIsNull();  
	example.setOrderByClause("username asc,email desc");  
	List<?>list = ##tbUserMapper.selectByExample(example);  
	�൱�ڣ�select * from user where username = 'joe' and username is null order  
	  
     */
    List<TbUser> selectByExample(TbUserone example);

    /**
     * Mapper.selectByPrimaryKey(100); 
     * �൱��select * from user where  id = 100  
     * @param id
     * @return
     */
    TbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbUser record, @Param("example") TbUserone example);

    int updateByExample(@Param("record") TbUser record, @Param("example") TbUserone example);
    
    /**
     * �����ֻ�����ĳһ�ֶΣ����������������
     */
    int updateByPrimaryKeySelective(TbUser record);
   
    /**
     * updateByPrimaryKey����ע����ֶ�ȫ������
     */
    int updateByPrimaryKey(TbUser record);
}