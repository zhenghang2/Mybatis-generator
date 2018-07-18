package zhenghang.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRoomUnitIsNull() {
            addCriterion("ROOM_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andRoomUnitIsNotNull() {
            addCriterion("ROOM_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andRoomUnitEqualTo(Integer value) {
            addCriterion("ROOM_UNIT =", value, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitNotEqualTo(Integer value) {
            addCriterion("ROOM_UNIT <>", value, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitGreaterThan(Integer value) {
            addCriterion("ROOM_UNIT >", value, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOM_UNIT >=", value, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitLessThan(Integer value) {
            addCriterion("ROOM_UNIT <", value, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitLessThanOrEqualTo(Integer value) {
            addCriterion("ROOM_UNIT <=", value, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitIn(List<Integer> values) {
            addCriterion("ROOM_UNIT in", values, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitNotIn(List<Integer> values) {
            addCriterion("ROOM_UNIT not in", values, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_UNIT between", value1, value2, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_UNIT not between", value1, value2, "roomUnit");
            return (Criteria) this;
        }

        public Criteria andRoomFloorIsNull() {
            addCriterion("ROOM_FLOOR is null");
            return (Criteria) this;
        }

        public Criteria andRoomFloorIsNotNull() {
            addCriterion("ROOM_FLOOR is not null");
            return (Criteria) this;
        }

        public Criteria andRoomFloorEqualTo(Integer value) {
            addCriterion("ROOM_FLOOR =", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorNotEqualTo(Integer value) {
            addCriterion("ROOM_FLOOR <>", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorGreaterThan(Integer value) {
            addCriterion("ROOM_FLOOR >", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOM_FLOOR >=", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorLessThan(Integer value) {
            addCriterion("ROOM_FLOOR <", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorLessThanOrEqualTo(Integer value) {
            addCriterion("ROOM_FLOOR <=", value, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorIn(List<Integer> values) {
            addCriterion("ROOM_FLOOR in", values, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorNotIn(List<Integer> values) {
            addCriterion("ROOM_FLOOR not in", values, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_FLOOR between", value1, value2, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomFloorNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_FLOOR not between", value1, value2, "roomFloor");
            return (Criteria) this;
        }

        public Criteria andRoomNoIsNull() {
            addCriterion("ROOM_NO is null");
            return (Criteria) this;
        }

        public Criteria andRoomNoIsNotNull() {
            addCriterion("ROOM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNoEqualTo(String value) {
            addCriterion("ROOM_NO =", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotEqualTo(String value) {
            addCriterion("ROOM_NO <>", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoGreaterThan(String value) {
            addCriterion("ROOM_NO >", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_NO >=", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLessThan(String value) {
            addCriterion("ROOM_NO <", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLessThanOrEqualTo(String value) {
            addCriterion("ROOM_NO <=", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoLike(String value) {
            addCriterion("ROOM_NO like", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotLike(String value) {
            addCriterion("ROOM_NO not like", value, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoIn(List<String> values) {
            addCriterion("ROOM_NO in", values, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotIn(List<String> values) {
            addCriterion("ROOM_NO not in", values, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoBetween(String value1, String value2) {
            addCriterion("ROOM_NO between", value1, value2, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomNoNotBetween(String value1, String value2) {
            addCriterion("ROOM_NO not between", value1, value2, "roomNo");
            return (Criteria) this;
        }

        public Criteria andRoomClassIsNull() {
            addCriterion("ROOM_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andRoomClassIsNotNull() {
            addCriterion("ROOM_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andRoomClassEqualTo(String value) {
            addCriterion("ROOM_CLASS =", value, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassNotEqualTo(String value) {
            addCriterion("ROOM_CLASS <>", value, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassGreaterThan(String value) {
            addCriterion("ROOM_CLASS >", value, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_CLASS >=", value, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassLessThan(String value) {
            addCriterion("ROOM_CLASS <", value, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassLessThanOrEqualTo(String value) {
            addCriterion("ROOM_CLASS <=", value, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassLike(String value) {
            addCriterion("ROOM_CLASS like", value, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassNotLike(String value) {
            addCriterion("ROOM_CLASS not like", value, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassIn(List<String> values) {
            addCriterion("ROOM_CLASS in", values, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassNotIn(List<String> values) {
            addCriterion("ROOM_CLASS not in", values, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassBetween(String value1, String value2) {
            addCriterion("ROOM_CLASS between", value1, value2, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomClassNotBetween(String value1, String value2) {
            addCriterion("ROOM_CLASS not between", value1, value2, "roomClass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassIsNull() {
            addCriterion("ROOM_SUBCLASS is null");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassIsNotNull() {
            addCriterion("ROOM_SUBCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassEqualTo(String value) {
            addCriterion("ROOM_SUBCLASS =", value, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassNotEqualTo(String value) {
            addCriterion("ROOM_SUBCLASS <>", value, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassGreaterThan(String value) {
            addCriterion("ROOM_SUBCLASS >", value, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_SUBCLASS >=", value, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassLessThan(String value) {
            addCriterion("ROOM_SUBCLASS <", value, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassLessThanOrEqualTo(String value) {
            addCriterion("ROOM_SUBCLASS <=", value, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassLike(String value) {
            addCriterion("ROOM_SUBCLASS like", value, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassNotLike(String value) {
            addCriterion("ROOM_SUBCLASS not like", value, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassIn(List<String> values) {
            addCriterion("ROOM_SUBCLASS in", values, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassNotIn(List<String> values) {
            addCriterion("ROOM_SUBCLASS not in", values, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassBetween(String value1, String value2) {
            addCriterion("ROOM_SUBCLASS between", value1, value2, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andRoomSubclassNotBetween(String value1, String value2) {
            addCriterion("ROOM_SUBCLASS not between", value1, value2, "roomSubclass");
            return (Criteria) this;
        }

        public Criteria andCountInspectIsNull() {
            addCriterion("COUNT_INSPECT is null");
            return (Criteria) this;
        }

        public Criteria andCountInspectIsNotNull() {
            addCriterion("COUNT_INSPECT is not null");
            return (Criteria) this;
        }

        public Criteria andCountInspectEqualTo(Integer value) {
            addCriterion("COUNT_INSPECT =", value, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectNotEqualTo(Integer value) {
            addCriterion("COUNT_INSPECT <>", value, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectGreaterThan(Integer value) {
            addCriterion("COUNT_INSPECT >", value, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectGreaterThanOrEqualTo(Integer value) {
            addCriterion("COUNT_INSPECT >=", value, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectLessThan(Integer value) {
            addCriterion("COUNT_INSPECT <", value, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectLessThanOrEqualTo(Integer value) {
            addCriterion("COUNT_INSPECT <=", value, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectIn(List<Integer> values) {
            addCriterion("COUNT_INSPECT in", values, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectNotIn(List<Integer> values) {
            addCriterion("COUNT_INSPECT not in", values, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_INSPECT between", value1, value2, "countInspect");
            return (Criteria) this;
        }

        public Criteria andCountInspectNotBetween(Integer value1, Integer value2) {
            addCriterion("COUNT_INSPECT not between", value1, value2, "countInspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectIsNull() {
            addCriterion("TIME_LASTINSPECT is null");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectIsNotNull() {
            addCriterion("TIME_LASTINSPECT is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectEqualTo(Date value) {
            addCriterion("TIME_LASTINSPECT =", value, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectNotEqualTo(Date value) {
            addCriterion("TIME_LASTINSPECT <>", value, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectGreaterThan(Date value) {
            addCriterion("TIME_LASTINSPECT >", value, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectGreaterThanOrEqualTo(Date value) {
            addCriterion("TIME_LASTINSPECT >=", value, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectLessThan(Date value) {
            addCriterion("TIME_LASTINSPECT <", value, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectLessThanOrEqualTo(Date value) {
            addCriterion("TIME_LASTINSPECT <=", value, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectIn(List<Date> values) {
            addCriterion("TIME_LASTINSPECT in", values, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectNotIn(List<Date> values) {
            addCriterion("TIME_LASTINSPECT not in", values, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectBetween(Date value1, Date value2) {
            addCriterion("TIME_LASTINSPECT between", value1, value2, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andTimeLastinspectNotBetween(Date value1, Date value2) {
            addCriterion("TIME_LASTINSPECT not between", value1, value2, "timeLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectIsNull() {
            addCriterion("REC_LASTINSPECT is null");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectIsNotNull() {
            addCriterion("REC_LASTINSPECT is not null");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectEqualTo(String value) {
            addCriterion("REC_LASTINSPECT =", value, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectNotEqualTo(String value) {
            addCriterion("REC_LASTINSPECT <>", value, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectGreaterThan(String value) {
            addCriterion("REC_LASTINSPECT >", value, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectGreaterThanOrEqualTo(String value) {
            addCriterion("REC_LASTINSPECT >=", value, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectLessThan(String value) {
            addCriterion("REC_LASTINSPECT <", value, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectLessThanOrEqualTo(String value) {
            addCriterion("REC_LASTINSPECT <=", value, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectLike(String value) {
            addCriterion("REC_LASTINSPECT like", value, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectNotLike(String value) {
            addCriterion("REC_LASTINSPECT not like", value, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectIn(List<String> values) {
            addCriterion("REC_LASTINSPECT in", values, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectNotIn(List<String> values) {
            addCriterion("REC_LASTINSPECT not in", values, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectBetween(String value1, String value2) {
            addCriterion("REC_LASTINSPECT between", value1, value2, "recLastinspect");
            return (Criteria) this;
        }

        public Criteria andRecLastinspectNotBetween(String value1, String value2) {
            addCriterion("REC_LASTINSPECT not between", value1, value2, "recLastinspect");
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

        public Criteria andIsDrugIsNull() {
            addCriterion("IS_DRUG is null");
            return (Criteria) this;
        }

        public Criteria andIsDrugIsNotNull() {
            addCriterion("IS_DRUG is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrugEqualTo(Boolean value) {
            addCriterion("IS_DRUG =", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugNotEqualTo(Boolean value) {
            addCriterion("IS_DRUG <>", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugGreaterThan(Boolean value) {
            addCriterion("IS_DRUG >", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DRUG >=", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugLessThan(Boolean value) {
            addCriterion("IS_DRUG <", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DRUG <=", value, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugIn(List<Boolean> values) {
            addCriterion("IS_DRUG in", values, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugNotIn(List<Boolean> values) {
            addCriterion("IS_DRUG not in", values, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DRUG between", value1, value2, "isDrug");
            return (Criteria) this;
        }

        public Criteria andIsDrugNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DRUG not between", value1, value2, "isDrug");
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

        public Criteria andIsBoomIsNull() {
            addCriterion("IS_BOOM is null");
            return (Criteria) this;
        }

        public Criteria andIsBoomIsNotNull() {
            addCriterion("IS_BOOM is not null");
            return (Criteria) this;
        }

        public Criteria andIsBoomEqualTo(Boolean value) {
            addCriterion("IS_BOOM =", value, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomNotEqualTo(Boolean value) {
            addCriterion("IS_BOOM <>", value, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomGreaterThan(Boolean value) {
            addCriterion("IS_BOOM >", value, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_BOOM >=", value, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomLessThan(Boolean value) {
            addCriterion("IS_BOOM <", value, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_BOOM <=", value, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomIn(List<Boolean> values) {
            addCriterion("IS_BOOM in", values, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomNotIn(List<Boolean> values) {
            addCriterion("IS_BOOM not in", values, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_BOOM between", value1, value2, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsBoomNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_BOOM not between", value1, value2, "isBoom");
            return (Criteria) this;
        }

        public Criteria andIsToxicIsNull() {
            addCriterion("IS_TOXIC is null");
            return (Criteria) this;
        }

        public Criteria andIsToxicIsNotNull() {
            addCriterion("IS_TOXIC is not null");
            return (Criteria) this;
        }

        public Criteria andIsToxicEqualTo(Boolean value) {
            addCriterion("IS_TOXIC =", value, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicNotEqualTo(Boolean value) {
            addCriterion("IS_TOXIC <>", value, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicGreaterThan(Boolean value) {
            addCriterion("IS_TOXIC >", value, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_TOXIC >=", value, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicLessThan(Boolean value) {
            addCriterion("IS_TOXIC <", value, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_TOXIC <=", value, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicIn(List<Boolean> values) {
            addCriterion("IS_TOXIC in", values, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicNotIn(List<Boolean> values) {
            addCriterion("IS_TOXIC not in", values, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_TOXIC between", value1, value2, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsToxicNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_TOXIC not between", value1, value2, "isToxic");
            return (Criteria) this;
        }

        public Criteria andIsDangerIsNull() {
            addCriterion("IS_DANGER is null");
            return (Criteria) this;
        }

        public Criteria andIsDangerIsNotNull() {
            addCriterion("IS_DANGER is not null");
            return (Criteria) this;
        }

        public Criteria andIsDangerEqualTo(Boolean value) {
            addCriterion("IS_DANGER =", value, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerNotEqualTo(Boolean value) {
            addCriterion("IS_DANGER <>", value, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerGreaterThan(Boolean value) {
            addCriterion("IS_DANGER >", value, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_DANGER >=", value, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerLessThan(Boolean value) {
            addCriterion("IS_DANGER <", value, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_DANGER <=", value, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerIn(List<Boolean> values) {
            addCriterion("IS_DANGER in", values, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerNotIn(List<Boolean> values) {
            addCriterion("IS_DANGER not in", values, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DANGER between", value1, value2, "isDanger");
            return (Criteria) this;
        }

        public Criteria andIsDangerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_DANGER not between", value1, value2, "isDanger");
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