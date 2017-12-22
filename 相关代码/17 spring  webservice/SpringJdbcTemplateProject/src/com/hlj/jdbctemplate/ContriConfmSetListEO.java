package com.hlj.jdbctemplate;

/**
 * 封装反馈代理人缴费确认信息实体类
 * 
 * @author 39054
 * 
 */
public class ContriConfmSetListEO {
	/**
	 * 受托人年金计划编码
	 */
	public String planid;

	/**
	 * 代理人代码
	 */
	public String accountplanid;

	/**
	 * 年金计划名称
	 */
	public String planname;

	/**
	 * 年金计划登记号
	 */
	public String planlicid;

	/**
	 * 代理人代码
	 */
	public String trustorid;

	/**
	 * 代理人名称
	 */
	public String trustorname;

	/**
	 * 划款指令流水号
	 */
	public String contributionnotno;

	/**
	 * 划款收账类型
	 */
	public String collecttype;

	/**
	 * 划款总金额
	 */

	public String drawamount;

	/**
	 * 币种
	 */
	public String currency;

	/**
	 * 受托财产托管账户名称
	 */
	public String trustaccname;

	/**
	 * 受托财产托管账户账号
	 */
	public String trustaccno;

	/**
	 * 受托财产托管账户开户行名称
	 */
	public String custodian;
	/**
	 * 受托财产托管账户开户行行号
	 */
	public String custaccountbankid;

	/**
	 * 划款明细序号
	 */
	public String payserial;

	/**
	 * 付款银行名称
	 */
	public String paybank;

	/**
	 * 付款银行行号
	 */
	public String paybankid;

	/**
	 * 付款银行账户名称
	 */
	public String paybankaccname;

	/**
	 * 付款银行账号
	 */
	public String paybankaccno;

	/**
	 * 付款银行所在省
	 */
	public String paybankprov;

	/**
	 * 付款银行所在市
	 */
	public String paybankcity;

	/**
	 * 划款金额
	 */
	public String Contribution;

	/**
	 * 到账金额
	 */
	public String paidupamt;

	/**
	 * 到账日期时间
	 */
	public String paidupdate;

	/**
	 * 收款到账标志
	 */
	public String paidupflag;

	/**
	 * 到账单编号
	 */
	public String paidupnotno;

	/**
	 * 摘要
	 */
	public String memo;

	/**
	 * 时间戳
	 */
	public String ts;

	public String getPlanid() {
		return planid;
	}

	public void setPlanid(String planid) {
		this.planid = planid;
	}

	public String getAccountplanid() {
		return accountplanid;
	}

	public void setAccountplanid(String accountplanid) {
		this.accountplanid = accountplanid;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getPlanlicid() {
		return planlicid;
	}

	public void setPlanlicid(String planlicid) {
		this.planlicid = planlicid;
	}

	public String getTrustorid() {
		return trustorid;
	}

	public void setTrustorid(String trustorid) {
		this.trustorid = trustorid;
	}

	public String getTrustorname() {
		return trustorname;
	}

	public void setTrustorname(String trustorname) {
		this.trustorname = trustorname;
	}

	public String getContributionnotno() {
		return contributionnotno;
	}

	public void setContributionnotno(String contributionnotno) {
		this.contributionnotno = contributionnotno;
	}

	public String getCollecttype() {
		return collecttype;
	}

	public void setCollecttype(String collecttype) {
		this.collecttype = collecttype;
	}

	public String getDrawamount() {
		return drawamount;
	}

	public void setDrawamount(String drawamount) {
		this.drawamount = drawamount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getTrustaccname() {
		return trustaccname;
	}

	public void setTrustaccname(String trustaccname) {
		this.trustaccname = trustaccname;
	}

	public String getTrustaccno() {
		return trustaccno;
	}

	public void setTrustaccno(String trustaccno) {
		this.trustaccno = trustaccno;
	}

	public String getCustodian() {
		return custodian;
	}

	public void setCustodian(String custodian) {
		this.custodian = custodian;
	}

	public String getCustaccountbankid() {
		return custaccountbankid;
	}

	public void setCustaccountbankid(String custaccountbankid) {
		this.custaccountbankid = custaccountbankid;
	}

	public String getPayserial() {
		return payserial;
	}

	public void setPayserial(String payserial) {
		this.payserial = payserial;
	}

	public String getPaybank() {
		return paybank;
	}

	public void setPaybank(String paybank) {
		this.paybank = paybank;
	}

	public String getPaybankid() {
		return paybankid;
	}

	public void setPaybankid(String paybankid) {
		this.paybankid = paybankid;
	}

	public String getPaybankaccname() {
		return paybankaccname;
	}

	public void setPaybankaccname(String paybankaccname) {
		this.paybankaccname = paybankaccname;
	}

	public String getPaybankaccno() {
		return paybankaccno;
	}

	public void setPaybankaccno(String paybankaccno) {
		this.paybankaccno = paybankaccno;
	}

	public String getPaybankprov() {
		return paybankprov;
	}

	public void setPaybankprov(String paybankprov) {
		this.paybankprov = paybankprov;
	}

	public String getPaybankcity() {
		return paybankcity;
	}

	public void setPaybankcity(String paybankcity) {
		this.paybankcity = paybankcity;
	}

	public String getContribution() {
		return Contribution;
	}

	public void setContribution(String contribution) {
		Contribution = contribution;
	}

	public String getPaidupamt() {
		return paidupamt;
	}

	public void setPaidupamt(String paidupamt) {
		this.paidupamt = paidupamt;
	}

	public String getPaidupdate() {
		return paidupdate;
	}

	public void setPaidupdate(String paidupdate) {
		this.paidupdate = paidupdate;
	}

	public String getPaidupflag() {
		return paidupflag;
	}

	public void setPaidupflag(String paidupflag) {
		this.paidupflag = paidupflag;
	}

	public String getPaidupnotno() {
		return paidupnotno;
	}

	public void setPaidupnotno(String paidupnotno) {
		this.paidupnotno = paidupnotno;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "ContriConfmSetListEO [planid=" + planid + ", accountplanid="
				+ accountplanid + ", planname=" + planname + ", planlicid="
				+ planlicid + ", trustorid=" + trustorid + ", trustorname="
				+ trustorname + ", contributionnotno=" + contributionnotno
				+ ", collecttype=" + collecttype + ", drawamount=" + drawamount
				+ ", currency=" + currency + ", trustaccname=" + trustaccname
				+ ", trustaccno=" + trustaccno + ", custodian=" + custodian
				+ ", custaccountbankid=" + custaccountbankid + ", payserial="
				+ payserial + ", paybank=" + paybank + ", paybankid="
				+ paybankid + ", paybankaccname=" + paybankaccname
				+ ", paybankaccno=" + paybankaccno + ", paybankprov="
				+ paybankprov + ", paybankcity=" + paybankcity
				+ ", Contribution=" + Contribution + ", paidupamt=" + paidupamt
				+ ", paidupdate=" + paidupdate + ", paidupflag=" + paidupflag
				+ ", paidupnotno=" + paidupnotno + ", memo=" + memo + ", ts="
				+ ts + "]";
	}
	
	

}
