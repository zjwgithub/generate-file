package com.lifengdi.job.example;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

/**
 * 任务类型操作日志
 * 
 * @author goddess
 * 2019-09-05
 */
public class JobTypeLogCondition {
    /**
     * 排序字段
     */
    protected String orderByClause;

    /**
     * 过滤重复数据
     */
    protected boolean distinct;

    /**
     * 查询条件
     */
    protected List<Criteria> oredCriteria;

    /**
     * 构造查询条件
     */
    public JobTypeLogCondition() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置排序字段
     *
     * @param orderByClause String 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取排序字段
     * 
     * @return String
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置过滤重复数据
     *
     * @param distinct boolean 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 是否过滤重复数据
     * 
     * @return boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取当前的查询条件实例
     * 
     * @return List<Criteria>
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     *
     * @param criteria Criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * 
     * @return Criteria
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 创建一个查询条件
     * 
     * @return Criteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 内部构建查询条件对象
     * 
     * @return Criteria
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 清除查询条件
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *t_job_type_log 2019-09-05
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdIsNull() {
            addCriterion("job_type_id is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdIsNotNull() {
            addCriterion("job_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdEqualTo(String value) {
            addCriterion("job_type_id =", value, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdNotEqualTo(String value) {
            addCriterion("job_type_id <>", value, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdGreaterThan(String value) {
            addCriterion("job_type_id >", value, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("job_type_id >=", value, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdLessThan(String value) {
            addCriterion("job_type_id <", value, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdLessThanOrEqualTo(String value) {
            addCriterion("job_type_id <=", value, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdLike(String value) {
            addCriterion("job_type_id like", value, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdNotLike(String value) {
            addCriterion("job_type_id not like", value, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdIn(List<String> values) {
            addCriterion("job_type_id in", values, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdNotIn(List<String> values) {
            addCriterion("job_type_id not in", values, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdBetween(String value1, String value2) {
            addCriterion("job_type_id between", value1, value2, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andJobTypeIdNotBetween(String value1, String value2) {
            addCriterion("job_type_id not between", value1, value2, "jobTypeId");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("operate_type is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("operate_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(String value) {
            addCriterion("operate_type =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(String value) {
            addCriterion("operate_type <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(String value) {
            addCriterion("operate_type >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operate_type >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(String value) {
            addCriterion("operate_type <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(String value) {
            addCriterion("operate_type <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLike(String value) {
            addCriterion("operate_type like", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotLike(String value) {
            addCriterion("operate_type not like", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<String> values) {
            addCriterion("operate_type in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<String> values) {
            addCriterion("operate_type not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(String value1, String value2) {
            addCriterion("operate_type between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(String value1, String value2) {
            addCriterion("operate_type not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOldContentIsNull() {
            addCriterion("old_content is null");
            return (Criteria) this;
        }

        public Criteria andOldContentIsNotNull() {
            addCriterion("old_content is not null");
            return (Criteria) this;
        }

        public Criteria andOldContentEqualTo(String value) {
            addCriterion("old_content =", value, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentNotEqualTo(String value) {
            addCriterion("old_content <>", value, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentGreaterThan(String value) {
            addCriterion("old_content >", value, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentGreaterThanOrEqualTo(String value) {
            addCriterion("old_content >=", value, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentLessThan(String value) {
            addCriterion("old_content <", value, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentLessThanOrEqualTo(String value) {
            addCriterion("old_content <=", value, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentLike(String value) {
            addCriterion("old_content like", value, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentNotLike(String value) {
            addCriterion("old_content not like", value, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentIn(List<String> values) {
            addCriterion("old_content in", values, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentNotIn(List<String> values) {
            addCriterion("old_content not in", values, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentBetween(String value1, String value2) {
            addCriterion("old_content between", value1, value2, "oldContent");
            return (Criteria) this;
        }

        public Criteria andOldContentNotBetween(String value1, String value2) {
            addCriterion("old_content not between", value1, value2, "oldContent");
            return (Criteria) this;
        }

        public Criteria andNewContentIsNull() {
            addCriterion("new_content is null");
            return (Criteria) this;
        }

        public Criteria andNewContentIsNotNull() {
            addCriterion("new_content is not null");
            return (Criteria) this;
        }

        public Criteria andNewContentEqualTo(String value) {
            addCriterion("new_content =", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentNotEqualTo(String value) {
            addCriterion("new_content <>", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentGreaterThan(String value) {
            addCriterion("new_content >", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentGreaterThanOrEqualTo(String value) {
            addCriterion("new_content >=", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentLessThan(String value) {
            addCriterion("new_content <", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentLessThanOrEqualTo(String value) {
            addCriterion("new_content <=", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentLike(String value) {
            addCriterion("new_content like", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentNotLike(String value) {
            addCriterion("new_content not like", value, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentIn(List<String> values) {
            addCriterion("new_content in", values, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentNotIn(List<String> values) {
            addCriterion("new_content not in", values, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentBetween(String value1, String value2) {
            addCriterion("new_content between", value1, value2, "newContent");
            return (Criteria) this;
        }

        public Criteria andNewContentNotBetween(String value1, String value2) {
            addCriterion("new_content not between", value1, value2, "newContent");
            return (Criteria) this;
        }

        public Criteria andOperateDescIsNull() {
            addCriterion("operate_desc is null");
            return (Criteria) this;
        }

        public Criteria andOperateDescIsNotNull() {
            addCriterion("operate_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDescEqualTo(String value) {
            addCriterion("operate_desc =", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotEqualTo(String value) {
            addCriterion("operate_desc <>", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescGreaterThan(String value) {
            addCriterion("operate_desc >", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescGreaterThanOrEqualTo(String value) {
            addCriterion("operate_desc >=", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescLessThan(String value) {
            addCriterion("operate_desc <", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescLessThanOrEqualTo(String value) {
            addCriterion("operate_desc <=", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescLike(String value) {
            addCriterion("operate_desc like", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotLike(String value) {
            addCriterion("operate_desc not like", value, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescIn(List<String> values) {
            addCriterion("operate_desc in", values, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotIn(List<String> values) {
            addCriterion("operate_desc not in", values, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescBetween(String value1, String value2) {
            addCriterion("operate_desc between", value1, value2, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andOperateDescNotBetween(String value1, String value2) {
            addCriterion("operate_desc not between", value1, value2, "operateDesc");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Instant value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Instant value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Instant value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Instant value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Instant value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Instant value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Instant> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Instant> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Instant value1, Instant value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Instant value1, Instant value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }
    }

    /**
     * t_job_type_log
     * @author goddess 2019-09-05
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *t_job_type_log 2019-09-05
     */
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