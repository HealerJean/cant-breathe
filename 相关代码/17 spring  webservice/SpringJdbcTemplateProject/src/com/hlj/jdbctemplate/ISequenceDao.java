package com.hlj.jdbctemplate;

import java.util.List;

public interface ISequenceDao {

	/**
	 * @return
	 * @Description: 
	 * ��ȡ���κ�
	 */
	public abstract String getBatchNo();

	/**
	 * @return
	 * @Description: 
	 * ��ȡ�������к�
	 */
	public abstract String getAppseriono();
	
	/**
	 * ��ȡϵͳ������ˮ��
	 * @return
	 */
	public abstract String getSerialNo();

	public abstract <T> T get(String sequence, Class<T> clazz);
	
	/**
	 * @return
	 * @Description: 
	 * ��ȡ�ɷ�������
	 */
	public abstract String getContriApplyNo();

	/**
	 * @return
	 * @Description: 
	 * ��ȡ�ɷ�������
	 */
	public abstract String getInsnId();
	
	/**
	 * @return
	 * @Description: 
	 * ��ȡ������ˮ��
	 */
	public abstract String getRefNo();
	
	/**
	 * @return
	 * @Description: 
	 * ��ȡ�ļ��Ӵ�����ˮ��
	 */
	public abstract String getFlowNo();

	public abstract String getappno();
	
	
	public abstract List<PayReceiptDetialEO> getBySql(); 

	public abstract PayReceiptDetialEO getByObjectSql(); 

	
}