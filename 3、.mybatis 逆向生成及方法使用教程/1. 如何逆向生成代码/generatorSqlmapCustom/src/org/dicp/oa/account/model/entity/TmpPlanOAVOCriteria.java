package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TmpPlanOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TmpPlanOAVOCriteria() {
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

        public Criteria andPlanlicdateIsNull() {
            addCriterion("PLANLICDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateIsNotNull() {
            addCriterion("PLANLICDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateEqualTo(String value) {
            addCriterion("PLANLICDATE =", value, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateNotEqualTo(String value) {
            addCriterion("PLANLICDATE <>", value, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateGreaterThan(String value) {
            addCriterion("PLANLICDATE >", value, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateGreaterThanOrEqualTo(String value) {
            addCriterion("PLANLICDATE >=", value, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateLessThan(String value) {
            addCriterion("PLANLICDATE <", value, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateLessThanOrEqualTo(String value) {
            addCriterion("PLANLICDATE <=", value, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateLike(String value) {
            addCriterion("PLANLICDATE like", value, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateNotLike(String value) {
            addCriterion("PLANLICDATE not like", value, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateIn(List<String> values) {
            addCriterion("PLANLICDATE in", values, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateNotIn(List<String> values) {
            addCriterion("PLANLICDATE not in", values, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateBetween(String value1, String value2) {
            addCriterion("PLANLICDATE between", value1, value2, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanlicdateNotBetween(String value1, String value2) {
            addCriterion("PLANLICDATE not between", value1, value2, "planlicdate");
            return (Criteria) this;
        }

        public Criteria andPlanattIsNull() {
            addCriterion("PLANATT is null");
            return (Criteria) this;
        }

        public Criteria andPlanattIsNotNull() {
            addCriterion("PLANATT is not null");
            return (Criteria) this;
        }

        public Criteria andPlanattEqualTo(String value) {
            addCriterion("PLANATT =", value, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattNotEqualTo(String value) {
            addCriterion("PLANATT <>", value, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattGreaterThan(String value) {
            addCriterion("PLANATT >", value, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattGreaterThanOrEqualTo(String value) {
            addCriterion("PLANATT >=", value, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattLessThan(String value) {
            addCriterion("PLANATT <", value, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattLessThanOrEqualTo(String value) {
            addCriterion("PLANATT <=", value, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattLike(String value) {
            addCriterion("PLANATT like", value, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattNotLike(String value) {
            addCriterion("PLANATT not like", value, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattIn(List<String> values) {
            addCriterion("PLANATT in", values, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattNotIn(List<String> values) {
            addCriterion("PLANATT not in", values, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattBetween(String value1, String value2) {
            addCriterion("PLANATT between", value1, value2, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlanattNotBetween(String value1, String value2) {
            addCriterion("PLANATT not between", value1, value2, "planatt");
            return (Criteria) this;
        }

        public Criteria andPlantypeIsNull() {
            addCriterion("PLANTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPlantypeIsNotNull() {
            addCriterion("PLANTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPlantypeEqualTo(String value) {
            addCriterion("PLANTYPE =", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeNotEqualTo(String value) {
            addCriterion("PLANTYPE <>", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeGreaterThan(String value) {
            addCriterion("PLANTYPE >", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeGreaterThanOrEqualTo(String value) {
            addCriterion("PLANTYPE >=", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeLessThan(String value) {
            addCriterion("PLANTYPE <", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeLessThanOrEqualTo(String value) {
            addCriterion("PLANTYPE <=", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeLike(String value) {
            addCriterion("PLANTYPE like", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeNotLike(String value) {
            addCriterion("PLANTYPE not like", value, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeIn(List<String> values) {
            addCriterion("PLANTYPE in", values, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeNotIn(List<String> values) {
            addCriterion("PLANTYPE not in", values, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeBetween(String value1, String value2) {
            addCriterion("PLANTYPE between", value1, value2, "plantype");
            return (Criteria) this;
        }

        public Criteria andPlantypeNotBetween(String value1, String value2) {
            addCriterion("PLANTYPE not between", value1, value2, "plantype");
            return (Criteria) this;
        }

        public Criteria andTrustconnoIsNull() {
            addCriterion("TRUSTCONNO is null");
            return (Criteria) this;
        }

        public Criteria andTrustconnoIsNotNull() {
            addCriterion("TRUSTCONNO is not null");
            return (Criteria) this;
        }

        public Criteria andTrustconnoEqualTo(String value) {
            addCriterion("TRUSTCONNO =", value, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoNotEqualTo(String value) {
            addCriterion("TRUSTCONNO <>", value, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoGreaterThan(String value) {
            addCriterion("TRUSTCONNO >", value, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSTCONNO >=", value, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoLessThan(String value) {
            addCriterion("TRUSTCONNO <", value, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoLessThanOrEqualTo(String value) {
            addCriterion("TRUSTCONNO <=", value, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoLike(String value) {
            addCriterion("TRUSTCONNO like", value, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoNotLike(String value) {
            addCriterion("TRUSTCONNO not like", value, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoIn(List<String> values) {
            addCriterion("TRUSTCONNO in", values, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoNotIn(List<String> values) {
            addCriterion("TRUSTCONNO not in", values, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoBetween(String value1, String value2) {
            addCriterion("TRUSTCONNO between", value1, value2, "trustconno");
            return (Criteria) this;
        }

        public Criteria andTrustconnoNotBetween(String value1, String value2) {
            addCriterion("TRUSTCONNO not between", value1, value2, "trustconno");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateIsNull() {
            addCriterion("PLANBEGDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateIsNotNull() {
            addCriterion("PLANBEGDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateEqualTo(String value) {
            addCriterion("PLANBEGDATE =", value, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateNotEqualTo(String value) {
            addCriterion("PLANBEGDATE <>", value, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateGreaterThan(String value) {
            addCriterion("PLANBEGDATE >", value, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateGreaterThanOrEqualTo(String value) {
            addCriterion("PLANBEGDATE >=", value, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateLessThan(String value) {
            addCriterion("PLANBEGDATE <", value, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateLessThanOrEqualTo(String value) {
            addCriterion("PLANBEGDATE <=", value, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateLike(String value) {
            addCriterion("PLANBEGDATE like", value, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateNotLike(String value) {
            addCriterion("PLANBEGDATE not like", value, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateIn(List<String> values) {
            addCriterion("PLANBEGDATE in", values, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateNotIn(List<String> values) {
            addCriterion("PLANBEGDATE not in", values, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateBetween(String value1, String value2) {
            addCriterion("PLANBEGDATE between", value1, value2, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanbegdateNotBetween(String value1, String value2) {
            addCriterion("PLANBEGDATE not between", value1, value2, "planbegdate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIsNull() {
            addCriterion("PLANENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIsNotNull() {
            addCriterion("PLANENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanenddateEqualTo(String value) {
            addCriterion("PLANENDDATE =", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotEqualTo(String value) {
            addCriterion("PLANENDDATE <>", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateGreaterThan(String value) {
            addCriterion("PLANENDDATE >", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateGreaterThanOrEqualTo(String value) {
            addCriterion("PLANENDDATE >=", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateLessThan(String value) {
            addCriterion("PLANENDDATE <", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateLessThanOrEqualTo(String value) {
            addCriterion("PLANENDDATE <=", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateLike(String value) {
            addCriterion("PLANENDDATE like", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotLike(String value) {
            addCriterion("PLANENDDATE not like", value, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateIn(List<String> values) {
            addCriterion("PLANENDDATE in", values, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotIn(List<String> values) {
            addCriterion("PLANENDDATE not in", values, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateBetween(String value1, String value2) {
            addCriterion("PLANENDDATE between", value1, value2, "planenddate");
            return (Criteria) this;
        }

        public Criteria andPlanenddateNotBetween(String value1, String value2) {
            addCriterion("PLANENDDATE not between", value1, value2, "planenddate");
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

        public Criteria andUnifiedcustodianidIsNull() {
            addCriterion("UNIFIEDCUSTODIANID is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidIsNotNull() {
            addCriterion("UNIFIEDCUSTODIANID is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidEqualTo(String value) {
            addCriterion("UNIFIEDCUSTODIANID =", value, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidNotEqualTo(String value) {
            addCriterion("UNIFIEDCUSTODIANID <>", value, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidGreaterThan(String value) {
            addCriterion("UNIFIEDCUSTODIANID >", value, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIEDCUSTODIANID >=", value, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidLessThan(String value) {
            addCriterion("UNIFIEDCUSTODIANID <", value, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidLessThanOrEqualTo(String value) {
            addCriterion("UNIFIEDCUSTODIANID <=", value, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidLike(String value) {
            addCriterion("UNIFIEDCUSTODIANID like", value, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidNotLike(String value) {
            addCriterion("UNIFIEDCUSTODIANID not like", value, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidIn(List<String> values) {
            addCriterion("UNIFIEDCUSTODIANID in", values, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidNotIn(List<String> values) {
            addCriterion("UNIFIEDCUSTODIANID not in", values, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidBetween(String value1, String value2) {
            addCriterion("UNIFIEDCUSTODIANID between", value1, value2, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedcustodianidNotBetween(String value1, String value2) {
            addCriterion("UNIFIEDCUSTODIANID not between", value1, value2, "unifiedcustodianid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidIsNull() {
            addCriterion("UNIFIEDTRUSTEEID is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidIsNotNull() {
            addCriterion("UNIFIEDTRUSTEEID is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidEqualTo(String value) {
            addCriterion("UNIFIEDTRUSTEEID =", value, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidNotEqualTo(String value) {
            addCriterion("UNIFIEDTRUSTEEID <>", value, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidGreaterThan(String value) {
            addCriterion("UNIFIEDTRUSTEEID >", value, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIEDTRUSTEEID >=", value, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidLessThan(String value) {
            addCriterion("UNIFIEDTRUSTEEID <", value, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidLessThanOrEqualTo(String value) {
            addCriterion("UNIFIEDTRUSTEEID <=", value, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidLike(String value) {
            addCriterion("UNIFIEDTRUSTEEID like", value, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidNotLike(String value) {
            addCriterion("UNIFIEDTRUSTEEID not like", value, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidIn(List<String> values) {
            addCriterion("UNIFIEDTRUSTEEID in", values, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidNotIn(List<String> values) {
            addCriterion("UNIFIEDTRUSTEEID not in", values, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidBetween(String value1, String value2) {
            addCriterion("UNIFIEDTRUSTEEID between", value1, value2, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedtrusteeidNotBetween(String value1, String value2) {
            addCriterion("UNIFIEDTRUSTEEID not between", value1, value2, "unifiedtrusteeid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameIsNull() {
            addCriterion("UNIFIEDPLANNAME is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameIsNotNull() {
            addCriterion("UNIFIEDPLANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameEqualTo(String value) {
            addCriterion("UNIFIEDPLANNAME =", value, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameNotEqualTo(String value) {
            addCriterion("UNIFIEDPLANNAME <>", value, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameGreaterThan(String value) {
            addCriterion("UNIFIEDPLANNAME >", value, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIEDPLANNAME >=", value, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameLessThan(String value) {
            addCriterion("UNIFIEDPLANNAME <", value, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameLessThanOrEqualTo(String value) {
            addCriterion("UNIFIEDPLANNAME <=", value, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameLike(String value) {
            addCriterion("UNIFIEDPLANNAME like", value, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameNotLike(String value) {
            addCriterion("UNIFIEDPLANNAME not like", value, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameIn(List<String> values) {
            addCriterion("UNIFIEDPLANNAME in", values, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameNotIn(List<String> values) {
            addCriterion("UNIFIEDPLANNAME not in", values, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameBetween(String value1, String value2) {
            addCriterion("UNIFIEDPLANNAME between", value1, value2, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplannameNotBetween(String value1, String value2) {
            addCriterion("UNIFIEDPLANNAME not between", value1, value2, "unifiedplanname");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidIsNull() {
            addCriterion("UNIFIEDPLANLICID is null");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidIsNotNull() {
            addCriterion("UNIFIEDPLANLICID is not null");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidEqualTo(String value) {
            addCriterion("UNIFIEDPLANLICID =", value, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidNotEqualTo(String value) {
            addCriterion("UNIFIEDPLANLICID <>", value, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidGreaterThan(String value) {
            addCriterion("UNIFIEDPLANLICID >", value, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidGreaterThanOrEqualTo(String value) {
            addCriterion("UNIFIEDPLANLICID >=", value, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidLessThan(String value) {
            addCriterion("UNIFIEDPLANLICID <", value, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidLessThanOrEqualTo(String value) {
            addCriterion("UNIFIEDPLANLICID <=", value, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidLike(String value) {
            addCriterion("UNIFIEDPLANLICID like", value, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidNotLike(String value) {
            addCriterion("UNIFIEDPLANLICID not like", value, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidIn(List<String> values) {
            addCriterion("UNIFIEDPLANLICID in", values, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidNotIn(List<String> values) {
            addCriterion("UNIFIEDPLANLICID not in", values, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidBetween(String value1, String value2) {
            addCriterion("UNIFIEDPLANLICID between", value1, value2, "unifiedplanlicid");
            return (Criteria) this;
        }

        public Criteria andUnifiedplanlicidNotBetween(String value1, String value2) {
            addCriterion("UNIFIEDPLANLICID not between", value1, value2, "unifiedplanlicid");
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

        public Criteria andTrusteeidIsNull() {
            addCriterion("TRUSTEEID is null");
            return (Criteria) this;
        }

        public Criteria andTrusteeidIsNotNull() {
            addCriterion("TRUSTEEID is not null");
            return (Criteria) this;
        }

        public Criteria andTrusteeidEqualTo(String value) {
            addCriterion("TRUSTEEID =", value, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidNotEqualTo(String value) {
            addCriterion("TRUSTEEID <>", value, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidGreaterThan(String value) {
            addCriterion("TRUSTEEID >", value, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidGreaterThanOrEqualTo(String value) {
            addCriterion("TRUSTEEID >=", value, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidLessThan(String value) {
            addCriterion("TRUSTEEID <", value, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidLessThanOrEqualTo(String value) {
            addCriterion("TRUSTEEID <=", value, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidLike(String value) {
            addCriterion("TRUSTEEID like", value, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidNotLike(String value) {
            addCriterion("TRUSTEEID not like", value, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidIn(List<String> values) {
            addCriterion("TRUSTEEID in", values, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidNotIn(List<String> values) {
            addCriterion("TRUSTEEID not in", values, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidBetween(String value1, String value2) {
            addCriterion("TRUSTEEID between", value1, value2, "trusteeid");
            return (Criteria) this;
        }

        public Criteria andTrusteeidNotBetween(String value1, String value2) {
            addCriterion("TRUSTEEID not between", value1, value2, "trusteeid");
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

        public Criteria andRegplacecodeIsNull() {
            addCriterion("REGPLACECODE is null");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeIsNotNull() {
            addCriterion("REGPLACECODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeEqualTo(String value) {
            addCriterion("REGPLACECODE =", value, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeNotEqualTo(String value) {
            addCriterion("REGPLACECODE <>", value, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeGreaterThan(String value) {
            addCriterion("REGPLACECODE >", value, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGPLACECODE >=", value, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeLessThan(String value) {
            addCriterion("REGPLACECODE <", value, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeLessThanOrEqualTo(String value) {
            addCriterion("REGPLACECODE <=", value, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeLike(String value) {
            addCriterion("REGPLACECODE like", value, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeNotLike(String value) {
            addCriterion("REGPLACECODE not like", value, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeIn(List<String> values) {
            addCriterion("REGPLACECODE in", values, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeNotIn(List<String> values) {
            addCriterion("REGPLACECODE not in", values, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeBetween(String value1, String value2) {
            addCriterion("REGPLACECODE between", value1, value2, "regplacecode");
            return (Criteria) this;
        }

        public Criteria andRegplacecodeNotBetween(String value1, String value2) {
            addCriterion("REGPLACECODE not between", value1, value2, "regplacecode");
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

        public Criteria andCollectionbanknoIsNull() {
            addCriterion("COLLECTIONBANKNO is null");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoIsNotNull() {
            addCriterion("COLLECTIONBANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoEqualTo(String value) {
            addCriterion("COLLECTIONBANKNO =", value, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoNotEqualTo(String value) {
            addCriterion("COLLECTIONBANKNO <>", value, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoGreaterThan(String value) {
            addCriterion("COLLECTIONBANKNO >", value, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKNO >=", value, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoLessThan(String value) {
            addCriterion("COLLECTIONBANKNO <", value, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoLessThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKNO <=", value, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoLike(String value) {
            addCriterion("COLLECTIONBANKNO like", value, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoNotLike(String value) {
            addCriterion("COLLECTIONBANKNO not like", value, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoIn(List<String> values) {
            addCriterion("COLLECTIONBANKNO in", values, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoNotIn(List<String> values) {
            addCriterion("COLLECTIONBANKNO not in", values, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKNO between", value1, value2, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknoNotBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKNO not between", value1, value2, "collectionbankno");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameIsNull() {
            addCriterion("COLLECTIONBANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameIsNotNull() {
            addCriterion("COLLECTIONBANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameEqualTo(String value) {
            addCriterion("COLLECTIONBANKNAME =", value, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameNotEqualTo(String value) {
            addCriterion("COLLECTIONBANKNAME <>", value, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameGreaterThan(String value) {
            addCriterion("COLLECTIONBANKNAME >", value, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKNAME >=", value, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameLessThan(String value) {
            addCriterion("COLLECTIONBANKNAME <", value, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameLessThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKNAME <=", value, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameLike(String value) {
            addCriterion("COLLECTIONBANKNAME like", value, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameNotLike(String value) {
            addCriterion("COLLECTIONBANKNAME not like", value, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameIn(List<String> values) {
            addCriterion("COLLECTIONBANKNAME in", values, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameNotIn(List<String> values) {
            addCriterion("COLLECTIONBANKNAME not in", values, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKNAME between", value1, value2, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbanknameNotBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKNAME not between", value1, value2, "collectionbankname");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovIsNull() {
            addCriterion("COLLECTIONBANKPROV is null");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovIsNotNull() {
            addCriterion("COLLECTIONBANKPROV is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovEqualTo(String value) {
            addCriterion("COLLECTIONBANKPROV =", value, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovNotEqualTo(String value) {
            addCriterion("COLLECTIONBANKPROV <>", value, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovGreaterThan(String value) {
            addCriterion("COLLECTIONBANKPROV >", value, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKPROV >=", value, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovLessThan(String value) {
            addCriterion("COLLECTIONBANKPROV <", value, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovLessThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKPROV <=", value, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovLike(String value) {
            addCriterion("COLLECTIONBANKPROV like", value, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovNotLike(String value) {
            addCriterion("COLLECTIONBANKPROV not like", value, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovIn(List<String> values) {
            addCriterion("COLLECTIONBANKPROV in", values, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovNotIn(List<String> values) {
            addCriterion("COLLECTIONBANKPROV not in", values, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKPROV between", value1, value2, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankprovNotBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKPROV not between", value1, value2, "collectionbankprov");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityIsNull() {
            addCriterion("COLLECTIONBANKCITY is null");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityIsNotNull() {
            addCriterion("COLLECTIONBANKCITY is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityEqualTo(String value) {
            addCriterion("COLLECTIONBANKCITY =", value, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityNotEqualTo(String value) {
            addCriterion("COLLECTIONBANKCITY <>", value, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityGreaterThan(String value) {
            addCriterion("COLLECTIONBANKCITY >", value, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKCITY >=", value, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityLessThan(String value) {
            addCriterion("COLLECTIONBANKCITY <", value, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityLessThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKCITY <=", value, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityLike(String value) {
            addCriterion("COLLECTIONBANKCITY like", value, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityNotLike(String value) {
            addCriterion("COLLECTIONBANKCITY not like", value, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityIn(List<String> values) {
            addCriterion("COLLECTIONBANKCITY in", values, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityNotIn(List<String> values) {
            addCriterion("COLLECTIONBANKCITY not in", values, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKCITY between", value1, value2, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankcityNotBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKCITY not between", value1, value2, "collectionbankcity");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidIsNull() {
            addCriterion("COLLECTIONBANKID is null");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidIsNotNull() {
            addCriterion("COLLECTIONBANKID is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidEqualTo(String value) {
            addCriterion("COLLECTIONBANKID =", value, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidNotEqualTo(String value) {
            addCriterion("COLLECTIONBANKID <>", value, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidGreaterThan(String value) {
            addCriterion("COLLECTIONBANKID >", value, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKID >=", value, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidLessThan(String value) {
            addCriterion("COLLECTIONBANKID <", value, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidLessThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANKID <=", value, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidLike(String value) {
            addCriterion("COLLECTIONBANKID like", value, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidNotLike(String value) {
            addCriterion("COLLECTIONBANKID not like", value, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidIn(List<String> values) {
            addCriterion("COLLECTIONBANKID in", values, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidNotIn(List<String> values) {
            addCriterion("COLLECTIONBANKID not in", values, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKID between", value1, value2, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankidNotBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANKID not between", value1, value2, "collectionbankid");
            return (Criteria) this;
        }

        public Criteria andCollectionbankIsNull() {
            addCriterion("COLLECTIONBANK is null");
            return (Criteria) this;
        }

        public Criteria andCollectionbankIsNotNull() {
            addCriterion("COLLECTIONBANK is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionbankEqualTo(String value) {
            addCriterion("COLLECTIONBANK =", value, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankNotEqualTo(String value) {
            addCriterion("COLLECTIONBANK <>", value, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankGreaterThan(String value) {
            addCriterion("COLLECTIONBANK >", value, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANK >=", value, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankLessThan(String value) {
            addCriterion("COLLECTIONBANK <", value, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankLessThanOrEqualTo(String value) {
            addCriterion("COLLECTIONBANK <=", value, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankLike(String value) {
            addCriterion("COLLECTIONBANK like", value, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankNotLike(String value) {
            addCriterion("COLLECTIONBANK not like", value, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankIn(List<String> values) {
            addCriterion("COLLECTIONBANK in", values, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankNotIn(List<String> values) {
            addCriterion("COLLECTIONBANK not in", values, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANK between", value1, value2, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andCollectionbankNotBetween(String value1, String value2) {
            addCriterion("COLLECTIONBANK not between", value1, value2, "collectionbank");
            return (Criteria) this;
        }

        public Criteria andPlanstatusIsNull() {
            addCriterion("PLANSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPlanstatusIsNotNull() {
            addCriterion("PLANSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPlanstatusEqualTo(String value) {
            addCriterion("PLANSTATUS =", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotEqualTo(String value) {
            addCriterion("PLANSTATUS <>", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusGreaterThan(String value) {
            addCriterion("PLANSTATUS >", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PLANSTATUS >=", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusLessThan(String value) {
            addCriterion("PLANSTATUS <", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusLessThanOrEqualTo(String value) {
            addCriterion("PLANSTATUS <=", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusLike(String value) {
            addCriterion("PLANSTATUS like", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotLike(String value) {
            addCriterion("PLANSTATUS not like", value, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusIn(List<String> values) {
            addCriterion("PLANSTATUS in", values, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotIn(List<String> values) {
            addCriterion("PLANSTATUS not in", values, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusBetween(String value1, String value2) {
            addCriterion("PLANSTATUS between", value1, value2, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPlanstatusNotBetween(String value1, String value2) {
            addCriterion("PLANSTATUS not between", value1, value2, "planstatus");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchIsNull() {
            addCriterion("PAYMENT_SWITCH is null");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchIsNotNull() {
            addCriterion("PAYMENT_SWITCH is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchEqualTo(String value) {
            addCriterion("PAYMENT_SWITCH =", value, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchNotEqualTo(String value) {
            addCriterion("PAYMENT_SWITCH <>", value, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchGreaterThan(String value) {
            addCriterion("PAYMENT_SWITCH >", value, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_SWITCH >=", value, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchLessThan(String value) {
            addCriterion("PAYMENT_SWITCH <", value, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_SWITCH <=", value, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchLike(String value) {
            addCriterion("PAYMENT_SWITCH like", value, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchNotLike(String value) {
            addCriterion("PAYMENT_SWITCH not like", value, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchIn(List<String> values) {
            addCriterion("PAYMENT_SWITCH in", values, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchNotIn(List<String> values) {
            addCriterion("PAYMENT_SWITCH not in", values, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchBetween(String value1, String value2) {
            addCriterion("PAYMENT_SWITCH between", value1, value2, "paymentSwitch");
            return (Criteria) this;
        }

        public Criteria andPaymentSwitchNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_SWITCH not between", value1, value2, "paymentSwitch");
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

        public Criteria andAppserionoIsNull() {
            addCriterion("APPSERIONO is null");
            return (Criteria) this;
        }

        public Criteria andAppserionoIsNotNull() {
            addCriterion("APPSERIONO is not null");
            return (Criteria) this;
        }

        public Criteria andAppserionoEqualTo(String value) {
            addCriterion("APPSERIONO =", value, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoNotEqualTo(String value) {
            addCriterion("APPSERIONO <>", value, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoGreaterThan(String value) {
            addCriterion("APPSERIONO >", value, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoGreaterThanOrEqualTo(String value) {
            addCriterion("APPSERIONO >=", value, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoLessThan(String value) {
            addCriterion("APPSERIONO <", value, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoLessThanOrEqualTo(String value) {
            addCriterion("APPSERIONO <=", value, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoLike(String value) {
            addCriterion("APPSERIONO like", value, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoNotLike(String value) {
            addCriterion("APPSERIONO not like", value, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoIn(List<String> values) {
            addCriterion("APPSERIONO in", values, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoNotIn(List<String> values) {
            addCriterion("APPSERIONO not in", values, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoBetween(String value1, String value2) {
            addCriterion("APPSERIONO between", value1, value2, "appseriono");
            return (Criteria) this;
        }

        public Criteria andAppserionoNotBetween(String value1, String value2) {
            addCriterion("APPSERIONO not between", value1, value2, "appseriono");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNull() {
            addCriterion("TRANSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("TRANSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("TRANSTYPE =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("TRANSTYPE <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("TRANSTYPE >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("TRANSTYPE <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("TRANSTYPE like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("TRANSTYPE not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("TRANSTYPE in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("TRANSTYPE not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("TRANSTYPE between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("TRANSTYPE not between", value1, value2, "transtype");
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