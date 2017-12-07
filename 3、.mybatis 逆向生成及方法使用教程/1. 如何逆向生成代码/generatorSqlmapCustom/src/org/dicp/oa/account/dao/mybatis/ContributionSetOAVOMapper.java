package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.ContributionSetOAVO;
import org.dicp.oa.account.model.entity.ContributionSetOAVOCriteria;

public interface ContributionSetOAVOMapper {
    int countByExample(ContributionSetOAVOCriteria example);

    int deleteByExample(ContributionSetOAVOCriteria example);

    int insert(ContributionSetOAVO record);

    int insertSelective(ContributionSetOAVO record);

    List<ContributionSetOAVO> selectByExample(ContributionSetOAVOCriteria example);

    int updateByExampleSelective(@Param("record") ContributionSetOAVO record, @Param("example") ContributionSetOAVOCriteria example);

    int updateByExample(@Param("record") ContributionSetOAVO record, @Param("example") ContributionSetOAVOCriteria example);
}