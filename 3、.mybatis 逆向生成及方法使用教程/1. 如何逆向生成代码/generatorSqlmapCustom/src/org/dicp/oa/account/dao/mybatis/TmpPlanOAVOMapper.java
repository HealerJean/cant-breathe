package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.TmpPlanOAVO;
import org.dicp.oa.account.model.entity.TmpPlanOAVOCriteria;

public interface TmpPlanOAVOMapper {
    int countByExample(TmpPlanOAVOCriteria example);

    int deleteByExample(TmpPlanOAVOCriteria example);

    int insert(TmpPlanOAVO record);

    int insertSelective(TmpPlanOAVO record);

    List<TmpPlanOAVO> selectByExample(TmpPlanOAVOCriteria example);

    int updateByExampleSelective(@Param("record") TmpPlanOAVO record, @Param("example") TmpPlanOAVOCriteria example);

    int updateByExample(@Param("record") TmpPlanOAVO record, @Param("example") TmpPlanOAVOCriteria example);
}