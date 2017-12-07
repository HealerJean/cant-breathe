package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.TmpPriceDayOAVO;
import org.dicp.oa.account.model.entity.TmpPriceDayOAVOCriteria;

public interface TmpPriceDayOAVOMapper {
    int countByExample(TmpPriceDayOAVOCriteria example);

    int deleteByExample(TmpPriceDayOAVOCriteria example);

    int insert(TmpPriceDayOAVO record);

    int insertSelective(TmpPriceDayOAVO record);

    List<TmpPriceDayOAVO> selectByExample(TmpPriceDayOAVOCriteria example);

    int updateByExampleSelective(@Param("record") TmpPriceDayOAVO record, @Param("example") TmpPriceDayOAVOCriteria example);

    int updateByExample(@Param("record") TmpPriceDayOAVO record, @Param("example") TmpPriceDayOAVOCriteria example);
}