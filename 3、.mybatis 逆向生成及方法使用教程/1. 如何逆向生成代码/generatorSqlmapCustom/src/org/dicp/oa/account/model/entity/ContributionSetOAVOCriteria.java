package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContributionSetOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContributionSetOAVOCriteria() {
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

        public Criteria andPkContributionsetIsNull() {
            addCriterion("PK_CONTRIBUTIONSET is null");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetIsNotNull() {
            addCriterion("PK_CONTRIBUTIONSET is not null");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetEqualTo(String value) {
            addCriterion("PK_CONTRIBUTIONSET =", value, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetNotEqualTo(String value) {
            addCriterion("PK_CONTRIBUTIONSET <>", value, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetGreaterThan(String value) {
            addCriterion("PK_CONTRIBUTIONSET >", value, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CONTRIBUTIONSET >=", value, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetLessThan(String value) {
            addCriterion("PK_CONTRIBUTIONSET <", value, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetLessThanOrEqualTo(String value) {
            addCriterion("PK_CONTRIBUTIONSET <=", value, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetLike(String value) {
            addCriterion("PK_CONTRIBUTIONSET like", value, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetNotLike(String value) {
            addCriterion("PK_CONTRIBUTIONSET not like", value, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetIn(List<String> values) {
            addCriterion("PK_CONTRIBUTIONSET in", values, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetNotIn(List<String> values) {
            addCriterion("PK_CONTRIBUTIONSET not in", values, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetBetween(String value1, String value2) {
            addCriterion("PK_CONTRIBUTIONSET between", value1, value2, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetNotBetween(String value1, String value2) {
            addCriterion("PK_CONTRIBUTIONSET not between", value1, value2, "pkContributionset");
            return (Criteria) this;
        }

        public Criteria andPkContributionIsNull() {
            addCriterion("PK_CONTRIBUTION is null");
            return (Criteria) this;
        }

        public Criteria andPkContributionIsNotNull() {
            addCriterion("PK_CONTRIBUTION is not null");
            return (Criteria) this;
        }

        public Criteria andPkContributionEqualTo(String value) {
            addCriterion("PK_CONTRIBUTION =", value, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionNotEqualTo(String value) {
            addCriterion("PK_CONTRIBUTION <>", value, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionGreaterThan(String value) {
            addCriterion("PK_CONTRIBUTION >", value, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CONTRIBUTION >=", value, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionLessThan(String value) {
            addCriterion("PK_CONTRIBUTION <", value, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionLessThanOrEqualTo(String value) {
            addCriterion("PK_CONTRIBUTION <=", value, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionLike(String value) {
            addCriterion("PK_CONTRIBUTION like", value, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionNotLike(String value) {
            addCriterion("PK_CONTRIBUTION not like", value, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionIn(List<String> values) {
            addCriterion("PK_CONTRIBUTION in", values, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionNotIn(List<String> values) {
            addCriterion("PK_CONTRIBUTION not in", values, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionBetween(String value1, String value2) {
            addCriterion("PK_CONTRIBUTION between", value1, value2, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andPkContributionNotBetween(String value1, String value2) {
            addCriterion("PK_CONTRIBUTION not between", value1, value2, "pkContribution");
            return (Criteria) this;
        }

        public Criteria andDrawsnIsNull() {
            addCriterion("DRAWSN is null");
            return (Criteria) this;
        }

        public Criteria andDrawsnIsNotNull() {
            addCriterion("DRAWSN is not null");
            return (Criteria) this;
        }

        public Criteria andDrawsnEqualTo(String value) {
            addCriterion("DRAWSN =", value, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnNotEqualTo(String value) {
            addCriterion("DRAWSN <>", value, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnGreaterThan(String value) {
            addCriterion("DRAWSN >", value, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnGreaterThanOrEqualTo(String value) {
            addCriterion("DRAWSN >=", value, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnLessThan(String value) {
            addCriterion("DRAWSN <", value, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnLessThanOrEqualTo(String value) {
            addCriterion("DRAWSN <=", value, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnLike(String value) {
            addCriterion("DRAWSN like", value, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnNotLike(String value) {
            addCriterion("DRAWSN not like", value, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnIn(List<String> values) {
            addCriterion("DRAWSN in", values, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnNotIn(List<String> values) {
            addCriterion("DRAWSN not in", values, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnBetween(String value1, String value2) {
            addCriterion("DRAWSN between", value1, value2, "drawsn");
            return (Criteria) this;
        }

        public Criteria andDrawsnNotBetween(String value1, String value2) {
            addCriterion("DRAWSN not between", value1, value2, "drawsn");
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

        public Criteria andDrawamountIsNull() {
            addCriterion("DRAWAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDrawamountIsNotNull() {
            addCriterion("DRAWAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDrawamountEqualTo(BigDecimal value) {
            addCriterion("DRAWAMOUNT =", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountNotEqualTo(BigDecimal value) {
            addCriterion("DRAWAMOUNT <>", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountGreaterThan(BigDecimal value) {
            addCriterion("DRAWAMOUNT >", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAWAMOUNT >=", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountLessThan(BigDecimal value) {
            addCriterion("DRAWAMOUNT <", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAWAMOUNT <=", value, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountIn(List<BigDecimal> values) {
            addCriterion("DRAWAMOUNT in", values, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountNotIn(List<BigDecimal> values) {
            addCriterion("DRAWAMOUNT not in", values, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAWAMOUNT between", value1, value2, "drawamount");
            return (Criteria) this;
        }

        public Criteria andDrawamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAWAMOUNT not between", value1, value2, "drawamount");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoIsNull() {
            addCriterion("TRUSACCNO is null");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoIsNotNull() {
            addCriterion("TRUSACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoEqualTo(String value) {
            addCriterion("TRUSACCNO =", value, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoNotEqualTo(String value) {
            addCriterion("TRUSACCNO <>", value, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoGreaterThan(String value) {
            addCriterion("TRUSACCNO >", value, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSACCNO >=", value, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoLessThan(String value) {
            addCriterion("TRUSACCNO <", value, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoLessThanOrEqualTo(String value) {
            addCriterion("TRUSACCNO <=", value, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoLike(String value) {
            addCriterion("TRUSACCNO like", value, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoNotLike(String value) {
            addCriterion("TRUSACCNO not like", value, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoIn(List<String> values) {
            addCriterion("TRUSACCNO in", values, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoNotIn(List<String> values) {
            addCriterion("TRUSACCNO not in", values, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoBetween(String value1, String value2) {
            addCriterion("TRUSACCNO between", value1, value2, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnoNotBetween(String value1, String value2) {
            addCriterion("TRUSACCNO not between", value1, value2, "trusaccno");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameIsNull() {
            addCriterion("TRUSACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameIsNotNull() {
            addCriterion("TRUSACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameEqualTo(String value) {
            addCriterion("TRUSACCNAME =", value, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameNotEqualTo(String value) {
            addCriterion("TRUSACCNAME <>", value, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameGreaterThan(String value) {
            addCriterion("TRUSACCNAME >", value, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSACCNAME >=", value, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameLessThan(String value) {
            addCriterion("TRUSACCNAME <", value, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameLessThanOrEqualTo(String value) {
            addCriterion("TRUSACCNAME <=", value, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameLike(String value) {
            addCriterion("TRUSACCNAME like", value, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameNotLike(String value) {
            addCriterion("TRUSACCNAME not like", value, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameIn(List<String> values) {
            addCriterion("TRUSACCNAME in", values, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameNotIn(List<String> values) {
            addCriterion("TRUSACCNAME not in", values, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameBetween(String value1, String value2) {
            addCriterion("TRUSACCNAME between", value1, value2, "trusaccname");
            return (Criteria) this;
        }

        public Criteria andTrusaccnameNotBetween(String value1, String value2) {
            addCriterion("TRUSACCNAME not between", value1, value2, "trusaccname");
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