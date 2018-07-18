package zhenghang.pojo;

import java.util.ArrayList;
import java.util.List;

public class BuildingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuildingExample() {
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

        public Criteria andBuilIdIsNull() {
            addCriterion("BUIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andBuilIdIsNotNull() {
            addCriterion("BUIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBuilIdEqualTo(Integer value) {
            addCriterion("BUIL_ID =", value, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdNotEqualTo(Integer value) {
            addCriterion("BUIL_ID <>", value, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdGreaterThan(Integer value) {
            addCriterion("BUIL_ID >", value, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUIL_ID >=", value, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdLessThan(Integer value) {
            addCriterion("BUIL_ID <", value, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdLessThanOrEqualTo(Integer value) {
            addCriterion("BUIL_ID <=", value, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdIn(List<Integer> values) {
            addCriterion("BUIL_ID in", values, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdNotIn(List<Integer> values) {
            addCriterion("BUIL_ID not in", values, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdBetween(Integer value1, Integer value2) {
            addCriterion("BUIL_ID between", value1, value2, "builId");
            return (Criteria) this;
        }

        public Criteria andBuilIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BUIL_ID not between", value1, value2, "builId");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNull() {
            addCriterion("COMM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCommIdIsNotNull() {
            addCriterion("COMM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCommIdEqualTo(Integer value) {
            addCriterion("COMM_ID =", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotEqualTo(Integer value) {
            addCriterion("COMM_ID <>", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThan(Integer value) {
            addCriterion("COMM_ID >", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMM_ID >=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThan(Integer value) {
            addCriterion("COMM_ID <", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdLessThanOrEqualTo(Integer value) {
            addCriterion("COMM_ID <=", value, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdIn(List<Integer> values) {
            addCriterion("COMM_ID in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotIn(List<Integer> values) {
            addCriterion("COMM_ID not in", values, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdBetween(Integer value1, Integer value2) {
            addCriterion("COMM_ID between", value1, value2, "commId");
            return (Criteria) this;
        }

        public Criteria andCommIdNotBetween(Integer value1, Integer value2) {
            addCriterion("COMM_ID not between", value1, value2, "commId");
            return (Criteria) this;
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

        public Criteria andBuilNameIsNull() {
            addCriterion("BUIL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuilNameIsNotNull() {
            addCriterion("BUIL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuilNameEqualTo(String value) {
            addCriterion("BUIL_NAME =", value, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameNotEqualTo(String value) {
            addCriterion("BUIL_NAME <>", value, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameGreaterThan(String value) {
            addCriterion("BUIL_NAME >", value, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUIL_NAME >=", value, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameLessThan(String value) {
            addCriterion("BUIL_NAME <", value, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameLessThanOrEqualTo(String value) {
            addCriterion("BUIL_NAME <=", value, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameLike(String value) {
            addCriterion("BUIL_NAME like", value, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameNotLike(String value) {
            addCriterion("BUIL_NAME not like", value, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameIn(List<String> values) {
            addCriterion("BUIL_NAME in", values, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameNotIn(List<String> values) {
            addCriterion("BUIL_NAME not in", values, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameBetween(String value1, String value2) {
            addCriterion("BUIL_NAME between", value1, value2, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilNameNotBetween(String value1, String value2) {
            addCriterion("BUIL_NAME not between", value1, value2, "builName");
            return (Criteria) this;
        }

        public Criteria andBuilGpseIsNull() {
            addCriterion("BUIL_GPSE is null");
            return (Criteria) this;
        }

        public Criteria andBuilGpseIsNotNull() {
            addCriterion("BUIL_GPSE is not null");
            return (Criteria) this;
        }

        public Criteria andBuilGpseEqualTo(String value) {
            addCriterion("BUIL_GPSE =", value, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseNotEqualTo(String value) {
            addCriterion("BUIL_GPSE <>", value, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseGreaterThan(String value) {
            addCriterion("BUIL_GPSE >", value, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseGreaterThanOrEqualTo(String value) {
            addCriterion("BUIL_GPSE >=", value, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseLessThan(String value) {
            addCriterion("BUIL_GPSE <", value, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseLessThanOrEqualTo(String value) {
            addCriterion("BUIL_GPSE <=", value, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseLike(String value) {
            addCriterion("BUIL_GPSE like", value, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseNotLike(String value) {
            addCriterion("BUIL_GPSE not like", value, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseIn(List<String> values) {
            addCriterion("BUIL_GPSE in", values, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseNotIn(List<String> values) {
            addCriterion("BUIL_GPSE not in", values, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseBetween(String value1, String value2) {
            addCriterion("BUIL_GPSE between", value1, value2, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpseNotBetween(String value1, String value2) {
            addCriterion("BUIL_GPSE not between", value1, value2, "builGpse");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnIsNull() {
            addCriterion("BUIL_GPSN is null");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnIsNotNull() {
            addCriterion("BUIL_GPSN is not null");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnEqualTo(String value) {
            addCriterion("BUIL_GPSN =", value, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnNotEqualTo(String value) {
            addCriterion("BUIL_GPSN <>", value, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnGreaterThan(String value) {
            addCriterion("BUIL_GPSN >", value, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnGreaterThanOrEqualTo(String value) {
            addCriterion("BUIL_GPSN >=", value, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnLessThan(String value) {
            addCriterion("BUIL_GPSN <", value, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnLessThanOrEqualTo(String value) {
            addCriterion("BUIL_GPSN <=", value, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnLike(String value) {
            addCriterion("BUIL_GPSN like", value, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnNotLike(String value) {
            addCriterion("BUIL_GPSN not like", value, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnIn(List<String> values) {
            addCriterion("BUIL_GPSN in", values, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnNotIn(List<String> values) {
            addCriterion("BUIL_GPSN not in", values, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnBetween(String value1, String value2) {
            addCriterion("BUIL_GPSN between", value1, value2, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilGpsnNotBetween(String value1, String value2) {
            addCriterion("BUIL_GPSN not between", value1, value2, "builGpsn");
            return (Criteria) this;
        }

        public Criteria andBuilTypeIsNull() {
            addCriterion("BUIL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBuilTypeIsNotNull() {
            addCriterion("BUIL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBuilTypeEqualTo(String value) {
            addCriterion("BUIL_TYPE =", value, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeNotEqualTo(String value) {
            addCriterion("BUIL_TYPE <>", value, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeGreaterThan(String value) {
            addCriterion("BUIL_TYPE >", value, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUIL_TYPE >=", value, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeLessThan(String value) {
            addCriterion("BUIL_TYPE <", value, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeLessThanOrEqualTo(String value) {
            addCriterion("BUIL_TYPE <=", value, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeLike(String value) {
            addCriterion("BUIL_TYPE like", value, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeNotLike(String value) {
            addCriterion("BUIL_TYPE not like", value, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeIn(List<String> values) {
            addCriterion("BUIL_TYPE in", values, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeNotIn(List<String> values) {
            addCriterion("BUIL_TYPE not in", values, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeBetween(String value1, String value2) {
            addCriterion("BUIL_TYPE between", value1, value2, "builType");
            return (Criteria) this;
        }

        public Criteria andBuilTypeNotBetween(String value1, String value2) {
            addCriterion("BUIL_TYPE not between", value1, value2, "builType");
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

        public Criteria andBuilAddrIsNull() {
            addCriterion("BUIL_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andBuilAddrIsNotNull() {
            addCriterion("BUIL_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBuilAddrEqualTo(String value) {
            addCriterion("BUIL_ADDR =", value, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrNotEqualTo(String value) {
            addCriterion("BUIL_ADDR <>", value, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrGreaterThan(String value) {
            addCriterion("BUIL_ADDR >", value, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrGreaterThanOrEqualTo(String value) {
            addCriterion("BUIL_ADDR >=", value, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrLessThan(String value) {
            addCriterion("BUIL_ADDR <", value, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrLessThanOrEqualTo(String value) {
            addCriterion("BUIL_ADDR <=", value, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrLike(String value) {
            addCriterion("BUIL_ADDR like", value, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrNotLike(String value) {
            addCriterion("BUIL_ADDR not like", value, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrIn(List<String> values) {
            addCriterion("BUIL_ADDR in", values, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrNotIn(List<String> values) {
            addCriterion("BUIL_ADDR not in", values, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrBetween(String value1, String value2) {
            addCriterion("BUIL_ADDR between", value1, value2, "builAddr");
            return (Criteria) this;
        }

        public Criteria andBuilAddrNotBetween(String value1, String value2) {
            addCriterion("BUIL_ADDR not between", value1, value2, "builAddr");
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