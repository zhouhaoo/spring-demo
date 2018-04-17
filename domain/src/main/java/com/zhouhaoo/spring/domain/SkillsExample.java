package com.zhouhaoo.spring.domain;

import java.util.ArrayList;
import java.util.List;

public class SkillsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SkillsExample() {
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

        public Criteria andSkillidIsNull() {
            addCriterion("SkillID is null");
            return (Criteria) this;
        }

        public Criteria andSkillidIsNotNull() {
            addCriterion("SkillID is not null");
            return (Criteria) this;
        }

        public Criteria andSkillidEqualTo(Integer value) {
            addCriterion("SkillID =", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotEqualTo(Integer value) {
            addCriterion("SkillID <>", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidGreaterThan(Integer value) {
            addCriterion("SkillID >", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SkillID >=", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLessThan(Integer value) {
            addCriterion("SkillID <", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidLessThanOrEqualTo(Integer value) {
            addCriterion("SkillID <=", value, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidIn(List<Integer> values) {
            addCriterion("SkillID in", values, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotIn(List<Integer> values) {
            addCriterion("SkillID not in", values, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidBetween(Integer value1, Integer value2) {
            addCriterion("SkillID between", value1, value2, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillidNotBetween(Integer value1, Integer value2) {
            addCriterion("SkillID not between", value1, value2, "skillid");
            return (Criteria) this;
        }

        public Criteria andSkillnameIsNull() {
            addCriterion("SkillName is null");
            return (Criteria) this;
        }

        public Criteria andSkillnameIsNotNull() {
            addCriterion("SkillName is not null");
            return (Criteria) this;
        }

        public Criteria andSkillnameEqualTo(String value) {
            addCriterion("SkillName =", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameNotEqualTo(String value) {
            addCriterion("SkillName <>", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameGreaterThan(String value) {
            addCriterion("SkillName >", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameGreaterThanOrEqualTo(String value) {
            addCriterion("SkillName >=", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameLessThan(String value) {
            addCriterion("SkillName <", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameLessThanOrEqualTo(String value) {
            addCriterion("SkillName <=", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameLike(String value) {
            addCriterion("SkillName like", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameNotLike(String value) {
            addCriterion("SkillName not like", value, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameIn(List<String> values) {
            addCriterion("SkillName in", values, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameNotIn(List<String> values) {
            addCriterion("SkillName not in", values, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameBetween(String value1, String value2) {
            addCriterion("SkillName between", value1, value2, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkillnameNotBetween(String value1, String value2) {
            addCriterion("SkillName not between", value1, value2, "skillname");
            return (Criteria) this;
        }

        public Criteria andSkilltypeIsNull() {
            addCriterion("SkillType is null");
            return (Criteria) this;
        }

        public Criteria andSkilltypeIsNotNull() {
            addCriterion("SkillType is not null");
            return (Criteria) this;
        }

        public Criteria andSkilltypeEqualTo(String value) {
            addCriterion("SkillType =", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeNotEqualTo(String value) {
            addCriterion("SkillType <>", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeGreaterThan(String value) {
            addCriterion("SkillType >", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("SkillType >=", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeLessThan(String value) {
            addCriterion("SkillType <", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeLessThanOrEqualTo(String value) {
            addCriterion("SkillType <=", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeLike(String value) {
            addCriterion("SkillType like", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeNotLike(String value) {
            addCriterion("SkillType not like", value, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeIn(List<String> values) {
            addCriterion("SkillType in", values, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeNotIn(List<String> values) {
            addCriterion("SkillType not in", values, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeBetween(String value1, String value2) {
            addCriterion("SkillType between", value1, value2, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkilltypeNotBetween(String value1, String value2) {
            addCriterion("SkillType not between", value1, value2, "skilltype");
            return (Criteria) this;
        }

        public Criteria andSkillnameLikeInsensitive(String value) {
            addCriterion("upper(SkillName) like", value.toUpperCase(), "skillname");
            return (Criteria) this;
        }

        public Criteria andSkilltypeLikeInsensitive(String value) {
            addCriterion("upper(SkillType) like", value.toUpperCase(), "skilltype");
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