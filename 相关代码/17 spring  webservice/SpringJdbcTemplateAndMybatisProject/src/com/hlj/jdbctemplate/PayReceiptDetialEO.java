package com.hlj.jdbctemplate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PayReceiptDetialEO implements Serializable {

	private static final long serialVersionUID = 208618036531396867L;
	private String drawDate;
	private String drawTime;
	private String bankSerialNo;
	private String ssid;
	private String bankType;
	private String bankId;
	private String benebankid;
	private String receiverbank;
    private String receiverprov;
    private String receivecity;
    private String receivename;
    private String receiveidtype;
    private String receiveidno;
    private String staffname;
    private String idtype;
    private String idno;
	private String accNo;
	private String accName;
	private BigDecimal paySumUnTax;
	private BigDecimal payTax;
	private BigDecimal payAmt;
	private String collectSN;
	private String retryFlag;
	private String aPaysum;
	private String feeSum;
	private String beneType;
	private String memo;
	private String retCode;
	private String retMessage;
	private String payaftersum;
	private String planid;
	private String num;
	private String personid;
	private String ssnum;
	private String flag;

	
	
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getSsnum() {
		return ssnum;
	}
	public void setSsnum(String ssnum) {
		this.ssnum = ssnum;
	}
	public String getPlanid() {
		return planid;
	}
	public void setPlanid(String planid) {
		this.planid = planid;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPersonid() {
		return personid;
	}
	public void setPersonid(String personid) {
		this.personid = personid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getPayaftersum() {
		return payaftersum;
	}
	public void setPayaftersum(String payaftersum) {
		this.payaftersum = payaftersum;
	}
	public String getDrawDate() {
		return drawDate;
	}
	public void setDrawDate(String drawDate) {
		this.drawDate = drawDate;
	}
	public String getDrawTime() {
		return drawTime;
	}
	public void setDrawTime(String drawTime) {
		this.drawTime = drawTime;
	}
	public String getBankSerialNo() {
		return bankSerialNo;
	}
	public void setBankSerialNo(String bankSerialNo) {
		this.bankSerialNo = bankSerialNo;
	}
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	public String getBankType() {
		return bankType;
	}
	public void setBankType(String bankType) {
		this.bankType = bankType;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public BigDecimal getPaySumUnTax() {
		return paySumUnTax;
	}
	public void setPaySumUnTax(BigDecimal paySumUnTax) {
		this.paySumUnTax = paySumUnTax;
	}
	public BigDecimal getPayTax() {
		return payTax;
	}
	public void setPayTax(BigDecimal payTax) {
		this.payTax = payTax;
	}
	public BigDecimal getPayAmt() {
		return payAmt;
	}
	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}
	public String getBeneType() {
		return beneType;
	}
	public void setBeneType(String beneType) {
		this.beneType = beneType;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getRetCode() {
		return retCode;
	}
	public void setRetCode(String retCode) {
		this.retCode = retCode;
	}
	public String getRetMessage() {
		return retMessage;
	}
	public void setRetMessage(String retMessage) {
		this.retMessage = retMessage;
	}
	public String getCollectSN() {
		return collectSN;
	}
	public void setCollectSN(String collectSN) {
		this.collectSN = collectSN;
	}
	public String getRetryFlag() {
		return retryFlag;
	}
	public void setRetryFlag(String retryFlag) {
		this.retryFlag = retryFlag;
	}
	public String getaPaysum() {
		return aPaysum;
	}
	public void setaPaysum(String aPaysum) {
		this.aPaysum = aPaysum;
	}
	public String getFeeSum() {
		return feeSum;
	}
	public void setFeeSum(String feeSum) {
		this.feeSum = feeSum;
	}
	public String getBenebankid() {
		return benebankid;
	}
	public void setBenebankid(String benebankid) {
		this.benebankid = benebankid;
	}
	public String getReceiverbank() {
		return receiverbank;
	}
	public void setReceiverbank(String receiverbank) {
		this.receiverbank = receiverbank;
	}
	public String getReceiverprov() {
		return receiverprov;
	}
	public void setReceiverprov(String receiverprov) {
		this.receiverprov = receiverprov;
	}
	public String getReceivecity() {
		return receivecity;
	}
	public void setReceivecity(String receivecity) {
		this.receivecity = receivecity;
	}
	public String getReceivename() {
		return receivename;
	}
	public void setReceivename(String receivename) {
		this.receivename = receivename;
	}
	public String getReceiveidtype() {
		return receiveidtype;
	}
	public void setReceiveidtype(String receiveidtype) {
		this.receiveidtype = receiveidtype;
	}
	public String getReceiveidno() {
		return receiveidno;
	}
	public void setReceiveidno(String receiveidno) {
		this.receiveidno = receiveidno;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getIdtype() {
		return idtype;
	}
	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}
	public String getIdno() {
		return idno;
	}
	public void setIdno(String idno) {
		this.idno = idno;
	}
	
}
