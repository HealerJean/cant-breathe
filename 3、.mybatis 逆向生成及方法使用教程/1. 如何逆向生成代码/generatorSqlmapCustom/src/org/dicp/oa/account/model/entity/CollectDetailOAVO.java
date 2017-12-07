package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CollectDetailOAVO {
    private String pkCollectdetail;

    private String collectsn;

    private String pkPlan;

    private String netdate;

    private String pkInvst;

    private BigDecimal unitnet;

    private BigDecimal newmoneybuy;

    private BigDecimal newmoneybuymoney;

    private BigDecimal ivstredsell;

    private BigDecimal ivstredsellmoney;

    private BigDecimal thisunit;

    private BigDecimal thismoney;

    private BigDecimal beforeunit;

    private BigDecimal beforemoney;

    private BigDecimal afterunit;

    private BigDecimal aftermoney;

    private Date ts;

    private String unifiedplanlicid;

    private String sumlevel;

    private String priceday;

    private BigDecimal begassetval;

    private BigDecimal appreciation;

    private BigDecimal totalbuyvol;

    private BigDecimal totalbuyamt;

    private BigDecimal contribuyvol;

    private BigDecimal contribuyamt;

    private BigDecimal noinvestbuyvol;

    private BigDecimal noinvestbuysum;

    private BigDecimal switchbuyvol;

    private BigDecimal switchbuysum;

    private BigDecimal otherbuyvol;

    private BigDecimal otherbuysum;

    private BigDecimal totalsalevol;

    private BigDecimal totalsalesum;

    private BigDecimal paymentsalevol;

    private BigDecimal paymentsalesum;

    private BigDecimal transsalevol;

    private BigDecimal transsalesum;

    private BigDecimal switchsalevol;

    private BigDecimal switchsalesum;

    private BigDecimal noinvestsalevol;

    private BigDecimal noinvestsalesum;

    private BigDecimal othersalevol;

    private BigDecimal othersalesum;

    private BigDecimal periodinvestvol;

    private BigDecimal periodinvestsum;

    private BigDecimal finalassetval;

    private String currency;

    private String printday;

    private String memo;

    private String sumtype;

    private BigDecimal begassetvol;

    private String planid;

    private String planlicid;

    private String planname;

    private String portfolioid;

    private String portfolioname;

    private String workflowno;

    private String column1;

    private String column2;

    private String column3;

    private String column4;

    private String column5;

    private String column6;

    private String column7;

    private String column8;

    private String column9;

    private String column10;

    public String getPkCollectdetail() {
        return pkCollectdetail;
    }

    public void setPkCollectdetail(String pkCollectdetail) {
        this.pkCollectdetail = pkCollectdetail == null ? null : pkCollectdetail.trim();
    }

    public String getCollectsn() {
        return collectsn;
    }

    public void setCollectsn(String collectsn) {
        this.collectsn = collectsn == null ? null : collectsn.trim();
    }

    public String getPkPlan() {
        return pkPlan;
    }

    public void setPkPlan(String pkPlan) {
        this.pkPlan = pkPlan == null ? null : pkPlan.trim();
    }

    public String getNetdate() {
        return netdate;
    }

    public void setNetdate(String netdate) {
        this.netdate = netdate == null ? null : netdate.trim();
    }

    public String getPkInvst() {
        return pkInvst;
    }

    public void setPkInvst(String pkInvst) {
        this.pkInvst = pkInvst == null ? null : pkInvst.trim();
    }

    public BigDecimal getUnitnet() {
        return unitnet;
    }

    public void setUnitnet(BigDecimal unitnet) {
        this.unitnet = unitnet;
    }

    public BigDecimal getNewmoneybuy() {
        return newmoneybuy;
    }

    public void setNewmoneybuy(BigDecimal newmoneybuy) {
        this.newmoneybuy = newmoneybuy;
    }

    public BigDecimal getNewmoneybuymoney() {
        return newmoneybuymoney;
    }

    public void setNewmoneybuymoney(BigDecimal newmoneybuymoney) {
        this.newmoneybuymoney = newmoneybuymoney;
    }

    public BigDecimal getIvstredsell() {
        return ivstredsell;
    }

    public void setIvstredsell(BigDecimal ivstredsell) {
        this.ivstredsell = ivstredsell;
    }

    public BigDecimal getIvstredsellmoney() {
        return ivstredsellmoney;
    }

    public void setIvstredsellmoney(BigDecimal ivstredsellmoney) {
        this.ivstredsellmoney = ivstredsellmoney;
    }

    public BigDecimal getThisunit() {
        return thisunit;
    }

    public void setThisunit(BigDecimal thisunit) {
        this.thisunit = thisunit;
    }

    public BigDecimal getThismoney() {
        return thismoney;
    }

    public void setThismoney(BigDecimal thismoney) {
        this.thismoney = thismoney;
    }

    public BigDecimal getBeforeunit() {
        return beforeunit;
    }

    public void setBeforeunit(BigDecimal beforeunit) {
        this.beforeunit = beforeunit;
    }

    public BigDecimal getBeforemoney() {
        return beforemoney;
    }

    public void setBeforemoney(BigDecimal beforemoney) {
        this.beforemoney = beforemoney;
    }

    public BigDecimal getAfterunit() {
        return afterunit;
    }

    public void setAfterunit(BigDecimal afterunit) {
        this.afterunit = afterunit;
    }

    public BigDecimal getAftermoney() {
        return aftermoney;
    }

    public void setAftermoney(BigDecimal aftermoney) {
        this.aftermoney = aftermoney;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getUnifiedplanlicid() {
        return unifiedplanlicid;
    }

    public void setUnifiedplanlicid(String unifiedplanlicid) {
        this.unifiedplanlicid = unifiedplanlicid == null ? null : unifiedplanlicid.trim();
    }

    public String getSumlevel() {
        return sumlevel;
    }

    public void setSumlevel(String sumlevel) {
        this.sumlevel = sumlevel == null ? null : sumlevel.trim();
    }

    public String getPriceday() {
        return priceday;
    }

    public void setPriceday(String priceday) {
        this.priceday = priceday == null ? null : priceday.trim();
    }

    public BigDecimal getBegassetval() {
        return begassetval;
    }

    public void setBegassetval(BigDecimal begassetval) {
        this.begassetval = begassetval;
    }

    public BigDecimal getAppreciation() {
        return appreciation;
    }

    public void setAppreciation(BigDecimal appreciation) {
        this.appreciation = appreciation;
    }

    public BigDecimal getTotalbuyvol() {
        return totalbuyvol;
    }

    public void setTotalbuyvol(BigDecimal totalbuyvol) {
        this.totalbuyvol = totalbuyvol;
    }

    public BigDecimal getTotalbuyamt() {
        return totalbuyamt;
    }

    public void setTotalbuyamt(BigDecimal totalbuyamt) {
        this.totalbuyamt = totalbuyamt;
    }

    public BigDecimal getContribuyvol() {
        return contribuyvol;
    }

    public void setContribuyvol(BigDecimal contribuyvol) {
        this.contribuyvol = contribuyvol;
    }

    public BigDecimal getContribuyamt() {
        return contribuyamt;
    }

    public void setContribuyamt(BigDecimal contribuyamt) {
        this.contribuyamt = contribuyamt;
    }

    public BigDecimal getNoinvestbuyvol() {
        return noinvestbuyvol;
    }

    public void setNoinvestbuyvol(BigDecimal noinvestbuyvol) {
        this.noinvestbuyvol = noinvestbuyvol;
    }

    public BigDecimal getNoinvestbuysum() {
        return noinvestbuysum;
    }

    public void setNoinvestbuysum(BigDecimal noinvestbuysum) {
        this.noinvestbuysum = noinvestbuysum;
    }

    public BigDecimal getSwitchbuyvol() {
        return switchbuyvol;
    }

    public void setSwitchbuyvol(BigDecimal switchbuyvol) {
        this.switchbuyvol = switchbuyvol;
    }

    public BigDecimal getSwitchbuysum() {
        return switchbuysum;
    }

    public void setSwitchbuysum(BigDecimal switchbuysum) {
        this.switchbuysum = switchbuysum;
    }

    public BigDecimal getOtherbuyvol() {
        return otherbuyvol;
    }

    public void setOtherbuyvol(BigDecimal otherbuyvol) {
        this.otherbuyvol = otherbuyvol;
    }

    public BigDecimal getOtherbuysum() {
        return otherbuysum;
    }

    public void setOtherbuysum(BigDecimal otherbuysum) {
        this.otherbuysum = otherbuysum;
    }

    public BigDecimal getTotalsalevol() {
        return totalsalevol;
    }

    public void setTotalsalevol(BigDecimal totalsalevol) {
        this.totalsalevol = totalsalevol;
    }

    public BigDecimal getTotalsalesum() {
        return totalsalesum;
    }

    public void setTotalsalesum(BigDecimal totalsalesum) {
        this.totalsalesum = totalsalesum;
    }

    public BigDecimal getPaymentsalevol() {
        return paymentsalevol;
    }

    public void setPaymentsalevol(BigDecimal paymentsalevol) {
        this.paymentsalevol = paymentsalevol;
    }

    public BigDecimal getPaymentsalesum() {
        return paymentsalesum;
    }

    public void setPaymentsalesum(BigDecimal paymentsalesum) {
        this.paymentsalesum = paymentsalesum;
    }

    public BigDecimal getTranssalevol() {
        return transsalevol;
    }

    public void setTranssalevol(BigDecimal transsalevol) {
        this.transsalevol = transsalevol;
    }

    public BigDecimal getTranssalesum() {
        return transsalesum;
    }

    public void setTranssalesum(BigDecimal transsalesum) {
        this.transsalesum = transsalesum;
    }

    public BigDecimal getSwitchsalevol() {
        return switchsalevol;
    }

    public void setSwitchsalevol(BigDecimal switchsalevol) {
        this.switchsalevol = switchsalevol;
    }

    public BigDecimal getSwitchsalesum() {
        return switchsalesum;
    }

    public void setSwitchsalesum(BigDecimal switchsalesum) {
        this.switchsalesum = switchsalesum;
    }

    public BigDecimal getNoinvestsalevol() {
        return noinvestsalevol;
    }

    public void setNoinvestsalevol(BigDecimal noinvestsalevol) {
        this.noinvestsalevol = noinvestsalevol;
    }

    public BigDecimal getNoinvestsalesum() {
        return noinvestsalesum;
    }

    public void setNoinvestsalesum(BigDecimal noinvestsalesum) {
        this.noinvestsalesum = noinvestsalesum;
    }

    public BigDecimal getOthersalevol() {
        return othersalevol;
    }

    public void setOthersalevol(BigDecimal othersalevol) {
        this.othersalevol = othersalevol;
    }

    public BigDecimal getOthersalesum() {
        return othersalesum;
    }

    public void setOthersalesum(BigDecimal othersalesum) {
        this.othersalesum = othersalesum;
    }

    public BigDecimal getPeriodinvestvol() {
        return periodinvestvol;
    }

    public void setPeriodinvestvol(BigDecimal periodinvestvol) {
        this.periodinvestvol = periodinvestvol;
    }

    public BigDecimal getPeriodinvestsum() {
        return periodinvestsum;
    }

    public void setPeriodinvestsum(BigDecimal periodinvestsum) {
        this.periodinvestsum = periodinvestsum;
    }

    public BigDecimal getFinalassetval() {
        return finalassetval;
    }

    public void setFinalassetval(BigDecimal finalassetval) {
        this.finalassetval = finalassetval;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getPrintday() {
        return printday;
    }

    public void setPrintday(String printday) {
        this.printday = printday == null ? null : printday.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getSumtype() {
        return sumtype;
    }

    public void setSumtype(String sumtype) {
        this.sumtype = sumtype == null ? null : sumtype.trim();
    }

    public BigDecimal getBegassetvol() {
        return begassetvol;
    }

    public void setBegassetvol(BigDecimal begassetvol) {
        this.begassetvol = begassetvol;
    }

    public String getPlanid() {
        return planid;
    }

    public void setPlanid(String planid) {
        this.planid = planid == null ? null : planid.trim();
    }

    public String getPlanlicid() {
        return planlicid;
    }

    public void setPlanlicid(String planlicid) {
        this.planlicid = planlicid == null ? null : planlicid.trim();
    }

    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname == null ? null : planname.trim();
    }

    public String getPortfolioid() {
        return portfolioid;
    }

    public void setPortfolioid(String portfolioid) {
        this.portfolioid = portfolioid == null ? null : portfolioid.trim();
    }

    public String getPortfolioname() {
        return portfolioname;
    }

    public void setPortfolioname(String portfolioname) {
        this.portfolioname = portfolioname == null ? null : portfolioname.trim();
    }

    public String getWorkflowno() {
        return workflowno;
    }

    public void setWorkflowno(String workflowno) {
        this.workflowno = workflowno == null ? null : workflowno.trim();
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1 == null ? null : column1.trim();
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2 == null ? null : column2.trim();
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3 == null ? null : column3.trim();
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4 == null ? null : column4.trim();
    }

    public String getColumn5() {
        return column5;
    }

    public void setColumn5(String column5) {
        this.column5 = column5 == null ? null : column5.trim();
    }

    public String getColumn6() {
        return column6;
    }

    public void setColumn6(String column6) {
        this.column6 = column6 == null ? null : column6.trim();
    }

    public String getColumn7() {
        return column7;
    }

    public void setColumn7(String column7) {
        this.column7 = column7 == null ? null : column7.trim();
    }

    public String getColumn8() {
        return column8;
    }

    public void setColumn8(String column8) {
        this.column8 = column8 == null ? null : column8.trim();
    }

    public String getColumn9() {
        return column9;
    }

    public void setColumn9(String column9) {
        this.column9 = column9 == null ? null : column9.trim();
    }

    public String getColumn10() {
        return column10;
    }

    public void setColumn10(String column10) {
        this.column10 = column10 == null ? null : column10.trim();
    }
}