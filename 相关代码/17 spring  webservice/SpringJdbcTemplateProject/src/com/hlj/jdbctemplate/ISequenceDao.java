package com.hlj.jdbctemplate;

import java.util.List;

public interface ISequenceDao {

	/**
	 * @return
	 * @Description: 
	 * 获取批次号
	 */
	public abstract String getBatchNo();

	/**
	 * @return
	 * @Description: 
	 * 获取交易序列号
	 */
	public abstract String getAppseriono();
	
	/**
	 * 获取系统公共流水号
	 * @return
	 */
	public abstract String getSerialNo();

	public abstract <T> T get(String sequence, Class<T> clazz);
	
	/**
	 * @return
	 * @Description: 
	 * 获取缴费申请编号
	 */
	public abstract String getContriApplyNo();

	/**
	 * @return
	 * @Description: 
	 * 获取缴费申请编号
	 */
	public abstract String getInsnId();
	
	/**
	 * @return
	 * @Description: 
	 * 获取交易流水号
	 */
	public abstract String getRefNo();
	
	/**
	 * @return
	 * @Description: 
	 * 获取文件从处理流水号
	 */
	public abstract String getFlowNo();

	public abstract String getappno();
	
	
	public abstract List<PayReceiptDetialEO> getBySql(); 

	public abstract PayReceiptDetialEO getByObjectSql(); 

	
}