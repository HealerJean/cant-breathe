package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.TmpInvstOAVO;
import org.dicp.oa.account.model.entity.TmpInvstOAVOCriteria;

public interface TmpInvstOAVOMapper {
    int countByExample(TmpInvstOAVOCriteria example);

    int deleteByExample(TmpInvstOAVOCriteria example);

    int insert(TmpInvstOAVO record);

    int insertSelective(TmpInvstOAVO record);

    List<TmpInvstOAVO> selectByExample(TmpInvstOAVOCriteria example);

    int updateByExampleSelective(@Param("record") TmpInvstOAVO record, @Param("example") TmpInvstOAVOCriteria example);

    int updateByExample(@Param("record") TmpInvstOAVO record, @Param("example") TmpInvstOAVOCriteria example);
}