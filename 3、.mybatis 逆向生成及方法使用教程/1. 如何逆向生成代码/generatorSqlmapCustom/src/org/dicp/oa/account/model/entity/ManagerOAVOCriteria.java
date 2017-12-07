package org.dicp.oa.account.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerOAVOCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerOAVOCriteria() {
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

        public Criteria andPkManagerIsNull() {
            addCriterion("PK_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andPkManagerIsNotNull() {
            addCriterion("PK_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andPkManagerEqualTo(String value) {
            addCriterion("PK_MANAGER =", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerNotEqualTo(String value) {
            addCriterion("PK_MANAGER <>", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerGreaterThan(String value) {
            addCriterion("PK_MANAGER >", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerGreaterThanOrEqualTo(String value) {
            addCriterion("PK_MANAGER >=", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerLessThan(String value) {
            addCriterion("PK_MANAGER <", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerLessThanOrEqualTo(String value) {
            addCriterion("PK_MANAGER <=", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerLike(String value) {
            addCriterion("PK_MANAGER like", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerNotLike(String value) {
            addCriterion("PK_MANAGER not like", value, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerIn(List<String> values) {
            addCriterion("PK_MANAGER in", values, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerNotIn(List<String> values) {
            addCriterion("PK_MANAGER not in", values, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerBetween(String value1, String value2) {
            addCriterion("PK_MANAGER between", value1, value2, "pkManager");
            return (Criteria) this;
        }

        public Criteria andPkManagerNotBetween(String value1, String value2) {
            addCriterion("PK_MANAGER not between", value1, value2, "pkManager");
            return (Criteria) this;
        }

        public Criteria andManagercodeIsNull() {
            addCriterion("MANAGERCODE is null");
            return (Criteria) this;
        }

        public Criteria andManagercodeIsNotNull() {
            addCriterion("MANAGERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andManagercodeEqualTo(String value) {
            addCriterion("MANAGERCODE =", value, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeNotEqualTo(String value) {
            addCriterion("MANAGERCODE <>", value, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeGreaterThan(String value) {
            addCriterion("MANAGERCODE >", value, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGERCODE >=", value, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeLessThan(String value) {
            addCriterion("MANAGERCODE <", value, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeLessThanOrEqualTo(String value) {
            addCriterion("MANAGERCODE <=", value, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeLike(String value) {
            addCriterion("MANAGERCODE like", value, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeNotLike(String value) {
            addCriterion("MANAGERCODE not like", value, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeIn(List<String> values) {
            addCriterion("MANAGERCODE in", values, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeNotIn(List<String> values) {
            addCriterion("MANAGERCODE not in", values, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeBetween(String value1, String value2) {
            addCriterion("MANAGERCODE between", value1, value2, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagercodeNotBetween(String value1, String value2) {
            addCriterion("MANAGERCODE not between", value1, value2, "managercode");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNull() {
            addCriterion("MANAGERNAME is null");
            return (Criteria) this;
        }

        public Criteria andManagernameIsNotNull() {
            addCriterion("MANAGERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andManagernameEqualTo(String value) {
            addCriterion("MANAGERNAME =", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotEqualTo(String value) {
            addCriterion("MANAGERNAME <>", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThan(String value) {
            addCriterion("MANAGERNAME >", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGERNAME >=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThan(String value) {
            addCriterion("MANAGERNAME <", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLessThanOrEqualTo(String value) {
            addCriterion("MANAGERNAME <=", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameLike(String value) {
            addCriterion("MANAGERNAME like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotLike(String value) {
            addCriterion("MANAGERNAME not like", value, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameIn(List<String> values) {
            addCriterion("MANAGERNAME in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotIn(List<String> values) {
            addCriterion("MANAGERNAME not in", values, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameBetween(String value1, String value2) {
            addCriterion("MANAGERNAME between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andManagernameNotBetween(String value1, String value2) {
            addCriterion("MANAGERNAME not between", value1, value2, "managername");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidIsNull() {
            addCriterion("INSTITUTIONORGID is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidIsNotNull() {
            addCriterion("INSTITUTIONORGID is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidEqualTo(String value) {
            addCriterion("INSTITUTIONORGID =", value, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidNotEqualTo(String value) {
            addCriterion("INSTITUTIONORGID <>", value, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidGreaterThan(String value) {
            addCriterion("INSTITUTIONORGID >", value, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidGreaterThanOrEqualTo(String value) {
            addCriterion("INSTITUTIONORGID >=", value, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidLessThan(String value) {
            addCriterion("INSTITUTIONORGID <", value, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidLessThanOrEqualTo(String value) {
            addCriterion("INSTITUTIONORGID <=", value, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidLike(String value) {
            addCriterion("INSTITUTIONORGID like", value, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidNotLike(String value) {
            addCriterion("INSTITUTIONORGID not like", value, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidIn(List<String> values) {
            addCriterion("INSTITUTIONORGID in", values, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidNotIn(List<String> values) {
            addCriterion("INSTITUTIONORGID not in", values, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidBetween(String value1, String value2) {
            addCriterion("INSTITUTIONORGID between", value1, value2, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andInstitutionorgidNotBetween(String value1, String value2) {
            addCriterion("INSTITUTIONORGID not between", value1, value2, "institutionorgid");
            return (Criteria) this;
        }

        public Criteria andPkParentIsNull() {
            addCriterion("PK_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andPkParentIsNotNull() {
            addCriterion("PK_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andPkParentEqualTo(String value) {
            addCriterion("PK_PARENT =", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentNotEqualTo(String value) {
            addCriterion("PK_PARENT <>", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentGreaterThan(String value) {
            addCriterion("PK_PARENT >", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PARENT >=", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentLessThan(String value) {
            addCriterion("PK_PARENT <", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentLessThanOrEqualTo(String value) {
            addCriterion("PK_PARENT <=", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentLike(String value) {
            addCriterion("PK_PARENT like", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentNotLike(String value) {
            addCriterion("PK_PARENT not like", value, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentIn(List<String> values) {
            addCriterion("PK_PARENT in", values, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentNotIn(List<String> values) {
            addCriterion("PK_PARENT not in", values, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentBetween(String value1, String value2) {
            addCriterion("PK_PARENT between", value1, value2, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkParentNotBetween(String value1, String value2) {
            addCriterion("PK_PARENT not between", value1, value2, "pkParent");
            return (Criteria) this;
        }

        public Criteria andPkTopIsNull() {
            addCriterion("PK_TOP is null");
            return (Criteria) this;
        }

        public Criteria andPkTopIsNotNull() {
            addCriterion("PK_TOP is not null");
            return (Criteria) this;
        }

        public Criteria andPkTopEqualTo(String value) {
            addCriterion("PK_TOP =", value, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopNotEqualTo(String value) {
            addCriterion("PK_TOP <>", value, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopGreaterThan(String value) {
            addCriterion("PK_TOP >", value, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopGreaterThanOrEqualTo(String value) {
            addCriterion("PK_TOP >=", value, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopLessThan(String value) {
            addCriterion("PK_TOP <", value, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopLessThanOrEqualTo(String value) {
            addCriterion("PK_TOP <=", value, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopLike(String value) {
            addCriterion("PK_TOP like", value, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopNotLike(String value) {
            addCriterion("PK_TOP not like", value, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopIn(List<String> values) {
            addCriterion("PK_TOP in", values, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopNotIn(List<String> values) {
            addCriterion("PK_TOP not in", values, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopBetween(String value1, String value2) {
            addCriterion("PK_TOP between", value1, value2, "pkTop");
            return (Criteria) this;
        }

        public Criteria andPkTopNotBetween(String value1, String value2) {
            addCriterion("PK_TOP not between", value1, value2, "pkTop");
            return (Criteria) this;
        }

        public Criteria andLicensetypeIsNull() {
            addCriterion("LICENSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andLicensetypeIsNotNull() {
            addCriterion("LICENSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLicensetypeEqualTo(String value) {
            addCriterion("LICENSETYPE =", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeNotEqualTo(String value) {
            addCriterion("LICENSETYPE <>", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeGreaterThan(String value) {
            addCriterion("LICENSETYPE >", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSETYPE >=", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeLessThan(String value) {
            addCriterion("LICENSETYPE <", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeLessThanOrEqualTo(String value) {
            addCriterion("LICENSETYPE <=", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeLike(String value) {
            addCriterion("LICENSETYPE like", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeNotLike(String value) {
            addCriterion("LICENSETYPE not like", value, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeIn(List<String> values) {
            addCriterion("LICENSETYPE in", values, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeNotIn(List<String> values) {
            addCriterion("LICENSETYPE not in", values, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeBetween(String value1, String value2) {
            addCriterion("LICENSETYPE between", value1, value2, "licensetype");
            return (Criteria) this;
        }

        public Criteria andLicensetypeNotBetween(String value1, String value2) {
            addCriterion("LICENSETYPE not between", value1, value2, "licensetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNull() {
            addCriterion("CERTIFICATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIsNotNull() {
            addCriterion("CERTIFICATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeEqualTo(String value) {
            addCriterion("CERTIFICATETYPE =", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <>", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThan(String value) {
            addCriterion("CERTIFICATETYPE >", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE >=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThan(String value) {
            addCriterion("CERTIFICATETYPE <", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATETYPE <=", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeLike(String value) {
            addCriterion("CERTIFICATETYPE like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotLike(String value) {
            addCriterion("CERTIFICATETYPE not like", value, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeIn(List<String> values) {
            addCriterion("CERTIFICATETYPE in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotIn(List<String> values) {
            addCriterion("CERTIFICATETYPE not in", values, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatetypeNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATETYPE not between", value1, value2, "certificatetype");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIsNull() {
            addCriterion("CERTIFICATENUM is null");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIsNotNull() {
            addCriterion("CERTIFICATENUM is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatenumEqualTo(String value) {
            addCriterion("CERTIFICATENUM =", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotEqualTo(String value) {
            addCriterion("CERTIFICATENUM <>", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumGreaterThan(String value) {
            addCriterion("CERTIFICATENUM >", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENUM >=", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLessThan(String value) {
            addCriterion("CERTIFICATENUM <", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATENUM <=", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumLike(String value) {
            addCriterion("CERTIFICATENUM like", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotLike(String value) {
            addCriterion("CERTIFICATENUM not like", value, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumIn(List<String> values) {
            addCriterion("CERTIFICATENUM in", values, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotIn(List<String> values) {
            addCriterion("CERTIFICATENUM not in", values, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumBetween(String value1, String value2) {
            addCriterion("CERTIFICATENUM between", value1, value2, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCertificatenumNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATENUM not between", value1, value2, "certificatenum");
            return (Criteria) this;
        }

        public Criteria andCifidIsNull() {
            addCriterion("CIFID is null");
            return (Criteria) this;
        }

        public Criteria andCifidIsNotNull() {
            addCriterion("CIFID is not null");
            return (Criteria) this;
        }

        public Criteria andCifidEqualTo(String value) {
            addCriterion("CIFID =", value, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidNotEqualTo(String value) {
            addCriterion("CIFID <>", value, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidGreaterThan(String value) {
            addCriterion("CIFID >", value, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidGreaterThanOrEqualTo(String value) {
            addCriterion("CIFID >=", value, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidLessThan(String value) {
            addCriterion("CIFID <", value, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidLessThanOrEqualTo(String value) {
            addCriterion("CIFID <=", value, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidLike(String value) {
            addCriterion("CIFID like", value, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidNotLike(String value) {
            addCriterion("CIFID not like", value, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidIn(List<String> values) {
            addCriterion("CIFID in", values, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidNotIn(List<String> values) {
            addCriterion("CIFID not in", values, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidBetween(String value1, String value2) {
            addCriterion("CIFID between", value1, value2, "cifid");
            return (Criteria) this;
        }

        public Criteria andCifidNotBetween(String value1, String value2) {
            addCriterion("CIFID not between", value1, value2, "cifid");
            return (Criteria) this;
        }

        public Criteria andStandardcodeIsNull() {
            addCriterion("STANDARDCODE is null");
            return (Criteria) this;
        }

        public Criteria andStandardcodeIsNotNull() {
            addCriterion("STANDARDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andStandardcodeEqualTo(String value) {
            addCriterion("STANDARDCODE =", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotEqualTo(String value) {
            addCriterion("STANDARDCODE <>", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeGreaterThan(String value) {
            addCriterion("STANDARDCODE >", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeGreaterThanOrEqualTo(String value) {
            addCriterion("STANDARDCODE >=", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLessThan(String value) {
            addCriterion("STANDARDCODE <", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLessThanOrEqualTo(String value) {
            addCriterion("STANDARDCODE <=", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeLike(String value) {
            addCriterion("STANDARDCODE like", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotLike(String value) {
            addCriterion("STANDARDCODE not like", value, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeIn(List<String> values) {
            addCriterion("STANDARDCODE in", values, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotIn(List<String> values) {
            addCriterion("STANDARDCODE not in", values, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeBetween(String value1, String value2) {
            addCriterion("STANDARDCODE between", value1, value2, "standardcode");
            return (Criteria) this;
        }

        public Criteria andStandardcodeNotBetween(String value1, String value2) {
            addCriterion("STANDARDCODE not between", value1, value2, "standardcode");
            return (Criteria) this;
        }

        public Criteria andMngrtactpIsNull() {
            addCriterion("MNGRTACTP is null");
            return (Criteria) this;
        }

        public Criteria andMngrtactpIsNotNull() {
            addCriterion("MNGRTACTP is not null");
            return (Criteria) this;
        }

        public Criteria andMngrtactpEqualTo(String value) {
            addCriterion("MNGRTACTP =", value, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpNotEqualTo(String value) {
            addCriterion("MNGRTACTP <>", value, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpGreaterThan(String value) {
            addCriterion("MNGRTACTP >", value, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpGreaterThanOrEqualTo(String value) {
            addCriterion("MNGRTACTP >=", value, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpLessThan(String value) {
            addCriterion("MNGRTACTP <", value, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpLessThanOrEqualTo(String value) {
            addCriterion("MNGRTACTP <=", value, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpLike(String value) {
            addCriterion("MNGRTACTP like", value, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpNotLike(String value) {
            addCriterion("MNGRTACTP not like", value, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpIn(List<String> values) {
            addCriterion("MNGRTACTP in", values, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpNotIn(List<String> values) {
            addCriterion("MNGRTACTP not in", values, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpBetween(String value1, String value2) {
            addCriterion("MNGRTACTP between", value1, value2, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngrtactpNotBetween(String value1, String value2) {
            addCriterion("MNGRTACTP not between", value1, value2, "mngrtactp");
            return (Criteria) this;
        }

        public Criteria andMngractptelIsNull() {
            addCriterion("MNGRACTPTEL is null");
            return (Criteria) this;
        }

        public Criteria andMngractptelIsNotNull() {
            addCriterion("MNGRACTPTEL is not null");
            return (Criteria) this;
        }

        public Criteria andMngractptelEqualTo(String value) {
            addCriterion("MNGRACTPTEL =", value, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelNotEqualTo(String value) {
            addCriterion("MNGRACTPTEL <>", value, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelGreaterThan(String value) {
            addCriterion("MNGRACTPTEL >", value, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelGreaterThanOrEqualTo(String value) {
            addCriterion("MNGRACTPTEL >=", value, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelLessThan(String value) {
            addCriterion("MNGRACTPTEL <", value, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelLessThanOrEqualTo(String value) {
            addCriterion("MNGRACTPTEL <=", value, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelLike(String value) {
            addCriterion("MNGRACTPTEL like", value, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelNotLike(String value) {
            addCriterion("MNGRACTPTEL not like", value, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelIn(List<String> values) {
            addCriterion("MNGRACTPTEL in", values, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelNotIn(List<String> values) {
            addCriterion("MNGRACTPTEL not in", values, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelBetween(String value1, String value2) {
            addCriterion("MNGRACTPTEL between", value1, value2, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractptelNotBetween(String value1, String value2) {
            addCriterion("MNGRACTPTEL not between", value1, value2, "mngractptel");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxIsNull() {
            addCriterion("MNGRACTPFAX is null");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxIsNotNull() {
            addCriterion("MNGRACTPFAX is not null");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxEqualTo(String value) {
            addCriterion("MNGRACTPFAX =", value, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxNotEqualTo(String value) {
            addCriterion("MNGRACTPFAX <>", value, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxGreaterThan(String value) {
            addCriterion("MNGRACTPFAX >", value, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxGreaterThanOrEqualTo(String value) {
            addCriterion("MNGRACTPFAX >=", value, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxLessThan(String value) {
            addCriterion("MNGRACTPFAX <", value, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxLessThanOrEqualTo(String value) {
            addCriterion("MNGRACTPFAX <=", value, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxLike(String value) {
            addCriterion("MNGRACTPFAX like", value, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxNotLike(String value) {
            addCriterion("MNGRACTPFAX not like", value, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxIn(List<String> values) {
            addCriterion("MNGRACTPFAX in", values, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxNotIn(List<String> values) {
            addCriterion("MNGRACTPFAX not in", values, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxBetween(String value1, String value2) {
            addCriterion("MNGRACTPFAX between", value1, value2, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpfaxNotBetween(String value1, String value2) {
            addCriterion("MNGRACTPFAX not between", value1, value2, "mngractpfax");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrIsNull() {
            addCriterion("MNGRACTPADDR is null");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrIsNotNull() {
            addCriterion("MNGRACTPADDR is not null");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrEqualTo(String value) {
            addCriterion("MNGRACTPADDR =", value, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrNotEqualTo(String value) {
            addCriterion("MNGRACTPADDR <>", value, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrGreaterThan(String value) {
            addCriterion("MNGRACTPADDR >", value, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrGreaterThanOrEqualTo(String value) {
            addCriterion("MNGRACTPADDR >=", value, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrLessThan(String value) {
            addCriterion("MNGRACTPADDR <", value, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrLessThanOrEqualTo(String value) {
            addCriterion("MNGRACTPADDR <=", value, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrLike(String value) {
            addCriterion("MNGRACTPADDR like", value, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrNotLike(String value) {
            addCriterion("MNGRACTPADDR not like", value, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrIn(List<String> values) {
            addCriterion("MNGRACTPADDR in", values, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrNotIn(List<String> values) {
            addCriterion("MNGRACTPADDR not in", values, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrBetween(String value1, String value2) {
            addCriterion("MNGRACTPADDR between", value1, value2, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpaddrNotBetween(String value1, String value2) {
            addCriterion("MNGRACTPADDR not between", value1, value2, "mngractpaddr");
            return (Criteria) this;
        }

        public Criteria andMngractpemailIsNull() {
            addCriterion("MNGRACTPEMAIL is null");
            return (Criteria) this;
        }

        public Criteria andMngractpemailIsNotNull() {
            addCriterion("MNGRACTPEMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMngractpemailEqualTo(String value) {
            addCriterion("MNGRACTPEMAIL =", value, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailNotEqualTo(String value) {
            addCriterion("MNGRACTPEMAIL <>", value, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailGreaterThan(String value) {
            addCriterion("MNGRACTPEMAIL >", value, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailGreaterThanOrEqualTo(String value) {
            addCriterion("MNGRACTPEMAIL >=", value, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailLessThan(String value) {
            addCriterion("MNGRACTPEMAIL <", value, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailLessThanOrEqualTo(String value) {
            addCriterion("MNGRACTPEMAIL <=", value, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailLike(String value) {
            addCriterion("MNGRACTPEMAIL like", value, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailNotLike(String value) {
            addCriterion("MNGRACTPEMAIL not like", value, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailIn(List<String> values) {
            addCriterion("MNGRACTPEMAIL in", values, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailNotIn(List<String> values) {
            addCriterion("MNGRACTPEMAIL not in", values, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailBetween(String value1, String value2) {
            addCriterion("MNGRACTPEMAIL between", value1, value2, "mngractpemail");
            return (Criteria) this;
        }

        public Criteria andMngractpemailNotBetween(String value1, String value2) {
            addCriterion("MNGRACTPEMAIL not between", value1, value2, "mngractpemail");
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

        public Criteria andSubinstpostcodeIsNull() {
            addCriterion("SUBINSTPOSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeIsNotNull() {
            addCriterion("SUBINSTPOSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeEqualTo(String value) {
            addCriterion("SUBINSTPOSTCODE =", value, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeNotEqualTo(String value) {
            addCriterion("SUBINSTPOSTCODE <>", value, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeGreaterThan(String value) {
            addCriterion("SUBINSTPOSTCODE >", value, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBINSTPOSTCODE >=", value, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeLessThan(String value) {
            addCriterion("SUBINSTPOSTCODE <", value, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeLessThanOrEqualTo(String value) {
            addCriterion("SUBINSTPOSTCODE <=", value, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeLike(String value) {
            addCriterion("SUBINSTPOSTCODE like", value, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeNotLike(String value) {
            addCriterion("SUBINSTPOSTCODE not like", value, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeIn(List<String> values) {
            addCriterion("SUBINSTPOSTCODE in", values, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeNotIn(List<String> values) {
            addCriterion("SUBINSTPOSTCODE not in", values, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeBetween(String value1, String value2) {
            addCriterion("SUBINSTPOSTCODE between", value1, value2, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstpostcodeNotBetween(String value1, String value2) {
            addCriterion("SUBINSTPOSTCODE not between", value1, value2, "subinstpostcode");
            return (Criteria) this;
        }

        public Criteria andSubinstidIsNull() {
            addCriterion("SUBINSTID is null");
            return (Criteria) this;
        }

        public Criteria andSubinstidIsNotNull() {
            addCriterion("SUBINSTID is not null");
            return (Criteria) this;
        }

        public Criteria andSubinstidEqualTo(String value) {
            addCriterion("SUBINSTID =", value, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidNotEqualTo(String value) {
            addCriterion("SUBINSTID <>", value, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidGreaterThan(String value) {
            addCriterion("SUBINSTID >", value, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidGreaterThanOrEqualTo(String value) {
            addCriterion("SUBINSTID >=", value, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidLessThan(String value) {
            addCriterion("SUBINSTID <", value, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidLessThanOrEqualTo(String value) {
            addCriterion("SUBINSTID <=", value, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidLike(String value) {
            addCriterion("SUBINSTID like", value, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidNotLike(String value) {
            addCriterion("SUBINSTID not like", value, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidIn(List<String> values) {
            addCriterion("SUBINSTID in", values, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidNotIn(List<String> values) {
            addCriterion("SUBINSTID not in", values, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidBetween(String value1, String value2) {
            addCriterion("SUBINSTID between", value1, value2, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSubinstidNotBetween(String value1, String value2) {
            addCriterion("SUBINSTID not between", value1, value2, "subinstid");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIsNull() {
            addCriterion("SOCIALCREDITCODE is null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIsNotNull() {
            addCriterion("SOCIALCREDITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeEqualTo(String value) {
            addCriterion("SOCIALCREDITCODE =", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotEqualTo(String value) {
            addCriterion("SOCIALCREDITCODE <>", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeGreaterThan(String value) {
            addCriterion("SOCIALCREDITCODE >", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIALCREDITCODE >=", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLessThan(String value) {
            addCriterion("SOCIALCREDITCODE <", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLessThanOrEqualTo(String value) {
            addCriterion("SOCIALCREDITCODE <=", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeLike(String value) {
            addCriterion("SOCIALCREDITCODE like", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotLike(String value) {
            addCriterion("SOCIALCREDITCODE not like", value, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeIn(List<String> values) {
            addCriterion("SOCIALCREDITCODE in", values, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotIn(List<String> values) {
            addCriterion("SOCIALCREDITCODE not in", values, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeBetween(String value1, String value2) {
            addCriterion("SOCIALCREDITCODE between", value1, value2, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSocialcreditcodeNotBetween(String value1, String value2) {
            addCriterion("SOCIALCREDITCODE not between", value1, value2, "socialcreditcode");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrIsNull() {
            addCriterion("SUBINSTADDR is null");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrIsNotNull() {
            addCriterion("SUBINSTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrEqualTo(String value) {
            addCriterion("SUBINSTADDR =", value, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrNotEqualTo(String value) {
            addCriterion("SUBINSTADDR <>", value, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrGreaterThan(String value) {
            addCriterion("SUBINSTADDR >", value, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrGreaterThanOrEqualTo(String value) {
            addCriterion("SUBINSTADDR >=", value, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrLessThan(String value) {
            addCriterion("SUBINSTADDR <", value, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrLessThanOrEqualTo(String value) {
            addCriterion("SUBINSTADDR <=", value, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrLike(String value) {
            addCriterion("SUBINSTADDR like", value, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrNotLike(String value) {
            addCriterion("SUBINSTADDR not like", value, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrIn(List<String> values) {
            addCriterion("SUBINSTADDR in", values, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrNotIn(List<String> values) {
            addCriterion("SUBINSTADDR not in", values, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrBetween(String value1, String value2) {
            addCriterion("SUBINSTADDR between", value1, value2, "subinstaddr");
            return (Criteria) this;
        }

        public Criteria andSubinstaddrNotBetween(String value1, String value2) {
            addCriterion("SUBINSTADDR not between", value1, value2, "subinstaddr");
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

        public Criteria andInstitutionidIsNull() {
            addCriterion("INSTITUTIONID is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionidIsNotNull() {
            addCriterion("INSTITUTIONID is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionidEqualTo(String value) {
            addCriterion("INSTITUTIONID =", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotEqualTo(String value) {
            addCriterion("INSTITUTIONID <>", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidGreaterThan(String value) {
            addCriterion("INSTITUTIONID >", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidGreaterThanOrEqualTo(String value) {
            addCriterion("INSTITUTIONID >=", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidLessThan(String value) {
            addCriterion("INSTITUTIONID <", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidLessThanOrEqualTo(String value) {
            addCriterion("INSTITUTIONID <=", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidLike(String value) {
            addCriterion("INSTITUTIONID like", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotLike(String value) {
            addCriterion("INSTITUTIONID not like", value, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidIn(List<String> values) {
            addCriterion("INSTITUTIONID in", values, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotIn(List<String> values) {
            addCriterion("INSTITUTIONID not in", values, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidBetween(String value1, String value2) {
            addCriterion("INSTITUTIONID between", value1, value2, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionidNotBetween(String value1, String value2) {
            addCriterion("INSTITUTIONID not between", value1, value2, "institutionid");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameIsNull() {
            addCriterion("INSTITUTIONNAME is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameIsNotNull() {
            addCriterion("INSTITUTIONNAME is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameEqualTo(String value) {
            addCriterion("INSTITUTIONNAME =", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameNotEqualTo(String value) {
            addCriterion("INSTITUTIONNAME <>", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameGreaterThan(String value) {
            addCriterion("INSTITUTIONNAME >", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameGreaterThanOrEqualTo(String value) {
            addCriterion("INSTITUTIONNAME >=", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameLessThan(String value) {
            addCriterion("INSTITUTIONNAME <", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameLessThanOrEqualTo(String value) {
            addCriterion("INSTITUTIONNAME <=", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameLike(String value) {
            addCriterion("INSTITUTIONNAME like", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameNotLike(String value) {
            addCriterion("INSTITUTIONNAME not like", value, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameIn(List<String> values) {
            addCriterion("INSTITUTIONNAME in", values, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameNotIn(List<String> values) {
            addCriterion("INSTITUTIONNAME not in", values, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameBetween(String value1, String value2) {
            addCriterion("INSTITUTIONNAME between", value1, value2, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutionnameNotBetween(String value1, String value2) {
            addCriterion("INSTITUTIONNAME not between", value1, value2, "institutionname");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIsNull() {
            addCriterion("INSTITUTIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIsNotNull() {
            addCriterion("INSTITUTIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeEqualTo(String value) {
            addCriterion("INSTITUTIONTYPE =", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotEqualTo(String value) {
            addCriterion("INSTITUTIONTYPE <>", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeGreaterThan(String value) {
            addCriterion("INSTITUTIONTYPE >", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("INSTITUTIONTYPE >=", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLessThan(String value) {
            addCriterion("INSTITUTIONTYPE <", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLessThanOrEqualTo(String value) {
            addCriterion("INSTITUTIONTYPE <=", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeLike(String value) {
            addCriterion("INSTITUTIONTYPE like", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotLike(String value) {
            addCriterion("INSTITUTIONTYPE not like", value, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeIn(List<String> values) {
            addCriterion("INSTITUTIONTYPE in", values, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotIn(List<String> values) {
            addCriterion("INSTITUTIONTYPE not in", values, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeBetween(String value1, String value2) {
            addCriterion("INSTITUTIONTYPE between", value1, value2, "institutiontype");
            return (Criteria) this;
        }

        public Criteria andInstitutiontypeNotBetween(String value1, String value2) {
            addCriterion("INSTITUTIONTYPE not between", value1, value2, "institutiontype");
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