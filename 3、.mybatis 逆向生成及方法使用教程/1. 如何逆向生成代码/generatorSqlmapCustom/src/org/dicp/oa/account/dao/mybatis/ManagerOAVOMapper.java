package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.ManagerOAVO;
import org.dicp.oa.account.model.entity.ManagerOAVOCriteria;


public interface ManagerOAVOMapper {
    int countByExample(ManagerOAVOCriteria example);

    int deleteByExample(ManagerOAVOCriteria example);

    int deleteByPrimaryKey(String pkManager);

    int insert(ManagerOAVO record);

    int insertSelective(ManagerOAVO record);

    List<ManagerOAVO> selectByExample(ManagerOAVOCriteria example);

    ManagerOAVO selectByPrimaryKey(String pkManager);

    int updateByExampleSelective(@Param("record") ManagerOAVO record, @Param("example") ManagerOAVOCriteria example);

    int updateByExample(@Param("record") ManagerOAVO record, @Param("example") ManagerOAVOCriteria example);

    int updateByPrimaryKeySelective(ManagerOAVO record);

    int updateByPrimaryKey(ManagerOAVO record);
}