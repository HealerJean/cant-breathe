package com.hlj.testStudy;

import java.util.List;

import com.taotao.mapper.TbUserMapper;
import com.taotao.pojo.TbUser;
import com.taotao.pojo.TbUserone;
import com.taotao.pojo.TbUserone.Criteria;

public class MainTest {
	

	public static void main(String[] args) {
		
		TbUserone example  = new TbUserone();
		example.setOrderByClause("�ֶ��� ASC"); //�������У�descΪ�������С�  
		example.setDistinct(false);//ȥ���ظ���boolean�ͣ�trueΪѡ���ظ��ļ�¼��  
		
		TbUserone.Criteria criteria = new TbUserone().createCriteria();  
	
	/**
	 *  and�÷�
	 */
		TbUserone.Criteria criteria2 = example.createCriteria();  
		criteria2.andUsernameEqualTo("joe");  
		criteria2.andPasswordIsNull();  
		example.setOrderByClause("username asc,email desc");  
	//����		List<TbUser>list = TbUserMapper.selectByExample(example);  
	//�൱�ڣ�select * from TbUser where username = 'joe' and password is null order  
				  
	
		/**
		 *  or�÷�
		 */
		TbUserone.Criteria criteria3 = example.createCriteria();  
		criteria3.andUsernameEqualTo("joe");  
		criteria3.andPasswordIsNull();  
		
		TbUserone.Criteria criteria4 = example.createCriteria();  
		criteria4.andEmailEqualTo("mxzdhealer@gmail.com");  
		criteria4.andPhoneIsNull();  
		example.or(criteria4);
		
		//���� List<TbUser>list = TbUserMapper.selectByExample(example);  
	//�൱��   select * from TbUser where (username = 'joe' and password is null) or (email = 'mxzdhealer@gmail.com' and phone is null)  
	}

}
