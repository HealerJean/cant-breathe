package com.hlj.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hlj.mybatis.entry.PlanOAVO;
import com.hlj.mybatis.entry.PlanOAVOCriteria;


public interface PlanOAVOMapper {
    int countByExample(PlanOAVOCriteria example);

    int deleteByExample(PlanOAVOCriteria example);

    int deleteByPrimaryKey(String pkPlan);

    int insert(PlanOAVO record);

    int insertSelective(PlanOAVO record);

    List<PlanOAVO> selectByExample(PlanOAVOCriteria example);

    PlanOAVO selectByPrimaryKey(String pkPlan);

    int updateByExampleSelective(@Param("record") PlanOAVO record, @Param("example") PlanOAVOCriteria example);

    int updateByExample(@Param("record") PlanOAVO record, @Param("example") PlanOAVOCriteria example);

    int updateByPrimaryKeySelective(PlanOAVO record);

    int updateByPrimaryKey(PlanOAVO record);

    PlanOAVO selectByPlanId(String planId);
        
    PlanOAVO selectByAccountplanid(String accountplanid);
    
    int countByPlanId(String planId); 
    
    /// templanOavo 复制而来的方法
    List<PlanOAVO> selectAll();
}