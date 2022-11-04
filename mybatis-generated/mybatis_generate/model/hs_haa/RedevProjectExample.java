package mybatis_generate.model.hs_haa;

import java.util.ArrayList;
import java.util.List;

public class RedevProjectExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public RedevProjectExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andRpPrjCodeIsNull() {
            addCriterion("RP_PRJ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeIsNotNull() {
            addCriterion("RP_PRJ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeEqualTo(String value) {
            addCriterion("RP_PRJ_CODE =", value, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeNotEqualTo(String value) {
            addCriterion("RP_PRJ_CODE <>", value, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeGreaterThan(String value) {
            addCriterion("RP_PRJ_CODE >", value, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RP_PRJ_CODE >=", value, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeLessThan(String value) {
            addCriterion("RP_PRJ_CODE <", value, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeLessThanOrEqualTo(String value) {
            addCriterion("RP_PRJ_CODE <=", value, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeLike(String value) {
            addCriterion("RP_PRJ_CODE like", value, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeNotLike(String value) {
            addCriterion("RP_PRJ_CODE not like", value, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeIn(List<String> values) {
            addCriterion("RP_PRJ_CODE in", values, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeNotIn(List<String> values) {
            addCriterion("RP_PRJ_CODE not in", values, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeBetween(String value1, String value2) {
            addCriterion("RP_PRJ_CODE between", value1, value2, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpPrjCodeNotBetween(String value1, String value2) {
            addCriterion("RP_PRJ_CODE not between", value1, value2, "rpPrjCode");
            return (Criteria) this;
        }

        public Criteria andRpActiveIsNull() {
            addCriterion("RP_ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andRpActiveIsNotNull() {
            addCriterion("RP_ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andRpActiveEqualTo(String value) {
            addCriterion("RP_ACTIVE =", value, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveNotEqualTo(String value) {
            addCriterion("RP_ACTIVE <>", value, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveGreaterThan(String value) {
            addCriterion("RP_ACTIVE >", value, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveGreaterThanOrEqualTo(String value) {
            addCriterion("RP_ACTIVE >=", value, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveLessThan(String value) {
            addCriterion("RP_ACTIVE <", value, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveLessThanOrEqualTo(String value) {
            addCriterion("RP_ACTIVE <=", value, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveLike(String value) {
            addCriterion("RP_ACTIVE like", value, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveNotLike(String value) {
            addCriterion("RP_ACTIVE not like", value, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveIn(List<String> values) {
            addCriterion("RP_ACTIVE in", values, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveNotIn(List<String> values) {
            addCriterion("RP_ACTIVE not in", values, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveBetween(String value1, String value2) {
            addCriterion("RP_ACTIVE between", value1, value2, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpActiveNotBetween(String value1, String value2) {
            addCriterion("RP_ACTIVE not between", value1, value2, "rpActive");
            return (Criteria) this;
        }

        public Criteria andRpCreateByIsNull() {
            addCriterion("RP_CREATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andRpCreateByIsNotNull() {
            addCriterion("RP_CREATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andRpCreateByEqualTo(String value) {
            addCriterion("RP_CREATE_BY =", value, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByNotEqualTo(String value) {
            addCriterion("RP_CREATE_BY <>", value, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByGreaterThan(String value) {
            addCriterion("RP_CREATE_BY >", value, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("RP_CREATE_BY >=", value, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByLessThan(String value) {
            addCriterion("RP_CREATE_BY <", value, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByLessThanOrEqualTo(String value) {
            addCriterion("RP_CREATE_BY <=", value, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByLike(String value) {
            addCriterion("RP_CREATE_BY like", value, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByNotLike(String value) {
            addCriterion("RP_CREATE_BY not like", value, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByIn(List<String> values) {
            addCriterion("RP_CREATE_BY in", values, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByNotIn(List<String> values) {
            addCriterion("RP_CREATE_BY not in", values, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByBetween(String value1, String value2) {
            addCriterion("RP_CREATE_BY between", value1, value2, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateByNotBetween(String value1, String value2) {
            addCriterion("RP_CREATE_BY not between", value1, value2, "rpCreateBy");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateIsNull() {
            addCriterion("RP_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateIsNotNull() {
            addCriterion("RP_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateEqualTo(String value) {
            addCriterion("RP_CREATE_DATE =", value, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateNotEqualTo(String value) {
            addCriterion("RP_CREATE_DATE <>", value, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateGreaterThan(String value) {
            addCriterion("RP_CREATE_DATE >", value, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("RP_CREATE_DATE >=", value, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateLessThan(String value) {
            addCriterion("RP_CREATE_DATE <", value, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateLessThanOrEqualTo(String value) {
            addCriterion("RP_CREATE_DATE <=", value, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateLike(String value) {
            addCriterion("RP_CREATE_DATE like", value, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateNotLike(String value) {
            addCriterion("RP_CREATE_DATE not like", value, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateIn(List<String> values) {
            addCriterion("RP_CREATE_DATE in", values, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateNotIn(List<String> values) {
            addCriterion("RP_CREATE_DATE not in", values, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateBetween(String value1, String value2) {
            addCriterion("RP_CREATE_DATE between", value1, value2, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpCreateDateNotBetween(String value1, String value2) {
            addCriterion("RP_CREATE_DATE not between", value1, value2, "rpCreateDate");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionIsNull() {
            addCriterion("RP_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionIsNotNull() {
            addCriterion("RP_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionEqualTo(String value) {
            addCriterion("RP_DESCRIPTION =", value, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionNotEqualTo(String value) {
            addCriterion("RP_DESCRIPTION <>", value, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionGreaterThan(String value) {
            addCriterion("RP_DESCRIPTION >", value, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("RP_DESCRIPTION >=", value, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionLessThan(String value) {
            addCriterion("RP_DESCRIPTION <", value, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionLessThanOrEqualTo(String value) {
            addCriterion("RP_DESCRIPTION <=", value, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionLike(String value) {
            addCriterion("RP_DESCRIPTION like", value, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionNotLike(String value) {
            addCriterion("RP_DESCRIPTION not like", value, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionIn(List<String> values) {
            addCriterion("RP_DESCRIPTION in", values, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionNotIn(List<String> values) {
            addCriterion("RP_DESCRIPTION not in", values, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionBetween(String value1, String value2) {
            addCriterion("RP_DESCRIPTION between", value1, value2, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpDescriptionNotBetween(String value1, String value2) {
            addCriterion("RP_DESCRIPTION not between", value1, value2, "rpDescription");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeIsNull() {
            addCriterion("RP_ESTATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeIsNotNull() {
            addCriterion("RP_ESTATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeEqualTo(String value) {
            addCriterion("RP_ESTATE_CODE =", value, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeNotEqualTo(String value) {
            addCriterion("RP_ESTATE_CODE <>", value, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeGreaterThan(String value) {
            addCriterion("RP_ESTATE_CODE >", value, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RP_ESTATE_CODE >=", value, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeLessThan(String value) {
            addCriterion("RP_ESTATE_CODE <", value, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeLessThanOrEqualTo(String value) {
            addCriterion("RP_ESTATE_CODE <=", value, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeLike(String value) {
            addCriterion("RP_ESTATE_CODE like", value, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeNotLike(String value) {
            addCriterion("RP_ESTATE_CODE not like", value, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeIn(List<String> values) {
            addCriterion("RP_ESTATE_CODE in", values, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeNotIn(List<String> values) {
            addCriterion("RP_ESTATE_CODE not in", values, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeBetween(String value1, String value2) {
            addCriterion("RP_ESTATE_CODE between", value1, value2, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpEstateCodeNotBetween(String value1, String value2) {
            addCriterion("RP_ESTATE_CODE not between", value1, value2, "rpEstateCode");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigIsNull() {
            addCriterion("RP_FLAT_SORT_CONFIG is null");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigIsNotNull() {
            addCriterion("RP_FLAT_SORT_CONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigEqualTo(Integer value) {
            addCriterion("RP_FLAT_SORT_CONFIG =", value, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigNotEqualTo(Integer value) {
            addCriterion("RP_FLAT_SORT_CONFIG <>", value, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigGreaterThan(Integer value) {
            addCriterion("RP_FLAT_SORT_CONFIG >", value, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigGreaterThanOrEqualTo(Integer value) {
            addCriterion("RP_FLAT_SORT_CONFIG >=", value, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigLessThan(Integer value) {
            addCriterion("RP_FLAT_SORT_CONFIG <", value, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigLessThanOrEqualTo(Integer value) {
            addCriterion("RP_FLAT_SORT_CONFIG <=", value, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigIn(List<Integer> values) {
            addCriterion("RP_FLAT_SORT_CONFIG in", values, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigNotIn(List<Integer> values) {
            addCriterion("RP_FLAT_SORT_CONFIG not in", values, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigBetween(Integer value1, Integer value2) {
            addCriterion("RP_FLAT_SORT_CONFIG between", value1, value2, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpFlatSortConfigNotBetween(Integer value1, Integer value2) {
            addCriterion("RP_FLAT_SORT_CONFIG not between", value1, value2, "rpFlatSortConfig");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqIsNull() {
            addCriterion("RP_APP_NEXT_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqIsNotNull() {
            addCriterion("RP_APP_NEXT_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqEqualTo(Long value) {
            addCriterion("RP_APP_NEXT_SEQ =", value, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqNotEqualTo(Long value) {
            addCriterion("RP_APP_NEXT_SEQ <>", value, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqGreaterThan(Long value) {
            addCriterion("RP_APP_NEXT_SEQ >", value, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("RP_APP_NEXT_SEQ >=", value, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqLessThan(Long value) {
            addCriterion("RP_APP_NEXT_SEQ <", value, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqLessThanOrEqualTo(Long value) {
            addCriterion("RP_APP_NEXT_SEQ <=", value, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqIn(List<Long> values) {
            addCriterion("RP_APP_NEXT_SEQ in", values, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqNotIn(List<Long> values) {
            addCriterion("RP_APP_NEXT_SEQ not in", values, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqBetween(Long value1, Long value2) {
            addCriterion("RP_APP_NEXT_SEQ between", value1, value2, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpAppNextSeqNotBetween(Long value1, Long value2) {
            addCriterion("RP_APP_NEXT_SEQ not between", value1, value2, "rpAppNextSeq");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeIsNull() {
            addCriterion("RP_PROP_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeIsNotNull() {
            addCriterion("RP_PROP_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeEqualTo(String value) {
            addCriterion("RP_PROP_RANGE =", value, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeNotEqualTo(String value) {
            addCriterion("RP_PROP_RANGE <>", value, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeGreaterThan(String value) {
            addCriterion("RP_PROP_RANGE >", value, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeGreaterThanOrEqualTo(String value) {
            addCriterion("RP_PROP_RANGE >=", value, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeLessThan(String value) {
            addCriterion("RP_PROP_RANGE <", value, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeLessThanOrEqualTo(String value) {
            addCriterion("RP_PROP_RANGE <=", value, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeLike(String value) {
            addCriterion("RP_PROP_RANGE like", value, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeNotLike(String value) {
            addCriterion("RP_PROP_RANGE not like", value, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeIn(List<String> values) {
            addCriterion("RP_PROP_RANGE in", values, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeNotIn(List<String> values) {
            addCriterion("RP_PROP_RANGE not in", values, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeBetween(String value1, String value2) {
            addCriterion("RP_PROP_RANGE between", value1, value2, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpPropRangeNotBetween(String value1, String value2) {
            addCriterion("RP_PROP_RANGE not between", value1, value2, "rpPropRange");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByIsNull() {
            addCriterion("RP_UPDATE_BY is null");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByIsNotNull() {
            addCriterion("RP_UPDATE_BY is not null");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByEqualTo(String value) {
            addCriterion("RP_UPDATE_BY =", value, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByNotEqualTo(String value) {
            addCriterion("RP_UPDATE_BY <>", value, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByGreaterThan(String value) {
            addCriterion("RP_UPDATE_BY >", value, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("RP_UPDATE_BY >=", value, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByLessThan(String value) {
            addCriterion("RP_UPDATE_BY <", value, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByLessThanOrEqualTo(String value) {
            addCriterion("RP_UPDATE_BY <=", value, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByLike(String value) {
            addCriterion("RP_UPDATE_BY like", value, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByNotLike(String value) {
            addCriterion("RP_UPDATE_BY not like", value, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByIn(List<String> values) {
            addCriterion("RP_UPDATE_BY in", values, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByNotIn(List<String> values) {
            addCriterion("RP_UPDATE_BY not in", values, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByBetween(String value1, String value2) {
            addCriterion("RP_UPDATE_BY between", value1, value2, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateByNotBetween(String value1, String value2) {
            addCriterion("RP_UPDATE_BY not between", value1, value2, "rpUpdateBy");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateIsNull() {
            addCriterion("RP_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateIsNotNull() {
            addCriterion("RP_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateEqualTo(String value) {
            addCriterion("RP_UPDATE_DATE =", value, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateNotEqualTo(String value) {
            addCriterion("RP_UPDATE_DATE <>", value, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateGreaterThan(String value) {
            addCriterion("RP_UPDATE_DATE >", value, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateGreaterThanOrEqualTo(String value) {
            addCriterion("RP_UPDATE_DATE >=", value, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateLessThan(String value) {
            addCriterion("RP_UPDATE_DATE <", value, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateLessThanOrEqualTo(String value) {
            addCriterion("RP_UPDATE_DATE <=", value, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateLike(String value) {
            addCriterion("RP_UPDATE_DATE like", value, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateNotLike(String value) {
            addCriterion("RP_UPDATE_DATE not like", value, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateIn(List<String> values) {
            addCriterion("RP_UPDATE_DATE in", values, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateNotIn(List<String> values) {
            addCriterion("RP_UPDATE_DATE not in", values, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateBetween(String value1, String value2) {
            addCriterion("RP_UPDATE_DATE between", value1, value2, "rpUpdateDate");
            return (Criteria) this;
        }

        public Criteria andRpUpdateDateNotBetween(String value1, String value2) {
            addCriterion("RP_UPDATE_DATE not between", value1, value2, "rpUpdateDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated do_not_delete_during_merge Thu Nov 03 17:49:24 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table HS_HAA.HST_HAA_REDEV_PROJECT
     *
     * @mbg.generated Thu Nov 03 17:49:24 CST 2022
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