package com.hlj.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hlj.mybatis.entry.PlanOAVO;
import com.hlj.mybatis.mapper.PlanOAVOMapper;
import com.sun.org.apache.regexp.internal.recompile;

/** 
 * @author : HealerJean
 * @date   ： 2017年11月28日 下午4:12:06 
 * @Description:
 */
@Service
public class ServiceMybatis {
	
	@Autowired
	public PlanOAVOMapper planOAVOMapper;
	
	public PlanOAVO findById(String id){
		
		return planOAVOMapper.selectByPlanId(id);
	}
}
