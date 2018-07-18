package zhenghang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonExample() {
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

        public Criteria andPersIdIsNull() {
            addCriterion("PERS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPersIdIsNotNull() {
            addCriterion("PERS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPersIdEqualTo(Integer value) {
            addCriterion("PERS_ID =", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotEqualTo(Integer value) {
            addCriterion("PERS_ID <>", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdGreaterThan(Integer value) {
            addCriterion("PERS_ID >", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERS_ID >=", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLessThan(Integer value) {
            addCriterion("PERS_ID <", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdLessThanOrEqualTo(Integer value) {
            addCriterion("PERS_ID <=", value, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdIn(List<Integer> values) {
            addCriterion("PERS_ID in", values, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotIn(List<Integer> values) {
            addCriterion("PERS_ID not in", values, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdBetween(Integer value1, Integer value2) {
            addCriterion("PERS_ID between", value1, value2, "persId");
            return (Criteria) this;
        }

        public Criteria andPersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PERS_ID not between", value1, value2, "persId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("ROOM_ID =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("ROOM_ID <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("ROOM_ID >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOM_ID >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("ROOM_ID <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("ROOM_ID <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("ROOM_ID in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("ROOM_ID not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_ID between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_ID not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andPersNameIsNull() {
            addCriterion("PERS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPersNameIsNotNull() {
            addCriterion("PERS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPersNameEqualTo(String value) {
            addCriterion("PERS_NAME =", value, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameNotEqualTo(String value) {
            addCriterion("PERS_NAME <>", value, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameGreaterThan(String value) {
            addCriterion("PERS_NAME >", value, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameGreaterThanOrEqualTo(String value) {
            addCriterion("PERS_NAME >=", value, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameLessThan(String value) {
            addCriterion("PERS_NAME <", value, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameLessThanOrEqualTo(String value) {
            addCriterion("PERS_NAME <=", value, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameLike(String value) {
            addCriterion("PERS_NAME like", value, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameNotLike(String value) {
            addCriterion("PERS_NAME not like", value, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameIn(List<String> values) {
            addCriterion("PERS_NAME in", values, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameNotIn(List<String> values) {
            addCriterion("PERS_NAME not in", values, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameBetween(String value1, String value2) {
            addCriterion("PERS_NAME between", value1, value2, "persName");
            return (Criteria) this;
        }

        public Criteria andPersNameNotBetween(String value1, String value2) {
            addCriterion("PERS_NAME not between", value1, value2, "persName");
            return (Criteria) this;
        }

        public Criteria andPersSexIsNull() {
            addCriterion("PERS_SEX is null");
            return (Criteria) this;
        }

        public Criteria andPersSexIsNotNull() {
            addCriterion("PERS_SEX is not null");
            return (Criteria) this;
        }

        public Criteria andPersSexEqualTo(Boolean value) {
            addCriterion("PERS_SEX =", value, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexNotEqualTo(Boolean value) {
            addCriterion("PERS_SEX <>", value, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexGreaterThan(Boolean value) {
            addCriterion("PERS_SEX >", value, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PERS_SEX >=", value, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexLessThan(Boolean value) {
            addCriterion("PERS_SEX <", value, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexLessThanOrEqualTo(Boolean value) {
            addCriterion("PERS_SEX <=", value, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexIn(List<Boolean> values) {
            addCriterion("PERS_SEX in", values, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexNotIn(List<Boolean> values) {
            addCriterion("PERS_SEX not in", values, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexBetween(Boolean value1, Boolean value2) {
            addCriterion("PERS_SEX between", value1, value2, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PERS_SEX not between", value1, value2, "persSex");
            return (Criteria) this;
        }

        public Criteria andPersIdcardIsNull() {
            addCriterion("PERS_IDCARD is null");
            return (Criteria) this;
        }

        public Criteria andPersIdcardIsNotNull() {
            addCriterion("PERS_IDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andPersIdcardEqualTo(String value) {
            addCriterion("PERS_IDCARD =", value, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardNotEqualTo(String value) {
            addCriterion("PERS_IDCARD <>", value, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardGreaterThan(String value) {
            addCriterion("PERS_IDCARD >", value, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("PERS_IDCARD >=", value, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardLessThan(String value) {
            addCriterion("PERS_IDCARD <", value, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardLessThanOrEqualTo(String value) {
            addCriterion("PERS_IDCARD <=", value, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardLike(String value) {
            addCriterion("PERS_IDCARD like", value, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardNotLike(String value) {
            addCriterion("PERS_IDCARD not like", value, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardIn(List<String> values) {
            addCriterion("PERS_IDCARD in", values, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardNotIn(List<String> values) {
            addCriterion("PERS_IDCARD not in", values, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardBetween(String value1, String value2) {
            addCriterion("PERS_IDCARD between", value1, value2, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersIdcardNotBetween(String value1, String value2) {
            addCriterion("PERS_IDCARD not between", value1, value2, "persIdcard");
            return (Criteria) this;
        }

        public Criteria andPersPhoneIsNull() {
            addCriterion("PERS_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPersPhoneIsNotNull() {
            addCriterion("PERS_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPersPhoneEqualTo(String value) {
            addCriterion("PERS_PHONE =", value, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneNotEqualTo(String value) {
            addCriterion("PERS_PHONE <>", value, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneGreaterThan(String value) {
            addCriterion("PERS_PHONE >", value, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PERS_PHONE >=", value, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneLessThan(String value) {
            addCriterion("PERS_PHONE <", value, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneLessThanOrEqualTo(String value) {
            addCriterion("PERS_PHONE <=", value, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneLike(String value) {
            addCriterion("PERS_PHONE like", value, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneNotLike(String value) {
            addCriterion("PERS_PHONE not like", value, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneIn(List<String> values) {
            addCriterion("PERS_PHONE in", values, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneNotIn(List<String> values) {
            addCriterion("PERS_PHONE not in", values, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneBetween(String value1, String value2) {
            addCriterion("PERS_PHONE between", value1, value2, "persPhone");
            return (Criteria) this;
        }

        public Criteria andPersPhoneNotBetween(String value1, String value2) {
            addCriterion("PERS_PHONE not between", value1, value2, "persPhone");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterIsNull() {
            addCriterion("TIME_REGISTER is null");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterIsNotNull() {
            addCriterion("TIME_REGISTER is not null");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterEqualTo(Date value) {
            addCriterion("TIME_REGISTER =", value, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterNotEqualTo(Date value) {
            addCriterion("TIME_REGISTER <>", value, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterGreaterThan(Date value) {
            addCriterion("TIME_REGISTER >", value, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_REGISTER >=", value, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterLessThan(Date value) {
            addCriterion("TIME_REGISTER <", value, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterLessThanOrEqualTo(Date value) {
            addCriterion("TIME_REGISTER <=", value, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterIn(List<Date> values) {
            addCriterion("TIME_REGISTER in", values, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterNotIn(List<Date> values) {
            addCriterion("TIME_REGISTER not in", values, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterBetween(Date value1, Date value2) {
            addCriterion("TIME_REGISTER between", value1, value2, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andTimeRegisterNotBetween(Date value1, Date value2) {
            addCriterion("TIME_REGISTER not between", value1, value2, "timeRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterIsNull() {
            addCriterion("WHY_REGISTER is null");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterIsNotNull() {
            addCriterion("WHY_REGISTER is not null");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterEqualTo(String value) {
            addCriterion("WHY_REGISTER =", value, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterNotEqualTo(String value) {
            addCriterion("WHY_REGISTER <>", value, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterGreaterThan(String value) {
            addCriterion("WHY_REGISTER >", value, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("WHY_REGISTER >=", value, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterLessThan(String value) {
            addCriterion("WHY_REGISTER <", value, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterLessThanOrEqualTo(String value) {
            addCriterion("WHY_REGISTER <=", value, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterLike(String value) {
            addCriterion("WHY_REGISTER like", value, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterNotLike(String value) {
            addCriterion("WHY_REGISTER not like", value, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterIn(List<String> values) {
            addCriterion("WHY_REGISTER in", values, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterNotIn(List<String> values) {
            addCriterion("WHY_REGISTER not in", values, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterBetween(String value1, String value2) {
            addCriterion("WHY_REGISTER between", value1, value2, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andWhyRegisterNotBetween(String value1, String value2) {
            addCriterion("WHY_REGISTER not between", value1, value2, "whyRegister");
            return (Criteria) this;
        }

        public Criteria andAddrCensusIsNull() {
            addCriterion("ADDR_CENSUS is null");
            return (Criteria) this;
        }

        public Criteria andAddrCensusIsNotNull() {
            addCriterion("ADDR_CENSUS is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCensusEqualTo(String value) {
            addCriterion("ADDR_CENSUS =", value, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusNotEqualTo(String value) {
            addCriterion("ADDR_CENSUS <>", value, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusGreaterThan(String value) {
            addCriterion("ADDR_CENSUS >", value, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_CENSUS >=", value, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusLessThan(String value) {
            addCriterion("ADDR_CENSUS <", value, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusLessThanOrEqualTo(String value) {
            addCriterion("ADDR_CENSUS <=", value, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusLike(String value) {
            addCriterion("ADDR_CENSUS like", value, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusNotLike(String value) {
            addCriterion("ADDR_CENSUS not like", value, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusIn(List<String> values) {
            addCriterion("ADDR_CENSUS in", values, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusNotIn(List<String> values) {
            addCriterion("ADDR_CENSUS not in", values, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusBetween(String value1, String value2) {
            addCriterion("ADDR_CENSUS between", value1, value2, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrCensusNotBetween(String value1, String value2) {
            addCriterion("ADDR_CENSUS not between", value1, value2, "addrCensus");
            return (Criteria) this;
        }

        public Criteria andAddrLiveIsNull() {
            addCriterion("ADDR_LIVE is null");
            return (Criteria) this;
        }

        public Criteria andAddrLiveIsNotNull() {
            addCriterion("ADDR_LIVE is not null");
            return (Criteria) this;
        }

        public Criteria andAddrLiveEqualTo(String value) {
            addCriterion("ADDR_LIVE =", value, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveNotEqualTo(String value) {
            addCriterion("ADDR_LIVE <>", value, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveGreaterThan(String value) {
            addCriterion("ADDR_LIVE >", value, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_LIVE >=", value, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveLessThan(String value) {
            addCriterion("ADDR_LIVE <", value, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveLessThanOrEqualTo(String value) {
            addCriterion("ADDR_LIVE <=", value, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveLike(String value) {
            addCriterion("ADDR_LIVE like", value, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveNotLike(String value) {
            addCriterion("ADDR_LIVE not like", value, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveIn(List<String> values) {
            addCriterion("ADDR_LIVE in", values, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveNotIn(List<String> values) {
            addCriterion("ADDR_LIVE not in", values, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveBetween(String value1, String value2) {
            addCriterion("ADDR_LIVE between", value1, value2, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrLiveNotBetween(String value1, String value2) {
            addCriterion("ADDR_LIVE not between", value1, value2, "addrLive");
            return (Criteria) this;
        }

        public Criteria andAddrWorkIsNull() {
            addCriterion("ADDR_WORK is null");
            return (Criteria) this;
        }

        public Criteria andAddrWorkIsNotNull() {
            addCriterion("ADDR_WORK is not null");
            return (Criteria) this;
        }

        public Criteria andAddrWorkEqualTo(String value) {
            addCriterion("ADDR_WORK =", value, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkNotEqualTo(String value) {
            addCriterion("ADDR_WORK <>", value, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkGreaterThan(String value) {
            addCriterion("ADDR_WORK >", value, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_WORK >=", value, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkLessThan(String value) {
            addCriterion("ADDR_WORK <", value, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkLessThanOrEqualTo(String value) {
            addCriterion("ADDR_WORK <=", value, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkLike(String value) {
            addCriterion("ADDR_WORK like", value, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkNotLike(String value) {
            addCriterion("ADDR_WORK not like", value, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkIn(List<String> values) {
            addCriterion("ADDR_WORK in", values, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkNotIn(List<String> values) {
            addCriterion("ADDR_WORK not in", values, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkBetween(String value1, String value2) {
            addCriterion("ADDR_WORK between", value1, value2, "addrWork");
            return (Criteria) this;
        }

        public Criteria andAddrWorkNotBetween(String value1, String value2) {
            addCriterion("ADDR_WORK not between", value1, value2, "addrWork");
            return (Criteria) this;
        }

        public Criteria andIsFocusIsNull() {
            addCriterion("IS_FOCUS is null");
            return (Criteria) this;
        }

        public Criteria andIsFocusIsNotNull() {
            addCriterion("IS_FOCUS is not null");
            return (Criteria) this;
        }

        public Criteria andIsFocusEqualTo(Boolean value) {
            addCriterion("IS_FOCUS =", value, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusNotEqualTo(Boolean value) {
            addCriterion("IS_FOCUS <>", value, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusGreaterThan(Boolean value) {
            addCriterion("IS_FOCUS >", value, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_FOCUS >=", value, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusLessThan(Boolean value) {
            addCriterion("IS_FOCUS <", value, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_FOCUS <=", value, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusIn(List<Boolean> values) {
            addCriterion("IS_FOCUS in", values, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusNotIn(List<Boolean> values) {
            addCriterion("IS_FOCUS not in", values, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FOCUS between", value1, value2, "isFocus");
            return (Criteria) this;
        }

        public Criteria andIsFocusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FOCUS not between", value1, value2, "isFocus");
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

        public Criteria andPersTypeIsNull() {
            addCriterion("PERS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPersTypeIsNotNull() {
            addCriterion("PERS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPersTypeEqualTo(Integer value) {
            addCriterion("PERS_TYPE =", value, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeNotEqualTo(Integer value) {
            addCriterion("PERS_TYPE <>", value, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeGreaterThan(Integer value) {
            addCriterion("PERS_TYPE >", value, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PERS_TYPE >=", value, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeLessThan(Integer value) {
            addCriterion("PERS_TYPE <", value, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PERS_TYPE <=", value, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeIn(List<Integer> values) {
            addCriterion("PERS_TYPE in", values, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeNotIn(List<Integer> values) {
            addCriterion("PERS_TYPE not in", values, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeBetween(Integer value1, Integer value2) {
            addCriterion("PERS_TYPE between", value1, value2, "persType");
            return (Criteria) this;
        }

        public Criteria andPersTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PERS_TYPE not between", value1, value2, "persType");
            return (Criteria) this;
        }

        public Criteria andPersPhotoIsNull() {
            addCriterion("PERS_PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPersPhotoIsNotNull() {
            addCriterion("PERS_PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPersPhotoEqualTo(String value) {
            addCriterion("PERS_PHOTO =", value, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoNotEqualTo(String value) {
            addCriterion("PERS_PHOTO <>", value, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoGreaterThan(String value) {
            addCriterion("PERS_PHOTO >", value, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PERS_PHOTO >=", value, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoLessThan(String value) {
            addCriterion("PERS_PHOTO <", value, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoLessThanOrEqualTo(String value) {
            addCriterion("PERS_PHOTO <=", value, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoLike(String value) {
            addCriterion("PERS_PHOTO like", value, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoNotLike(String value) {
            addCriterion("PERS_PHOTO not like", value, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoIn(List<String> values) {
            addCriterion("PERS_PHOTO in", values, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoNotIn(List<String> values) {
            addCriterion("PERS_PHOTO not in", values, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoBetween(String value1, String value2) {
            addCriterion("PERS_PHOTO between", value1, value2, "persPhoto");
            return (Criteria) this;
        }

        public Criteria andPersPhotoNotBetween(String value1, String value2) {
            addCriterion("PERS_PHOTO not between", value1, value2, "persPhoto");
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