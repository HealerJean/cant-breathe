package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.PriceDayOAVO;
import org.dicp.oa.account.model.entity.PriceDayOAVOCriteria;

public interface PriceDayOAVOMapper {
    int countByExample(PriceDayOAVOCriteria example);

    int deleteByExample(PriceDayOAVOCriteria example);

    int deleteByPrimaryKey(String pkPriceday);

    int insert(PriceDayOAVO record);

    int insertSelective(PriceDayOAVO record);

    List<PriceDayOAVO> selectByExample(PriceDayOAVOCriteria example);

    PriceDayOAVO selectByPrimaryKey(String pkPriceday);

    int updateByExampleSelective(@Param("record") PriceDayOAVO record, @Param("example") PriceDayOAVOCriteria example);

    int updateByExample(@Param("record") PriceDayOAVO record, @Param("example") PriceDayOAVOCriteria example);

    int updateByPrimaryKeySelective(PriceDayOAVO record);

    int updateByPrimaryKey(PriceDayOAVO record);
}