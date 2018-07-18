package zhenghang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoliceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoliceExample() {
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

        public Criteria andPoliIdIsNull() {
            addCriterion("POLI_ID is null");
            return (Criteria) this;
        }

        public Criteria andPoliIdIsNotNull() {
            addCriterion("POLI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPoliIdEqualTo(Integer value) {
            addCriterion("POLI_ID =", value, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdNotEqualTo(Integer value) {
            addCriterion("POLI_ID <>", value, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdGreaterThan(Integer value) {
            addCriterion("POLI_ID >", value, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("POLI_ID >=", value, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdLessThan(Integer value) {
            addCriterion("POLI_ID <", value, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdLessThanOrEqualTo(Integer value) {
            addCriterion("POLI_ID <=", value, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdIn(List<Integer> values) {
            addCriterion("POLI_ID in", values, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdNotIn(List<Integer> values) {
            addCriterion("POLI_ID not in", values, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdBetween(Integer value1, Integer value2) {
            addCriterion("POLI_ID between", value1, value2, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliIdNotBetween(Integer value1, Integer value2) {
            addCriterion("POLI_ID not between", value1, value2, "poliId");
            return (Criteria) this;
        }

        public Criteria andPoliCodeIsNull() {
            addCriterion("POLI_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPoliCodeIsNotNull() {
            addCriterion("POLI_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPoliCodeEqualTo(String value) {
            addCriterion("POLI_CODE =", value, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeNotEqualTo(String value) {
            addCriterion("POLI_CODE <>", value, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeGreaterThan(String value) {
            addCriterion("POLI_CODE >", value, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POLI_CODE >=", value, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeLessThan(String value) {
            addCriterion("POLI_CODE <", value, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeLessThanOrEqualTo(String value) {
            addCriterion("POLI_CODE <=", value, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeLike(String value) {
            addCriterion("POLI_CODE like", value, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeNotLike(String value) {
            addCriterion("POLI_CODE not like", value, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeIn(List<String> values) {
            addCriterion("POLI_CODE in", values, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeNotIn(List<String> values) {
            addCriterion("POLI_CODE not in", values, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeBetween(String value1, String value2) {
            addCriterion("POLI_CODE between", value1, value2, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliCodeNotBetween(String value1, String value2) {
            addCriterion("POLI_CODE not between", value1, value2, "poliCode");
            return (Criteria) this;
        }

        public Criteria andPoliNameIsNull() {
            addCriterion("POLI_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPoliNameIsNotNull() {
            addCriterion("POLI_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPoliNameEqualTo(String value) {
            addCriterion("POLI_NAME =", value, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameNotEqualTo(String value) {
            addCriterion("POLI_NAME <>", value, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameGreaterThan(String value) {
            addCriterion("POLI_NAME >", value, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameGreaterThanOrEqualTo(String value) {
            addCriterion("POLI_NAME >=", value, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameLessThan(String value) {
            addCriterion("POLI_NAME <", value, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameLessThanOrEqualTo(String value) {
            addCriterion("POLI_NAME <=", value, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameLike(String value) {
            addCriterion("POLI_NAME like", value, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameNotLike(String value) {
            addCriterion("POLI_NAME not like", value, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameIn(List<String> values) {
            addCriterion("POLI_NAME in", values, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameNotIn(List<String> values) {
            addCriterion("POLI_NAME not in", values, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameBetween(String value1, String value2) {
            addCriterion("POLI_NAME between", value1, value2, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliNameNotBetween(String value1, String value2) {
            addCriterion("POLI_NAME not between", value1, value2, "poliName");
            return (Criteria) this;
        }

        public Criteria andPoliPassIsNull() {
            addCriterion("POLI_PASS is null");
            return (Criteria) this;
        }

        public Criteria andPoliPassIsNotNull() {
            addCriterion("POLI_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andPoliPassEqualTo(String value) {
            addCriterion("POLI_PASS =", value, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassNotEqualTo(String value) {
            addCriterion("POLI_PASS <>", value, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassGreaterThan(String value) {
            addCriterion("POLI_PASS >", value, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassGreaterThanOrEqualTo(String value) {
            addCriterion("POLI_PASS >=", value, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassLessThan(String value) {
            addCriterion("POLI_PASS <", value, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassLessThanOrEqualTo(String value) {
            addCriterion("POLI_PASS <=", value, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassLike(String value) {
            addCriterion("POLI_PASS like", value, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassNotLike(String value) {
            addCriterion("POLI_PASS not like", value, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassIn(List<String> values) {
            addCriterion("POLI_PASS in", values, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassNotIn(List<String> values) {
            addCriterion("POLI_PASS not in", values, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassBetween(String value1, String value2) {
            addCriterion("POLI_PASS between", value1, value2, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliPassNotBetween(String value1, String value2) {
            addCriterion("POLI_PASS not between", value1, value2, "poliPass");
            return (Criteria) this;
        }

        public Criteria andPoliRoleIsNull() {
            addCriterion("POLI_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andPoliRoleIsNotNull() {
            addCriterion("POLI_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andPoliRoleEqualTo(String value) {
            addCriterion("POLI_ROLE =", value, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleNotEqualTo(String value) {
            addCriterion("POLI_ROLE <>", value, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleGreaterThan(String value) {
            addCriterion("POLI_ROLE >", value, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleGreaterThanOrEqualTo(String value) {
            addCriterion("POLI_ROLE >=", value, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleLessThan(String value) {
            addCriterion("POLI_ROLE <", value, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleLessThanOrEqualTo(String value) {
            addCriterion("POLI_ROLE <=", value, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleLike(String value) {
            addCriterion("POLI_ROLE like", value, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleNotLike(String value) {
            addCriterion("POLI_ROLE not like", value, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleIn(List<String> values) {
            addCriterion("POLI_ROLE in", values, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleNotIn(List<String> values) {
            addCriterion("POLI_ROLE not in", values, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleBetween(String value1, String value2) {
            addCriterion("POLI_ROLE between", value1, value2, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliRoleNotBetween(String value1, String value2) {
            addCriterion("POLI_ROLE not between", value1, value2, "poliRole");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoIsNull() {
            addCriterion("POLI_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoIsNotNull() {
            addCriterion("POLI_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoEqualTo(String value) {
            addCriterion("POLI_PHOTO =", value, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoNotEqualTo(String value) {
            addCriterion("POLI_PHOTO <>", value, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoGreaterThan(String value) {
            addCriterion("POLI_PHOTO >", value, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("POLI_PHOTO >=", value, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoLessThan(String value) {
            addCriterion("POLI_PHOTO <", value, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoLessThanOrEqualTo(String value) {
            addCriterion("POLI_PHOTO <=", value, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoLike(String value) {
            addCriterion("POLI_PHOTO like", value, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoNotLike(String value) {
            addCriterion("POLI_PHOTO not like", value, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoIn(List<String> values) {
            addCriterion("POLI_PHOTO in", values, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoNotIn(List<String> values) {
            addCriterion("POLI_PHOTO not in", values, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoBetween(String value1, String value2) {
            addCriterion("POLI_PHOTO between", value1, value2, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliPhotoNotBetween(String value1, String value2) {
            addCriterion("POLI_PHOTO not between", value1, value2, "poliPhoto");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictIsNull() {
            addCriterion("POLI_DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictIsNotNull() {
            addCriterion("POLI_DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictEqualTo(String value) {
            addCriterion("POLI_DISTRICT =", value, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictNotEqualTo(String value) {
            addCriterion("POLI_DISTRICT <>", value, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictGreaterThan(String value) {
            addCriterion("POLI_DISTRICT >", value, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("POLI_DISTRICT >=", value, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictLessThan(String value) {
            addCriterion("POLI_DISTRICT <", value, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictLessThanOrEqualTo(String value) {
            addCriterion("POLI_DISTRICT <=", value, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictLike(String value) {
            addCriterion("POLI_DISTRICT like", value, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictNotLike(String value) {
            addCriterion("POLI_DISTRICT not like", value, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictIn(List<String> values) {
            addCriterion("POLI_DISTRICT in", values, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictNotIn(List<String> values) {
            addCriterion("POLI_DISTRICT not in", values, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictBetween(String value1, String value2) {
            addCriterion("POLI_DISTRICT between", value1, value2, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andPoliDistrictNotBetween(String value1, String value2) {
            addCriterion("POLI_DISTRICT not between", value1, value2, "poliDistrict");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginIsNull() {
            addCriterion("TIME_LASTLOGIN is null");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginIsNotNull() {
            addCriterion("TIME_LASTLOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginEqualTo(Date value) {
            addCriterion("TIME_LASTLOGIN =", value, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginNotEqualTo(Date value) {
            addCriterion("TIME_LASTLOGIN <>", value, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginGreaterThan(Date value) {
            addCriterion("TIME_LASTLOGIN >", value, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_LASTLOGIN >=", value, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginLessThan(Date value) {
            addCriterion("TIME_LASTLOGIN <", value, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginLessThanOrEqualTo(Date value) {
            addCriterion("TIME_LASTLOGIN <=", value, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginIn(List<Date> values) {
            addCriterion("TIME_LASTLOGIN in", values, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginNotIn(List<Date> values) {
            addCriterion("TIME_LASTLOGIN not in", values, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginBetween(Date value1, Date value2) {
            addCriterion("TIME_LASTLOGIN between", value1, value2, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andTimeLastloginNotBetween(Date value1, Date value2) {
            addCriterion("TIME_LASTLOGIN not between", value1, value2, "timeLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginIsNull() {
            addCriterion("IP_LASTLOGIN is null");
            return (Criteria) this;
        }

        public Criteria andIpLastloginIsNotNull() {
            addCriterion("IP_LASTLOGIN is not null");
            return (Criteria) this;
        }

        public Criteria andIpLastloginEqualTo(String value) {
            addCriterion("IP_LASTLOGIN =", value, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginNotEqualTo(String value) {
            addCriterion("IP_LASTLOGIN <>", value, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginGreaterThan(String value) {
            addCriterion("IP_LASTLOGIN >", value, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginGreaterThanOrEqualTo(String value) {
            addCriterion("IP_LASTLOGIN >=", value, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginLessThan(String value) {
            addCriterion("IP_LASTLOGIN <", value, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginLessThanOrEqualTo(String value) {
            addCriterion("IP_LASTLOGIN <=", value, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginLike(String value) {
            addCriterion("IP_LASTLOGIN like", value, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginNotLike(String value) {
            addCriterion("IP_LASTLOGIN not like", value, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginIn(List<String> values) {
            addCriterion("IP_LASTLOGIN in", values, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginNotIn(List<String> values) {
            addCriterion("IP_LASTLOGIN not in", values, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginBetween(String value1, String value2) {
            addCriterion("IP_LASTLOGIN between", value1, value2, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIpLastloginNotBetween(String value1, String value2) {
            addCriterion("IP_LASTLOGIN not between", value1, value2, "ipLastlogin");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andRamarkIsNull() {
            addCriterion("RAMARK is null");
            return (Criteria) this;
        }

        public Criteria andRamarkIsNotNull() {
            addCriterion("RAMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRamarkEqualTo(String value) {
            addCriterion("RAMARK =", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkNotEqualTo(String value) {
            addCriterion("RAMARK <>", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkGreaterThan(String value) {
            addCriterion("RAMARK >", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkGreaterThanOrEqualTo(String value) {
            addCriterion("RAMARK >=", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkLessThan(String value) {
            addCriterion("RAMARK <", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkLessThanOrEqualTo(String value) {
            addCriterion("RAMARK <=", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkLike(String value) {
            addCriterion("RAMARK like", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkNotLike(String value) {
            addCriterion("RAMARK not like", value, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkIn(List<String> values) {
            addCriterion("RAMARK in", values, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkNotIn(List<String> values) {
            addCriterion("RAMARK not in", values, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkBetween(String value1, String value2) {
            addCriterion("RAMARK between", value1, value2, "ramark");
            return (Criteria) this;
        }

        public Criteria andRamarkNotBetween(String value1, String value2) {
            addCriterion("RAMARK not between", value1, value2, "ramark");
            return (Criteria) this;
        }

        public Criteria andStatIdIsNull() {
            addCriterion("STAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andStatIdIsNotNull() {
            addCriterion("STAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStatIdEqualTo(Integer value) {
            addCriterion("STAT_ID =", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotEqualTo(Integer value) {
            addCriterion("STAT_ID <>", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThan(Integer value) {
            addCriterion("STAT_ID >", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STAT_ID >=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThan(Integer value) {
            addCriterion("STAT_ID <", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdLessThanOrEqualTo(Integer value) {
            addCriterion("STAT_ID <=", value, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdIn(List<Integer> values) {
            addCriterion("STAT_ID in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotIn(List<Integer> values) {
            addCriterion("STAT_ID not in", values, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdBetween(Integer value1, Integer value2) {
            addCriterion("STAT_ID between", value1, value2, "statId");
            return (Criteria) this;
        }

        public Criteria andStatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STAT_ID not between", value1, value2, "statId");
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