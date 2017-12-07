package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ContributionSetOAVO {
    private String pkContributionset;

    private String pkContribution;

    private String drawsn;

    private String planid;

    private BigDecimal drawamount;

    private String trusaccno;

    private String trusaccname;

    private Date ts;

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

    public String getPkContributionset() {
        return pkContributionset;
    }

    public void setPkContributionset(String pkContributionset) {
        this.pkContributionset = pkContributionset == null ? null : pkContributionset.trim();
    }

    public String getPkContribution() {
        return pkContribution;
    }

    public void setPkContribution(String pkContribution) {
        this.pkContribution = pkContribution == null ? null : pkContribution.trim();
    }

    public String getDrawsn() {
        return drawsn;
    }

    public void setDrawsn(String drawsn) {
        this.drawsn = drawsn == null ? null : drawsn.trim();
    }

    public String getPlanid() {
        return planid;
    }

    public void setPlanid(String planid) {
        this.planid = planid == null ? null : planid.trim();
    }

    public BigDecimal getDrawamount() {
        return drawamount;
    }

    public void setDrawamount(BigDecimal drawamount) {
        this.drawamount = drawamount;
    }

    public String getTrusaccno() {
        return trusaccno;
    }

    public void setTrusaccno(String trusaccno) {
        this.trusaccno = trusaccno == null ? null : trusaccno.trim();
    }

    public String getTrusaccname() {
        return trusaccname;
    }

    public void setTrusaccname(String trusaccname) {
        this.trusaccname = trusaccname == null ? null : trusaccname.trim();
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
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