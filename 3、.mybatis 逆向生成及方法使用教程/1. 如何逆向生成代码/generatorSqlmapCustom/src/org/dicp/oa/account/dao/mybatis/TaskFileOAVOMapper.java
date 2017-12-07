package org.dicp.oa.account.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dicp.oa.account.model.entity.TaskFileOAVO;
import org.dicp.oa.account.model.entity.TaskFileOAVOCriteria;

public interface TaskFileOAVOMapper {
    int countByExample(TaskFileOAVOCriteria example);

    int deleteByExample(TaskFileOAVOCriteria example);

    int insert(TaskFileOAVO record);

    int insertSelective(TaskFileOAVO record);

    List<TaskFileOAVO> selectByExample(TaskFileOAVOCriteria example);

    int updateByExampleSelective(@Param("record") TaskFileOAVO record, @Param("example") TaskFileOAVOCriteria example);

    int updateByExample(@Param("record") TaskFileOAVO record, @Param("example") TaskFileOAVOCriteria example);
    
    // ����Ϊdicc �µı�ṹ���ƹ�����
   
    
    TaskFileOAVO selectByPrimaryKey(String pkTaskfile);

    int deleteByPrimaryKey(String pkTaskfile);
    
    int updateByPrimaryKeySelective(TaskFileOAVO record);

    int updateByPrimaryKey(TaskFileOAVO record);
    
    TaskFileOAVO queryTaskFileOAVOByPkPaylistinfo(String paylistinfo);
    
    TaskFileOAVO queryTaskFileOAVOByPkBatchno(@Param("batchno") String batchno);
    
    int countByBatchno(@Param("batchno") String batchno);
    
   /* PayReceiptSumEO  queryPayReceiptSumEOByInnerListNo(String innerListNo);
    
    List<PayReceiptDetialEO>  queryPayReceiptDetialEOByInnerListNo(String innerListNo);
    
    *//**
     * �����������κŸ�����������
     * @param batchno		�������κ�
     * @param pkPayListInfo	��������
     * @return
     *//*
    int updatePkPayListInfoByBatchNo(@Param("batchno") String batchno,@Param("pkPayListInfo")String pkPayListInfo);
    
    PayReceiptSumEO queryPayReceiptSumEOByInnerListNoGX(String innerListNo);
*/
    
}