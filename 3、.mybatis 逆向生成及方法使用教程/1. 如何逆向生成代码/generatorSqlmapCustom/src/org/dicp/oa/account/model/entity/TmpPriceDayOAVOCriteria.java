package org.dicp.oa.account.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TmpPriceDayOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmpPriceDayOAVOCriteria() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPkPricedayIsNull() {
            addCriterion("PK_PRICEDAY is null");
            return (Criteria) this;
        }

        public Criteria andPkPricedayIsNotNull() {
            addCriterion("PK_PRICEDAY is not null");
            return (Criteria) this;
        }

        public Criteria andPkPricedayEqualTo(String value) {
            addCriterion("PK_PRICEDAY =", value, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayNotEqualTo(String value) {
            addCriterion("PK_PRICEDAY <>", value, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayGreaterThan(String value) {
            addCriterion("PK_PRICEDAY >", value, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PRICEDAY >=", value, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayLessThan(String value) {
            addCriterion("PK_PRICEDAY <", value, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayLessThanOrEqualTo(String value) {
            addCriterion("PK_PRICEDAY <=", value, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayLike(String value) {
            addCriterion("PK_PRICEDAY like", value, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayNotLike(String value) {
            addCriterion("PK_PRICEDAY not like", value, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayIn(List<String> values) {
            addCriterion("PK_PRICEDAY in", values, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayNotIn(List<String> values) {
            addCriterion("PK_PRICEDAY not in", values, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayBetween(String value1, String value2) {
            addCriterion("PK_PRICEDAY between", value1, value2, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPricedayNotBetween(String value1, String value2) {
            addCriterion("PK_PRICEDAY not between", value1, value2, "pkPriceday");
            return (Criteria) this;
        }

        public Criteria andPkPlanIsNull() {
            addCriterion("PK_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andPkPlanIsNotNull() {
            addCriterion("PK_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andPkPlanEqualTo(String value) {
            addCriterion("PK_PLAN =", value, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanNotEqualTo(String value) {
            addCriterion("PK_PLAN <>", value, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanGreaterThan(String value) {
            addCriterion("PK_PLAN >", value, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PLAN >=", value, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanLessThan(String value) {
            addCriterion("PK_PLAN <", value, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanLessThanOrEqualTo(String value) {
            addCriterion("PK_PLAN <=", value, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanLike(String value) {
            addCriterion("PK_PLAN like", value, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanNotLike(String value) {
            addCriterion("PK_PLAN not like", value, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanIn(List<String> values) {
            addCriterion("PK_PLAN in", values, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanNotIn(List<String> values) {
            addCriterion("PK_PLAN not in", values, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanBetween(String value1, String value2) {
            addCriterion("PK_PLAN between", value1, value2, "pkPlan");
            return (Criteria) this;
        }

        public Criteria andPkPlanNotBetween(String value1, String value2) {
            addCriterion("PK_PLAN not between", value1, value2, "pkPlan");
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

        public Criteria andPriceyearIsNull() {
            addCriterion("PRICEYEAR is null");
            return (Criteria) this;
        }

        public Criteria andPriceyearIsNotNull() {
            addCriterion("PRICEYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andPriceyearEqualTo(String value) {
            addCriterion("PRICEYEAR =", value, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearNotEqualTo(String value) {
            addCriterion("PRICEYEAR <>", value, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearGreaterThan(String value) {
            addCriterion("PRICEYEAR >", value, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearGreaterThanOrEqualTo(String value) {
            addCriterion("PRICEYEAR >=", value, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearLessThan(String value) {
            addCriterion("PRICEYEAR <", value, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearLessThanOrEqualTo(String value) {
            addCriterion("PRICEYEAR <=", value, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearLike(String value) {
            addCriterion("PRICEYEAR like", value, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearNotLike(String value) {
            addCriterion("PRICEYEAR not like", value, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearIn(List<String> values) {
            addCriterion("PRICEYEAR in", values, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearNotIn(List<String> values) {
            addCriterion("PRICEYEAR not in", values, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearBetween(String value1, String value2) {
            addCriterion("PRICEYEAR between", value1, value2, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPriceyearNotBetween(String value1, String value2) {
            addCriterion("PRICEYEAR not between", value1, value2, "priceyear");
            return (Criteria) this;
        }

        public Criteria andPricedateIsNull() {
            addCriterion("PRICEDATE is null");
            return (Criteria) this;
        }

        public Criteria andPricedateIsNotNull() {
            addCriterion("PRICEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPricedateEqualTo(Date value) {
            addCriterionForJDBCDate("PRICEDATE =", value, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PRICEDATE <>", value, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateGreaterThan(Date value) {
            addCriterionForJDBCDate("PRICEDATE >", value, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRICEDATE >=", value, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateLessThan(Date value) {
            addCriterionForJDBCDate("PRICEDATE <", value, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PRICEDATE <=", value, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateIn(List<Date> values) {
            addCriterionForJDBCDate("PRICEDATE in", values, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PRICEDATE not in", values, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRICEDATE between", value1, value2, "pricedate");
            return (Criteria) this;
        }

        public Criteria andPricedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PRICEDATE not between", value1, value2, "pricedate");
            return (Criteria) this;
        }

        public Criteria andLastupddateIsNull() {
            addCriterion("LASTUPDDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastupddateIsNotNull() {
            addCriterion("LASTUPDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastupddateEqualTo(String value) {
            addCriterion("LASTUPDDATE =", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotEqualTo(String value) {
            addCriterion("LASTUPDDATE <>", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateGreaterThan(String value) {
            addCriterion("LASTUPDDATE >", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateGreaterThanOrEqualTo(String value) {
            addCriterion("LASTUPDDATE >=", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateLessThan(String value) {
            addCriterion("LASTUPDDATE <", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateLessThanOrEqualTo(String value) {
            addCriterion("LASTUPDDATE <=", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateLike(String value) {
            addCriterion("LASTUPDDATE like", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotLike(String value) {
            addCriterion("LASTUPDDATE not like", value, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateIn(List<String> values) {
            addCriterion("LASTUPDDATE in", values, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotIn(List<String> values) {
            addCriterion("LASTUPDDATE not in", values, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateBetween(String value1, String value2) {
            addCriterion("LASTUPDDATE between", value1, value2, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andLastupddateNotBetween(String value1, String value2) {
            addCriterion("LASTUPDDATE not between", value1, value2, "lastupddate");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
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