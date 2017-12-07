package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskFileOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskFileOAVOCriteria() {
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

        public Criteria andPkPaylistinfoIsNull() {
            addCriterion("PK_PAYLISTINFO is null");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoIsNotNull() {
            addCriterion("PK_PAYLISTINFO is not null");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoEqualTo(String value) {
            addCriterion("PK_PAYLISTINFO =", value, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoNotEqualTo(String value) {
            addCriterion("PK_PAYLISTINFO <>", value, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoGreaterThan(String value) {
            addCriterion("PK_PAYLISTINFO >", value, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PAYLISTINFO >=", value, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoLessThan(String value) {
            addCriterion("PK_PAYLISTINFO <", value, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoLessThanOrEqualTo(String value) {
            addCriterion("PK_PAYLISTINFO <=", value, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoLike(String value) {
            addCriterion("PK_PAYLISTINFO like", value, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoNotLike(String value) {
            addCriterion("PK_PAYLISTINFO not like", value, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoIn(List<String> values) {
            addCriterion("PK_PAYLISTINFO in", values, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoNotIn(List<String> values) {
            addCriterion("PK_PAYLISTINFO not in", values, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoBetween(String value1, String value2) {
            addCriterion("PK_PAYLISTINFO between", value1, value2, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkPaylistinfoNotBetween(String value1, String value2) {
            addCriterion("PK_PAYLISTINFO not between", value1, value2, "pkPaylistinfo");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreIsNull() {
            addCriterion("PK_FILESTORE is null");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreIsNotNull() {
            addCriterion("PK_FILESTORE is not null");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreEqualTo(String value) {
            addCriterion("PK_FILESTORE =", value, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreNotEqualTo(String value) {
            addCriterion("PK_FILESTORE <>", value, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreGreaterThan(String value) {
            addCriterion("PK_FILESTORE >", value, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreGreaterThanOrEqualTo(String value) {
            addCriterion("PK_FILESTORE >=", value, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreLessThan(String value) {
            addCriterion("PK_FILESTORE <", value, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreLessThanOrEqualTo(String value) {
            addCriterion("PK_FILESTORE <=", value, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreLike(String value) {
            addCriterion("PK_FILESTORE like", value, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreNotLike(String value) {
            addCriterion("PK_FILESTORE not like", value, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreIn(List<String> values) {
            addCriterion("PK_FILESTORE in", values, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreNotIn(List<String> values) {
            addCriterion("PK_FILESTORE not in", values, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreBetween(String value1, String value2) {
            addCriterion("PK_FILESTORE between", value1, value2, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andPkFilestoreNotBetween(String value1, String value2) {
            addCriterion("PK_FILESTORE not between", value1, value2, "pkFilestore");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNull() {
            addCriterion("BATCHNO is null");
            return (Criteria) this;
        }

        public Criteria andBatchnoIsNotNull() {
            addCriterion("BATCHNO is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnoEqualTo(String value) {
            addCriterion("BATCHNO =", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotEqualTo(String value) {
            addCriterion("BATCHNO <>", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThan(String value) {
            addCriterion("BATCHNO >", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNO >=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThan(String value) {
            addCriterion("BATCHNO <", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLessThanOrEqualTo(String value) {
            addCriterion("BATCHNO <=", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoLike(String value) {
            addCriterion("BATCHNO like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotLike(String value) {
            addCriterion("BATCHNO not like", value, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoIn(List<String> values) {
            addCriterion("BATCHNO in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotIn(List<String> values) {
            addCriterion("BATCHNO not in", values, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoBetween(String value1, String value2) {
            addCriterion("BATCHNO between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBatchnoNotBetween(String value1, String value2) {
            addCriterion("BATCHNO not between", value1, value2, "batchno");
            return (Criteria) this;
        }

        public Criteria andBuscdIsNull() {
            addCriterion("BUSCD is null");
            return (Criteria) this;
        }

        public Criteria andBuscdIsNotNull() {
            addCriterion("BUSCD is not null");
            return (Criteria) this;
        }

        public Criteria andBuscdEqualTo(String value) {
            addCriterion("BUSCD =", value, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdNotEqualTo(String value) {
            addCriterion("BUSCD <>", value, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdGreaterThan(String value) {
            addCriterion("BUSCD >", value, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSCD >=", value, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdLessThan(String value) {
            addCriterion("BUSCD <", value, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdLessThanOrEqualTo(String value) {
            addCriterion("BUSCD <=", value, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdLike(String value) {
            addCriterion("BUSCD like", value, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdNotLike(String value) {
            addCriterion("BUSCD not like", value, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdIn(List<String> values) {
            addCriterion("BUSCD in", values, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdNotIn(List<String> values) {
            addCriterion("BUSCD not in", values, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdBetween(String value1, String value2) {
            addCriterion("BUSCD between", value1, value2, "buscd");
            return (Criteria) this;
        }

        public Criteria andBuscdNotBetween(String value1, String value2) {
            addCriterion("BUSCD not between", value1, value2, "buscd");
            return (Criteria) this;
        }

        public Criteria andTotalcountIsNull() {
            addCriterion("TOTALCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalcountIsNotNull() {
            addCriterion("TOTALCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcountEqualTo(String value) {
            addCriterion("TOTALCOUNT =", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotEqualTo(String value) {
            addCriterion("TOTALCOUNT <>", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountGreaterThan(String value) {
            addCriterion("TOTALCOUNT >", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountGreaterThanOrEqualTo(String value) {
            addCriterion("TOTALCOUNT >=", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLessThan(String value) {
            addCriterion("TOTALCOUNT <", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLessThanOrEqualTo(String value) {
            addCriterion("TOTALCOUNT <=", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountLike(String value) {
            addCriterion("TOTALCOUNT like", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotLike(String value) {
            addCriterion("TOTALCOUNT not like", value, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountIn(List<String> values) {
            addCriterion("TOTALCOUNT in", values, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotIn(List<String> values) {
            addCriterion("TOTALCOUNT not in", values, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountBetween(String value1, String value2) {
            addCriterion("TOTALCOUNT between", value1, value2, "totalcount");
            return (Criteria) this;
        }

        public Criteria andTotalcountNotBetween(String value1, String value2) {
            addCriterion("TOTALCOUNT not between", value1, value2, "totalcount");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxIsNull() {
            addCriterion("SUMPAYSUMUNTAX is null");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxIsNotNull() {
            addCriterion("SUMPAYSUMUNTAX is not null");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxEqualTo(BigDecimal value) {
            addCriterion("SUMPAYSUMUNTAX =", value, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxNotEqualTo(BigDecimal value) {
            addCriterion("SUMPAYSUMUNTAX <>", value, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxGreaterThan(BigDecimal value) {
            addCriterion("SUMPAYSUMUNTAX >", value, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPAYSUMUNTAX >=", value, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxLessThan(BigDecimal value) {
            addCriterion("SUMPAYSUMUNTAX <", value, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPAYSUMUNTAX <=", value, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxIn(List<BigDecimal> values) {
            addCriterion("SUMPAYSUMUNTAX in", values, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxNotIn(List<BigDecimal> values) {
            addCriterion("SUMPAYSUMUNTAX not in", values, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPAYSUMUNTAX between", value1, value2, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaysumuntaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPAYSUMUNTAX not between", value1, value2, "sumpaysumuntax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxIsNull() {
            addCriterion("SUMPAYTAX is null");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxIsNotNull() {
            addCriterion("SUMPAYTAX is not null");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxEqualTo(BigDecimal value) {
            addCriterion("SUMPAYTAX =", value, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxNotEqualTo(BigDecimal value) {
            addCriterion("SUMPAYTAX <>", value, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxGreaterThan(BigDecimal value) {
            addCriterion("SUMPAYTAX >", value, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPAYTAX >=", value, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxLessThan(BigDecimal value) {
            addCriterion("SUMPAYTAX <", value, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPAYTAX <=", value, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxIn(List<BigDecimal> values) {
            addCriterion("SUMPAYTAX in", values, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxNotIn(List<BigDecimal> values) {
            addCriterion("SUMPAYTAX not in", values, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPAYTAX between", value1, value2, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpaytaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPAYTAX not between", value1, value2, "sumpaytax");
            return (Criteria) this;
        }

        public Criteria andSumpayamtIsNull() {
            addCriterion("SUMPAYAMT is null");
            return (Criteria) this;
        }

        public Criteria andSumpayamtIsNotNull() {
            addCriterion("SUMPAYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andSumpayamtEqualTo(BigDecimal value) {
            addCriterion("SUMPAYAMT =", value, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtNotEqualTo(BigDecimal value) {
            addCriterion("SUMPAYAMT <>", value, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtGreaterThan(BigDecimal value) {
            addCriterion("SUMPAYAMT >", value, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPAYAMT >=", value, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtLessThan(BigDecimal value) {
            addCriterion("SUMPAYAMT <", value, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUMPAYAMT <=", value, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtIn(List<BigDecimal> values) {
            addCriterion("SUMPAYAMT in", values, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtNotIn(List<BigDecimal> values) {
            addCriterion("SUMPAYAMT not in", values, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPAYAMT between", value1, value2, "sumpayamt");
            return (Criteria) this;
        }

        public Criteria andSumpayamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUMPAYAMT not between", value1, value2, "sumpayamt");
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

        public Criteria andPlanlicidIsNull() {
            addCriterion("PLANLICID is null");
            return (Criteria) this;
        }

        public Criteria andPlanlicidIsNotNull() {
            addCriterion("PLANLICID is not null");
            return (Criteria) this;
        }

        public Criteria andPlanlicidEqualTo(String value) {
            addCriterion("PLANLICID =", value, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidNotEqualTo(String value) {
            addCriterion("PLANLICID <>", value, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidGreaterThan(String value) {
            addCriterion("PLANLICID >", value, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidGreaterThanOrEqualTo(String value) {
            addCriterion("PLANLICID >=", value, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidLessThan(String value) {
            addCriterion("PLANLICID <", value, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidLessThanOrEqualTo(String value) {
            addCriterion("PLANLICID <=", value, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidLike(String value) {
            addCriterion("PLANLICID like", value, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidNotLike(String value) {
            addCriterion("PLANLICID not like", value, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidIn(List<String> values) {
            addCriterion("PLANLICID in", values, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidNotIn(List<String> values) {
            addCriterion("PLANLICID not in", values, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidBetween(String value1, String value2) {
            addCriterion("PLANLICID between", value1, value2, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlanlicidNotBetween(String value1, String value2) {
            addCriterion("PLANLICID not between", value1, value2, "planlicid");
            return (Criteria) this;
        }

        public Criteria andPlannameIsNull() {
            addCriterion("PLANNAME is null");
            return (Criteria) this;
        }

        public Criteria andPlannameIsNotNull() {
            addCriterion("PLANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlannameEqualTo(String value) {
            addCriterion("PLANNAME =", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotEqualTo(String value) {
            addCriterion("PLANNAME <>", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameGreaterThan(String value) {
            addCriterion("PLANNAME >", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameGreaterThanOrEqualTo(String value) {
            addCriterion("PLANNAME >=", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLessThan(String value) {
            addCriterion("PLANNAME <", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLessThanOrEqualTo(String value) {
            addCriterion("PLANNAME <=", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameLike(String value) {
            addCriterion("PLANNAME like", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotLike(String value) {
            addCriterion("PLANNAME not like", value, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameIn(List<String> values) {
            addCriterion("PLANNAME in", values, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotIn(List<String> values) {
            addCriterion("PLANNAME not in", values, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameBetween(String value1, String value2) {
            addCriterion("PLANNAME between", value1, value2, "planname");
            return (Criteria) this;
        }

        public Criteria andPlannameNotBetween(String value1, String value2) {
            addCriterion("PLANNAME not between", value1, value2, "planname");
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

        public Criteria andAccountplanidIsNull() {
            addCriterion("ACCOUNTPLANID is null");
            return (Criteria) this;
        }

        public Criteria andAccountplanidIsNotNull() {
            addCriterion("ACCOUNTPLANID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountplanidEqualTo(String value) {
            addCriterion("ACCOUNTPLANID =", value, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidNotEqualTo(String value) {
            addCriterion("ACCOUNTPLANID <>", value, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidGreaterThan(String value) {
            addCriterion("ACCOUNTPLANID >", value, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTPLANID >=", value, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidLessThan(String value) {
            addCriterion("ACCOUNTPLANID <", value, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTPLANID <=", value, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidLike(String value) {
            addCriterion("ACCOUNTPLANID like", value, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidNotLike(String value) {
            addCriterion("ACCOUNTPLANID not like", value, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidIn(List<String> values) {
            addCriterion("ACCOUNTPLANID in", values, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidNotIn(List<String> values) {
            addCriterion("ACCOUNTPLANID not in", values, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidBetween(String value1, String value2) {
            addCriterion("ACCOUNTPLANID between", value1, value2, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAccountplanidNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTPLANID not between", value1, value2, "accountplanid");
            return (Criteria) this;
        }

        public Criteria andAeskeyIsNull() {
            addCriterion("AESKEY is null");
            return (Criteria) this;
        }

        public Criteria andAeskeyIsNotNull() {
            addCriterion("AESKEY is not null");
            return (Criteria) this;
        }

        public Criteria andAeskeyEqualTo(String value) {
            addCriterion("AESKEY =", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyNotEqualTo(String value) {
            addCriterion("AESKEY <>", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyGreaterThan(String value) {
            addCriterion("AESKEY >", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyGreaterThanOrEqualTo(String value) {
            addCriterion("AESKEY >=", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyLessThan(String value) {
            addCriterion("AESKEY <", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyLessThanOrEqualTo(String value) {
            addCriterion("AESKEY <=", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyLike(String value) {
            addCriterion("AESKEY like", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyNotLike(String value) {
            addCriterion("AESKEY not like", value, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyIn(List<String> values) {
            addCriterion("AESKEY in", values, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyNotIn(List<String> values) {
            addCriterion("AESKEY not in", values, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyBetween(String value1, String value2) {
            addCriterion("AESKEY between", value1, value2, "aeskey");
            return (Criteria) this;
        }

        public Criteria andAeskeyNotBetween(String value1, String value2) {
            addCriterion("AESKEY not between", value1, value2, "aeskey");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNull() {
            addCriterion("FILENAME is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FILENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FILENAME =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FILENAME <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FILENAME >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FILENAME >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FILENAME <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FILENAME <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FILENAME like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FILENAME not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FILENAME in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FILENAME not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FILENAME between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FILENAME not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNull() {
            addCriterion("FILEPATH is null");
            return (Criteria) this;
        }

        public Criteria andFilepathIsNotNull() {
            addCriterion("FILEPATH is not null");
            return (Criteria) this;
        }

        public Criteria andFilepathEqualTo(String value) {
            addCriterion("FILEPATH =", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotEqualTo(String value) {
            addCriterion("FILEPATH <>", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThan(String value) {
            addCriterion("FILEPATH >", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("FILEPATH >=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThan(String value) {
            addCriterion("FILEPATH <", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLessThanOrEqualTo(String value) {
            addCriterion("FILEPATH <=", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathLike(String value) {
            addCriterion("FILEPATH like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotLike(String value) {
            addCriterion("FILEPATH not like", value, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathIn(List<String> values) {
            addCriterion("FILEPATH in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotIn(List<String> values) {
            addCriterion("FILEPATH not in", values, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathBetween(String value1, String value2) {
            addCriterion("FILEPATH between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilepathNotBetween(String value1, String value2) {
            addCriterion("FILEPATH not between", value1, value2, "filepath");
            return (Criteria) this;
        }

        public Criteria andFilesignIsNull() {
            addCriterion("FILESIGN is null");
            return (Criteria) this;
        }

        public Criteria andFilesignIsNotNull() {
            addCriterion("FILESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andFilesignEqualTo(String value) {
            addCriterion("FILESIGN =", value, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignNotEqualTo(String value) {
            addCriterion("FILESIGN <>", value, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignGreaterThan(String value) {
            addCriterion("FILESIGN >", value, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignGreaterThanOrEqualTo(String value) {
            addCriterion("FILESIGN >=", value, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignLessThan(String value) {
            addCriterion("FILESIGN <", value, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignLessThanOrEqualTo(String value) {
            addCriterion("FILESIGN <=", value, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignLike(String value) {
            addCriterion("FILESIGN like", value, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignNotLike(String value) {
            addCriterion("FILESIGN not like", value, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignIn(List<String> values) {
            addCriterion("FILESIGN in", values, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignNotIn(List<String> values) {
            addCriterion("FILESIGN not in", values, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignBetween(String value1, String value2) {
            addCriterion("FILESIGN between", value1, value2, "filesign");
            return (Criteria) this;
        }

        public Criteria andFilesignNotBetween(String value1, String value2) {
            addCriterion("FILESIGN not between", value1, value2, "filesign");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNull() {
            addCriterion("MAKEDATE is null");
            return (Criteria) this;
        }

        public Criteria andMakedateIsNotNull() {
            addCriterion("MAKEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andMakedateEqualTo(Object value) {
            addCriterion("MAKEDATE =", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotEqualTo(Object value) {
            addCriterion("MAKEDATE <>", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThan(Object value) {
            addCriterion("MAKEDATE >", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateGreaterThanOrEqualTo(Object value) {
            addCriterion("MAKEDATE >=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThan(Object value) {
            addCriterion("MAKEDATE <", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateLessThanOrEqualTo(Object value) {
            addCriterion("MAKEDATE <=", value, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateIn(List<Object> values) {
            addCriterion("MAKEDATE in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotIn(List<Object> values) {
            addCriterion("MAKEDATE not in", values, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateBetween(Object value1, Object value2) {
            addCriterion("MAKEDATE between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMakedateNotBetween(Object value1, Object value2) {
            addCriterion("MAKEDATE not between", value1, value2, "makedate");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNull() {
            addCriterion("MAKETIME is null");
            return (Criteria) this;
        }

        public Criteria andMaketimeIsNotNull() {
            addCriterion("MAKETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMaketimeEqualTo(Date value) {
            addCriterion("MAKETIME =", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotEqualTo(Date value) {
            addCriterion("MAKETIME <>", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThan(Date value) {
            addCriterion("MAKETIME >", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MAKETIME >=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThan(Date value) {
            addCriterion("MAKETIME <", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeLessThanOrEqualTo(Date value) {
            addCriterion("MAKETIME <=", value, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeIn(List<Date> values) {
            addCriterion("MAKETIME in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotIn(List<Date> values) {
            addCriterion("MAKETIME not in", values, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeBetween(Date value1, Date value2) {
            addCriterion("MAKETIME between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andMaketimeNotBetween(Date value1, Date value2) {
            addCriterion("MAKETIME not between", value1, value2, "maketime");
            return (Criteria) this;
        }

        public Criteria andSenderIsNull() {
            addCriterion("SENDER is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("SENDER is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("SENDER =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("SENDER <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("SENDER >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("SENDER >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("SENDER <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("SENDER <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("SENDER like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("SENDER not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("SENDER in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("SENDER not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("SENDER between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("SENDER not between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("RECEIVER is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("RECEIVER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("RECEIVER =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("RECEIVER <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("RECEIVER >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVER >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("RECEIVER <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("RECEIVER <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("RECEIVER like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("RECEIVER not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("RECEIVER in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("RECEIVER not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("RECEIVER between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("RECEIVER not between", value1, value2, "receiver");
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

        public Criteria andColumn1IsNull() {
            addCriterion("COLUMN1 is null");
            return (Criteria) this;
        }

        public Criteria andColumn1IsNotNull() {
            addCriterion("COLUMN1 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn1EqualTo(String value) {
            addCriterion("COLUMN1 =", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotEqualTo(String value) {
            addCriterion("COLUMN1 <>", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThan(String value) {
            addCriterion("COLUMN1 >", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN1 >=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThan(String value) {
            addCriterion("COLUMN1 <", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1LessThanOrEqualTo(String value) {
            addCriterion("COLUMN1 <=", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Like(String value) {
            addCriterion("COLUMN1 like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotLike(String value) {
            addCriterion("COLUMN1 not like", value, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1In(List<String> values) {
            addCriterion("COLUMN1 in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotIn(List<String> values) {
            addCriterion("COLUMN1 not in", values, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1Between(String value1, String value2) {
            addCriterion("COLUMN1 between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn1NotBetween(String value1, String value2) {
            addCriterion("COLUMN1 not between", value1, value2, "column1");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNull() {
            addCriterion("COLUMN2 is null");
            return (Criteria) this;
        }

        public Criteria andColumn2IsNotNull() {
            addCriterion("COLUMN2 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn2EqualTo(String value) {
            addCriterion("COLUMN2 =", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotEqualTo(String value) {
            addCriterion("COLUMN2 <>", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThan(String value) {
            addCriterion("COLUMN2 >", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN2 >=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThan(String value) {
            addCriterion("COLUMN2 <", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2LessThanOrEqualTo(String value) {
            addCriterion("COLUMN2 <=", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Like(String value) {
            addCriterion("COLUMN2 like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotLike(String value) {
            addCriterion("COLUMN2 not like", value, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2In(List<String> values) {
            addCriterion("COLUMN2 in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotIn(List<String> values) {
            addCriterion("COLUMN2 not in", values, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2Between(String value1, String value2) {
            addCriterion("COLUMN2 between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn2NotBetween(String value1, String value2) {
            addCriterion("COLUMN2 not between", value1, value2, "column2");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNull() {
            addCriterion("COLUMN3 is null");
            return (Criteria) this;
        }

        public Criteria andColumn3IsNotNull() {
            addCriterion("COLUMN3 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn3EqualTo(String value) {
            addCriterion("COLUMN3 =", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotEqualTo(String value) {
            addCriterion("COLUMN3 <>", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThan(String value) {
            addCriterion("COLUMN3 >", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN3 >=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThan(String value) {
            addCriterion("COLUMN3 <", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3LessThanOrEqualTo(String value) {
            addCriterion("COLUMN3 <=", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Like(String value) {
            addCriterion("COLUMN3 like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotLike(String value) {
            addCriterion("COLUMN3 not like", value, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3In(List<String> values) {
            addCriterion("COLUMN3 in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotIn(List<String> values) {
            addCriterion("COLUMN3 not in", values, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3Between(String value1, String value2) {
            addCriterion("COLUMN3 between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn3NotBetween(String value1, String value2) {
            addCriterion("COLUMN3 not between", value1, value2, "column3");
            return (Criteria) this;
        }

        public Criteria andColumn4IsNull() {
            addCriterion("COLUMN4 is null");
            return (Criteria) this;
        }

        public Criteria andColumn4IsNotNull() {
            addCriterion("COLUMN4 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn4EqualTo(String value) {
            addCriterion("COLUMN4 =", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4NotEqualTo(String value) {
            addCriterion("COLUMN4 <>", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4GreaterThan(String value) {
            addCriterion("COLUMN4 >", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN4 >=", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4LessThan(String value) {
            addCriterion("COLUMN4 <", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4LessThanOrEqualTo(String value) {
            addCriterion("COLUMN4 <=", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4Like(String value) {
            addCriterion("COLUMN4 like", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4NotLike(String value) {
            addCriterion("COLUMN4 not like", value, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4In(List<String> values) {
            addCriterion("COLUMN4 in", values, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4NotIn(List<String> values) {
            addCriterion("COLUMN4 not in", values, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4Between(String value1, String value2) {
            addCriterion("COLUMN4 between", value1, value2, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn4NotBetween(String value1, String value2) {
            addCriterion("COLUMN4 not between", value1, value2, "column4");
            return (Criteria) this;
        }

        public Criteria andColumn5IsNull() {
            addCriterion("COLUMN5 is null");
            return (Criteria) this;
        }

        public Criteria andColumn5IsNotNull() {
            addCriterion("COLUMN5 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn5EqualTo(String value) {
            addCriterion("COLUMN5 =", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotEqualTo(String value) {
            addCriterion("COLUMN5 <>", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5GreaterThan(String value) {
            addCriterion("COLUMN5 >", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN5 >=", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5LessThan(String value) {
            addCriterion("COLUMN5 <", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5LessThanOrEqualTo(String value) {
            addCriterion("COLUMN5 <=", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5Like(String value) {
            addCriterion("COLUMN5 like", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotLike(String value) {
            addCriterion("COLUMN5 not like", value, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5In(List<String> values) {
            addCriterion("COLUMN5 in", values, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotIn(List<String> values) {
            addCriterion("COLUMN5 not in", values, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5Between(String value1, String value2) {
            addCriterion("COLUMN5 between", value1, value2, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn5NotBetween(String value1, String value2) {
            addCriterion("COLUMN5 not between", value1, value2, "column5");
            return (Criteria) this;
        }

        public Criteria andColumn6IsNull() {
            addCriterion("COLUMN6 is null");
            return (Criteria) this;
        }

        public Criteria andColumn6IsNotNull() {
            addCriterion("COLUMN6 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn6EqualTo(String value) {
            addCriterion("COLUMN6 =", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotEqualTo(String value) {
            addCriterion("COLUMN6 <>", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6GreaterThan(String value) {
            addCriterion("COLUMN6 >", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN6 >=", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6LessThan(String value) {
            addCriterion("COLUMN6 <", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6LessThanOrEqualTo(String value) {
            addCriterion("COLUMN6 <=", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6Like(String value) {
            addCriterion("COLUMN6 like", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotLike(String value) {
            addCriterion("COLUMN6 not like", value, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6In(List<String> values) {
            addCriterion("COLUMN6 in", values, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotIn(List<String> values) {
            addCriterion("COLUMN6 not in", values, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6Between(String value1, String value2) {
            addCriterion("COLUMN6 between", value1, value2, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn6NotBetween(String value1, String value2) {
            addCriterion("COLUMN6 not between", value1, value2, "column6");
            return (Criteria) this;
        }

        public Criteria andColumn7IsNull() {
            addCriterion("COLUMN7 is null");
            return (Criteria) this;
        }

        public Criteria andColumn7IsNotNull() {
            addCriterion("COLUMN7 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn7EqualTo(String value) {
            addCriterion("COLUMN7 =", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotEqualTo(String value) {
            addCriterion("COLUMN7 <>", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7GreaterThan(String value) {
            addCriterion("COLUMN7 >", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN7 >=", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7LessThan(String value) {
            addCriterion("COLUMN7 <", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7LessThanOrEqualTo(String value) {
            addCriterion("COLUMN7 <=", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7Like(String value) {
            addCriterion("COLUMN7 like", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotLike(String value) {
            addCriterion("COLUMN7 not like", value, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7In(List<String> values) {
            addCriterion("COLUMN7 in", values, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotIn(List<String> values) {
            addCriterion("COLUMN7 not in", values, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7Between(String value1, String value2) {
            addCriterion("COLUMN7 between", value1, value2, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn7NotBetween(String value1, String value2) {
            addCriterion("COLUMN7 not between", value1, value2, "column7");
            return (Criteria) this;
        }

        public Criteria andColumn8IsNull() {
            addCriterion("COLUMN8 is null");
            return (Criteria) this;
        }

        public Criteria andColumn8IsNotNull() {
            addCriterion("COLUMN8 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn8EqualTo(String value) {
            addCriterion("COLUMN8 =", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotEqualTo(String value) {
            addCriterion("COLUMN8 <>", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8GreaterThan(String value) {
            addCriterion("COLUMN8 >", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN8 >=", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8LessThan(String value) {
            addCriterion("COLUMN8 <", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8LessThanOrEqualTo(String value) {
            addCriterion("COLUMN8 <=", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8Like(String value) {
            addCriterion("COLUMN8 like", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotLike(String value) {
            addCriterion("COLUMN8 not like", value, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8In(List<String> values) {
            addCriterion("COLUMN8 in", values, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotIn(List<String> values) {
            addCriterion("COLUMN8 not in", values, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8Between(String value1, String value2) {
            addCriterion("COLUMN8 between", value1, value2, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn8NotBetween(String value1, String value2) {
            addCriterion("COLUMN8 not between", value1, value2, "column8");
            return (Criteria) this;
        }

        public Criteria andColumn9IsNull() {
            addCriterion("COLUMN9 is null");
            return (Criteria) this;
        }

        public Criteria andColumn9IsNotNull() {
            addCriterion("COLUMN9 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn9EqualTo(String value) {
            addCriterion("COLUMN9 =", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotEqualTo(String value) {
            addCriterion("COLUMN9 <>", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9GreaterThan(String value) {
            addCriterion("COLUMN9 >", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN9 >=", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9LessThan(String value) {
            addCriterion("COLUMN9 <", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9LessThanOrEqualTo(String value) {
            addCriterion("COLUMN9 <=", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9Like(String value) {
            addCriterion("COLUMN9 like", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotLike(String value) {
            addCriterion("COLUMN9 not like", value, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9In(List<String> values) {
            addCriterion("COLUMN9 in", values, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotIn(List<String> values) {
            addCriterion("COLUMN9 not in", values, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9Between(String value1, String value2) {
            addCriterion("COLUMN9 between", value1, value2, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn9NotBetween(String value1, String value2) {
            addCriterion("COLUMN9 not between", value1, value2, "column9");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNull() {
            addCriterion("COLUMN10 is null");
            return (Criteria) this;
        }

        public Criteria andColumn10IsNotNull() {
            addCriterion("COLUMN10 is not null");
            return (Criteria) this;
        }

        public Criteria andColumn10EqualTo(String value) {
            addCriterion("COLUMN10 =", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotEqualTo(String value) {
            addCriterion("COLUMN10 <>", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThan(String value) {
            addCriterion("COLUMN10 >", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10GreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN10 >=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThan(String value) {
            addCriterion("COLUMN10 <", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10LessThanOrEqualTo(String value) {
            addCriterion("COLUMN10 <=", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Like(String value) {
            addCriterion("COLUMN10 like", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotLike(String value) {
            addCriterion("COLUMN10 not like", value, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10In(List<String> values) {
            addCriterion("COLUMN10 in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotIn(List<String> values) {
            addCriterion("COLUMN10 not in", values, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10Between(String value1, String value2) {
            addCriterion("COLUMN10 between", value1, value2, "column10");
            return (Criteria) this;
        }

        public Criteria andColumn10NotBetween(String value1, String value2) {
            addCriterion("COLUMN10 not between", value1, value2, "column10");
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