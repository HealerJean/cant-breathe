package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InvstOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvstOAVOCriteria() {
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

        public Criteria andPkInvstIsNull() {
            addCriterion("PK_INVST is null");
            return (Criteria) this;
        }

        public Criteria andPkInvstIsNotNull() {
            addCriterion("PK_INVST is not null");
            return (Criteria) this;
        }

        public Criteria andPkInvstEqualTo(String value) {
            addCriterion("PK_INVST =", value, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstNotEqualTo(String value) {
            addCriterion("PK_INVST <>", value, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstGreaterThan(String value) {
            addCriterion("PK_INVST >", value, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstGreaterThanOrEqualTo(String value) {
            addCriterion("PK_INVST >=", value, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstLessThan(String value) {
            addCriterion("PK_INVST <", value, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstLessThanOrEqualTo(String value) {
            addCriterion("PK_INVST <=", value, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstLike(String value) {
            addCriterion("PK_INVST like", value, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstNotLike(String value) {
            addCriterion("PK_INVST not like", value, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstIn(List<String> values) {
            addCriterion("PK_INVST in", values, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstNotIn(List<String> values) {
            addCriterion("PK_INVST not in", values, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstBetween(String value1, String value2) {
            addCriterion("PK_INVST between", value1, value2, "pkInvst");
            return (Criteria) this;
        }

        public Criteria andPkInvstNotBetween(String value1, String value2) {
            addCriterion("PK_INVST not between", value1, value2, "pkInvst");
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

        public Criteria andPortfolioidIsNull() {
            addCriterion("PORTFOLIOID is null");
            return (Criteria) this;
        }

        public Criteria andPortfolioidIsNotNull() {
            addCriterion("PORTFOLIOID is not null");
            return (Criteria) this;
        }

        public Criteria andPortfolioidEqualTo(String value) {
            addCriterion("PORTFOLIOID =", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidNotEqualTo(String value) {
            addCriterion("PORTFOLIOID <>", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidGreaterThan(String value) {
            addCriterion("PORTFOLIOID >", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidGreaterThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOID >=", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidLessThan(String value) {
            addCriterion("PORTFOLIOID <", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidLessThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOID <=", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidLike(String value) {
            addCriterion("PORTFOLIOID like", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidNotLike(String value) {
            addCriterion("PORTFOLIOID not like", value, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidIn(List<String> values) {
            addCriterion("PORTFOLIOID in", values, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidNotIn(List<String> values) {
            addCriterion("PORTFOLIOID not in", values, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidBetween(String value1, String value2) {
            addCriterion("PORTFOLIOID between", value1, value2, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andPortfolioidNotBetween(String value1, String value2) {
            addCriterion("PORTFOLIOID not between", value1, value2, "portfolioid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidIsNull() {
            addCriterion("INVESTMANTID is null");
            return (Criteria) this;
        }

        public Criteria andInvestmantidIsNotNull() {
            addCriterion("INVESTMANTID is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmantidEqualTo(String value) {
            addCriterion("INVESTMANTID =", value, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidNotEqualTo(String value) {
            addCriterion("INVESTMANTID <>", value, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidGreaterThan(String value) {
            addCriterion("INVESTMANTID >", value, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTMANTID >=", value, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidLessThan(String value) {
            addCriterion("INVESTMANTID <", value, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidLessThanOrEqualTo(String value) {
            addCriterion("INVESTMANTID <=", value, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidLike(String value) {
            addCriterion("INVESTMANTID like", value, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidNotLike(String value) {
            addCriterion("INVESTMANTID not like", value, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidIn(List<String> values) {
            addCriterion("INVESTMANTID in", values, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidNotIn(List<String> values) {
            addCriterion("INVESTMANTID not in", values, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidBetween(String value1, String value2) {
            addCriterion("INVESTMANTID between", value1, value2, "investmantid");
            return (Criteria) this;
        }

        public Criteria andInvestmantidNotBetween(String value1, String value2) {
            addCriterion("INVESTMANTID not between", value1, value2, "investmantid");
            return (Criteria) this;
        }

        public Criteria andPortfolionameIsNull() {
            addCriterion("PORTFOLIONAME is null");
            return (Criteria) this;
        }

        public Criteria andPortfolionameIsNotNull() {
            addCriterion("PORTFOLIONAME is not null");
            return (Criteria) this;
        }

        public Criteria andPortfolionameEqualTo(String value) {
            addCriterion("PORTFOLIONAME =", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameNotEqualTo(String value) {
            addCriterion("PORTFOLIONAME <>", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameGreaterThan(String value) {
            addCriterion("PORTFOLIONAME >", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameGreaterThanOrEqualTo(String value) {
            addCriterion("PORTFOLIONAME >=", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameLessThan(String value) {
            addCriterion("PORTFOLIONAME <", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameLessThanOrEqualTo(String value) {
            addCriterion("PORTFOLIONAME <=", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameLike(String value) {
            addCriterion("PORTFOLIONAME like", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameNotLike(String value) {
            addCriterion("PORTFOLIONAME not like", value, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameIn(List<String> values) {
            addCriterion("PORTFOLIONAME in", values, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameNotIn(List<String> values) {
            addCriterion("PORTFOLIONAME not in", values, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameBetween(String value1, String value2) {
            addCriterion("PORTFOLIONAME between", value1, value2, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andPortfolionameNotBetween(String value1, String value2) {
            addCriterion("PORTFOLIONAME not between", value1, value2, "portfolioname");
            return (Criteria) this;
        }

        public Criteria andDealingperiodIsNull() {
            addCriterion("DEALINGPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andDealingperiodIsNotNull() {
            addCriterion("DEALINGPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andDealingperiodEqualTo(String value) {
            addCriterion("DEALINGPERIOD =", value, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodNotEqualTo(String value) {
            addCriterion("DEALINGPERIOD <>", value, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodGreaterThan(String value) {
            addCriterion("DEALINGPERIOD >", value, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodGreaterThanOrEqualTo(String value) {
            addCriterion("DEALINGPERIOD >=", value, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodLessThan(String value) {
            addCriterion("DEALINGPERIOD <", value, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodLessThanOrEqualTo(String value) {
            addCriterion("DEALINGPERIOD <=", value, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodLike(String value) {
            addCriterion("DEALINGPERIOD like", value, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodNotLike(String value) {
            addCriterion("DEALINGPERIOD not like", value, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodIn(List<String> values) {
            addCriterion("DEALINGPERIOD in", values, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodNotIn(List<String> values) {
            addCriterion("DEALINGPERIOD not in", values, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodBetween(String value1, String value2) {
            addCriterion("DEALINGPERIOD between", value1, value2, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andDealingperiodNotBetween(String value1, String value2) {
            addCriterion("DEALINGPERIOD not between", value1, value2, "dealingperiod");
            return (Criteria) this;
        }

        public Criteria andRoundingIsNull() {
            addCriterion("ROUNDING is null");
            return (Criteria) this;
        }

        public Criteria andRoundingIsNotNull() {
            addCriterion("ROUNDING is not null");
            return (Criteria) this;
        }

        public Criteria andRoundingEqualTo(String value) {
            addCriterion("ROUNDING =", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingNotEqualTo(String value) {
            addCriterion("ROUNDING <>", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingGreaterThan(String value) {
            addCriterion("ROUNDING >", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingGreaterThanOrEqualTo(String value) {
            addCriterion("ROUNDING >=", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingLessThan(String value) {
            addCriterion("ROUNDING <", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingLessThanOrEqualTo(String value) {
            addCriterion("ROUNDING <=", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingLike(String value) {
            addCriterion("ROUNDING like", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingNotLike(String value) {
            addCriterion("ROUNDING not like", value, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingIn(List<String> values) {
            addCriterion("ROUNDING in", values, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingNotIn(List<String> values) {
            addCriterion("ROUNDING not in", values, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingBetween(String value1, String value2) {
            addCriterion("ROUNDING between", value1, value2, "rounding");
            return (Criteria) this;
        }

        public Criteria andRoundingNotBetween(String value1, String value2) {
            addCriterion("ROUNDING not between", value1, value2, "rounding");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateIsNull() {
            addCriterion("PORTFOLIOENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateIsNotNull() {
            addCriterion("PORTFOLIOENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateEqualTo(String value) {
            addCriterion("PORTFOLIOENDDATE =", value, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateNotEqualTo(String value) {
            addCriterion("PORTFOLIOENDDATE <>", value, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateGreaterThan(String value) {
            addCriterion("PORTFOLIOENDDATE >", value, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateGreaterThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOENDDATE >=", value, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateLessThan(String value) {
            addCriterion("PORTFOLIOENDDATE <", value, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateLessThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOENDDATE <=", value, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateLike(String value) {
            addCriterion("PORTFOLIOENDDATE like", value, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateNotLike(String value) {
            addCriterion("PORTFOLIOENDDATE not like", value, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateIn(List<String> values) {
            addCriterion("PORTFOLIOENDDATE in", values, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateNotIn(List<String> values) {
            addCriterion("PORTFOLIOENDDATE not in", values, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateBetween(String value1, String value2) {
            addCriterion("PORTFOLIOENDDATE between", value1, value2, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfolioenddateNotBetween(String value1, String value2) {
            addCriterion("PORTFOLIOENDDATE not between", value1, value2, "portfolioenddate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateIsNull() {
            addCriterion("PORTFOLIOBEGDATE is null");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateIsNotNull() {
            addCriterion("PORTFOLIOBEGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateEqualTo(String value) {
            addCriterion("PORTFOLIOBEGDATE =", value, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateNotEqualTo(String value) {
            addCriterion("PORTFOLIOBEGDATE <>", value, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateGreaterThan(String value) {
            addCriterion("PORTFOLIOBEGDATE >", value, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateGreaterThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOBEGDATE >=", value, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateLessThan(String value) {
            addCriterion("PORTFOLIOBEGDATE <", value, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateLessThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOBEGDATE <=", value, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateLike(String value) {
            addCriterion("PORTFOLIOBEGDATE like", value, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateNotLike(String value) {
            addCriterion("PORTFOLIOBEGDATE not like", value, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateIn(List<String> values) {
            addCriterion("PORTFOLIOBEGDATE in", values, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateNotIn(List<String> values) {
            addCriterion("PORTFOLIOBEGDATE not in", values, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateBetween(String value1, String value2) {
            addCriterion("PORTFOLIOBEGDATE between", value1, value2, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andPortfoliobegdateNotBetween(String value1, String value2) {
            addCriterion("PORTFOLIOBEGDATE not between", value1, value2, "portfoliobegdate");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerIsNull() {
            addCriterion("INVESTMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerIsNotNull() {
            addCriterion("INVESTMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerEqualTo(String value) {
            addCriterion("INVESTMANAGER =", value, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerNotEqualTo(String value) {
            addCriterion("INVESTMANAGER <>", value, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerGreaterThan(String value) {
            addCriterion("INVESTMANAGER >", value, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTMANAGER >=", value, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerLessThan(String value) {
            addCriterion("INVESTMANAGER <", value, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerLessThanOrEqualTo(String value) {
            addCriterion("INVESTMANAGER <=", value, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerLike(String value) {
            addCriterion("INVESTMANAGER like", value, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerNotLike(String value) {
            addCriterion("INVESTMANAGER not like", value, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerIn(List<String> values) {
            addCriterion("INVESTMANAGER in", values, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerNotIn(List<String> values) {
            addCriterion("INVESTMANAGER not in", values, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerBetween(String value1, String value2) {
            addCriterion("INVESTMANAGER between", value1, value2, "investmanager");
            return (Criteria) this;
        }

        public Criteria andInvestmanagerNotBetween(String value1, String value2) {
            addCriterion("INVESTMANAGER not between", value1, value2, "investmanager");
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

        public Criteria andRestrustaccnameIsNull() {
            addCriterion("RESTRUSTACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameIsNotNull() {
            addCriterion("RESTRUSTACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameEqualTo(String value) {
            addCriterion("RESTRUSTACCNAME =", value, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameNotEqualTo(String value) {
            addCriterion("RESTRUSTACCNAME <>", value, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameGreaterThan(String value) {
            addCriterion("RESTRUSTACCNAME >", value, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameGreaterThanOrEqualTo(String value) {
            addCriterion("RESTRUSTACCNAME >=", value, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameLessThan(String value) {
            addCriterion("RESTRUSTACCNAME <", value, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameLessThanOrEqualTo(String value) {
            addCriterion("RESTRUSTACCNAME <=", value, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameLike(String value) {
            addCriterion("RESTRUSTACCNAME like", value, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameNotLike(String value) {
            addCriterion("RESTRUSTACCNAME not like", value, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameIn(List<String> values) {
            addCriterion("RESTRUSTACCNAME in", values, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameNotIn(List<String> values) {
            addCriterion("RESTRUSTACCNAME not in", values, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameBetween(String value1, String value2) {
            addCriterion("RESTRUSTACCNAME between", value1, value2, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnameNotBetween(String value1, String value2) {
            addCriterion("RESTRUSTACCNAME not between", value1, value2, "restrustaccname");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoIsNull() {
            addCriterion("RESTRUSTACCNO is null");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoIsNotNull() {
            addCriterion("RESTRUSTACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoEqualTo(String value) {
            addCriterion("RESTRUSTACCNO =", value, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoNotEqualTo(String value) {
            addCriterion("RESTRUSTACCNO <>", value, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoGreaterThan(String value) {
            addCriterion("RESTRUSTACCNO >", value, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoGreaterThanOrEqualTo(String value) {
            addCriterion("RESTRUSTACCNO >=", value, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoLessThan(String value) {
            addCriterion("RESTRUSTACCNO <", value, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoLessThanOrEqualTo(String value) {
            addCriterion("RESTRUSTACCNO <=", value, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoLike(String value) {
            addCriterion("RESTRUSTACCNO like", value, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoNotLike(String value) {
            addCriterion("RESTRUSTACCNO not like", value, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoIn(List<String> values) {
            addCriterion("RESTRUSTACCNO in", values, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoNotIn(List<String> values) {
            addCriterion("RESTRUSTACCNO not in", values, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoBetween(String value1, String value2) {
            addCriterion("RESTRUSTACCNO between", value1, value2, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRestrustaccnoNotBetween(String value1, String value2) {
            addCriterion("RESTRUSTACCNO not between", value1, value2, "restrustaccno");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidIsNull() {
            addCriterion("RESCUSTACTBANKID is null");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidIsNotNull() {
            addCriterion("RESCUSTACTBANKID is not null");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidEqualTo(String value) {
            addCriterion("RESCUSTACTBANKID =", value, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidNotEqualTo(String value) {
            addCriterion("RESCUSTACTBANKID <>", value, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidGreaterThan(String value) {
            addCriterion("RESCUSTACTBANKID >", value, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidGreaterThanOrEqualTo(String value) {
            addCriterion("RESCUSTACTBANKID >=", value, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidLessThan(String value) {
            addCriterion("RESCUSTACTBANKID <", value, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidLessThanOrEqualTo(String value) {
            addCriterion("RESCUSTACTBANKID <=", value, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidLike(String value) {
            addCriterion("RESCUSTACTBANKID like", value, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidNotLike(String value) {
            addCriterion("RESCUSTACTBANKID not like", value, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidIn(List<String> values) {
            addCriterion("RESCUSTACTBANKID in", values, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidNotIn(List<String> values) {
            addCriterion("RESCUSTACTBANKID not in", values, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidBetween(String value1, String value2) {
            addCriterion("RESCUSTACTBANKID between", value1, value2, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustactbankidNotBetween(String value1, String value2) {
            addCriterion("RESCUSTACTBANKID not between", value1, value2, "rescustactbankid");
            return (Criteria) this;
        }

        public Criteria andRescustodianIsNull() {
            addCriterion("RESCUSTODIAN is null");
            return (Criteria) this;
        }

        public Criteria andRescustodianIsNotNull() {
            addCriterion("RESCUSTODIAN is not null");
            return (Criteria) this;
        }

        public Criteria andRescustodianEqualTo(String value) {
            addCriterion("RESCUSTODIAN =", value, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianNotEqualTo(String value) {
            addCriterion("RESCUSTODIAN <>", value, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianGreaterThan(String value) {
            addCriterion("RESCUSTODIAN >", value, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianGreaterThanOrEqualTo(String value) {
            addCriterion("RESCUSTODIAN >=", value, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianLessThan(String value) {
            addCriterion("RESCUSTODIAN <", value, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianLessThanOrEqualTo(String value) {
            addCriterion("RESCUSTODIAN <=", value, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianLike(String value) {
            addCriterion("RESCUSTODIAN like", value, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianNotLike(String value) {
            addCriterion("RESCUSTODIAN not like", value, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianIn(List<String> values) {
            addCriterion("RESCUSTODIAN in", values, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianNotIn(List<String> values) {
            addCriterion("RESCUSTODIAN not in", values, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianBetween(String value1, String value2) {
            addCriterion("RESCUSTODIAN between", value1, value2, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andRescustodianNotBetween(String value1, String value2) {
            addCriterion("RESCUSTODIAN not between", value1, value2, "rescustodian");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameIsNull() {
            addCriterion("TRUSTACCNAME is null");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameIsNotNull() {
            addCriterion("TRUSTACCNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameEqualTo(String value) {
            addCriterion("TRUSTACCNAME =", value, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameNotEqualTo(String value) {
            addCriterion("TRUSTACCNAME <>", value, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameGreaterThan(String value) {
            addCriterion("TRUSTACCNAME >", value, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSTACCNAME >=", value, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameLessThan(String value) {
            addCriterion("TRUSTACCNAME <", value, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameLessThanOrEqualTo(String value) {
            addCriterion("TRUSTACCNAME <=", value, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameLike(String value) {
            addCriterion("TRUSTACCNAME like", value, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameNotLike(String value) {
            addCriterion("TRUSTACCNAME not like", value, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameIn(List<String> values) {
            addCriterion("TRUSTACCNAME in", values, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameNotIn(List<String> values) {
            addCriterion("TRUSTACCNAME not in", values, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameBetween(String value1, String value2) {
            addCriterion("TRUSTACCNAME between", value1, value2, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnameNotBetween(String value1, String value2) {
            addCriterion("TRUSTACCNAME not between", value1, value2, "trustaccname");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoIsNull() {
            addCriterion("TRUSTACCNO is null");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoIsNotNull() {
            addCriterion("TRUSTACCNO is not null");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoEqualTo(String value) {
            addCriterion("TRUSTACCNO =", value, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoNotEqualTo(String value) {
            addCriterion("TRUSTACCNO <>", value, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoGreaterThan(String value) {
            addCriterion("TRUSTACCNO >", value, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSTACCNO >=", value, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoLessThan(String value) {
            addCriterion("TRUSTACCNO <", value, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoLessThanOrEqualTo(String value) {
            addCriterion("TRUSTACCNO <=", value, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoLike(String value) {
            addCriterion("TRUSTACCNO like", value, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoNotLike(String value) {
            addCriterion("TRUSTACCNO not like", value, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoIn(List<String> values) {
            addCriterion("TRUSTACCNO in", values, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoNotIn(List<String> values) {
            addCriterion("TRUSTACCNO not in", values, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoBetween(String value1, String value2) {
            addCriterion("TRUSTACCNO between", value1, value2, "trustaccno");
            return (Criteria) this;
        }

        public Criteria andTrustaccnoNotBetween(String value1, String value2) {
            addCriterion("TRUSTACCNO not between", value1, value2, "trustaccno");
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

        public Criteria andCustodianidIsNull() {
            addCriterion("CUSTODIANID is null");
            return (Criteria) this;
        }

        public Criteria andCustodianidIsNotNull() {
            addCriterion("CUSTODIANID is not null");
            return (Criteria) this;
        }

        public Criteria andCustodianidEqualTo(String value) {
            addCriterion("CUSTODIANID =", value, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidNotEqualTo(String value) {
            addCriterion("CUSTODIANID <>", value, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidGreaterThan(String value) {
            addCriterion("CUSTODIANID >", value, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTODIANID >=", value, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidLessThan(String value) {
            addCriterion("CUSTODIANID <", value, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidLessThanOrEqualTo(String value) {
            addCriterion("CUSTODIANID <=", value, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidLike(String value) {
            addCriterion("CUSTODIANID like", value, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidNotLike(String value) {
            addCriterion("CUSTODIANID not like", value, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidIn(List<String> values) {
            addCriterion("CUSTODIANID in", values, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidNotIn(List<String> values) {
            addCriterion("CUSTODIANID not in", values, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidBetween(String value1, String value2) {
            addCriterion("CUSTODIANID between", value1, value2, "custodianid");
            return (Criteria) this;
        }

        public Criteria andCustodianidNotBetween(String value1, String value2) {
            addCriterion("CUSTODIANID not between", value1, value2, "custodianid");
            return (Criteria) this;
        }

        public Criteria andDrawrateIsNull() {
            addCriterion("DRAWRATE is null");
            return (Criteria) this;
        }

        public Criteria andDrawrateIsNotNull() {
            addCriterion("DRAWRATE is not null");
            return (Criteria) this;
        }

        public Criteria andDrawrateEqualTo(BigDecimal value) {
            addCriterion("DRAWRATE =", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateNotEqualTo(BigDecimal value) {
            addCriterion("DRAWRATE <>", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateGreaterThan(BigDecimal value) {
            addCriterion("DRAWRATE >", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAWRATE >=", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateLessThan(BigDecimal value) {
            addCriterion("DRAWRATE <", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRAWRATE <=", value, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateIn(List<BigDecimal> values) {
            addCriterion("DRAWRATE in", values, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateNotIn(List<BigDecimal> values) {
            addCriterion("DRAWRATE not in", values, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAWRATE between", value1, value2, "drawrate");
            return (Criteria) this;
        }

        public Criteria andDrawrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRAWRATE not between", value1, value2, "drawrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateIsNull() {
            addCriterion("INVESTRATE is null");
            return (Criteria) this;
        }

        public Criteria andInvestrateIsNotNull() {
            addCriterion("INVESTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvestrateEqualTo(BigDecimal value) {
            addCriterion("INVESTRATE =", value, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateNotEqualTo(BigDecimal value) {
            addCriterion("INVESTRATE <>", value, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateGreaterThan(BigDecimal value) {
            addCriterion("INVESTRATE >", value, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTRATE >=", value, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateLessThan(BigDecimal value) {
            addCriterion("INVESTRATE <", value, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTRATE <=", value, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateIn(List<BigDecimal> values) {
            addCriterion("INVESTRATE in", values, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateNotIn(List<BigDecimal> values) {
            addCriterion("INVESTRATE not in", values, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTRATE between", value1, value2, "investrate");
            return (Criteria) this;
        }

        public Criteria andInvestrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTRATE not between", value1, value2, "investrate");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeIsNull() {
            addCriterion("CUSTODIANFEE is null");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeIsNotNull() {
            addCriterion("CUSTODIANFEE is not null");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeEqualTo(BigDecimal value) {
            addCriterion("CUSTODIANFEE =", value, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeNotEqualTo(BigDecimal value) {
            addCriterion("CUSTODIANFEE <>", value, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeGreaterThan(BigDecimal value) {
            addCriterion("CUSTODIANFEE >", value, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTODIANFEE >=", value, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeLessThan(BigDecimal value) {
            addCriterion("CUSTODIANFEE <", value, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTODIANFEE <=", value, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeIn(List<BigDecimal> values) {
            addCriterion("CUSTODIANFEE in", values, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeNotIn(List<BigDecimal> values) {
            addCriterion("CUSTODIANFEE not in", values, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTODIANFEE between", value1, value2, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTODIANFEE not between", value1, value2, "custodianfee");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateIsNull() {
            addCriterion("INVESTMENTRATE is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateIsNotNull() {
            addCriterion("INVESTMENTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateEqualTo(BigDecimal value) {
            addCriterion("INVESTMENTRATE =", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateNotEqualTo(BigDecimal value) {
            addCriterion("INVESTMENTRATE <>", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateGreaterThan(BigDecimal value) {
            addCriterion("INVESTMENTRATE >", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTMENTRATE >=", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateLessThan(BigDecimal value) {
            addCriterion("INVESTMENTRATE <", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTMENTRATE <=", value, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateIn(List<BigDecimal> values) {
            addCriterion("INVESTMENTRATE in", values, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateNotIn(List<BigDecimal> values) {
            addCriterion("INVESTMENTRATE not in", values, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTMENTRATE between", value1, value2, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andInvestmentrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTMENTRATE not between", value1, value2, "investmentrate");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeIsNull() {
            addCriterion("TRUSTEEFEE is null");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeIsNotNull() {
            addCriterion("TRUSTEEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeEqualTo(BigDecimal value) {
            addCriterion("TRUSTEEFEE =", value, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeNotEqualTo(BigDecimal value) {
            addCriterion("TRUSTEEFEE <>", value, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeGreaterThan(BigDecimal value) {
            addCriterion("TRUSTEEFEE >", value, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRUSTEEFEE >=", value, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeLessThan(BigDecimal value) {
            addCriterion("TRUSTEEFEE <", value, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRUSTEEFEE <=", value, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeIn(List<BigDecimal> values) {
            addCriterion("TRUSTEEFEE in", values, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeNotIn(List<BigDecimal> values) {
            addCriterion("TRUSTEEFEE not in", values, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRUSTEEFEE between", value1, value2, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andTrusteefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRUSTEEFEE not between", value1, value2, "trusteefee");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescIsNull() {
            addCriterion("CUSTODIANFEEDESC is null");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescIsNotNull() {
            addCriterion("CUSTODIANFEEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescEqualTo(String value) {
            addCriterion("CUSTODIANFEEDESC =", value, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescNotEqualTo(String value) {
            addCriterion("CUSTODIANFEEDESC <>", value, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescGreaterThan(String value) {
            addCriterion("CUSTODIANFEEDESC >", value, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTODIANFEEDESC >=", value, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescLessThan(String value) {
            addCriterion("CUSTODIANFEEDESC <", value, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescLessThanOrEqualTo(String value) {
            addCriterion("CUSTODIANFEEDESC <=", value, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescLike(String value) {
            addCriterion("CUSTODIANFEEDESC like", value, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescNotLike(String value) {
            addCriterion("CUSTODIANFEEDESC not like", value, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescIn(List<String> values) {
            addCriterion("CUSTODIANFEEDESC in", values, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescNotIn(List<String> values) {
            addCriterion("CUSTODIANFEEDESC not in", values, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescBetween(String value1, String value2) {
            addCriterion("CUSTODIANFEEDESC between", value1, value2, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andCustodianfeedescNotBetween(String value1, String value2) {
            addCriterion("CUSTODIANFEEDESC not between", value1, value2, "custodianfeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescIsNull() {
            addCriterion("TRUSTEEFEEDESC is null");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescIsNotNull() {
            addCriterion("TRUSTEEFEEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescEqualTo(String value) {
            addCriterion("TRUSTEEFEEDESC =", value, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescNotEqualTo(String value) {
            addCriterion("TRUSTEEFEEDESC <>", value, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescGreaterThan(String value) {
            addCriterion("TRUSTEEFEEDESC >", value, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSTEEFEEDESC >=", value, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescLessThan(String value) {
            addCriterion("TRUSTEEFEEDESC <", value, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescLessThanOrEqualTo(String value) {
            addCriterion("TRUSTEEFEEDESC <=", value, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescLike(String value) {
            addCriterion("TRUSTEEFEEDESC like", value, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescNotLike(String value) {
            addCriterion("TRUSTEEFEEDESC not like", value, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescIn(List<String> values) {
            addCriterion("TRUSTEEFEEDESC in", values, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescNotIn(List<String> values) {
            addCriterion("TRUSTEEFEEDESC not in", values, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescBetween(String value1, String value2) {
            addCriterion("TRUSTEEFEEDESC between", value1, value2, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andTrusteefeedescNotBetween(String value1, String value2) {
            addCriterion("TRUSTEEFEEDESC not between", value1, value2, "trusteefeedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescIsNull() {
            addCriterion("INVESTRATEDESC is null");
            return (Criteria) this;
        }

        public Criteria andInvestratedescIsNotNull() {
            addCriterion("INVESTRATEDESC is not null");
            return (Criteria) this;
        }

        public Criteria andInvestratedescEqualTo(String value) {
            addCriterion("INVESTRATEDESC =", value, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescNotEqualTo(String value) {
            addCriterion("INVESTRATEDESC <>", value, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescGreaterThan(String value) {
            addCriterion("INVESTRATEDESC >", value, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTRATEDESC >=", value, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescLessThan(String value) {
            addCriterion("INVESTRATEDESC <", value, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescLessThanOrEqualTo(String value) {
            addCriterion("INVESTRATEDESC <=", value, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescLike(String value) {
            addCriterion("INVESTRATEDESC like", value, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescNotLike(String value) {
            addCriterion("INVESTRATEDESC not like", value, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescIn(List<String> values) {
            addCriterion("INVESTRATEDESC in", values, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescNotIn(List<String> values) {
            addCriterion("INVESTRATEDESC not in", values, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescBetween(String value1, String value2) {
            addCriterion("INVESTRATEDESC between", value1, value2, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andInvestratedescNotBetween(String value1, String value2) {
            addCriterion("INVESTRATEDESC not between", value1, value2, "investratedesc");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeIsNull() {
            addCriterion("PORTFOLIOTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeIsNotNull() {
            addCriterion("PORTFOLIOTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeEqualTo(String value) {
            addCriterion("PORTFOLIOTYPE =", value, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeNotEqualTo(String value) {
            addCriterion("PORTFOLIOTYPE <>", value, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeGreaterThan(String value) {
            addCriterion("PORTFOLIOTYPE >", value, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeGreaterThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOTYPE >=", value, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeLessThan(String value) {
            addCriterion("PORTFOLIOTYPE <", value, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeLessThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOTYPE <=", value, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeLike(String value) {
            addCriterion("PORTFOLIOTYPE like", value, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeNotLike(String value) {
            addCriterion("PORTFOLIOTYPE not like", value, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeIn(List<String> values) {
            addCriterion("PORTFOLIOTYPE in", values, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeNotIn(List<String> values) {
            addCriterion("PORTFOLIOTYPE not in", values, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeBetween(String value1, String value2) {
            addCriterion("PORTFOLIOTYPE between", value1, value2, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andPortfoliotypeNotBetween(String value1, String value2) {
            addCriterion("PORTFOLIOTYPE not between", value1, value2, "portfoliotype");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerIsNull() {
            addCriterion("FIXINCMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerIsNotNull() {
            addCriterion("FIXINCMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerEqualTo(String value) {
            addCriterion("FIXINCMANAGER =", value, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerNotEqualTo(String value) {
            addCriterion("FIXINCMANAGER <>", value, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerGreaterThan(String value) {
            addCriterion("FIXINCMANAGER >", value, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("FIXINCMANAGER >=", value, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerLessThan(String value) {
            addCriterion("FIXINCMANAGER <", value, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerLessThanOrEqualTo(String value) {
            addCriterion("FIXINCMANAGER <=", value, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerLike(String value) {
            addCriterion("FIXINCMANAGER like", value, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerNotLike(String value) {
            addCriterion("FIXINCMANAGER not like", value, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerIn(List<String> values) {
            addCriterion("FIXINCMANAGER in", values, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerNotIn(List<String> values) {
            addCriterion("FIXINCMANAGER not in", values, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerBetween(String value1, String value2) {
            addCriterion("FIXINCMANAGER between", value1, value2, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andFixincmanagerNotBetween(String value1, String value2) {
            addCriterion("FIXINCMANAGER not between", value1, value2, "fixincmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerIsNull() {
            addCriterion("STOCKMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andStockmanagerIsNotNull() {
            addCriterion("STOCKMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andStockmanagerEqualTo(String value) {
            addCriterion("STOCKMANAGER =", value, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerNotEqualTo(String value) {
            addCriterion("STOCKMANAGER <>", value, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerGreaterThan(String value) {
            addCriterion("STOCKMANAGER >", value, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("STOCKMANAGER >=", value, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerLessThan(String value) {
            addCriterion("STOCKMANAGER <", value, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerLessThanOrEqualTo(String value) {
            addCriterion("STOCKMANAGER <=", value, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerLike(String value) {
            addCriterion("STOCKMANAGER like", value, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerNotLike(String value) {
            addCriterion("STOCKMANAGER not like", value, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerIn(List<String> values) {
            addCriterion("STOCKMANAGER in", values, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerNotIn(List<String> values) {
            addCriterion("STOCKMANAGER not in", values, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerBetween(String value1, String value2) {
            addCriterion("STOCKMANAGER between", value1, value2, "stockmanager");
            return (Criteria) this;
        }

        public Criteria andStockmanagerNotBetween(String value1, String value2) {
            addCriterion("STOCKMANAGER not between", value1, value2, "stockmanager");
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

        public Criteria andFirstpricedateIsNull() {
            addCriterion("FIRSTPRICEDATE is null");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateIsNotNull() {
            addCriterion("FIRSTPRICEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateEqualTo(String value) {
            addCriterion("FIRSTPRICEDATE =", value, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateNotEqualTo(String value) {
            addCriterion("FIRSTPRICEDATE <>", value, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateGreaterThan(String value) {
            addCriterion("FIRSTPRICEDATE >", value, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTPRICEDATE >=", value, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateLessThan(String value) {
            addCriterion("FIRSTPRICEDATE <", value, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateLessThanOrEqualTo(String value) {
            addCriterion("FIRSTPRICEDATE <=", value, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateLike(String value) {
            addCriterion("FIRSTPRICEDATE like", value, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateNotLike(String value) {
            addCriterion("FIRSTPRICEDATE not like", value, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateIn(List<String> values) {
            addCriterion("FIRSTPRICEDATE in", values, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateNotIn(List<String> values) {
            addCriterion("FIRSTPRICEDATE not in", values, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateBetween(String value1, String value2) {
            addCriterion("FIRSTPRICEDATE between", value1, value2, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andFirstpricedateNotBetween(String value1, String value2) {
            addCriterion("FIRSTPRICEDATE not between", value1, value2, "firstpricedate");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatIsNull() {
            addCriterion("PORTFOLIOSTAT is null");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatIsNotNull() {
            addCriterion("PORTFOLIOSTAT is not null");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatEqualTo(String value) {
            addCriterion("PORTFOLIOSTAT =", value, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatNotEqualTo(String value) {
            addCriterion("PORTFOLIOSTAT <>", value, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatGreaterThan(String value) {
            addCriterion("PORTFOLIOSTAT >", value, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatGreaterThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOSTAT >=", value, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatLessThan(String value) {
            addCriterion("PORTFOLIOSTAT <", value, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatLessThanOrEqualTo(String value) {
            addCriterion("PORTFOLIOSTAT <=", value, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatLike(String value) {
            addCriterion("PORTFOLIOSTAT like", value, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatNotLike(String value) {
            addCriterion("PORTFOLIOSTAT not like", value, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatIn(List<String> values) {
            addCriterion("PORTFOLIOSTAT in", values, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatNotIn(List<String> values) {
            addCriterion("PORTFOLIOSTAT not in", values, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatBetween(String value1, String value2) {
            addCriterion("PORTFOLIOSTAT between", value1, value2, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliostatNotBetween(String value1, String value2) {
            addCriterion("PORTFOLIOSTAT not between", value1, value2, "portfoliostat");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceIsNull() {
            addCriterion("PORTFOLIOORIPRICE is null");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceIsNotNull() {
            addCriterion("PORTFOLIOORIPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOORIPRICE =", value, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceNotEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOORIPRICE <>", value, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceGreaterThan(BigDecimal value) {
            addCriterion("PORTFOLIOORIPRICE >", value, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOORIPRICE >=", value, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceLessThan(BigDecimal value) {
            addCriterion("PORTFOLIOORIPRICE <", value, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PORTFOLIOORIPRICE <=", value, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceIn(List<BigDecimal> values) {
            addCriterion("PORTFOLIOORIPRICE in", values, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceNotIn(List<BigDecimal> values) {
            addCriterion("PORTFOLIOORIPRICE not in", values, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTFOLIOORIPRICE between", value1, value2, "portfoliooriprice");
            return (Criteria) this;
        }

        public Criteria andPortfoliooripriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PORTFOLIOORIPRICE not between", value1, value2, "portfoliooriprice");
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