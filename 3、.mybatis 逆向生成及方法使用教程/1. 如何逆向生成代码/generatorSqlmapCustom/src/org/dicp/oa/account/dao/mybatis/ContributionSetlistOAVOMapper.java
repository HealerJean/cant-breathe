package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.ContributionSetlistOAVO;
import org.dicp.oa.account.model.entity.ContributionSetlistOAVOCriteria;

public interface ContributionSetlistOAVOMapper {
    int countByExample(ContributionSetlistOAVOCriteria example);

    int deleteByExample(ContributionSetlistOAVOCriteria example);

    int insert(ContributionSetlistOAVO record);

    int insertSelective(ContributionSetlistOAVO record);

    List<ContributionSetlistOAVO> selectByExample(ContributionSetlistOAVOCriteria example);

    int updateByExampleSelective(@Param("record") ContributionSetlistOAVO record, @Param("example") ContributionSetlistOAVOCriteria example);

    int updateByExample(@Param("record") ContributionSetlistOAVO record, @Param("example") ContributionSetlistOAVOCriteria example);
}