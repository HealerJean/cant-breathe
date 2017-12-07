package org.dicp.oa.account.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectDetailOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectDetailOAVOCriteria() {
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

        public Criteria andPkCollectdetailIsNull() {
            addCriterion("PK_COLLECTDETAIL is null");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailIsNotNull() {
            addCriterion("PK_COLLECTDETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailEqualTo(String value) {
            addCriterion("PK_COLLECTDETAIL =", value, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailNotEqualTo(String value) {
            addCriterion("PK_COLLECTDETAIL <>", value, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailGreaterThan(String value) {
            addCriterion("PK_COLLECTDETAIL >", value, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailGreaterThanOrEqualTo(String value) {
            addCriterion("PK_COLLECTDETAIL >=", value, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailLessThan(String value) {
            addCriterion("PK_COLLECTDETAIL <", value, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailLessThanOrEqualTo(String value) {
            addCriterion("PK_COLLECTDETAIL <=", value, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailLike(String value) {
            addCriterion("PK_COLLECTDETAIL like", value, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailNotLike(String value) {
            addCriterion("PK_COLLECTDETAIL not like", value, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailIn(List<String> values) {
            addCriterion("PK_COLLECTDETAIL in", values, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailNotIn(List<String> values) {
            addCriterion("PK_COLLECTDETAIL not in", values, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailBetween(String value1, String value2) {
            addCriterion("PK_COLLECTDETAIL between", value1, value2, "pkCollectdetail");
            return (Criteria) this;
        }

        public Criteria andPkCollectdetailNotBetween(String value1, String value2) {
            addCriterion("PK_COLLECTDETAIL not between", value1, value2, "pkCollectdetail");
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

        public Criteria andNetdateIsNull() {
            addCriterion("NETDATE is null");
            return (Criteria) this;
        }

        public Criteria andNetdateIsNotNull() {
            addCriterion("NETDATE is not null");
            return (Criteria) this;
        }

        public Criteria andNetdateEqualTo(String value) {
            addCriterion("NETDATE =", value, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateNotEqualTo(String value) {
            addCriterion("NETDATE <>", value, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateGreaterThan(String value) {
            addCriterion("NETDATE >", value, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateGreaterThanOrEqualTo(String value) {
            addCriterion("NETDATE >=", value, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateLessThan(String value) {
            addCriterion("NETDATE <", value, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateLessThanOrEqualTo(String value) {
            addCriterion("NETDATE <=", value, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateLike(String value) {
            addCriterion("NETDATE like", value, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateNotLike(String value) {
            addCriterion("NETDATE not like", value, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateIn(List<String> values) {
            addCriterion("NETDATE in", values, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateNotIn(List<String> values) {
            addCriterion("NETDATE not in", values, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateBetween(String value1, String value2) {
            addCriterion("NETDATE between", value1, value2, "netdate");
            return (Criteria) this;
        }

        public Criteria andNetdateNotBetween(String value1, String value2) {
            addCriterion("NETDATE not between", value1, value2, "netdate");
            return (Criteria) this;
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

        public Criteria andUnitnetIsNull() {
            addCriterion("UNITNET is null");
            return (Criteria) this;
        }

        public Criteria andUnitnetIsNotNull() {
            addCriterion("UNITNET is not null");
            return (Criteria) this;
        }

        public Criteria andUnitnetEqualTo(BigDecimal value) {
            addCriterion("UNITNET =", value, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetNotEqualTo(BigDecimal value) {
            addCriterion("UNITNET <>", value, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetGreaterThan(BigDecimal value) {
            addCriterion("UNITNET >", value, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITNET >=", value, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetLessThan(BigDecimal value) {
            addCriterion("UNITNET <", value, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITNET <=", value, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetIn(List<BigDecimal> values) {
            addCriterion("UNITNET in", values, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetNotIn(List<BigDecimal> values) {
            addCriterion("UNITNET not in", values, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITNET between", value1, value2, "unitnet");
            return (Criteria) this;
        }

        public Criteria andUnitnetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITNET not between", value1, value2, "unitnet");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyIsNull() {
            addCriterion("NEWMONEYBUY is null");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyIsNotNull() {
            addCriterion("NEWMONEYBUY is not null");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyEqualTo(BigDecimal value) {
            addCriterion("NEWMONEYBUY =", value, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyNotEqualTo(BigDecimal value) {
            addCriterion("NEWMONEYBUY <>", value, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyGreaterThan(BigDecimal value) {
            addCriterion("NEWMONEYBUY >", value, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEWMONEYBUY >=", value, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyLessThan(BigDecimal value) {
            addCriterion("NEWMONEYBUY <", value, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEWMONEYBUY <=", value, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyIn(List<BigDecimal> values) {
            addCriterion("NEWMONEYBUY in", values, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyNotIn(List<BigDecimal> values) {
            addCriterion("NEWMONEYBUY not in", values, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEWMONEYBUY between", value1, value2, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEWMONEYBUY not between", value1, value2, "newmoneybuy");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyIsNull() {
            addCriterion("NEWMONEYBUYMONEY is null");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyIsNotNull() {
            addCriterion("NEWMONEYBUYMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyEqualTo(BigDecimal value) {
            addCriterion("NEWMONEYBUYMONEY =", value, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyNotEqualTo(BigDecimal value) {
            addCriterion("NEWMONEYBUYMONEY <>", value, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyGreaterThan(BigDecimal value) {
            addCriterion("NEWMONEYBUYMONEY >", value, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEWMONEYBUYMONEY >=", value, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyLessThan(BigDecimal value) {
            addCriterion("NEWMONEYBUYMONEY <", value, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEWMONEYBUYMONEY <=", value, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyIn(List<BigDecimal> values) {
            addCriterion("NEWMONEYBUYMONEY in", values, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyNotIn(List<BigDecimal> values) {
            addCriterion("NEWMONEYBUYMONEY not in", values, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEWMONEYBUYMONEY between", value1, value2, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andNewmoneybuymoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEWMONEYBUYMONEY not between", value1, value2, "newmoneybuymoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellIsNull() {
            addCriterion("IVSTREDSELL is null");
            return (Criteria) this;
        }

        public Criteria andIvstredsellIsNotNull() {
            addCriterion("IVSTREDSELL is not null");
            return (Criteria) this;
        }

        public Criteria andIvstredsellEqualTo(BigDecimal value) {
            addCriterion("IVSTREDSELL =", value, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellNotEqualTo(BigDecimal value) {
            addCriterion("IVSTREDSELL <>", value, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellGreaterThan(BigDecimal value) {
            addCriterion("IVSTREDSELL >", value, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IVSTREDSELL >=", value, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellLessThan(BigDecimal value) {
            addCriterion("IVSTREDSELL <", value, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IVSTREDSELL <=", value, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellIn(List<BigDecimal> values) {
            addCriterion("IVSTREDSELL in", values, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellNotIn(List<BigDecimal> values) {
            addCriterion("IVSTREDSELL not in", values, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IVSTREDSELL between", value1, value2, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IVSTREDSELL not between", value1, value2, "ivstredsell");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyIsNull() {
            addCriterion("IVSTREDSELLMONEY is null");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyIsNotNull() {
            addCriterion("IVSTREDSELLMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyEqualTo(BigDecimal value) {
            addCriterion("IVSTREDSELLMONEY =", value, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyNotEqualTo(BigDecimal value) {
            addCriterion("IVSTREDSELLMONEY <>", value, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyGreaterThan(BigDecimal value) {
            addCriterion("IVSTREDSELLMONEY >", value, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IVSTREDSELLMONEY >=", value, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyLessThan(BigDecimal value) {
            addCriterion("IVSTREDSELLMONEY <", value, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IVSTREDSELLMONEY <=", value, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyIn(List<BigDecimal> values) {
            addCriterion("IVSTREDSELLMONEY in", values, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyNotIn(List<BigDecimal> values) {
            addCriterion("IVSTREDSELLMONEY not in", values, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IVSTREDSELLMONEY between", value1, value2, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andIvstredsellmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IVSTREDSELLMONEY not between", value1, value2, "ivstredsellmoney");
            return (Criteria) this;
        }

        public Criteria andThisunitIsNull() {
            addCriterion("THISUNIT is null");
            return (Criteria) this;
        }

        public Criteria andThisunitIsNotNull() {
            addCriterion("THISUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andThisunitEqualTo(BigDecimal value) {
            addCriterion("THISUNIT =", value, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitNotEqualTo(BigDecimal value) {
            addCriterion("THISUNIT <>", value, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitGreaterThan(BigDecimal value) {
            addCriterion("THISUNIT >", value, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THISUNIT >=", value, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitLessThan(BigDecimal value) {
            addCriterion("THISUNIT <", value, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THISUNIT <=", value, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitIn(List<BigDecimal> values) {
            addCriterion("THISUNIT in", values, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitNotIn(List<BigDecimal> values) {
            addCriterion("THISUNIT not in", values, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THISUNIT between", value1, value2, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThisunitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THISUNIT not between", value1, value2, "thisunit");
            return (Criteria) this;
        }

        public Criteria andThismoneyIsNull() {
            addCriterion("THISMONEY is null");
            return (Criteria) this;
        }

        public Criteria andThismoneyIsNotNull() {
            addCriterion("THISMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andThismoneyEqualTo(BigDecimal value) {
            addCriterion("THISMONEY =", value, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyNotEqualTo(BigDecimal value) {
            addCriterion("THISMONEY <>", value, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyGreaterThan(BigDecimal value) {
            addCriterion("THISMONEY >", value, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THISMONEY >=", value, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyLessThan(BigDecimal value) {
            addCriterion("THISMONEY <", value, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THISMONEY <=", value, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyIn(List<BigDecimal> values) {
            addCriterion("THISMONEY in", values, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyNotIn(List<BigDecimal> values) {
            addCriterion("THISMONEY not in", values, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THISMONEY between", value1, value2, "thismoney");
            return (Criteria) this;
        }

        public Criteria andThismoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THISMONEY not between", value1, value2, "thismoney");
            return (Criteria) this;
        }

        public Criteria andBeforeunitIsNull() {
            addCriterion("BEFOREUNIT is null");
            return (Criteria) this;
        }

        public Criteria andBeforeunitIsNotNull() {
            addCriterion("BEFOREUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeunitEqualTo(BigDecimal value) {
            addCriterion("BEFOREUNIT =", value, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitNotEqualTo(BigDecimal value) {
            addCriterion("BEFOREUNIT <>", value, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitGreaterThan(BigDecimal value) {
            addCriterion("BEFOREUNIT >", value, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFOREUNIT >=", value, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitLessThan(BigDecimal value) {
            addCriterion("BEFOREUNIT <", value, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFOREUNIT <=", value, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitIn(List<BigDecimal> values) {
            addCriterion("BEFOREUNIT in", values, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitNotIn(List<BigDecimal> values) {
            addCriterion("BEFOREUNIT not in", values, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFOREUNIT between", value1, value2, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforeunitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFOREUNIT not between", value1, value2, "beforeunit");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyIsNull() {
            addCriterion("BEFOREMONEY is null");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyIsNotNull() {
            addCriterion("BEFOREMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyEqualTo(BigDecimal value) {
            addCriterion("BEFOREMONEY =", value, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyNotEqualTo(BigDecimal value) {
            addCriterion("BEFOREMONEY <>", value, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyGreaterThan(BigDecimal value) {
            addCriterion("BEFOREMONEY >", value, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFOREMONEY >=", value, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyLessThan(BigDecimal value) {
            addCriterion("BEFOREMONEY <", value, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEFOREMONEY <=", value, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyIn(List<BigDecimal> values) {
            addCriterion("BEFOREMONEY in", values, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyNotIn(List<BigDecimal> values) {
            addCriterion("BEFOREMONEY not in", values, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFOREMONEY between", value1, value2, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andBeforemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEFOREMONEY not between", value1, value2, "beforemoney");
            return (Criteria) this;
        }

        public Criteria andAfterunitIsNull() {
            addCriterion("AFTERUNIT is null");
            return (Criteria) this;
        }

        public Criteria andAfterunitIsNotNull() {
            addCriterion("AFTERUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAfterunitEqualTo(BigDecimal value) {
            addCriterion("AFTERUNIT =", value, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitNotEqualTo(BigDecimal value) {
            addCriterion("AFTERUNIT <>", value, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitGreaterThan(BigDecimal value) {
            addCriterion("AFTERUNIT >", value, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AFTERUNIT >=", value, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitLessThan(BigDecimal value) {
            addCriterion("AFTERUNIT <", value, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AFTERUNIT <=", value, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitIn(List<BigDecimal> values) {
            addCriterion("AFTERUNIT in", values, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitNotIn(List<BigDecimal> values) {
            addCriterion("AFTERUNIT not in", values, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFTERUNIT between", value1, value2, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAfterunitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFTERUNIT not between", value1, value2, "afterunit");
            return (Criteria) this;
        }

        public Criteria andAftermoneyIsNull() {
            addCriterion("AFTERMONEY is null");
            return (Criteria) this;
        }

        public Criteria andAftermoneyIsNotNull() {
            addCriterion("AFTERMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andAftermoneyEqualTo(BigDecimal value) {
            addCriterion("AFTERMONEY =", value, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyNotEqualTo(BigDecimal value) {
            addCriterion("AFTERMONEY <>", value, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyGreaterThan(BigDecimal value) {
            addCriterion("AFTERMONEY >", value, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AFTERMONEY >=", value, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyLessThan(BigDecimal value) {
            addCriterion("AFTERMONEY <", value, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AFTERMONEY <=", value, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyIn(List<BigDecimal> values) {
            addCriterion("AFTERMONEY in", values, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyNotIn(List<BigDecimal> values) {
            addCriterion("AFTERMONEY not in", values, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFTERMONEY between", value1, value2, "aftermoney");
            return (Criteria) this;
        }

        public Criteria andAftermoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AFTERMONEY not between", value1, value2, "aftermoney");
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

        public Criteria andSumlevelIsNull() {
            addCriterion("SUMLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSumlevelIsNotNull() {
            addCriterion("SUMLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSumlevelEqualTo(String value) {
            addCriterion("SUMLEVEL =", value, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelNotEqualTo(String value) {
            addCriterion("SUMLEVEL <>", value, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelGreaterThan(String value) {
            addCriterion("SUMLEVEL >", value, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelGreaterThanOrEqualTo(String value) {
            addCriterion("SUMLEVEL >=", value, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelLessThan(String value) {
            addCriterion("SUMLEVEL <", value, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelLessThanOrEqualTo(String value) {
            addCriterion("SUMLEVEL <=", value, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelLike(String value) {
            addCriterion("SUMLEVEL like", value, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelNotLike(String value) {
            addCriterion("SUMLEVEL not like", value, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelIn(List<String> values) {
            addCriterion("SUMLEVEL in", values, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelNotIn(List<String> values) {
            addCriterion("SUMLEVEL not in", values, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelBetween(String value1, String value2) {
            addCriterion("SUMLEVEL between", value1, value2, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andSumlevelNotBetween(String value1, String value2) {
            addCriterion("SUMLEVEL not between", value1, value2, "sumlevel");
            return (Criteria) this;
        }

        public Criteria andPricedayIsNull() {
            addCriterion("PRICEDAY is null");
            return (Criteria) this;
        }

        public Criteria andPricedayIsNotNull() {
            addCriterion("PRICEDAY is not null");
            return (Criteria) this;
        }

        public Criteria andPricedayEqualTo(String value) {
            addCriterion("PRICEDAY =", value, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayNotEqualTo(String value) {
            addCriterion("PRICEDAY <>", value, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayGreaterThan(String value) {
            addCriterion("PRICEDAY >", value, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayGreaterThanOrEqualTo(String value) {
            addCriterion("PRICEDAY >=", value, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayLessThan(String value) {
            addCriterion("PRICEDAY <", value, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayLessThanOrEqualTo(String value) {
            addCriterion("PRICEDAY <=", value, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayLike(String value) {
            addCriterion("PRICEDAY like", value, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayNotLike(String value) {
            addCriterion("PRICEDAY not like", value, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayIn(List<String> values) {
            addCriterion("PRICEDAY in", values, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayNotIn(List<String> values) {
            addCriterion("PRICEDAY not in", values, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayBetween(String value1, String value2) {
            addCriterion("PRICEDAY between", value1, value2, "priceday");
            return (Criteria) this;
        }

        public Criteria andPricedayNotBetween(String value1, String value2) {
            addCriterion("PRICEDAY not between", value1, value2, "priceday");
            return (Criteria) this;
        }

        public Criteria andBegassetvalIsNull() {
            addCriterion("BEGASSETVAL is null");
            return (Criteria) this;
        }

        public Criteria andBegassetvalIsNotNull() {
            addCriterion("BEGASSETVAL is not null");
            return (Criteria) this;
        }

        public Criteria andBegassetvalEqualTo(BigDecimal value) {
            addCriterion("BEGASSETVAL =", value, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalNotEqualTo(BigDecimal value) {
            addCriterion("BEGASSETVAL <>", value, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalGreaterThan(BigDecimal value) {
            addCriterion("BEGASSETVAL >", value, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEGASSETVAL >=", value, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalLessThan(BigDecimal value) {
            addCriterion("BEGASSETVAL <", value, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEGASSETVAL <=", value, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalIn(List<BigDecimal> values) {
            addCriterion("BEGASSETVAL in", values, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalNotIn(List<BigDecimal> values) {
            addCriterion("BEGASSETVAL not in", values, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEGASSETVAL between", value1, value2, "begassetval");
            return (Criteria) this;
        }

        public Criteria andBegassetvalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEGASSETVAL not between", value1, value2, "begassetval");
            return (Criteria) this;
        }

        public Criteria andAppreciationIsNull() {
            addCriterion("APPRECIATION is null");
            return (Criteria) this;
        }

        public Criteria andAppreciationIsNotNull() {
            addCriterion("APPRECIATION is not null");
            return (Criteria) this;
        }

        public Criteria andAppreciationEqualTo(BigDecimal value) {
            addCriterion("APPRECIATION =", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotEqualTo(BigDecimal value) {
            addCriterion("APPRECIATION <>", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationGreaterThan(BigDecimal value) {
            addCriterion("APPRECIATION >", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPRECIATION >=", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationLessThan(BigDecimal value) {
            addCriterion("APPRECIATION <", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPRECIATION <=", value, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationIn(List<BigDecimal> values) {
            addCriterion("APPRECIATION in", values, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotIn(List<BigDecimal> values) {
            addCriterion("APPRECIATION not in", values, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPRECIATION between", value1, value2, "appreciation");
            return (Criteria) this;
        }

        public Criteria andAppreciationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPRECIATION not between", value1, value2, "appreciation");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolIsNull() {
            addCriterion("TOTALBUYVOL is null");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolIsNotNull() {
            addCriterion("TOTALBUYVOL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolEqualTo(BigDecimal value) {
            addCriterion("TOTALBUYVOL =", value, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolNotEqualTo(BigDecimal value) {
            addCriterion("TOTALBUYVOL <>", value, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolGreaterThan(BigDecimal value) {
            addCriterion("TOTALBUYVOL >", value, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALBUYVOL >=", value, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolLessThan(BigDecimal value) {
            addCriterion("TOTALBUYVOL <", value, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALBUYVOL <=", value, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolIn(List<BigDecimal> values) {
            addCriterion("TOTALBUYVOL in", values, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolNotIn(List<BigDecimal> values) {
            addCriterion("TOTALBUYVOL not in", values, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALBUYVOL between", value1, value2, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyvolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALBUYVOL not between", value1, value2, "totalbuyvol");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtIsNull() {
            addCriterion("TOTALBUYAMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtIsNotNull() {
            addCriterion("TOTALBUYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtEqualTo(BigDecimal value) {
            addCriterion("TOTALBUYAMT =", value, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtNotEqualTo(BigDecimal value) {
            addCriterion("TOTALBUYAMT <>", value, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtGreaterThan(BigDecimal value) {
            addCriterion("TOTALBUYAMT >", value, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALBUYAMT >=", value, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtLessThan(BigDecimal value) {
            addCriterion("TOTALBUYAMT <", value, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALBUYAMT <=", value, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtIn(List<BigDecimal> values) {
            addCriterion("TOTALBUYAMT in", values, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtNotIn(List<BigDecimal> values) {
            addCriterion("TOTALBUYAMT not in", values, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALBUYAMT between", value1, value2, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andTotalbuyamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALBUYAMT not between", value1, value2, "totalbuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyvolIsNull() {
            addCriterion("CONTRIBUYVOL is null");
            return (Criteria) this;
        }

        public Criteria andContribuyvolIsNotNull() {
            addCriterion("CONTRIBUYVOL is not null");
            return (Criteria) this;
        }

        public Criteria andContribuyvolEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUYVOL =", value, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolNotEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUYVOL <>", value, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolGreaterThan(BigDecimal value) {
            addCriterion("CONTRIBUYVOL >", value, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUYVOL >=", value, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolLessThan(BigDecimal value) {
            addCriterion("CONTRIBUYVOL <", value, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUYVOL <=", value, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolIn(List<BigDecimal> values) {
            addCriterion("CONTRIBUYVOL in", values, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolNotIn(List<BigDecimal> values) {
            addCriterion("CONTRIBUYVOL not in", values, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRIBUYVOL between", value1, value2, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyvolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRIBUYVOL not between", value1, value2, "contribuyvol");
            return (Criteria) this;
        }

        public Criteria andContribuyamtIsNull() {
            addCriterion("CONTRIBUYAMT is null");
            return (Criteria) this;
        }

        public Criteria andContribuyamtIsNotNull() {
            addCriterion("CONTRIBUYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andContribuyamtEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUYAMT =", value, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtNotEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUYAMT <>", value, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtGreaterThan(BigDecimal value) {
            addCriterion("CONTRIBUYAMT >", value, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUYAMT >=", value, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtLessThan(BigDecimal value) {
            addCriterion("CONTRIBUYAMT <", value, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRIBUYAMT <=", value, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtIn(List<BigDecimal> values) {
            addCriterion("CONTRIBUYAMT in", values, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtNotIn(List<BigDecimal> values) {
            addCriterion("CONTRIBUYAMT not in", values, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRIBUYAMT between", value1, value2, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andContribuyamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRIBUYAMT not between", value1, value2, "contribuyamt");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolIsNull() {
            addCriterion("NOINVESTBUYVOL is null");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolIsNotNull() {
            addCriterion("NOINVESTBUYVOL is not null");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolEqualTo(BigDecimal value) {
            addCriterion("NOINVESTBUYVOL =", value, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolNotEqualTo(BigDecimal value) {
            addCriterion("NOINVESTBUYVOL <>", value, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolGreaterThan(BigDecimal value) {
            addCriterion("NOINVESTBUYVOL >", value, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOINVESTBUYVOL >=", value, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolLessThan(BigDecimal value) {
            addCriterion("NOINVESTBUYVOL <", value, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOINVESTBUYVOL <=", value, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolIn(List<BigDecimal> values) {
            addCriterion("NOINVESTBUYVOL in", values, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolNotIn(List<BigDecimal> values) {
            addCriterion("NOINVESTBUYVOL not in", values, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOINVESTBUYVOL between", value1, value2, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuyvolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOINVESTBUYVOL not between", value1, value2, "noinvestbuyvol");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumIsNull() {
            addCriterion("NOINVESTBUYSUM is null");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumIsNotNull() {
            addCriterion("NOINVESTBUYSUM is not null");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumEqualTo(BigDecimal value) {
            addCriterion("NOINVESTBUYSUM =", value, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumNotEqualTo(BigDecimal value) {
            addCriterion("NOINVESTBUYSUM <>", value, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumGreaterThan(BigDecimal value) {
            addCriterion("NOINVESTBUYSUM >", value, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOINVESTBUYSUM >=", value, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumLessThan(BigDecimal value) {
            addCriterion("NOINVESTBUYSUM <", value, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOINVESTBUYSUM <=", value, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumIn(List<BigDecimal> values) {
            addCriterion("NOINVESTBUYSUM in", values, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumNotIn(List<BigDecimal> values) {
            addCriterion("NOINVESTBUYSUM not in", values, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOINVESTBUYSUM between", value1, value2, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andNoinvestbuysumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOINVESTBUYSUM not between", value1, value2, "noinvestbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolIsNull() {
            addCriterion("SWITCHBUYVOL is null");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolIsNotNull() {
            addCriterion("SWITCHBUYVOL is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolEqualTo(BigDecimal value) {
            addCriterion("SWITCHBUYVOL =", value, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolNotEqualTo(BigDecimal value) {
            addCriterion("SWITCHBUYVOL <>", value, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolGreaterThan(BigDecimal value) {
            addCriterion("SWITCHBUYVOL >", value, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SWITCHBUYVOL >=", value, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolLessThan(BigDecimal value) {
            addCriterion("SWITCHBUYVOL <", value, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SWITCHBUYVOL <=", value, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolIn(List<BigDecimal> values) {
            addCriterion("SWITCHBUYVOL in", values, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolNotIn(List<BigDecimal> values) {
            addCriterion("SWITCHBUYVOL not in", values, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWITCHBUYVOL between", value1, value2, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuyvolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWITCHBUYVOL not between", value1, value2, "switchbuyvol");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumIsNull() {
            addCriterion("SWITCHBUYSUM is null");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumIsNotNull() {
            addCriterion("SWITCHBUYSUM is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumEqualTo(BigDecimal value) {
            addCriterion("SWITCHBUYSUM =", value, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumNotEqualTo(BigDecimal value) {
            addCriterion("SWITCHBUYSUM <>", value, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumGreaterThan(BigDecimal value) {
            addCriterion("SWITCHBUYSUM >", value, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SWITCHBUYSUM >=", value, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumLessThan(BigDecimal value) {
            addCriterion("SWITCHBUYSUM <", value, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SWITCHBUYSUM <=", value, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumIn(List<BigDecimal> values) {
            addCriterion("SWITCHBUYSUM in", values, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumNotIn(List<BigDecimal> values) {
            addCriterion("SWITCHBUYSUM not in", values, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWITCHBUYSUM between", value1, value2, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andSwitchbuysumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWITCHBUYSUM not between", value1, value2, "switchbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolIsNull() {
            addCriterion("OTHERBUYVOL is null");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolIsNotNull() {
            addCriterion("OTHERBUYVOL is not null");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolEqualTo(BigDecimal value) {
            addCriterion("OTHERBUYVOL =", value, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolNotEqualTo(BigDecimal value) {
            addCriterion("OTHERBUYVOL <>", value, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolGreaterThan(BigDecimal value) {
            addCriterion("OTHERBUYVOL >", value, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERBUYVOL >=", value, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolLessThan(BigDecimal value) {
            addCriterion("OTHERBUYVOL <", value, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERBUYVOL <=", value, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolIn(List<BigDecimal> values) {
            addCriterion("OTHERBUYVOL in", values, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolNotIn(List<BigDecimal> values) {
            addCriterion("OTHERBUYVOL not in", values, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERBUYVOL between", value1, value2, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuyvolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERBUYVOL not between", value1, value2, "otherbuyvol");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumIsNull() {
            addCriterion("OTHERBUYSUM is null");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumIsNotNull() {
            addCriterion("OTHERBUYSUM is not null");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumEqualTo(BigDecimal value) {
            addCriterion("OTHERBUYSUM =", value, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumNotEqualTo(BigDecimal value) {
            addCriterion("OTHERBUYSUM <>", value, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumGreaterThan(BigDecimal value) {
            addCriterion("OTHERBUYSUM >", value, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERBUYSUM >=", value, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumLessThan(BigDecimal value) {
            addCriterion("OTHERBUYSUM <", value, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERBUYSUM <=", value, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumIn(List<BigDecimal> values) {
            addCriterion("OTHERBUYSUM in", values, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumNotIn(List<BigDecimal> values) {
            addCriterion("OTHERBUYSUM not in", values, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERBUYSUM between", value1, value2, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andOtherbuysumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERBUYSUM not between", value1, value2, "otherbuysum");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolIsNull() {
            addCriterion("TOTALSALEVOL is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolIsNotNull() {
            addCriterion("TOTALSALEVOL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolEqualTo(BigDecimal value) {
            addCriterion("TOTALSALEVOL =", value, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolNotEqualTo(BigDecimal value) {
            addCriterion("TOTALSALEVOL <>", value, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolGreaterThan(BigDecimal value) {
            addCriterion("TOTALSALEVOL >", value, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALSALEVOL >=", value, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolLessThan(BigDecimal value) {
            addCriterion("TOTALSALEVOL <", value, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALSALEVOL <=", value, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolIn(List<BigDecimal> values) {
            addCriterion("TOTALSALEVOL in", values, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolNotIn(List<BigDecimal> values) {
            addCriterion("TOTALSALEVOL not in", values, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALSALEVOL between", value1, value2, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalevolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALSALEVOL not between", value1, value2, "totalsalevol");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumIsNull() {
            addCriterion("TOTALSALESUM is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumIsNotNull() {
            addCriterion("TOTALSALESUM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumEqualTo(BigDecimal value) {
            addCriterion("TOTALSALESUM =", value, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumNotEqualTo(BigDecimal value) {
            addCriterion("TOTALSALESUM <>", value, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumGreaterThan(BigDecimal value) {
            addCriterion("TOTALSALESUM >", value, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALSALESUM >=", value, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumLessThan(BigDecimal value) {
            addCriterion("TOTALSALESUM <", value, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALSALESUM <=", value, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumIn(List<BigDecimal> values) {
            addCriterion("TOTALSALESUM in", values, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumNotIn(List<BigDecimal> values) {
            addCriterion("TOTALSALESUM not in", values, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALSALESUM between", value1, value2, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andTotalsalesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALSALESUM not between", value1, value2, "totalsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolIsNull() {
            addCriterion("PAYMENTSALEVOL is null");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolIsNotNull() {
            addCriterion("PAYMENTSALEVOL is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolEqualTo(BigDecimal value) {
            addCriterion("PAYMENTSALEVOL =", value, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENTSALEVOL <>", value, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolGreaterThan(BigDecimal value) {
            addCriterion("PAYMENTSALEVOL >", value, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENTSALEVOL >=", value, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolLessThan(BigDecimal value) {
            addCriterion("PAYMENTSALEVOL <", value, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENTSALEVOL <=", value, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolIn(List<BigDecimal> values) {
            addCriterion("PAYMENTSALEVOL in", values, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENTSALEVOL not in", values, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENTSALEVOL between", value1, value2, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalevolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENTSALEVOL not between", value1, value2, "paymentsalevol");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumIsNull() {
            addCriterion("PAYMENTSALESUM is null");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumIsNotNull() {
            addCriterion("PAYMENTSALESUM is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumEqualTo(BigDecimal value) {
            addCriterion("PAYMENTSALESUM =", value, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENTSALESUM <>", value, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumGreaterThan(BigDecimal value) {
            addCriterion("PAYMENTSALESUM >", value, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENTSALESUM >=", value, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumLessThan(BigDecimal value) {
            addCriterion("PAYMENTSALESUM <", value, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENTSALESUM <=", value, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumIn(List<BigDecimal> values) {
            addCriterion("PAYMENTSALESUM in", values, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENTSALESUM not in", values, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENTSALESUM between", value1, value2, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andPaymentsalesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENTSALESUM not between", value1, value2, "paymentsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalevolIsNull() {
            addCriterion("TRANSSALEVOL is null");
            return (Criteria) this;
        }

        public Criteria andTranssalevolIsNotNull() {
            addCriterion("TRANSSALEVOL is not null");
            return (Criteria) this;
        }

        public Criteria andTranssalevolEqualTo(BigDecimal value) {
            addCriterion("TRANSSALEVOL =", value, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolNotEqualTo(BigDecimal value) {
            addCriterion("TRANSSALEVOL <>", value, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolGreaterThan(BigDecimal value) {
            addCriterion("TRANSSALEVOL >", value, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSSALEVOL >=", value, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolLessThan(BigDecimal value) {
            addCriterion("TRANSSALEVOL <", value, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSSALEVOL <=", value, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolIn(List<BigDecimal> values) {
            addCriterion("TRANSSALEVOL in", values, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolNotIn(List<BigDecimal> values) {
            addCriterion("TRANSSALEVOL not in", values, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSSALEVOL between", value1, value2, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalevolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSSALEVOL not between", value1, value2, "transsalevol");
            return (Criteria) this;
        }

        public Criteria andTranssalesumIsNull() {
            addCriterion("TRANSSALESUM is null");
            return (Criteria) this;
        }

        public Criteria andTranssalesumIsNotNull() {
            addCriterion("TRANSSALESUM is not null");
            return (Criteria) this;
        }

        public Criteria andTranssalesumEqualTo(BigDecimal value) {
            addCriterion("TRANSSALESUM =", value, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumNotEqualTo(BigDecimal value) {
            addCriterion("TRANSSALESUM <>", value, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumGreaterThan(BigDecimal value) {
            addCriterion("TRANSSALESUM >", value, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSSALESUM >=", value, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumLessThan(BigDecimal value) {
            addCriterion("TRANSSALESUM <", value, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSSALESUM <=", value, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumIn(List<BigDecimal> values) {
            addCriterion("TRANSSALESUM in", values, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumNotIn(List<BigDecimal> values) {
            addCriterion("TRANSSALESUM not in", values, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSSALESUM between", value1, value2, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andTranssalesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSSALESUM not between", value1, value2, "transsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolIsNull() {
            addCriterion("SWITCHSALEVOL is null");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolIsNotNull() {
            addCriterion("SWITCHSALEVOL is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolEqualTo(BigDecimal value) {
            addCriterion("SWITCHSALEVOL =", value, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolNotEqualTo(BigDecimal value) {
            addCriterion("SWITCHSALEVOL <>", value, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolGreaterThan(BigDecimal value) {
            addCriterion("SWITCHSALEVOL >", value, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SWITCHSALEVOL >=", value, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolLessThan(BigDecimal value) {
            addCriterion("SWITCHSALEVOL <", value, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SWITCHSALEVOL <=", value, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolIn(List<BigDecimal> values) {
            addCriterion("SWITCHSALEVOL in", values, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolNotIn(List<BigDecimal> values) {
            addCriterion("SWITCHSALEVOL not in", values, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWITCHSALEVOL between", value1, value2, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalevolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWITCHSALEVOL not between", value1, value2, "switchsalevol");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumIsNull() {
            addCriterion("SWITCHSALESUM is null");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumIsNotNull() {
            addCriterion("SWITCHSALESUM is not null");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumEqualTo(BigDecimal value) {
            addCriterion("SWITCHSALESUM =", value, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumNotEqualTo(BigDecimal value) {
            addCriterion("SWITCHSALESUM <>", value, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumGreaterThan(BigDecimal value) {
            addCriterion("SWITCHSALESUM >", value, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SWITCHSALESUM >=", value, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumLessThan(BigDecimal value) {
            addCriterion("SWITCHSALESUM <", value, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SWITCHSALESUM <=", value, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumIn(List<BigDecimal> values) {
            addCriterion("SWITCHSALESUM in", values, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumNotIn(List<BigDecimal> values) {
            addCriterion("SWITCHSALESUM not in", values, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWITCHSALESUM between", value1, value2, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andSwitchsalesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SWITCHSALESUM not between", value1, value2, "switchsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolIsNull() {
            addCriterion("NOINVESTSALEVOL is null");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolIsNotNull() {
            addCriterion("NOINVESTSALEVOL is not null");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolEqualTo(BigDecimal value) {
            addCriterion("NOINVESTSALEVOL =", value, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolNotEqualTo(BigDecimal value) {
            addCriterion("NOINVESTSALEVOL <>", value, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolGreaterThan(BigDecimal value) {
            addCriterion("NOINVESTSALEVOL >", value, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOINVESTSALEVOL >=", value, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolLessThan(BigDecimal value) {
            addCriterion("NOINVESTSALEVOL <", value, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOINVESTSALEVOL <=", value, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolIn(List<BigDecimal> values) {
            addCriterion("NOINVESTSALEVOL in", values, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolNotIn(List<BigDecimal> values) {
            addCriterion("NOINVESTSALEVOL not in", values, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOINVESTSALEVOL between", value1, value2, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalevolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOINVESTSALEVOL not between", value1, value2, "noinvestsalevol");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumIsNull() {
            addCriterion("NOINVESTSALESUM is null");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumIsNotNull() {
            addCriterion("NOINVESTSALESUM is not null");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumEqualTo(BigDecimal value) {
            addCriterion("NOINVESTSALESUM =", value, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumNotEqualTo(BigDecimal value) {
            addCriterion("NOINVESTSALESUM <>", value, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumGreaterThan(BigDecimal value) {
            addCriterion("NOINVESTSALESUM >", value, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOINVESTSALESUM >=", value, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumLessThan(BigDecimal value) {
            addCriterion("NOINVESTSALESUM <", value, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOINVESTSALESUM <=", value, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumIn(List<BigDecimal> values) {
            addCriterion("NOINVESTSALESUM in", values, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumNotIn(List<BigDecimal> values) {
            addCriterion("NOINVESTSALESUM not in", values, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOINVESTSALESUM between", value1, value2, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andNoinvestsalesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOINVESTSALESUM not between", value1, value2, "noinvestsalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalevolIsNull() {
            addCriterion("OTHERSALEVOL is null");
            return (Criteria) this;
        }

        public Criteria andOthersalevolIsNotNull() {
            addCriterion("OTHERSALEVOL is not null");
            return (Criteria) this;
        }

        public Criteria andOthersalevolEqualTo(BigDecimal value) {
            addCriterion("OTHERSALEVOL =", value, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolNotEqualTo(BigDecimal value) {
            addCriterion("OTHERSALEVOL <>", value, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolGreaterThan(BigDecimal value) {
            addCriterion("OTHERSALEVOL >", value, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERSALEVOL >=", value, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolLessThan(BigDecimal value) {
            addCriterion("OTHERSALEVOL <", value, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERSALEVOL <=", value, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolIn(List<BigDecimal> values) {
            addCriterion("OTHERSALEVOL in", values, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolNotIn(List<BigDecimal> values) {
            addCriterion("OTHERSALEVOL not in", values, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERSALEVOL between", value1, value2, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalevolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERSALEVOL not between", value1, value2, "othersalevol");
            return (Criteria) this;
        }

        public Criteria andOthersalesumIsNull() {
            addCriterion("OTHERSALESUM is null");
            return (Criteria) this;
        }

        public Criteria andOthersalesumIsNotNull() {
            addCriterion("OTHERSALESUM is not null");
            return (Criteria) this;
        }

        public Criteria andOthersalesumEqualTo(BigDecimal value) {
            addCriterion("OTHERSALESUM =", value, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumNotEqualTo(BigDecimal value) {
            addCriterion("OTHERSALESUM <>", value, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumGreaterThan(BigDecimal value) {
            addCriterion("OTHERSALESUM >", value, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERSALESUM >=", value, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumLessThan(BigDecimal value) {
            addCriterion("OTHERSALESUM <", value, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERSALESUM <=", value, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumIn(List<BigDecimal> values) {
            addCriterion("OTHERSALESUM in", values, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumNotIn(List<BigDecimal> values) {
            addCriterion("OTHERSALESUM not in", values, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERSALESUM between", value1, value2, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andOthersalesumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERSALESUM not between", value1, value2, "othersalesum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolIsNull() {
            addCriterion("PERIODINVESTVOL is null");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolIsNotNull() {
            addCriterion("PERIODINVESTVOL is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolEqualTo(BigDecimal value) {
            addCriterion("PERIODINVESTVOL =", value, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolNotEqualTo(BigDecimal value) {
            addCriterion("PERIODINVESTVOL <>", value, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolGreaterThan(BigDecimal value) {
            addCriterion("PERIODINVESTVOL >", value, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PERIODINVESTVOL >=", value, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolLessThan(BigDecimal value) {
            addCriterion("PERIODINVESTVOL <", value, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PERIODINVESTVOL <=", value, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolIn(List<BigDecimal> values) {
            addCriterion("PERIODINVESTVOL in", values, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolNotIn(List<BigDecimal> values) {
            addCriterion("PERIODINVESTVOL not in", values, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERIODINVESTVOL between", value1, value2, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestvolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERIODINVESTVOL not between", value1, value2, "periodinvestvol");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumIsNull() {
            addCriterion("PERIODINVESTSUM is null");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumIsNotNull() {
            addCriterion("PERIODINVESTSUM is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumEqualTo(BigDecimal value) {
            addCriterion("PERIODINVESTSUM =", value, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumNotEqualTo(BigDecimal value) {
            addCriterion("PERIODINVESTSUM <>", value, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumGreaterThan(BigDecimal value) {
            addCriterion("PERIODINVESTSUM >", value, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PERIODINVESTSUM >=", value, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumLessThan(BigDecimal value) {
            addCriterion("PERIODINVESTSUM <", value, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PERIODINVESTSUM <=", value, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumIn(List<BigDecimal> values) {
            addCriterion("PERIODINVESTSUM in", values, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumNotIn(List<BigDecimal> values) {
            addCriterion("PERIODINVESTSUM not in", values, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERIODINVESTSUM between", value1, value2, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andPeriodinvestsumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERIODINVESTSUM not between", value1, value2, "periodinvestsum");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalIsNull() {
            addCriterion("FINALASSETVAL is null");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalIsNotNull() {
            addCriterion("FINALASSETVAL is not null");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalEqualTo(BigDecimal value) {
            addCriterion("FINALASSETVAL =", value, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalNotEqualTo(BigDecimal value) {
            addCriterion("FINALASSETVAL <>", value, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalGreaterThan(BigDecimal value) {
            addCriterion("FINALASSETVAL >", value, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINALASSETVAL >=", value, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalLessThan(BigDecimal value) {
            addCriterion("FINALASSETVAL <", value, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINALASSETVAL <=", value, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalIn(List<BigDecimal> values) {
            addCriterion("FINALASSETVAL in", values, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalNotIn(List<BigDecimal> values) {
            addCriterion("FINALASSETVAL not in", values, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINALASSETVAL between", value1, value2, "finalassetval");
            return (Criteria) this;
        }

        public Criteria andFinalassetvalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINALASSETVAL not between", value1, value2, "finalassetval");
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

        public Criteria andPrintdayIsNull() {
            addCriterion("PRINTDAY is null");
            return (Criteria) this;
        }

        public Criteria andPrintdayIsNotNull() {
            addCriterion("PRINTDAY is not null");
            return (Criteria) this;
        }

        public Criteria andPrintdayEqualTo(String value) {
            addCriterion("PRINTDAY =", value, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayNotEqualTo(String value) {
            addCriterion("PRINTDAY <>", value, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayGreaterThan(String value) {
            addCriterion("PRINTDAY >", value, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayGreaterThanOrEqualTo(String value) {
            addCriterion("PRINTDAY >=", value, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayLessThan(String value) {
            addCriterion("PRINTDAY <", value, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayLessThanOrEqualTo(String value) {
            addCriterion("PRINTDAY <=", value, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayLike(String value) {
            addCriterion("PRINTDAY like", value, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayNotLike(String value) {
            addCriterion("PRINTDAY not like", value, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayIn(List<String> values) {
            addCriterion("PRINTDAY in", values, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayNotIn(List<String> values) {
            addCriterion("PRINTDAY not in", values, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayBetween(String value1, String value2) {
            addCriterion("PRINTDAY between", value1, value2, "printday");
            return (Criteria) this;
        }

        public Criteria andPrintdayNotBetween(String value1, String value2) {
            addCriterion("PRINTDAY not between", value1, value2, "printday");
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

        public Criteria andSumtypeIsNull() {
            addCriterion("SUMTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSumtypeIsNotNull() {
            addCriterion("SUMTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSumtypeEqualTo(String value) {
            addCriterion("SUMTYPE =", value, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeNotEqualTo(String value) {
            addCriterion("SUMTYPE <>", value, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeGreaterThan(String value) {
            addCriterion("SUMTYPE >", value, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeGreaterThanOrEqualTo(String value) {
            addCriterion("SUMTYPE >=", value, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeLessThan(String value) {
            addCriterion("SUMTYPE <", value, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeLessThanOrEqualTo(String value) {
            addCriterion("SUMTYPE <=", value, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeLike(String value) {
            addCriterion("SUMTYPE like", value, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeNotLike(String value) {
            addCriterion("SUMTYPE not like", value, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeIn(List<String> values) {
            addCriterion("SUMTYPE in", values, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeNotIn(List<String> values) {
            addCriterion("SUMTYPE not in", values, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeBetween(String value1, String value2) {
            addCriterion("SUMTYPE between", value1, value2, "sumtype");
            return (Criteria) this;
        }

        public Criteria andSumtypeNotBetween(String value1, String value2) {
            addCriterion("SUMTYPE not between", value1, value2, "sumtype");
            return (Criteria) this;
        }

        public Criteria andBegassetvolIsNull() {
            addCriterion("BEGASSETVOL is null");
            return (Criteria) this;
        }

        public Criteria andBegassetvolIsNotNull() {
            addCriterion("BEGASSETVOL is not null");
            return (Criteria) this;
        }

        public Criteria andBegassetvolEqualTo(BigDecimal value) {
            addCriterion("BEGASSETVOL =", value, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolNotEqualTo(BigDecimal value) {
            addCriterion("BEGASSETVOL <>", value, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolGreaterThan(BigDecimal value) {
            addCriterion("BEGASSETVOL >", value, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEGASSETVOL >=", value, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolLessThan(BigDecimal value) {
            addCriterion("BEGASSETVOL <", value, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEGASSETVOL <=", value, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolIn(List<BigDecimal> values) {
            addCriterion("BEGASSETVOL in", values, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolNotIn(List<BigDecimal> values) {
            addCriterion("BEGASSETVOL not in", values, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEGASSETVOL between", value1, value2, "begassetvol");
            return (Criteria) this;
        }

        public Criteria andBegassetvolNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEGASSETVOL not between", value1, value2, "begassetvol");
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