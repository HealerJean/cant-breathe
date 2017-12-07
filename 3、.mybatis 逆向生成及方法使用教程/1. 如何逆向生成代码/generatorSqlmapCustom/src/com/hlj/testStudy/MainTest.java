package com.hlj.testStudy;

import java.util.List;

import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserone;
import com.taotao.pojo.TbUserone.Criteria;

public class MainTest {
	

	public static void main(String[] args) {
		
		TbUserone example  = new TbUserone();
		example.setOrderByClause("字段名 ASC"); //升序排列，desc为降序排列。  
		example.setDistinct(false);//去除重复，boolean型，true为选择不重复的记录。  
		
		TbUserone.Criteria criteria = new TbUserone().createCriteria();  
	
	/**
	 *  and用法
	 */
		TbUserone.Criteria criteria2 = example.createCriteria();  
		criteria2.andUsernameEqualTo("joe");  
		criteria2.andPasswordIsNull();  
		example.setOrderByClause("username asc,email desc");  
	//出现		List<TbUser>list = TbUserMapper.selectByExample(example);  
	//相当于：select * from TbUser where username = 'joe' and password is null order  
				  
	
		/**
		 *  or用法
		 */
		TbUserone.Criteria criteria3 = example.createCriteria();  
		criteria3.andUsernameEqualTo("joe");  
		criteria3.andPasswordIsNull();  
		
		TbUserone.Criteria criteria4 = example.createCriteria();  
		criteria4.andEmailEqualTo("mxzdhealer@gmail.com");  
		criteria4.andPhoneIsNull();  
		example.or(criteria4);
		
		//出现 List<TbUser>list = TbUserMapper.selectByExample(example);  
	//相当于   select * from TbUser where (username = 'joe' and password is null) or (email = 'mxzdhealer@gmail.com' and phone is null)  
	}

}
