package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PayListOAVO {
    private String pkPaylist;

    private String pkTaskfile;

    private String idtype;

    private String idno;

    private String ssid;

    private String paydate;

    private BigDecimal payamt;

    private String apaydate;

    private String benebank;

    private String benebankid;

    private String accno;

    private String benebankbranchid;

    private String accname;

    private String benebankbranch;

    private BigDecimal paysumuntax;

    private BigDecimal paytax;

    private String perliststatus;

    private String collectsn;

    private String retryflag;

    private String benetype;

    private String taxpaystatus;

    private String memo;

    private Date ts;

    private String num;

    private String receiverbank;

    private String receiverprov;

    private String receivecity;

    private String planid;

    private String personid;

    private String ssnum;

    private String receivename;

    private String receiveidtype;

    private String receiveidno;

    private String staffname;

    private String payaftersum;

    private String currency;

    private BigDecimal taxableamount;

    private BigDecimal beforetaxpayamt;

    private String extinfo;

    private String extinfo1;

    private String extinfo2;

    private String extinfo3;

    private String extinfo4;

    private String extinfo5;

    private String extinfo6;

    private String extinfo7;

    private String extinfo8;

    private String extinfo9;

    private String extinfo10;

    private String workflowno;

    public String getPkPaylist() {
        return pkPaylist;
    }

    public void setPkPaylist(String pkPaylist) {
        this.pkPaylist = pkPaylist == null ? null : pkPaylist.trim();
    }

    public String getPkTaskfile() {
        return pkTaskfile;
    }

    public void setPkTaskfile(String pkTaskfile) {
        this.pkTaskfile = pkTaskfile == null ? null : pkTaskfile.trim();
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid == null ? null : ssid.trim();
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate == null ? null : paydate.trim();
    }

    public BigDecimal getPayamt() {
        return payamt;
    }

    public void setPayamt(BigDecimal payamt) {
        this.payamt = payamt;
    }

    public String getApaydate() {
        return apaydate;
    }

    public void setApaydate(String apaydate) {
        this.apaydate = apaydate == null ? null : apaydate.trim();
    }

    public String getBenebank() {
        return benebank;
    }

    public void setBenebank(String benebank) {
        this.benebank = benebank == null ? null : benebank.trim();
    }

    public String getBenebankid() {
        return benebankid;
    }

    public void setBenebankid(String benebankid) {
        this.benebankid = benebankid == null ? null : benebankid.trim();
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno == null ? null : accno.trim();
    }

    public String getBenebankbranchid() {
        return benebankbranchid;
    }

    public void setBenebankbranchid(String benebankbranchid) {
        this.benebankbranchid = benebankbranchid == null ? null : benebankbranchid.trim();
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname == null ? null : accname.trim();
    }

    public String getBenebankbranch() {
        return benebankbranch;
    }

    public void setBenebankbranch(String benebankbranch) {
        this.benebankbranch = benebankbranch == null ? null : benebankbranch.trim();
    }

    public BigDecimal getPaysumuntax() {
        return paysumuntax;
    }

    public void setPaysumuntax(BigDecimal paysumuntax) {
        this.paysumuntax = paysumuntax;
    }

    public BigDecimal getPaytax() {
        return paytax;
    }

    public void setPaytax(BigDecimal paytax) {
        this.paytax = paytax;
    }

    public String getPerliststatus() {
        return perliststatus;
    }

    public void setPerliststatus(String perliststatus) {
        this.perliststatus = perliststatus == null ? null : perliststatus.trim();
    }

    public String getCollectsn() {
        return collectsn;
    }

    public void setCollectsn(String collectsn) {
        this.collectsn = collectsn == null ? null : collectsn.trim();
    }

    public String getRetryflag() {
        return retryflag;
    }

    public void setRetryflag(String retryflag) {
        this.retryflag = retryflag == null ? null : retryflag.trim();
    }

    public String getBenetype() {
        return benetype;
    }

    public void setBenetype(String benetype) {
        this.benetype = benetype == null ? null : benetype.trim();
    }

    public String getTaxpaystatus() {
        return taxpaystatus;
    }

    public void setTaxpaystatus(String taxpaystatus) {
        this.taxpaystatus = taxpaystatus == null ? null : taxpaystatus.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num == null ? null : num.trim();
    }

    public String getReceiverbank() {
        return receiverbank;
    }

    public void setReceiverbank(String receiverbank) {
        this.receiverbank = receiverbank == null ? null : receiverbank.trim();
    }

    public String getReceiverprov() {
        return receiverprov;
    }

    public void setReceiverprov(String receiverprov) {
        this.receiverprov = receiverprov == null ? null : receiverprov.trim();
    }

    public String getReceivecity() {
        return receivecity;
    }

    public void setReceivecity(String receivecity) {
        this.receivecity = receivecity == null ? null : receivecity.trim();
    }

    public String getPlanid() {
        return planid;
    }

    public void setPlanid(String planid) {
        this.planid = planid == null ? null : planid.trim();
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getSsnum() {
        return ssnum;
    }

    public void setSsnum(String ssnum) {
        this.ssnum = ssnum == null ? null : ssnum.trim();
    }

    public String getReceivename() {
        return receivename;
    }

    public void setReceivename(String receivename) {
        this.receivename = receivename == null ? null : receivename.trim();
    }

    public String getReceiveidtype() {
        return receiveidtype;
    }

    public void setReceiveidtype(String receiveidtype) {
        this.receiveidtype = receiveidtype == null ? null : receiveidtype.trim();
    }

    public String getReceiveidno() {
        return receiveidno;
    }

    public void setReceiveidno(String receiveidno) {
        this.receiveidno = receiveidno == null ? null : receiveidno.trim();
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname == null ? null : staffname.trim();
    }

    public String getPayaftersum() {
        return payaftersum;
    }

    public void setPayaftersum(String payaftersum) {
        this.payaftersum = payaftersum == null ? null : payaftersum.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getTaxableamount() {
        return taxableamount;
    }

    public void setTaxableamount(BigDecimal taxableamount) {
        this.taxableamount = taxableamount;
    }

    public BigDecimal getBeforetaxpayamt() {
        return beforetaxpayamt;
    }

    public void setBeforetaxpayamt(BigDecimal beforetaxpayamt) {
        this.beforetaxpayamt = beforetaxpayamt;
    }

    public String getExtinfo() {
        return extinfo;
    }

    public void setExtinfo(String extinfo) {
        this.extinfo = extinfo == null ? null : extinfo.trim();
    }

    public String getExtinfo1() {
        return extinfo1;
    }

    public void setExtinfo1(String extinfo1) {
        this.extinfo1 = extinfo1 == null ? null : extinfo1.trim();
    }

    public String getExtinfo2() {
        return extinfo2;
    }

    public void setExtinfo2(String extinfo2) {
        this.extinfo2 = extinfo2 == null ? null : extinfo2.trim();
    }

    public String getExtinfo3() {
        return extinfo3;
    }

    public void setExtinfo3(String extinfo3) {
        this.extinfo3 = extinfo3 == null ? null : extinfo3.trim();
    }

    public String getExtinfo4() {
        return extinfo4;
    }

    public void setExtinfo4(String extinfo4) {
        this.extinfo4 = extinfo4 == null ? null : extinfo4.trim();
    }

    public String getExtinfo5() {
        return extinfo5;
    }

    public void setExtinfo5(String extinfo5) {
        this.extinfo5 = extinfo5 == null ? null : extinfo5.trim();
    }

    public String getExtinfo6() {
        return extinfo6;
    }

    public void setExtinfo6(String extinfo6) {
        this.extinfo6 = extinfo6 == null ? null : extinfo6.trim();
    }

    public String getExtinfo7() {
        return extinfo7;
    }

    public void setExtinfo7(String extinfo7) {
        this.extinfo7 = extinfo7 == null ? null : extinfo7.trim();
    }

    public String getExtinfo8() {
        return extinfo8;
    }

    public void setExtinfo8(String extinfo8) {
        this.extinfo8 = extinfo8 == null ? null : extinfo8.trim();
    }

    public String getExtinfo9() {
        return extinfo9;
    }

    public void setExtinfo9(String extinfo9) {
        this.extinfo9 = extinfo9 == null ? null : extinfo9.trim();
    }

    public String getExtinfo10() {
        return extinfo10;
    }

    public void setExtinfo10(String extinfo10) {
        this.extinfo10 = extinfo10 == null ? null : extinfo10.trim();
    }

    public String getWorkflowno() {
        return workflowno;
    }

    public void setWorkflowno(String workflowno) {
        this.workflowno = workflowno == null ? null : workflowno.trim();
    }
}