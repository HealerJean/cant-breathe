package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayListOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PayListOAVOCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPkPaylistIsNull() {
            addCriterion("PK_PAYLIST is null");
            return (Criteria) this;
        }

        public Criteria andPkPaylistIsNotNull() {
            addCriterion("PK_PAYLIST is not null");
            return (Criteria) this;
        }

        public Criteria andPkPaylistEqualTo(String value) {
            addCriterion("PK_PAYLIST =", value, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistNotEqualTo(String value) {
            addCriterion("PK_PAYLIST <>", value, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistGreaterThan(String value) {
            addCriterion("PK_PAYLIST >", value, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PAYLIST >=", value, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistLessThan(String value) {
            addCriterion("PK_PAYLIST <", value, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistLessThanOrEqualTo(String value) {
            addCriterion("PK_PAYLIST <=", value, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistLike(String value) {
            addCriterion("PK_PAYLIST like", value, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistNotLike(String value) {
            addCriterion("PK_PAYLIST not like", value, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistIn(List<String> values) {
            addCriterion("PK_PAYLIST in", values, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistNotIn(List<String> values) {
            addCriterion("PK_PAYLIST not in", values, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistBetween(String value1, String value2) {
            addCriterion("PK_PAYLIST between", value1, value2, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkPaylistNotBetween(String value1, String value2) {
            addCriterion("PK_PAYLIST not between", value1, value2, "pkPaylist");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileIsNull() {
            addCriterion("PK_TASKFILE is null");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileIsNotNull() {
            addCriterion("PK_TASKFILE is not null");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileEqualTo(String value) {
            addCriterion("PK_TASKFILE =", value, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileNotEqualTo(String value) {
            addCriterion("PK_TASKFILE <>", value, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileGreaterThan(String value) {
            addCriterion("PK_TASKFILE >", value, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TASKFILE >=", value, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileLessThan(String value) {
            addCriterion("PK_TASKFILE <", value, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileLessThanOrEqualTo(String value) {
            addCriterion("PK_TASKFILE <=", value, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileLike(String value) {
            addCriterion("PK_TASKFILE like", value, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileNotLike(String value) {
            addCriterion("PK_TASKFILE not like", value, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileIn(List<String> values) {
            addCriterion("PK_TASKFILE in", values, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileNotIn(List<String> values) {
            addCriterion("PK_TASKFILE not in", values, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileBetween(String value1, String value2) {
            addCriterion("PK_TASKFILE between", value1, value2, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andPkTaskfileNotBetween(String value1, String value2) {
            addCriterion("PK_TASKFILE not between", value1, value2, "pkTaskfile");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNull() {
            addCriterion("IDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNotNull() {
            addCriterion("IDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdtypeEqualTo(String value) {
            addCriterion("IDTYPE =", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotEqualTo(String value) {
            addCriterion("IDTYPE <>", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThan(String value) {
            addCriterion("IDTYPE >", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDTYPE >=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThan(String value) {
            addCriterion("IDTYPE <", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThanOrEqualTo(String value) {
            addCriterion("IDTYPE <=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLike(String value) {
            addCriterion("IDTYPE like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotLike(String value) {
            addCriterion("IDTYPE not like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeIn(List<String> values) {
            addCriterion("IDTYPE in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotIn(List<String> values) {
            addCriterion("IDTYPE not in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeBetween(String value1, String value2) {
            addCriterion("IDTYPE between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotBetween(String value1, String value2) {
            addCriterion("IDTYPE not between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("IDNO is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("IDNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("IDNO =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("IDNO <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("IDNO >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("IDNO >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("IDNO <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("IDNO <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("IDNO like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("IDNO not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("IDNO in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("IDNO not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("IDNO between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("IDNO not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andSsidIsNull() {
            addCriterion("SSID is null");
            return (Criteria) this;
        }

        public Criteria andSsidIsNotNull() {
            addCriterion("SSID is not null");
            return (Criteria) this;
        }

        public Criteria andSsidEqualTo(String value) {
            addCriterion("SSID =", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotEqualTo(String value) {
            addCriterion("SSID <>", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThan(String value) {
            addCriterion("SSID >", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidGreaterThanOrEqualTo(String value) {
            addCriterion("SSID >=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThan(String value) {
            addCriterion("SSID <", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLessThanOrEqualTo(String value) {
            addCriterion("SSID <=", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidLike(String value) {
            addCriterion("SSID like", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotLike(String value) {
            addCriterion("SSID not like", value, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidIn(List<String> values) {
            addCriterion("SSID in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotIn(List<String> values) {
            addCriterion("SSID not in", values, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidBetween(String value1, String value2) {
            addCriterion("SSID between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andSsidNotBetween(String value1, String value2) {
            addCriterion("SSID not between", value1, value2, "ssid");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNull() {
            addCriterion("PAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaydateIsNotNull() {
            addCriterion("PAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaydateEqualTo(String value) {
            addCriterion("PAYDATE =", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotEqualTo(String value) {
            addCriterion("PAYDATE <>", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThan(String value) {
            addCriterion("PAYDATE >", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateGreaterThanOrEqualTo(String value) {
            addCriterion("PAYDATE >=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThan(String value) {
            addCriterion("PAYDATE <", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLessThanOrEqualTo(String value) {
            addCriterion("PAYDATE <=", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateLike(String value) {
            addCriterion("PAYDATE like", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotLike(String value) {
            addCriterion("PAYDATE not like", value, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateIn(List<String> values) {
            addCriterion("PAYDATE in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotIn(List<String> values) {
            addCriterion("PAYDATE not in", values, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateBetween(String value1, String value2) {
            addCriterion("PAYDATE between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPaydateNotBetween(String value1, String value2) {
            addCriterion("PAYDATE not between", value1, value2, "paydate");
            return (Criteria) this;
        }

        public Criteria andPayamtIsNull() {
            addCriterion("PAYAMT is null");
            return (Criteria) this;
        }

        public Criteria andPayamtIsNotNull() {
            addCriterion("PAYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andPayamtEqualTo(BigDecimal value) {
            addCriterion("PAYAMT =", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtNotEqualTo(BigDecimal value) {
            addCriterion("PAYAMT <>", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtGreaterThan(BigDecimal value) {
            addCriterion("PAYAMT >", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYAMT >=", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtLessThan(BigDecimal value) {
            addCriterion("PAYAMT <", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYAMT <=", value, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtIn(List<BigDecimal> values) {
            addCriterion("PAYAMT in", values, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtNotIn(List<BigDecimal> values) {
            addCriterion("PAYAMT not in", values, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYAMT between", value1, value2, "payamt");
            return (Criteria) this;
        }

        public Criteria andPayamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYAMT not between", value1, value2, "payamt");
            return (Criteria) this;
        }

        public Criteria andApaydateIsNull() {
            addCriterion("APAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andApaydateIsNotNull() {
            addCriterion("APAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApaydateEqualTo(String value) {
            addCriterion("APAYDATE =", value, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateNotEqualTo(String value) {
            addCriterion("APAYDATE <>", value, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateGreaterThan(String value) {
            addCriterion("APAYDATE >", value, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateGreaterThanOrEqualTo(String value) {
            addCriterion("APAYDATE >=", value, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateLessThan(String value) {
            addCriterion("APAYDATE <", value, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateLessThanOrEqualTo(String value) {
            addCriterion("APAYDATE <=", value, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateLike(String value) {
            addCriterion("APAYDATE like", value, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateNotLike(String value) {
            addCriterion("APAYDATE not like", value, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateIn(List<String> values) {
            addCriterion("APAYDATE in", values, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateNotIn(List<String> values) {
            addCriterion("APAYDATE not in", values, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateBetween(String value1, String value2) {
            addCriterion("APAYDATE between", value1, value2, "apaydate");
            return (Criteria) this;
        }

        public Criteria andApaydateNotBetween(String value1, String value2) {
            addCriterion("APAYDATE not between", value1, value2, "apaydate");
            return (Criteria) this;
        }

        public Criteria andBenebankIsNull() {
            addCriterion("BENEBANK is null");
            return (Criteria) this;
        }

        public Criteria andBenebankIsNotNull() {
            addCriterion("BENEBANK is not null");
            return (Criteria) this;
        }

        public Criteria andBenebankEqualTo(String value) {
            addCriterion("BENEBANK =", value, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankNotEqualTo(String value) {
            addCriterion("BENEBANK <>", value, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankGreaterThan(String value) {
            addCriterion("BENEBANK >", value, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankGreaterThanOrEqualTo(String value) {
            addCriterion("BENEBANK >=", value, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankLessThan(String value) {
            addCriterion("BENEBANK <", value, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankLessThanOrEqualTo(String value) {
            addCriterion("BENEBANK <=", value, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankLike(String value) {
            addCriterion("BENEBANK like", value, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankNotLike(String value) {
            addCriterion("BENEBANK not like", value, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankIn(List<String> values) {
            addCriterion("BENEBANK in", values, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankNotIn(List<String> values) {
            addCriterion("BENEBANK not in", values, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankBetween(String value1, String value2) {
            addCriterion("BENEBANK between", value1, value2, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankNotBetween(String value1, String value2) {
            addCriterion("BENEBANK not between", value1, value2, "benebank");
            return (Criteria) this;
        }

        public Criteria andBenebankidIsNull() {
            addCriterion("BENEBANKID is null");
            return (Criteria) this;
        }

        public Criteria andBenebankidIsNotNull() {
            addCriterion("BENEBANKID is not null");
            return (Criteria) this;
        }

        public Criteria andBenebankidEqualTo(String value) {
            addCriterion("BENEBANKID =", value, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidNotEqualTo(String value) {
            addCriterion("BENEBANKID <>", value, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidGreaterThan(String value) {
            addCriterion("BENEBANKID >", value, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidGreaterThanOrEqualTo(String value) {
            addCriterion("BENEBANKID >=", value, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidLessThan(String value) {
            addCriterion("BENEBANKID <", value, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidLessThanOrEqualTo(String value) {
            addCriterion("BENEBANKID <=", value, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidLike(String value) {
            addCriterion("BENEBANKID like", value, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidNotLike(String value) {
            addCriterion("BENEBANKID not like", value, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidIn(List<String> values) {
            addCriterion("BENEBANKID in", values, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidNotIn(List<String> values) {
            addCriterion("BENEBANKID not in", values, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidBetween(String value1, String value2) {
            addCriterion("BENEBANKID between", value1, value2, "benebankid");
            return (Criteria) this;
        }

        public Criteria andBenebankidNotBetween(String value1, String value2) {
            addCriterion("BENEBANKID not between", value1, value2, "benebankid");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNull() {
            addCriterion("ACCNO is null");
            return (Criteria) this;
        }

        public Criteria andAccnoIsNotNull() {
            addCriterion("ACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccnoEqualTo(String value) {
            addCriterion("ACCNO =", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotEqualTo(String value) {
            addCriterion("ACCNO <>", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThan(String value) {
            addCriterion("ACCNO >", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCNO >=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThan(String value) {
            addCriterion("ACCNO <", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLessThanOrEqualTo(String value) {
            addCriterion("ACCNO <=", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoLike(String value) {
            addCriterion("ACCNO like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotLike(String value) {
            addCriterion("ACCNO not like", value, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoIn(List<String> values) {
            addCriterion("ACCNO in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotIn(List<String> values) {
            addCriterion("ACCNO not in", values, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoBetween(String value1, String value2) {
            addCriterion("ACCNO between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andAccnoNotBetween(String value1, String value2) {
            addCriterion("ACCNO not between", value1, value2, "accno");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidIsNull() {
            addCriterion("BENEBANKBRANCHID is null");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidIsNotNull() {
            addCriterion("BENEBANKBRANCHID is not null");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidEqualTo(String value) {
            addCriterion("BENEBANKBRANCHID =", value, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidNotEqualTo(String value) {
            addCriterion("BENEBANKBRANCHID <>", value, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidGreaterThan(String value) {
            addCriterion("BENEBANKBRANCHID >", value, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidGreaterThanOrEqualTo(String value) {
            addCriterion("BENEBANKBRANCHID >=", value, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidLessThan(String value) {
            addCriterion("BENEBANKBRANCHID <", value, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidLessThanOrEqualTo(String value) {
            addCriterion("BENEBANKBRANCHID <=", value, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidLike(String value) {
            addCriterion("BENEBANKBRANCHID like", value, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidNotLike(String value) {
            addCriterion("BENEBANKBRANCHID not like", value, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidIn(List<String> values) {
            addCriterion("BENEBANKBRANCHID in", values, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidNotIn(List<String> values) {
            addCriterion("BENEBANKBRANCHID not in", values, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidBetween(String value1, String value2) {
            addCriterion("BENEBANKBRANCHID between", value1, value2, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchidNotBetween(String value1, String value2) {
            addCriterion("BENEBANKBRANCHID not between", value1, value2, "benebankbranchid");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNull() {
            addCriterion("ACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccnameIsNotNull() {
            addCriterion("ACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccnameEqualTo(String value) {
            addCriterion("ACCNAME =", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotEqualTo(String value) {
            addCriterion("ACCNAME <>", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThan(String value) {
            addCriterion("ACCNAME >", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCNAME >=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThan(String value) {
            addCriterion("ACCNAME <", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLessThanOrEqualTo(String value) {
            addCriterion("ACCNAME <=", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameLike(String value) {
            addCriterion("ACCNAME like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotLike(String value) {
            addCriterion("ACCNAME not like", value, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameIn(List<String> values) {
            addCriterion("ACCNAME in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotIn(List<String> values) {
            addCriterion("ACCNAME not in", values, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameBetween(String value1, String value2) {
            addCriterion("ACCNAME between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andAccnameNotBetween(String value1, String value2) {
            addCriterion("ACCNAME not between", value1, value2, "accname");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchIsNull() {
            addCriterion("BENEBANKBRANCH is null");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchIsNotNull() {
            addCriterion("BENEBANKBRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchEqualTo(String value) {
            addCriterion("BENEBANKBRANCH =", value, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchNotEqualTo(String value) {
            addCriterion("BENEBANKBRANCH <>", value, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchGreaterThan(String value) {
            addCriterion("BENEBANKBRANCH >", value, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchGreaterThanOrEqualTo(String value) {
            addCriterion("BENEBANKBRANCH >=", value, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchLessThan(String value) {
            addCriterion("BENEBANKBRANCH <", value, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchLessThanOrEqualTo(String value) {
            addCriterion("BENEBANKBRANCH <=", value, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchLike(String value) {
            addCriterion("BENEBANKBRANCH like", value, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchNotLike(String value) {
            addCriterion("BENEBANKBRANCH not like", value, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchIn(List<String> values) {
            addCriterion("BENEBANKBRANCH in", values, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchNotIn(List<String> values) {
            addCriterion("BENEBANKBRANCH not in", values, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchBetween(String value1, String value2) {
            addCriterion("BENEBANKBRANCH between", value1, value2, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andBenebankbranchNotBetween(String value1, String value2) {
            addCriterion("BENEBANKBRANCH not between", value1, value2, "benebankbranch");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxIsNull() {
            addCriterion("PAYSUMUNTAX is null");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxIsNotNull() {
            addCriterion("PAYSUMUNTAX is not null");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxEqualTo(BigDecimal value) {
            addCriterion("PAYSUMUNTAX =", value, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxNotEqualTo(BigDecimal value) {
            addCriterion("PAYSUMUNTAX <>", value, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxGreaterThan(BigDecimal value) {
            addCriterion("PAYSUMUNTAX >", value, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYSUMUNTAX >=", value, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxLessThan(BigDecimal value) {
            addCriterion("PAYSUMUNTAX <", value, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYSUMUNTAX <=", value, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxIn(List<BigDecimal> values) {
            addCriterion("PAYSUMUNTAX in", values, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxNotIn(List<BigDecimal> values) {
            addCriterion("PAYSUMUNTAX not in", values, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYSUMUNTAX between", value1, value2, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaysumuntaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYSUMUNTAX not between", value1, value2, "paysumuntax");
            return (Criteria) this;
        }

        public Criteria andPaytaxIsNull() {
            addCriterion("PAYTAX is null");
            return (Criteria) this;
        }

        public Criteria andPaytaxIsNotNull() {
            addCriterion("PAYTAX is not null");
            return (Criteria) this;
        }

        public Criteria andPaytaxEqualTo(BigDecimal value) {
            addCriterion("PAYTAX =", value, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxNotEqualTo(BigDecimal value) {
            addCriterion("PAYTAX <>", value, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxGreaterThan(BigDecimal value) {
            addCriterion("PAYTAX >", value, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYTAX >=", value, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxLessThan(BigDecimal value) {
            addCriterion("PAYTAX <", value, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYTAX <=", value, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxIn(List<BigDecimal> values) {
            addCriterion("PAYTAX in", values, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxNotIn(List<BigDecimal> values) {
            addCriterion("PAYTAX not in", values, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYTAX between", value1, value2, "paytax");
            return (Criteria) this;
        }

        public Criteria andPaytaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYTAX not between", value1, value2, "paytax");
            return (Criteria) this;
        }

        public Criteria andPerliststatusIsNull() {
            addCriterion("PERLISTSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPerliststatusIsNotNull() {
            addCriterion("PERLISTSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPerliststatusEqualTo(String value) {
            addCriterion("PERLISTSTATUS =", value, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusNotEqualTo(String value) {
            addCriterion("PERLISTSTATUS <>", value, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusGreaterThan(String value) {
            addCriterion("PERLISTSTATUS >", value, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusGreaterThanOrEqualTo(String value) {
            addCriterion("PERLISTSTATUS >=", value, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusLessThan(String value) {
            addCriterion("PERLISTSTATUS <", value, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusLessThanOrEqualTo(String value) {
            addCriterion("PERLISTSTATUS <=", value, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusLike(String value) {
            addCriterion("PERLISTSTATUS like", value, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusNotLike(String value) {
            addCriterion("PERLISTSTATUS not like", value, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusIn(List<String> values) {
            addCriterion("PERLISTSTATUS in", values, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusNotIn(List<String> values) {
            addCriterion("PERLISTSTATUS not in", values, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusBetween(String value1, String value2) {
            addCriterion("PERLISTSTATUS between", value1, value2, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andPerliststatusNotBetween(String value1, String value2) {
            addCriterion("PERLISTSTATUS not between", value1, value2, "perliststatus");
            return (Criteria) this;
        }

        public Criteria andCollectsnIsNull() {
            addCriterion("COLLECTSN is null");
            return (Criteria) this;
        }

        public Criteria andCollectsnIsNotNull() {
            addCriterion("COLLECTSN is not null");
            return (Criteria) this;
        }

        public Criteria andCollectsnEqualTo(String value) {
            addCriterion("COLLECTSN =", value, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnNotEqualTo(String value) {
            addCriterion("COLLECTSN <>", value, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnGreaterThan(String value) {
            addCriterion("COLLECTSN >", value, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTSN >=", value, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnLessThan(String value) {
            addCriterion("COLLECTSN <", value, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnLessThanOrEqualTo(String value) {
            addCriterion("COLLECTSN <=", value, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnLike(String value) {
            addCriterion("COLLECTSN like", value, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnNotLike(String value) {
            addCriterion("COLLECTSN not like", value, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnIn(List<String> values) {
            addCriterion("COLLECTSN in", values, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnNotIn(List<String> values) {
            addCriterion("COLLECTSN not in", values, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnBetween(String value1, String value2) {
            addCriterion("COLLECTSN between", value1, value2, "collectsn");
            return (Criteria) this;
        }

        public Criteria andCollectsnNotBetween(String value1, String value2) {
            addCriterion("COLLECTSN not between", value1, value2, "collectsn");
            return (Criteria) this;
        }

        public Criteria andRetryflagIsNull() {
            addCriterion("RETRYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andRetryflagIsNotNull() {
            addCriterion("RETRYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRetryflagEqualTo(String value) {
            addCriterion("RETRYFLAG =", value, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagNotEqualTo(String value) {
            addCriterion("RETRYFLAG <>", value, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagGreaterThan(String value) {
            addCriterion("RETRYFLAG >", value, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagGreaterThanOrEqualTo(String value) {
            addCriterion("RETRYFLAG >=", value, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagLessThan(String value) {
            addCriterion("RETRYFLAG <", value, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagLessThanOrEqualTo(String value) {
            addCriterion("RETRYFLAG <=", value, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagLike(String value) {
            addCriterion("RETRYFLAG like", value, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagNotLike(String value) {
            addCriterion("RETRYFLAG not like", value, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagIn(List<String> values) {
            addCriterion("RETRYFLAG in", values, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagNotIn(List<String> values) {
            addCriterion("RETRYFLAG not in", values, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagBetween(String value1, String value2) {
            addCriterion("RETRYFLAG between", value1, value2, "retryflag");
            return (Criteria) this;
        }

        public Criteria andRetryflagNotBetween(String value1, String value2) {
            addCriterion("RETRYFLAG not between", value1, value2, "retryflag");
            return (Criteria) this;
        }

        public Criteria andBenetypeIsNull() {
            addCriterion("BENETYPE is null");
            return (Criteria) this;
        }

        public Criteria andBenetypeIsNotNull() {
            addCriterion("BENETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBenetypeEqualTo(String value) {
            addCriterion("BENETYPE =", value, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeNotEqualTo(String value) {
            addCriterion("BENETYPE <>", value, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeGreaterThan(String value) {
            addCriterion("BENETYPE >", value, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeGreaterThanOrEqualTo(String value) {
            addCriterion("BENETYPE >=", value, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeLessThan(String value) {
            addCriterion("BENETYPE <", value, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeLessThanOrEqualTo(String value) {
            addCriterion("BENETYPE <=", value, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeLike(String value) {
            addCriterion("BENETYPE like", value, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeNotLike(String value) {
            addCriterion("BENETYPE not like", value, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeIn(List<String> values) {
            addCriterion("BENETYPE in", values, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeNotIn(List<String> values) {
            addCriterion("BENETYPE not in", values, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeBetween(String value1, String value2) {
            addCriterion("BENETYPE between", value1, value2, "benetype");
            return (Criteria) this;
        }

        public Criteria andBenetypeNotBetween(String value1, String value2) {
            addCriterion("BENETYPE not between", value1, value2, "benetype");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusIsNull() {
            addCriterion("TAXPAYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusIsNotNull() {
            addCriterion("TAXPAYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusEqualTo(String value) {
            addCriterion("TAXPAYSTATUS =", value, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusNotEqualTo(String value) {
            addCriterion("TAXPAYSTATUS <>", value, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusGreaterThan(String value) {
            addCriterion("TAXPAYSTATUS >", value, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("TAXPAYSTATUS >=", value, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusLessThan(String value) {
            addCriterion("TAXPAYSTATUS <", value, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusLessThanOrEqualTo(String value) {
            addCriterion("TAXPAYSTATUS <=", value, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusLike(String value) {
            addCriterion("TAXPAYSTATUS like", value, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusNotLike(String value) {
            addCriterion("TAXPAYSTATUS not like", value, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusIn(List<String> values) {
            addCriterion("TAXPAYSTATUS in", values, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusNotIn(List<String> values) {
            addCriterion("TAXPAYSTATUS not in", values, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusBetween(String value1, String value2) {
            addCriterion("TAXPAYSTATUS between", value1, value2, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andTaxpaystatusNotBetween(String value1, String value2) {
            addCriterion("TAXPAYSTATUS not between", value1, value2, "taxpaystatus");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("TS is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("TS is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("TS =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("TS <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("TS >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("TS >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("TS <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("TS <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("TS in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("TS not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("TS between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("TS not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("NUM like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("NUM not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andReceiverbankIsNull() {
            addCriterion("RECEIVERBANK is null");
            return (Criteria) this;
        }

        public Criteria andReceiverbankIsNotNull() {
            addCriterion("RECEIVERBANK is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverbankEqualTo(String value) {
            addCriterion("RECEIVERBANK =", value, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankNotEqualTo(String value) {
            addCriterion("RECEIVERBANK <>", value, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankGreaterThan(String value) {
            addCriterion("RECEIVERBANK >", value, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVERBANK >=", value, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankLessThan(String value) {
            addCriterion("RECEIVERBANK <", value, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankLessThanOrEqualTo(String value) {
            addCriterion("RECEIVERBANK <=", value, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankLike(String value) {
            addCriterion("RECEIVERBANK like", value, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankNotLike(String value) {
            addCriterion("RECEIVERBANK not like", value, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankIn(List<String> values) {
            addCriterion("RECEIVERBANK in", values, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankNotIn(List<String> values) {
            addCriterion("RECEIVERBANK not in", values, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankBetween(String value1, String value2) {
            addCriterion("RECEIVERBANK between", value1, value2, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverbankNotBetween(String value1, String value2) {
            addCriterion("RECEIVERBANK not between", value1, value2, "receiverbank");
            return (Criteria) this;
        }

        public Criteria andReceiverprovIsNull() {
            addCriterion("RECEIVERPROV is null");
            return (Criteria) this;
        }

        public Criteria andReceiverprovIsNotNull() {
            addCriterion("RECEIVERPROV is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverprovEqualTo(String value) {
            addCriterion("RECEIVERPROV =", value, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovNotEqualTo(String value) {
            addCriterion("RECEIVERPROV <>", value, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovGreaterThan(String value) {
            addCriterion("RECEIVERPROV >", value, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVERPROV >=", value, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovLessThan(String value) {
            addCriterion("RECEIVERPROV <", value, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovLessThanOrEqualTo(String value) {
            addCriterion("RECEIVERPROV <=", value, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovLike(String value) {
            addCriterion("RECEIVERPROV like", value, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovNotLike(String value) {
            addCriterion("RECEIVERPROV not like", value, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovIn(List<String> values) {
            addCriterion("RECEIVERPROV in", values, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovNotIn(List<String> values) {
            addCriterion("RECEIVERPROV not in", values, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovBetween(String value1, String value2) {
            addCriterion("RECEIVERPROV between", value1, value2, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceiverprovNotBetween(String value1, String value2) {
            addCriterion("RECEIVERPROV not between", value1, value2, "receiverprov");
            return (Criteria) this;
        }

        public Criteria andReceivecityIsNull() {
            addCriterion("RECEIVECITY is null");
            return (Criteria) this;
        }

        public Criteria andReceivecityIsNotNull() {
            addCriterion("RECEIVECITY is not null");
            return (Criteria) this;
        }

        public Criteria andReceivecityEqualTo(String value) {
            addCriterion("RECEIVECITY =", value, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityNotEqualTo(String value) {
            addCriterion("RECEIVECITY <>", value, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityGreaterThan(String value) {
            addCriterion("RECEIVECITY >", value, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVECITY >=", value, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityLessThan(String value) {
            addCriterion("RECEIVECITY <", value, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityLessThanOrEqualTo(String value) {
            addCriterion("RECEIVECITY <=", value, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityLike(String value) {
            addCriterion("RECEIVECITY like", value, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityNotLike(String value) {
            addCriterion("RECEIVECITY not like", value, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityIn(List<String> values) {
            addCriterion("RECEIVECITY in", values, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityNotIn(List<String> values) {
            addCriterion("RECEIVECITY not in", values, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityBetween(String value1, String value2) {
            addCriterion("RECEIVECITY between", value1, value2, "receivecity");
            return (Criteria) this;
        }

        public Criteria andReceivecityNotBetween(String value1, String value2) {
            addCriterion("RECEIVECITY not between", value1, value2, "receivecity");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNull() {
            addCriterion("PLANID is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("PLANID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(String value) {
            addCriterion("PLANID =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(String value) {
            addCriterion("PLANID <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(String value) {
            addCriterion("PLANID >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(String value) {
            addCriterion("PLANID >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(String value) {
            addCriterion("PLANID <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(String value) {
            addCriterion("PLANID <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLike(String value) {
            addCriterion("PLANID like", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotLike(String value) {
            addCriterion("PLANID not like", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<String> values) {
            addCriterion("PLANID in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<String> values) {
            addCriterion("PLANID not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(String value1, String value2) {
            addCriterion("PLANID between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(String value1, String value2) {
            addCriterion("PLANID not between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNull() {
            addCriterion("PERSONID is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("PERSONID is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(String value) {
            addCriterion("PERSONID =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(String value) {
            addCriterion("PERSONID <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(String value) {
            addCriterion("PERSONID >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONID >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(String value) {
            addCriterion("PERSONID <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(String value) {
            addCriterion("PERSONID <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLike(String value) {
            addCriterion("PERSONID like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotLike(String value) {
            addCriterion("PERSONID not like", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<String> values) {
            addCriterion("PERSONID in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<String> values) {
            addCriterion("PERSONID not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(String value1, String value2) {
            addCriterion("PERSONID between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(String value1, String value2) {
            addCriterion("PERSONID not between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andSsnumIsNull() {
            addCriterion("SSNUM is null");
            return (Criteria) this;
        }

        public Criteria andSsnumIsNotNull() {
            addCriterion("SSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andSsnumEqualTo(String value) {
            addCriterion("SSNUM =", value, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumNotEqualTo(String value) {
            addCriterion("SSNUM <>", value, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumGreaterThan(String value) {
            addCriterion("SSNUM >", value, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumGreaterThanOrEqualTo(String value) {
            addCriterion("SSNUM >=", value, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumLessThan(String value) {
            addCriterion("SSNUM <", value, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumLessThanOrEqualTo(String value) {
            addCriterion("SSNUM <=", value, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumLike(String value) {
            addCriterion("SSNUM like", value, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumNotLike(String value) {
            addCriterion("SSNUM not like", value, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumIn(List<String> values) {
            addCriterion("SSNUM in", values, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumNotIn(List<String> values) {
            addCriterion("SSNUM not in", values, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumBetween(String value1, String value2) {
            addCriterion("SSNUM between", value1, value2, "ssnum");
            return (Criteria) this;
        }

        public Criteria andSsnumNotBetween(String value1, String value2) {
            addCriterion("SSNUM not between", value1, value2, "ssnum");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNull() {
            addCriterion("RECEIVENAME is null");
            return (Criteria) this;
        }

        public Criteria andReceivenameIsNotNull() {
            addCriterion("RECEIVENAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceivenameEqualTo(String value) {
            addCriterion("RECEIVENAME =", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotEqualTo(String value) {
            addCriterion("RECEIVENAME <>", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThan(String value) {
            addCriterion("RECEIVENAME >", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVENAME >=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThan(String value) {
            addCriterion("RECEIVENAME <", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVENAME <=", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameLike(String value) {
            addCriterion("RECEIVENAME like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotLike(String value) {
            addCriterion("RECEIVENAME not like", value, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameIn(List<String> values) {
            addCriterion("RECEIVENAME in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotIn(List<String> values) {
            addCriterion("RECEIVENAME not in", values, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameBetween(String value1, String value2) {
            addCriterion("RECEIVENAME between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceivenameNotBetween(String value1, String value2) {
            addCriterion("RECEIVENAME not between", value1, value2, "receivename");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeIsNull() {
            addCriterion("RECEIVEIDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeIsNotNull() {
            addCriterion("RECEIVEIDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeEqualTo(String value) {
            addCriterion("RECEIVEIDTYPE =", value, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeNotEqualTo(String value) {
            addCriterion("RECEIVEIDTYPE <>", value, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeGreaterThan(String value) {
            addCriterion("RECEIVEIDTYPE >", value, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEIDTYPE >=", value, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeLessThan(String value) {
            addCriterion("RECEIVEIDTYPE <", value, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEIDTYPE <=", value, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeLike(String value) {
            addCriterion("RECEIVEIDTYPE like", value, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeNotLike(String value) {
            addCriterion("RECEIVEIDTYPE not like", value, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeIn(List<String> values) {
            addCriterion("RECEIVEIDTYPE in", values, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeNotIn(List<String> values) {
            addCriterion("RECEIVEIDTYPE not in", values, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeBetween(String value1, String value2) {
            addCriterion("RECEIVEIDTYPE between", value1, value2, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidtypeNotBetween(String value1, String value2) {
            addCriterion("RECEIVEIDTYPE not between", value1, value2, "receiveidtype");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoIsNull() {
            addCriterion("RECEIVEIDNO is null");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoIsNotNull() {
            addCriterion("RECEIVEIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoEqualTo(String value) {
            addCriterion("RECEIVEIDNO =", value, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoNotEqualTo(String value) {
            addCriterion("RECEIVEIDNO <>", value, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoGreaterThan(String value) {
            addCriterion("RECEIVEIDNO >", value, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEIDNO >=", value, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoLessThan(String value) {
            addCriterion("RECEIVEIDNO <", value, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEIDNO <=", value, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoLike(String value) {
            addCriterion("RECEIVEIDNO like", value, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoNotLike(String value) {
            addCriterion("RECEIVEIDNO not like", value, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoIn(List<String> values) {
            addCriterion("RECEIVEIDNO in", values, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoNotIn(List<String> values) {
            addCriterion("RECEIVEIDNO not in", values, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoBetween(String value1, String value2) {
            addCriterion("RECEIVEIDNO between", value1, value2, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andReceiveidnoNotBetween(String value1, String value2) {
            addCriterion("RECEIVEIDNO not between", value1, value2, "receiveidno");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNull() {
            addCriterion("STAFFNAME is null");
            return (Criteria) this;
        }

        public Criteria andStaffnameIsNotNull() {
            addCriterion("STAFFNAME is not null");
            return (Criteria) this;
        }

        public Criteria andStaffnameEqualTo(String value) {
            addCriterion("STAFFNAME =", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotEqualTo(String value) {
            addCriterion("STAFFNAME <>", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThan(String value) {
            addCriterion("STAFFNAME >", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameGreaterThanOrEqualTo(String value) {
            addCriterion("STAFFNAME >=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThan(String value) {
            addCriterion("STAFFNAME <", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLessThanOrEqualTo(String value) {
            addCriterion("STAFFNAME <=", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameLike(String value) {
            addCriterion("STAFFNAME like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotLike(String value) {
            addCriterion("STAFFNAME not like", value, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameIn(List<String> values) {
            addCriterion("STAFFNAME in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotIn(List<String> values) {
            addCriterion("STAFFNAME not in", values, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameBetween(String value1, String value2) {
            addCriterion("STAFFNAME between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andStaffnameNotBetween(String value1, String value2) {
            addCriterion("STAFFNAME not between", value1, value2, "staffname");
            return (Criteria) this;
        }

        public Criteria andPayaftersumIsNull() {
            addCriterion("PAYAFTERSUM is null");
            return (Criteria) this;
        }

        public Criteria andPayaftersumIsNotNull() {
            addCriterion("PAYAFTERSUM is not null");
            return (Criteria) this;
        }

        public Criteria andPayaftersumEqualTo(String value) {
            addCriterion("PAYAFTERSUM =", value, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumNotEqualTo(String value) {
            addCriterion("PAYAFTERSUM <>", value, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumGreaterThan(String value) {
            addCriterion("PAYAFTERSUM >", value, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumGreaterThanOrEqualTo(String value) {
            addCriterion("PAYAFTERSUM >=", value, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumLessThan(String value) {
            addCriterion("PAYAFTERSUM <", value, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumLessThanOrEqualTo(String value) {
            addCriterion("PAYAFTERSUM <=", value, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumLike(String value) {
            addCriterion("PAYAFTERSUM like", value, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumNotLike(String value) {
            addCriterion("PAYAFTERSUM not like", value, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumIn(List<String> values) {
            addCriterion("PAYAFTERSUM in", values, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumNotIn(List<String> values) {
            addCriterion("PAYAFTERSUM not in", values, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumBetween(String value1, String value2) {
            addCriterion("PAYAFTERSUM between", value1, value2, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andPayaftersumNotBetween(String value1, String value2) {
            addCriterion("PAYAFTERSUM not between", value1, value2, "payaftersum");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("CURRENCY is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("CURRENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("CURRENCY =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("CURRENCY <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("CURRENCY >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCY >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("CURRENCY <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("CURRENCY <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("CURRENCY like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("CURRENCY not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("CURRENCY in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("CURRENCY not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("CURRENCY between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("CURRENCY not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andTaxableamountIsNull() {
            addCriterion("TAXABLEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTaxableamountIsNotNull() {
            addCriterion("TAXABLEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxableamountEqualTo(BigDecimal value) {
            addCriterion("TAXABLEAMOUNT =", value, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountNotEqualTo(BigDecimal value) {
            addCriterion("TAXABLEAMOUNT <>", value, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountGreaterThan(BigDecimal value) {
            addCriterion("TAXABLEAMOUNT >", value, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXABLEAMOUNT >=", value, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountLessThan(BigDecimal value) {
            addCriterion("TAXABLEAMOUNT <", value, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAXABLEAMOUNT <=", value, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountIn(List<BigDecimal> values) {
            addCriterion("TAXABLEAMOUNT in", values, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountNotIn(List<BigDecimal> values) {
            addCriterion("TAXABLEAMOUNT not in", values, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXABLEAMOUNT between", value1, value2, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andTaxableamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAXABLEAMOUNT not between", value1, value2, "taxableamount");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtIsNull() {
            addCriterion("BEFORETAXPAYAMT is null");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtIsNotNull() {
            addCriterion("BEFORETAXPAYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtEqualTo(BigDecimal value) {
            addCriterion("BEFORETAXPAYAMT =", value, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtNotEqualTo(BigDecimal value) {
            addCriterion("BEFORETAXPAYAMT <>", value, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtGreaterThan(BigDecimal value) {
            addCriterion("BEFORETAXPAYAMT >", value, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFORETAXPAYAMT >=", value, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtLessThan(BigDecimal value) {
            addCriterion("BEFORETAXPAYAMT <", value, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFORETAXPAYAMT <=", value, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtIn(List<BigDecimal> values) {
            addCriterion("BEFORETAXPAYAMT in", values, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtNotIn(List<BigDecimal> values) {
            addCriterion("BEFORETAXPAYAMT not in", values, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFORETAXPAYAMT between", value1, value2, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andBeforetaxpayamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFORETAXPAYAMT not between", value1, value2, "beforetaxpayamt");
            return (Criteria) this;
        }

        public Criteria andExtinfoIsNull() {
            addCriterion("EXTINFO is null");
            return (Criteria) this;
        }

        public Criteria andExtinfoIsNotNull() {
            addCriterion("EXTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfoEqualTo(String value) {
            addCriterion("EXTINFO =", value, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoNotEqualTo(String value) {
            addCriterion("EXTINFO <>", value, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoGreaterThan(String value) {
            addCriterion("EXTINFO >", value, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoGreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO >=", value, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoLessThan(String value) {
            addCriterion("EXTINFO <", value, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoLessThanOrEqualTo(String value) {
            addCriterion("EXTINFO <=", value, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoLike(String value) {
            addCriterion("EXTINFO like", value, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoNotLike(String value) {
            addCriterion("EXTINFO not like", value, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoIn(List<String> values) {
            addCriterion("EXTINFO in", values, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoNotIn(List<String> values) {
            addCriterion("EXTINFO not in", values, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoBetween(String value1, String value2) {
            addCriterion("EXTINFO between", value1, value2, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfoNotBetween(String value1, String value2) {
            addCriterion("EXTINFO not between", value1, value2, "extinfo");
            return (Criteria) this;
        }

        public Criteria andExtinfo1IsNull() {
            addCriterion("EXTINFO1 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo1IsNotNull() {
            addCriterion("EXTINFO1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo1EqualTo(String value) {
            addCriterion("EXTINFO1 =", value, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1NotEqualTo(String value) {
            addCriterion("EXTINFO1 <>", value, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1GreaterThan(String value) {
            addCriterion("EXTINFO1 >", value, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO1 >=", value, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1LessThan(String value) {
            addCriterion("EXTINFO1 <", value, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO1 <=", value, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1Like(String value) {
            addCriterion("EXTINFO1 like", value, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1NotLike(String value) {
            addCriterion("EXTINFO1 not like", value, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1In(List<String> values) {
            addCriterion("EXTINFO1 in", values, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1NotIn(List<String> values) {
            addCriterion("EXTINFO1 not in", values, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1Between(String value1, String value2) {
            addCriterion("EXTINFO1 between", value1, value2, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo1NotBetween(String value1, String value2) {
            addCriterion("EXTINFO1 not between", value1, value2, "extinfo1");
            return (Criteria) this;
        }

        public Criteria andExtinfo2IsNull() {
            addCriterion("EXTINFO2 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo2IsNotNull() {
            addCriterion("EXTINFO2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo2EqualTo(String value) {
            addCriterion("EXTINFO2 =", value, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2NotEqualTo(String value) {
            addCriterion("EXTINFO2 <>", value, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2GreaterThan(String value) {
            addCriterion("EXTINFO2 >", value, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO2 >=", value, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2LessThan(String value) {
            addCriterion("EXTINFO2 <", value, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO2 <=", value, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2Like(String value) {
            addCriterion("EXTINFO2 like", value, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2NotLike(String value) {
            addCriterion("EXTINFO2 not like", value, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2In(List<String> values) {
            addCriterion("EXTINFO2 in", values, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2NotIn(List<String> values) {
            addCriterion("EXTINFO2 not in", values, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2Between(String value1, String value2) {
            addCriterion("EXTINFO2 between", value1, value2, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo2NotBetween(String value1, String value2) {
            addCriterion("EXTINFO2 not between", value1, value2, "extinfo2");
            return (Criteria) this;
        }

        public Criteria andExtinfo3IsNull() {
            addCriterion("EXTINFO3 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo3IsNotNull() {
            addCriterion("EXTINFO3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo3EqualTo(String value) {
            addCriterion("EXTINFO3 =", value, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3NotEqualTo(String value) {
            addCriterion("EXTINFO3 <>", value, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3GreaterThan(String value) {
            addCriterion("EXTINFO3 >", value, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO3 >=", value, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3LessThan(String value) {
            addCriterion("EXTINFO3 <", value, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO3 <=", value, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3Like(String value) {
            addCriterion("EXTINFO3 like", value, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3NotLike(String value) {
            addCriterion("EXTINFO3 not like", value, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3In(List<String> values) {
            addCriterion("EXTINFO3 in", values, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3NotIn(List<String> values) {
            addCriterion("EXTINFO3 not in", values, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3Between(String value1, String value2) {
            addCriterion("EXTINFO3 between", value1, value2, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo3NotBetween(String value1, String value2) {
            addCriterion("EXTINFO3 not between", value1, value2, "extinfo3");
            return (Criteria) this;
        }

        public Criteria andExtinfo4IsNull() {
            addCriterion("EXTINFO4 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo4IsNotNull() {
            addCriterion("EXTINFO4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo4EqualTo(String value) {
            addCriterion("EXTINFO4 =", value, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4NotEqualTo(String value) {
            addCriterion("EXTINFO4 <>", value, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4GreaterThan(String value) {
            addCriterion("EXTINFO4 >", value, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO4 >=", value, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4LessThan(String value) {
            addCriterion("EXTINFO4 <", value, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO4 <=", value, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4Like(String value) {
            addCriterion("EXTINFO4 like", value, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4NotLike(String value) {
            addCriterion("EXTINFO4 not like", value, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4In(List<String> values) {
            addCriterion("EXTINFO4 in", values, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4NotIn(List<String> values) {
            addCriterion("EXTINFO4 not in", values, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4Between(String value1, String value2) {
            addCriterion("EXTINFO4 between", value1, value2, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo4NotBetween(String value1, String value2) {
            addCriterion("EXTINFO4 not between", value1, value2, "extinfo4");
            return (Criteria) this;
        }

        public Criteria andExtinfo5IsNull() {
            addCriterion("EXTINFO5 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo5IsNotNull() {
            addCriterion("EXTINFO5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo5EqualTo(String value) {
            addCriterion("EXTINFO5 =", value, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5NotEqualTo(String value) {
            addCriterion("EXTINFO5 <>", value, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5GreaterThan(String value) {
            addCriterion("EXTINFO5 >", value, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO5 >=", value, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5LessThan(String value) {
            addCriterion("EXTINFO5 <", value, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO5 <=", value, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5Like(String value) {
            addCriterion("EXTINFO5 like", value, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5NotLike(String value) {
            addCriterion("EXTINFO5 not like", value, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5In(List<String> values) {
            addCriterion("EXTINFO5 in", values, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5NotIn(List<String> values) {
            addCriterion("EXTINFO5 not in", values, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5Between(String value1, String value2) {
            addCriterion("EXTINFO5 between", value1, value2, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo5NotBetween(String value1, String value2) {
            addCriterion("EXTINFO5 not between", value1, value2, "extinfo5");
            return (Criteria) this;
        }

        public Criteria andExtinfo6IsNull() {
            addCriterion("EXTINFO6 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo6IsNotNull() {
            addCriterion("EXTINFO6 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo6EqualTo(String value) {
            addCriterion("EXTINFO6 =", value, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6NotEqualTo(String value) {
            addCriterion("EXTINFO6 <>", value, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6GreaterThan(String value) {
            addCriterion("EXTINFO6 >", value, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO6 >=", value, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6LessThan(String value) {
            addCriterion("EXTINFO6 <", value, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO6 <=", value, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6Like(String value) {
            addCriterion("EXTINFO6 like", value, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6NotLike(String value) {
            addCriterion("EXTINFO6 not like", value, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6In(List<String> values) {
            addCriterion("EXTINFO6 in", values, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6NotIn(List<String> values) {
            addCriterion("EXTINFO6 not in", values, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6Between(String value1, String value2) {
            addCriterion("EXTINFO6 between", value1, value2, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo6NotBetween(String value1, String value2) {
            addCriterion("EXTINFO6 not between", value1, value2, "extinfo6");
            return (Criteria) this;
        }

        public Criteria andExtinfo7IsNull() {
            addCriterion("EXTINFO7 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo7IsNotNull() {
            addCriterion("EXTINFO7 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo7EqualTo(String value) {
            addCriterion("EXTINFO7 =", value, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7NotEqualTo(String value) {
            addCriterion("EXTINFO7 <>", value, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7GreaterThan(String value) {
            addCriterion("EXTINFO7 >", value, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO7 >=", value, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7LessThan(String value) {
            addCriterion("EXTINFO7 <", value, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO7 <=", value, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7Like(String value) {
            addCriterion("EXTINFO7 like", value, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7NotLike(String value) {
            addCriterion("EXTINFO7 not like", value, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7In(List<String> values) {
            addCriterion("EXTINFO7 in", values, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7NotIn(List<String> values) {
            addCriterion("EXTINFO7 not in", values, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7Between(String value1, String value2) {
            addCriterion("EXTINFO7 between", value1, value2, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo7NotBetween(String value1, String value2) {
            addCriterion("EXTINFO7 not between", value1, value2, "extinfo7");
            return (Criteria) this;
        }

        public Criteria andExtinfo8IsNull() {
            addCriterion("EXTINFO8 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo8IsNotNull() {
            addCriterion("EXTINFO8 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo8EqualTo(String value) {
            addCriterion("EXTINFO8 =", value, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8NotEqualTo(String value) {
            addCriterion("EXTINFO8 <>", value, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8GreaterThan(String value) {
            addCriterion("EXTINFO8 >", value, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO8 >=", value, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8LessThan(String value) {
            addCriterion("EXTINFO8 <", value, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO8 <=", value, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8Like(String value) {
            addCriterion("EXTINFO8 like", value, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8NotLike(String value) {
            addCriterion("EXTINFO8 not like", value, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8In(List<String> values) {
            addCriterion("EXTINFO8 in", values, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8NotIn(List<String> values) {
            addCriterion("EXTINFO8 not in", values, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8Between(String value1, String value2) {
            addCriterion("EXTINFO8 between", value1, value2, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo8NotBetween(String value1, String value2) {
            addCriterion("EXTINFO8 not between", value1, value2, "extinfo8");
            return (Criteria) this;
        }

        public Criteria andExtinfo9IsNull() {
            addCriterion("EXTINFO9 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo9IsNotNull() {
            addCriterion("EXTINFO9 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo9EqualTo(String value) {
            addCriterion("EXTINFO9 =", value, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9NotEqualTo(String value) {
            addCriterion("EXTINFO9 <>", value, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9GreaterThan(String value) {
            addCriterion("EXTINFO9 >", value, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO9 >=", value, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9LessThan(String value) {
            addCriterion("EXTINFO9 <", value, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO9 <=", value, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9Like(String value) {
            addCriterion("EXTINFO9 like", value, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9NotLike(String value) {
            addCriterion("EXTINFO9 not like", value, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9In(List<String> values) {
            addCriterion("EXTINFO9 in", values, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9NotIn(List<String> values) {
            addCriterion("EXTINFO9 not in", values, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9Between(String value1, String value2) {
            addCriterion("EXTINFO9 between", value1, value2, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo9NotBetween(String value1, String value2) {
            addCriterion("EXTINFO9 not between", value1, value2, "extinfo9");
            return (Criteria) this;
        }

        public Criteria andExtinfo10IsNull() {
            addCriterion("EXTINFO10 is null");
            return (Criteria) this;
        }

        public Criteria andExtinfo10IsNotNull() {
            addCriterion("EXTINFO10 is not null");
            return (Criteria) this;
        }

        public Criteria andExtinfo10EqualTo(String value) {
            addCriterion("EXTINFO10 =", value, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10NotEqualTo(String value) {
            addCriterion("EXTINFO10 <>", value, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10GreaterThan(String value) {
            addCriterion("EXTINFO10 >", value, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10GreaterThanOrEqualTo(String value) {
            addCriterion("EXTINFO10 >=", value, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10LessThan(String value) {
            addCriterion("EXTINFO10 <", value, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10LessThanOrEqualTo(String value) {
            addCriterion("EXTINFO10 <=", value, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10Like(String value) {
            addCriterion("EXTINFO10 like", value, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10NotLike(String value) {
            addCriterion("EXTINFO10 not like", value, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10In(List<String> values) {
            addCriterion("EXTINFO10 in", values, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10NotIn(List<String> values) {
            addCriterion("EXTINFO10 not in", values, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10Between(String value1, String value2) {
            addCriterion("EXTINFO10 between", value1, value2, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andExtinfo10NotBetween(String value1, String value2) {
            addCriterion("EXTINFO10 not between", value1, value2, "extinfo10");
            return (Criteria) this;
        }

        public Criteria andWorkflownoIsNull() {
            addCriterion("WORKFLOWNO is null");
            return (Criteria) this;
        }

        public Criteria andWorkflownoIsNotNull() {
            addCriterion("WORKFLOWNO is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflownoEqualTo(String value) {
            addCriterion("WORKFLOWNO =", value, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoNotEqualTo(String value) {
            addCriterion("WORKFLOWNO <>", value, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoGreaterThan(String value) {
            addCriterion("WORKFLOWNO >", value, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoGreaterThanOrEqualTo(String value) {
            addCriterion("WORKFLOWNO >=", value, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoLessThan(String value) {
            addCriterion("WORKFLOWNO <", value, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoLessThanOrEqualTo(String value) {
            addCriterion("WORKFLOWNO <=", value, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoLike(String value) {
            addCriterion("WORKFLOWNO like", value, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoNotLike(String value) {
            addCriterion("WORKFLOWNO not like", value, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoIn(List<String> values) {
            addCriterion("WORKFLOWNO in", values, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoNotIn(List<String> values) {
            addCriterion("WORKFLOWNO not in", values, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoBetween(String value1, String value2) {
            addCriterion("WORKFLOWNO between", value1, value2, "workflowno");
            return (Criteria) this;
        }

        public Criteria andWorkflownoNotBetween(String value1, String value2) {
            addCriterion("WORKFLOWNO not between", value1, value2, "workflowno");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}