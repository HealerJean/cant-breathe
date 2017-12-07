package org.dicp.oa.account.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.CollectDetailOAVO;
import org.dicp.oa.account.model.entity.CollectDetailOAVOCriteria;

public interface CollectDetailOAVOMapper {
    int countByExample(CollectDetailOAVOCriteria example);

    int deleteByExample(CollectDetailOAVOCriteria example);

    int deleteByPrimaryKey(String pkCollectdetail);

    int insert(CollectDetailOAVO record);

    int insertSelective(CollectDetailOAVO record);

    List<CollectDetailOAVO> selectByExample(CollectDetailOAVOCriteria example);

    CollectDetailOAVO selectByPrimaryKey(String pkCollectdetail);

    int updateByExampleSelective(@Param("record") CollectDetailOAVO record, @Param("example") CollectDetailOAVOCriteria example);

    int updateByExample(@Param("record") CollectDetailOAVO record, @Param("example") CollectDetailOAVOCriteria example);

    int updateByPrimaryKeySelective(CollectDetailOAVO record);

    int updateByPrimaryKey(CollectDetailOAVO record);
    
    int countByCollectSN(@Param("collectSN") String collectSN);

    
}