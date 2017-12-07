package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.TmpManagerOAVO;
import org.dicp.oa.account.model.entity.TmpManagerOAVOCriteria;

public interface TmpManagerOAVOMapper {
    int countByExample(TmpManagerOAVOCriteria example);

    int deleteByExample(TmpManagerOAVOCriteria example);

    int insert(TmpManagerOAVO record);

    int insertSelective(TmpManagerOAVO record);

    List<TmpManagerOAVO> selectByExample(TmpManagerOAVOCriteria example);

    int updateByExampleSelective(@Param("record") TmpManagerOAVO record, @Param("example") TmpManagerOAVOCriteria example);

    int updateByExample(@Param("record") TmpManagerOAVO record, @Param("example") TmpManagerOAVOCriteria example);
}