package org.dicp.oa.account.dao.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.PayListOAVO;
import org.dicp.oa.account.model.entity.PayListOAVOCriteria;

public interface PayListOAVOMapper {
    int countByExample(PayListOAVOCriteria example);

    int deleteByExample(PayListOAVOCriteria example);

    int insert(PayListOAVO record);

    int insertSelective(PayListOAVO record);

    List<PayListOAVO> selectByExample(PayListOAVOCriteria example);

    int updateByExampleSelective(@Param("record") PayListOAVO record, @Param("example") PayListOAVOCriteria example);

    int updateByExample(@Param("record") PayListOAVO record, @Param("example") PayListOAVOCriteria example);

// DICC ����֧���°� 

    int deleteByPrimaryKey(String pkPaylist);
    
    PayListOAVO selectByPrimaryKey(String pkPaylist);

    
    int updateByPrimaryKeySelective(PayListOAVO record);

    int updateByPrimaryKey(PayListOAVO record);
    
    /**
 	 * @param listNo
 	 * @return
 	 * @Description: 
 	 * �����嵥����Ų�ѯ�嵥��ϸ��״̬�б�
 	 */
 	List<Map<String, Object>> selectPerListStatus(String listNo);
 	
	List<PayListOAVO> selectToOrderByListNo(Map<String, Object> params);
   
}