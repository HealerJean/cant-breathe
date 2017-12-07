package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContributionSetlistOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContributionSetlistOAVOCriteria() {
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

        public Criteria andPkContributionsetlistIsNull() {
            addCriterion("PK_CONTRIBUTIONSETLIST is null");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistIsNotNull() {
            addCriterion("PK_CONTRIBUTIONSETLIST is not null");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistEqualTo(String value) {
            addCriterion("PK_CONTRIBUTIONSETLIST =", value, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistNotEqualTo(String value) {
            addCriterion("PK_CONTRIBUTIONSETLIST <>", value, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistGreaterThan(String value) {
            addCriterion("PK_CONTRIBUTIONSETLIST >", value, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CONTRIBUTIONSETLIST >=", value, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistLessThan(String value) {
            addCriterion("PK_CONTRIBUTIONSETLIST <", value, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistLessThanOrEqualTo(String value) {
            addCriterion("PK_CONTRIBUTIONSETLIST <=", value, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistLike(String value) {
            addCriterion("PK_CONTRIBUTIONSETLIST like", value, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistNotLike(String value) {
            addCriterion("PK_CONTRIBUTIONSETLIST not like", value, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistIn(List<String> values) {
            addCriterion("PK_CONTRIBUTIONSETLIST in", values, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistNotIn(List<String> values) {
            addCriterion("PK_CONTRIBUTIONSETLIST not in", values, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistBetween(String value1, String value2) {
            addCriterion("PK_CONTRIBUTIONSETLIST between", value1, value2, "pkContributionsetlist");
            return (Criteria) this;
        }

        public Criteria andPkContributionsetlistNotBetween(String value1, String value2) {
            addCriterion("PK_CONTRIBUTIONSETLIST not between", value1, value2, "pkContributionsetlist");
            return (Criteria) this;
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

        public Criteria andCollectionaccnoIsNull() {
            addCriterion("COLLECTIONACCNO is null");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoIsNotNull() {
            addCriterion("COLLECTIONACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoEqualTo(String value) {
            addCriterion("COLLECTIONACCNO =", value, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoNotEqualTo(String value) {
            addCriterion("COLLECTIONACCNO <>", value, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoGreaterThan(String value) {
            addCriterion("COLLECTIONACCNO >", value, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTIONACCNO >=", value, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoLessThan(String value) {
            addCriterion("COLLECTIONACCNO <", value, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoLessThanOrEqualTo(String value) {
            addCriterion("COLLECTIONACCNO <=", value, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoLike(String value) {
            addCriterion("COLLECTIONACCNO like", value, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoNotLike(String value) {
            addCriterion("COLLECTIONACCNO not like", value, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoIn(List<String> values) {
            addCriterion("COLLECTIONACCNO in", values, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoNotIn(List<String> values) {
            addCriterion("COLLECTIONACCNO not in", values, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoBetween(String value1, String value2) {
            addCriterion("COLLECTIONACCNO between", value1, value2, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnoNotBetween(String value1, String value2) {
            addCriterion("COLLECTIONACCNO not between", value1, value2, "collectionaccno");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameIsNull() {
            addCriterion("COLLECTIONACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameIsNotNull() {
            addCriterion("COLLECTIONACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameEqualTo(String value) {
            addCriterion("COLLECTIONACCNAME =", value, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameNotEqualTo(String value) {
            addCriterion("COLLECTIONACCNAME <>", value, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameGreaterThan(String value) {
            addCriterion("COLLECTIONACCNAME >", value, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTIONACCNAME >=", value, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameLessThan(String value) {
            addCriterion("COLLECTIONACCNAME <", value, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameLessThanOrEqualTo(String value) {
            addCriterion("COLLECTIONACCNAME <=", value, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameLike(String value) {
            addCriterion("COLLECTIONACCNAME like", value, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameNotLike(String value) {
            addCriterion("COLLECTIONACCNAME not like", value, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameIn(List<String> values) {
            addCriterion("COLLECTIONACCNAME in", values, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameNotIn(List<String> values) {
            addCriterion("COLLECTIONACCNAME not in", values, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameBetween(String value1, String value2) {
            addCriterion("COLLECTIONACCNAME between", value1, value2, "collectionaccname");
            return (Criteria) this;
        }

        public Criteria andCollectionaccnameNotBetween(String value1, String value2) {
            addCriterion("COLLECTIONACCNAME not between", value1, value2, "collectionaccname");
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

        public Criteria andCollecttypeIsNull() {
            addCriterion("COLLECTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCollecttypeIsNotNull() {
            addCriterion("COLLECTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCollecttypeEqualTo(String value) {
            addCriterion("COLLECTTYPE =", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeNotEqualTo(String value) {
            addCriterion("COLLECTTYPE <>", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeGreaterThan(String value) {
            addCriterion("COLLECTTYPE >", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTTYPE >=", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeLessThan(String value) {
            addCriterion("COLLECTTYPE <", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeLessThanOrEqualTo(String value) {
            addCriterion("COLLECTTYPE <=", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeLike(String value) {
            addCriterion("COLLECTTYPE like", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeNotLike(String value) {
            addCriterion("COLLECTTYPE not like", value, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeIn(List<String> values) {
            addCriterion("COLLECTTYPE in", values, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeNotIn(List<String> values) {
            addCriterion("COLLECTTYPE not in", values, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeBetween(String value1, String value2) {
            addCriterion("COLLECTTYPE between", value1, value2, "collecttype");
            return (Criteria) this;
        }

        public Criteria andCollecttypeNotBetween(String value1, String value2) {
            addCriterion("COLLECTTYPE not between", value1, value2, "collecttype");
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

        public Criteria andTrustoridIsNull() {
            addCriterion("TRUSTORID is null");
            return (Criteria) this;
        }

        public Criteria andTrustoridIsNotNull() {
            addCriterion("TRUSTORID is not null");
            return (Criteria) this;
        }

        public Criteria andTrustoridEqualTo(String value) {
            addCriterion("TRUSTORID =", value, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridNotEqualTo(String value) {
            addCriterion("TRUSTORID <>", value, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridGreaterThan(String value) {
            addCriterion("TRUSTORID >", value, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSTORID >=", value, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridLessThan(String value) {
            addCriterion("TRUSTORID <", value, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridLessThanOrEqualTo(String value) {
            addCriterion("TRUSTORID <=", value, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridLike(String value) {
            addCriterion("TRUSTORID like", value, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridNotLike(String value) {
            addCriterion("TRUSTORID not like", value, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridIn(List<String> values) {
            addCriterion("TRUSTORID in", values, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridNotIn(List<String> values) {
            addCriterion("TRUSTORID not in", values, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridBetween(String value1, String value2) {
            addCriterion("TRUSTORID between", value1, value2, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustoridNotBetween(String value1, String value2) {
            addCriterion("TRUSTORID not between", value1, value2, "trustorid");
            return (Criteria) this;
        }

        public Criteria andTrustornameIsNull() {
            addCriterion("TRUSTORNAME is null");
            return (Criteria) this;
        }

        public Criteria andTrustornameIsNotNull() {
            addCriterion("TRUSTORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTrustornameEqualTo(String value) {
            addCriterion("TRUSTORNAME =", value, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameNotEqualTo(String value) {
            addCriterion("TRUSTORNAME <>", value, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameGreaterThan(String value) {
            addCriterion("TRUSTORNAME >", value, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSTORNAME >=", value, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameLessThan(String value) {
            addCriterion("TRUSTORNAME <", value, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameLessThanOrEqualTo(String value) {
            addCriterion("TRUSTORNAME <=", value, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameLike(String value) {
            addCriterion("TRUSTORNAME like", value, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameNotLike(String value) {
            addCriterion("TRUSTORNAME not like", value, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameIn(List<String> values) {
            addCriterion("TRUSTORNAME in", values, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameNotIn(List<String> values) {
            addCriterion("TRUSTORNAME not in", values, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameBetween(String value1, String value2) {
            addCriterion("TRUSTORNAME between", value1, value2, "trustorname");
            return (Criteria) this;
        }

        public Criteria andTrustornameNotBetween(String value1, String value2) {
            addCriterion("TRUSTORNAME not between", value1, value2, "trustorname");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateIsNull() {
            addCriterion("CONTRIBUTIONNOTDATE is null");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateIsNotNull() {
            addCriterion("CONTRIBUTIONNOTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateEqualTo(String value) {
            addCriterion("CONTRIBUTIONNOTDATE =", value, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateNotEqualTo(String value) {
            addCriterion("CONTRIBUTIONNOTDATE <>", value, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateGreaterThan(String value) {
            addCriterion("CONTRIBUTIONNOTDATE >", value, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTIONNOTDATE >=", value, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateLessThan(String value) {
            addCriterion("CONTRIBUTIONNOTDATE <", value, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateLessThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTIONNOTDATE <=", value, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateLike(String value) {
            addCriterion("CONTRIBUTIONNOTDATE like", value, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateNotLike(String value) {
            addCriterion("CONTRIBUTIONNOTDATE not like", value, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateIn(List<String> values) {
            addCriterion("CONTRIBUTIONNOTDATE in", values, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateNotIn(List<String> values) {
            addCriterion("CONTRIBUTIONNOTDATE not in", values, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateBetween(String value1, String value2) {
            addCriterion("CONTRIBUTIONNOTDATE between", value1, value2, "contributionnotdate");
            return (Criteria) this;
        }

        public Criteria andContributionnotdateNotBetween(String value1, String value2) {
            addCriterion("CONTRIBUTIONNOTDATE not between", value1, value2, "contributionnotdate");
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

        public Criteria andCustodianIsNull() {
            addCriterion("CUSTODIAN is null");
            return (Criteria) this;
        }

        public Criteria andCustodianIsNotNull() {
            addCriterion("CUSTODIAN is not null");
            return (Criteria) this;
        }

        public Criteria andCustodianEqualTo(String value) {
            addCriterion("CUSTODIAN =", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianNotEqualTo(String value) {
            addCriterion("CUSTODIAN <>", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianGreaterThan(String value) {
            addCriterion("CUSTODIAN >", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTODIAN >=", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianLessThan(String value) {
            addCriterion("CUSTODIAN <", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianLessThanOrEqualTo(String value) {
            addCriterion("CUSTODIAN <=", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianLike(String value) {
            addCriterion("CUSTODIAN like", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianNotLike(String value) {
            addCriterion("CUSTODIAN not like", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianIn(List<String> values) {
            addCriterion("CUSTODIAN in", values, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianNotIn(List<String> values) {
            addCriterion("CUSTODIAN not in", values, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianBetween(String value1, String value2) {
            addCriterion("CUSTODIAN between", value1, value2, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianNotBetween(String value1, String value2) {
            addCriterion("CUSTODIAN not between", value1, value2, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidIsNull() {
            addCriterion("CUSTACCOUNTBANKID is null");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidIsNotNull() {
            addCriterion("CUSTACCOUNTBANKID is not null");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidEqualTo(String value) {
            addCriterion("CUSTACCOUNTBANKID =", value, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidNotEqualTo(String value) {
            addCriterion("CUSTACCOUNTBANKID <>", value, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidGreaterThan(String value) {
            addCriterion("CUSTACCOUNTBANKID >", value, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTBANKID >=", value, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidLessThan(String value) {
            addCriterion("CUSTACCOUNTBANKID <", value, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidLessThanOrEqualTo(String value) {
            addCriterion("CUSTACCOUNTBANKID <=", value, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidLike(String value) {
            addCriterion("CUSTACCOUNTBANKID like", value, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidNotLike(String value) {
            addCriterion("CUSTACCOUNTBANKID not like", value, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidIn(List<String> values) {
            addCriterion("CUSTACCOUNTBANKID in", values, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidNotIn(List<String> values) {
            addCriterion("CUSTACCOUNTBANKID not in", values, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTBANKID between", value1, value2, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andCustaccountbankidNotBetween(String value1, String value2) {
            addCriterion("CUSTACCOUNTBANKID not between", value1, value2, "custaccountbankid");
            return (Criteria) this;
        }

        public Criteria andPayserialIsNull() {
            addCriterion("PAYSERIAL is null");
            return (Criteria) this;
        }

        public Criteria andPayserialIsNotNull() {
            addCriterion("PAYSERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andPayserialEqualTo(String value) {
            addCriterion("PAYSERIAL =", value, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialNotEqualTo(String value) {
            addCriterion("PAYSERIAL <>", value, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialGreaterThan(String value) {
            addCriterion("PAYSERIAL >", value, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialGreaterThanOrEqualTo(String value) {
            addCriterion("PAYSERIAL >=", value, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialLessThan(String value) {
            addCriterion("PAYSERIAL <", value, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialLessThanOrEqualTo(String value) {
            addCriterion("PAYSERIAL <=", value, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialLike(String value) {
            addCriterion("PAYSERIAL like", value, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialNotLike(String value) {
            addCriterion("PAYSERIAL not like", value, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialIn(List<String> values) {
            addCriterion("PAYSERIAL in", values, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialNotIn(List<String> values) {
            addCriterion("PAYSERIAL not in", values, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialBetween(String value1, String value2) {
            addCriterion("PAYSERIAL between", value1, value2, "payserial");
            return (Criteria) this;
        }

        public Criteria andPayserialNotBetween(String value1, String value2) {
            addCriterion("PAYSERIAL not between", value1, value2, "payserial");
            return (Criteria) this;
        }

        public Criteria andContributiondateIsNull() {
            addCriterion("CONTRIBUTIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andContributiondateIsNotNull() {
            addCriterion("CONTRIBUTIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andContributiondateEqualTo(String value) {
            addCriterion("CONTRIBUTIONDATE =", value, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateNotEqualTo(String value) {
            addCriterion("CONTRIBUTIONDATE <>", value, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateGreaterThan(String value) {
            addCriterion("CONTRIBUTIONDATE >", value, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTIONDATE >=", value, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateLessThan(String value) {
            addCriterion("CONTRIBUTIONDATE <", value, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateLessThanOrEqualTo(String value) {
            addCriterion("CONTRIBUTIONDATE <=", value, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateLike(String value) {
            addCriterion("CONTRIBUTIONDATE like", value, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateNotLike(String value) {
            addCriterion("CONTRIBUTIONDATE not like", value, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateIn(List<String> values) {
            addCriterion("CONTRIBUTIONDATE in", values, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateNotIn(List<String> values) {
            addCriterion("CONTRIBUTIONDATE not in", values, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateBetween(String value1, String value2) {
            addCriterion("CONTRIBUTIONDATE between", value1, value2, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andContributiondateNotBetween(String value1, String value2) {
            addCriterion("CONTRIBUTIONDATE not between", value1, value2, "contributiondate");
            return (Criteria) this;
        }

        public Criteria andPaybankprovIsNull() {
            addCriterion("PAYBANKPROV is null");
            return (Criteria) this;
        }

        public Criteria andPaybankprovIsNotNull() {
            addCriterion("PAYBANKPROV is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankprovEqualTo(String value) {
            addCriterion("PAYBANKPROV =", value, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovNotEqualTo(String value) {
            addCriterion("PAYBANKPROV <>", value, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovGreaterThan(String value) {
            addCriterion("PAYBANKPROV >", value, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovGreaterThanOrEqualTo(String value) {
            addCriterion("PAYBANKPROV >=", value, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovLessThan(String value) {
            addCriterion("PAYBANKPROV <", value, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovLessThanOrEqualTo(String value) {
            addCriterion("PAYBANKPROV <=", value, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovLike(String value) {
            addCriterion("PAYBANKPROV like", value, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovNotLike(String value) {
            addCriterion("PAYBANKPROV not like", value, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovIn(List<String> values) {
            addCriterion("PAYBANKPROV in", values, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovNotIn(List<String> values) {
            addCriterion("PAYBANKPROV not in", values, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovBetween(String value1, String value2) {
            addCriterion("PAYBANKPROV between", value1, value2, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankprovNotBetween(String value1, String value2) {
            addCriterion("PAYBANKPROV not between", value1, value2, "paybankprov");
            return (Criteria) this;
        }

        public Criteria andPaybankcityIsNull() {
            addCriterion("PAYBANKCITY is null");
            return (Criteria) this;
        }

        public Criteria andPaybankcityIsNotNull() {
            addCriterion("PAYBANKCITY is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankcityEqualTo(String value) {
            addCriterion("PAYBANKCITY =", value, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityNotEqualTo(String value) {
            addCriterion("PAYBANKCITY <>", value, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityGreaterThan(String value) {
            addCriterion("PAYBANKCITY >", value, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityGreaterThanOrEqualTo(String value) {
            addCriterion("PAYBANKCITY >=", value, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityLessThan(String value) {
            addCriterion("PAYBANKCITY <", value, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityLessThanOrEqualTo(String value) {
            addCriterion("PAYBANKCITY <=", value, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityLike(String value) {
            addCriterion("PAYBANKCITY like", value, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityNotLike(String value) {
            addCriterion("PAYBANKCITY not like", value, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityIn(List<String> values) {
            addCriterion("PAYBANKCITY in", values, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityNotIn(List<String> values) {
            addCriterion("PAYBANKCITY not in", values, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityBetween(String value1, String value2) {
            addCriterion("PAYBANKCITY between", value1, value2, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankcityNotBetween(String value1, String value2) {
            addCriterion("PAYBANKCITY not between", value1, value2, "paybankcity");
            return (Criteria) this;
        }

        public Criteria andPaybankIsNull() {
            addCriterion("PAYBANK is null");
            return (Criteria) this;
        }

        public Criteria andPaybankIsNotNull() {
            addCriterion("PAYBANK is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankEqualTo(String value) {
            addCriterion("PAYBANK =", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotEqualTo(String value) {
            addCriterion("PAYBANK <>", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankGreaterThan(String value) {
            addCriterion("PAYBANK >", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankGreaterThanOrEqualTo(String value) {
            addCriterion("PAYBANK >=", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLessThan(String value) {
            addCriterion("PAYBANK <", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLessThanOrEqualTo(String value) {
            addCriterion("PAYBANK <=", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankLike(String value) {
            addCriterion("PAYBANK like", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotLike(String value) {
            addCriterion("PAYBANK not like", value, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankIn(List<String> values) {
            addCriterion("PAYBANK in", values, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotIn(List<String> values) {
            addCriterion("PAYBANK not in", values, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankBetween(String value1, String value2) {
            addCriterion("PAYBANK between", value1, value2, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankNotBetween(String value1, String value2) {
            addCriterion("PAYBANK not between", value1, value2, "paybank");
            return (Criteria) this;
        }

        public Criteria andPaybankidIsNull() {
            addCriterion("PAYBANKID is null");
            return (Criteria) this;
        }

        public Criteria andPaybankidIsNotNull() {
            addCriterion("PAYBANKID is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankidEqualTo(String value) {
            addCriterion("PAYBANKID =", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidNotEqualTo(String value) {
            addCriterion("PAYBANKID <>", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidGreaterThan(String value) {
            addCriterion("PAYBANKID >", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidGreaterThanOrEqualTo(String value) {
            addCriterion("PAYBANKID >=", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidLessThan(String value) {
            addCriterion("PAYBANKID <", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidLessThanOrEqualTo(String value) {
            addCriterion("PAYBANKID <=", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidLike(String value) {
            addCriterion("PAYBANKID like", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidNotLike(String value) {
            addCriterion("PAYBANKID not like", value, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidIn(List<String> values) {
            addCriterion("PAYBANKID in", values, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidNotIn(List<String> values) {
            addCriterion("PAYBANKID not in", values, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidBetween(String value1, String value2) {
            addCriterion("PAYBANKID between", value1, value2, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankidNotBetween(String value1, String value2) {
            addCriterion("PAYBANKID not between", value1, value2, "paybankid");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameIsNull() {
            addCriterion("PAYBANKACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameIsNotNull() {
            addCriterion("PAYBANKACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameEqualTo(String value) {
            addCriterion("PAYBANKACCNAME =", value, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameNotEqualTo(String value) {
            addCriterion("PAYBANKACCNAME <>", value, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameGreaterThan(String value) {
            addCriterion("PAYBANKACCNAME >", value, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYBANKACCNAME >=", value, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameLessThan(String value) {
            addCriterion("PAYBANKACCNAME <", value, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameLessThanOrEqualTo(String value) {
            addCriterion("PAYBANKACCNAME <=", value, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameLike(String value) {
            addCriterion("PAYBANKACCNAME like", value, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameNotLike(String value) {
            addCriterion("PAYBANKACCNAME not like", value, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameIn(List<String> values) {
            addCriterion("PAYBANKACCNAME in", values, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameNotIn(List<String> values) {
            addCriterion("PAYBANKACCNAME not in", values, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameBetween(String value1, String value2) {
            addCriterion("PAYBANKACCNAME between", value1, value2, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnameNotBetween(String value1, String value2) {
            addCriterion("PAYBANKACCNAME not between", value1, value2, "paybankaccname");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoIsNull() {
            addCriterion("PAYBANKACCNO is null");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoIsNotNull() {
            addCriterion("PAYBANKACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoEqualTo(String value) {
            addCriterion("PAYBANKACCNO =", value, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoNotEqualTo(String value) {
            addCriterion("PAYBANKACCNO <>", value, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoGreaterThan(String value) {
            addCriterion("PAYBANKACCNO >", value, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYBANKACCNO >=", value, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoLessThan(String value) {
            addCriterion("PAYBANKACCNO <", value, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoLessThanOrEqualTo(String value) {
            addCriterion("PAYBANKACCNO <=", value, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoLike(String value) {
            addCriterion("PAYBANKACCNO like", value, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoNotLike(String value) {
            addCriterion("PAYBANKACCNO not like", value, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoIn(List<String> values) {
            addCriterion("PAYBANKACCNO in", values, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoNotIn(List<String> values) {
            addCriterion("PAYBANKACCNO not in", values, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoBetween(String value1, String value2) {
            addCriterion("PAYBANKACCNO between", value1, value2, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andPaybankaccnoNotBetween(String value1, String value2) {
            addCriterion("PAYBANKACCNO not between", value1, value2, "paybankaccno");
            return (Criteria) this;
        }

        public Criteria andContributionIsNull() {
            addCriterion("CONTRIBUTION is null");
            return (Criteria) this;
        }

        public Criteria andContributionIsNotNull() {
            addCriterion("CONTRIBUTION is not null");
            return (Criteria) this;
        }

        public Criteria andContributionEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUTION =", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUTION <>", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionGreaterThan(BigDecimal value) {
            addCriterion("CONTRIBUTION >", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUTION >=", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionLessThan(BigDecimal value) {
            addCriterion("CONTRIBUTION <", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUTION <=", value, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionIn(List<BigDecimal> values) {
            addCriterion("CONTRIBUTION in", values, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotIn(List<BigDecimal> values) {
            addCriterion("CONTRIBUTION not in", values, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRIBUTION between", value1, value2, "contribution");
            return (Criteria) this;
        }

        public Criteria andContributionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRIBUTION not between", value1, value2, "contribution");
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