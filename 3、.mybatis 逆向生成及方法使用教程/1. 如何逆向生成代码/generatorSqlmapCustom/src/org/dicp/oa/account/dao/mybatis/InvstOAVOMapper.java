package org.dicp.oa.account.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.InvstOAVO;
import org.dicp.oa.account.model.entity.InvstOAVOCriteria;


public interface InvstOAVOMapper {
    int countByExample(InvstOAVOCriteria example);

    int deleteByExample(InvstOAVOCriteria example);

    int deleteByPrimaryKey(String pkInvst);

    int insert(InvstOAVO record);

    int insertSelective(InvstOAVO record);

    List<InvstOAVO> selectByExample(InvstOAVOCriteria example);

    InvstOAVO selectByPrimaryKey(String pkInvst);

    int updateByExampleSelective(@Param("record") InvstOAVO record, @Param("example") InvstOAVOCriteria example);

    int updateByExample(@Param("record") InvstOAVO record, @Param("example") InvstOAVOCriteria example);

    int updateByPrimaryKeySelective(InvstOAVO record);

    int updateByPrimaryKey(InvstOAVO record);
    
    // 正式表移动过来的
    InvstOAVO selectByPortfolioNo(String portfoliono);

}