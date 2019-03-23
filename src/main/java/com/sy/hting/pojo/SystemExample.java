package com.sy.hting.pojo;

import java.util.ArrayList;
import java.util.List;

public class SystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemExample() {
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

        public Criteria andSysidIsNull() {
            addCriterion("sysID is null");
            return (Criteria) this;
        }

        public Criteria andSysidIsNotNull() {
            addCriterion("sysID is not null");
            return (Criteria) this;
        }

        public Criteria andSysidEqualTo(Integer value) {
            addCriterion("sysID =", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotEqualTo(Integer value) {
            addCriterion("sysID <>", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThan(Integer value) {
            addCriterion("sysID >", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysID >=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThan(Integer value) {
            addCriterion("sysID <", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidLessThanOrEqualTo(Integer value) {
            addCriterion("sysID <=", value, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidIn(List<Integer> values) {
            addCriterion("sysID in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotIn(List<Integer> values) {
            addCriterion("sysID not in", values, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidBetween(Integer value1, Integer value2) {
            addCriterion("sysID between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andSysidNotBetween(Integer value1, Integer value2) {
            addCriterion("sysID not between", value1, value2, "sysid");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNull() {
            addCriterion("exchangeRate is null");
            return (Criteria) this;
        }

        public Criteria andExchangerateIsNotNull() {
            addCriterion("exchangeRate is not null");
            return (Criteria) this;
        }

        public Criteria andExchangerateEqualTo(Integer value) {
            addCriterion("exchangeRate =", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotEqualTo(Integer value) {
            addCriterion("exchangeRate <>", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThan(Integer value) {
            addCriterion("exchangeRate >", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateGreaterThanOrEqualTo(Integer value) {
            addCriterion("exchangeRate >=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThan(Integer value) {
            addCriterion("exchangeRate <", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateLessThanOrEqualTo(Integer value) {
            addCriterion("exchangeRate <=", value, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateIn(List<Integer> values) {
            addCriterion("exchangeRate in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotIn(List<Integer> values) {
            addCriterion("exchangeRate not in", values, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateBetween(Integer value1, Integer value2) {
            addCriterion("exchangeRate between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andExchangerateNotBetween(Integer value1, Integer value2) {
            addCriterion("exchangeRate not between", value1, value2, "exchangerate");
            return (Criteria) this;
        }

        public Criteria andChargeIsNull() {
            addCriterion("charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(Integer value) {
            addCriterion("charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(Integer value) {
            addCriterion("charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(Integer value) {
            addCriterion("charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(Integer value) {
            addCriterion("charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(Integer value) {
            addCriterion("charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<Integer> values) {
            addCriterion("charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<Integer> values) {
            addCriterion("charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(Integer value1, Integer value2) {
            addCriterion("charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("charge not between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andSigninIsNull() {
            addCriterion("signIn is null");
            return (Criteria) this;
        }

        public Criteria andSigninIsNotNull() {
            addCriterion("signIn is not null");
            return (Criteria) this;
        }

        public Criteria andSigninEqualTo(Integer value) {
            addCriterion("signIn =", value, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninNotEqualTo(Integer value) {
            addCriterion("signIn <>", value, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninGreaterThan(Integer value) {
            addCriterion("signIn >", value, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninGreaterThanOrEqualTo(Integer value) {
            addCriterion("signIn >=", value, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninLessThan(Integer value) {
            addCriterion("signIn <", value, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninLessThanOrEqualTo(Integer value) {
            addCriterion("signIn <=", value, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninIn(List<Integer> values) {
            addCriterion("signIn in", values, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninNotIn(List<Integer> values) {
            addCriterion("signIn not in", values, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninBetween(Integer value1, Integer value2) {
            addCriterion("signIn between", value1, value2, "signin");
            return (Criteria) this;
        }

        public Criteria andSigninNotBetween(Integer value1, Integer value2) {
            addCriterion("signIn not between", value1, value2, "signin");
            return (Criteria) this;
        }

        public Criteria andPostintegralIsNull() {
            addCriterion("postIntegral is null");
            return (Criteria) this;
        }

        public Criteria andPostintegralIsNotNull() {
            addCriterion("postIntegral is not null");
            return (Criteria) this;
        }

        public Criteria andPostintegralEqualTo(Integer value) {
            addCriterion("postIntegral =", value, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralNotEqualTo(Integer value) {
            addCriterion("postIntegral <>", value, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralGreaterThan(Integer value) {
            addCriterion("postIntegral >", value, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("postIntegral >=", value, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralLessThan(Integer value) {
            addCriterion("postIntegral <", value, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralLessThanOrEqualTo(Integer value) {
            addCriterion("postIntegral <=", value, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralIn(List<Integer> values) {
            addCriterion("postIntegral in", values, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralNotIn(List<Integer> values) {
            addCriterion("postIntegral not in", values, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralBetween(Integer value1, Integer value2) {
            addCriterion("postIntegral between", value1, value2, "postintegral");
            return (Criteria) this;
        }

        public Criteria andPostintegralNotBetween(Integer value1, Integer value2) {
            addCriterion("postIntegral not between", value1, value2, "postintegral");
            return (Criteria) this;
        }

        public Criteria andTrackIsNull() {
            addCriterion("track is null");
            return (Criteria) this;
        }

        public Criteria andTrackIsNotNull() {
            addCriterion("track is not null");
            return (Criteria) this;
        }

        public Criteria andTrackEqualTo(Integer value) {
            addCriterion("track =", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackNotEqualTo(Integer value) {
            addCriterion("track <>", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackGreaterThan(Integer value) {
            addCriterion("track >", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackGreaterThanOrEqualTo(Integer value) {
            addCriterion("track >=", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackLessThan(Integer value) {
            addCriterion("track <", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackLessThanOrEqualTo(Integer value) {
            addCriterion("track <=", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackIn(List<Integer> values) {
            addCriterion("track in", values, "track");
            return (Criteria) this;
        }

        public Criteria andTrackNotIn(List<Integer> values) {
            addCriterion("track not in", values, "track");
            return (Criteria) this;
        }

        public Criteria andTrackBetween(Integer value1, Integer value2) {
            addCriterion("track between", value1, value2, "track");
            return (Criteria) this;
        }

        public Criteria andTrackNotBetween(Integer value1, Integer value2) {
            addCriterion("track not between", value1, value2, "track");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyIsNull() {
            addCriterion("releaseBeauty is null");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyIsNotNull() {
            addCriterion("releaseBeauty is not null");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyEqualTo(Integer value) {
            addCriterion("releaseBeauty =", value, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyNotEqualTo(Integer value) {
            addCriterion("releaseBeauty <>", value, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyGreaterThan(Integer value) {
            addCriterion("releaseBeauty >", value, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyGreaterThanOrEqualTo(Integer value) {
            addCriterion("releaseBeauty >=", value, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyLessThan(Integer value) {
            addCriterion("releaseBeauty <", value, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyLessThanOrEqualTo(Integer value) {
            addCriterion("releaseBeauty <=", value, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyIn(List<Integer> values) {
            addCriterion("releaseBeauty in", values, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyNotIn(List<Integer> values) {
            addCriterion("releaseBeauty not in", values, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyBetween(Integer value1, Integer value2) {
            addCriterion("releaseBeauty between", value1, value2, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andReleasebeautyNotBetween(Integer value1, Integer value2) {
            addCriterion("releaseBeauty not between", value1, value2, "releasebeauty");
            return (Criteria) this;
        }

        public Criteria andLogisticminIsNull() {
            addCriterion("logisticMin is null");
            return (Criteria) this;
        }

        public Criteria andLogisticminIsNotNull() {
            addCriterion("logisticMin is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticminEqualTo(Integer value) {
            addCriterion("logisticMin =", value, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminNotEqualTo(Integer value) {
            addCriterion("logisticMin <>", value, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminGreaterThan(Integer value) {
            addCriterion("logisticMin >", value, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticMin >=", value, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminLessThan(Integer value) {
            addCriterion("logisticMin <", value, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminLessThanOrEqualTo(Integer value) {
            addCriterion("logisticMin <=", value, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminIn(List<Integer> values) {
            addCriterion("logisticMin in", values, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminNotIn(List<Integer> values) {
            addCriterion("logisticMin not in", values, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminBetween(Integer value1, Integer value2) {
            addCriterion("logisticMin between", value1, value2, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticMin not between", value1, value2, "logisticmin");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerIsNull() {
            addCriterion("logisticMinSeller is null");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerIsNotNull() {
            addCriterion("logisticMinSeller is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerEqualTo(Integer value) {
            addCriterion("logisticMinSeller =", value, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerNotEqualTo(Integer value) {
            addCriterion("logisticMinSeller <>", value, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerGreaterThan(Integer value) {
            addCriterion("logisticMinSeller >", value, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticMinSeller >=", value, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerLessThan(Integer value) {
            addCriterion("logisticMinSeller <", value, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerLessThanOrEqualTo(Integer value) {
            addCriterion("logisticMinSeller <=", value, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerIn(List<Integer> values) {
            addCriterion("logisticMinSeller in", values, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerNotIn(List<Integer> values) {
            addCriterion("logisticMinSeller not in", values, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerBetween(Integer value1, Integer value2) {
            addCriterion("logisticMinSeller between", value1, value2, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticminsellerNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticMinSeller not between", value1, value2, "logisticminseller");
            return (Criteria) this;
        }

        public Criteria andLogisticweightIsNull() {
            addCriterion("logisticWeight is null");
            return (Criteria) this;
        }

        public Criteria andLogisticweightIsNotNull() {
            addCriterion("logisticWeight is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticweightEqualTo(Integer value) {
            addCriterion("logisticWeight =", value, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightNotEqualTo(Integer value) {
            addCriterion("logisticWeight <>", value, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightGreaterThan(Integer value) {
            addCriterion("logisticWeight >", value, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticWeight >=", value, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightLessThan(Integer value) {
            addCriterion("logisticWeight <", value, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightLessThanOrEqualTo(Integer value) {
            addCriterion("logisticWeight <=", value, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightIn(List<Integer> values) {
            addCriterion("logisticWeight in", values, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightNotIn(List<Integer> values) {
            addCriterion("logisticWeight not in", values, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightBetween(Integer value1, Integer value2) {
            addCriterion("logisticWeight between", value1, value2, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticweightNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticWeight not between", value1, value2, "logisticweight");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceIsNull() {
            addCriterion("logisticPrice is null");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceIsNotNull() {
            addCriterion("logisticPrice is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceEqualTo(Integer value) {
            addCriterion("logisticPrice =", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceNotEqualTo(Integer value) {
            addCriterion("logisticPrice <>", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceGreaterThan(Integer value) {
            addCriterion("logisticPrice >", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("logisticPrice >=", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceLessThan(Integer value) {
            addCriterion("logisticPrice <", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceLessThanOrEqualTo(Integer value) {
            addCriterion("logisticPrice <=", value, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceIn(List<Integer> values) {
            addCriterion("logisticPrice in", values, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceNotIn(List<Integer> values) {
            addCriterion("logisticPrice not in", values, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceBetween(Integer value1, Integer value2) {
            addCriterion("logisticPrice between", value1, value2, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andLogisticpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("logisticPrice not between", value1, value2, "logisticprice");
            return (Criteria) this;
        }

        public Criteria andBondIsNull() {
            addCriterion("bond is null");
            return (Criteria) this;
        }

        public Criteria andBondIsNotNull() {
            addCriterion("bond is not null");
            return (Criteria) this;
        }

        public Criteria andBondEqualTo(Float value) {
            addCriterion("bond =", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondNotEqualTo(Float value) {
            addCriterion("bond <>", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondGreaterThan(Float value) {
            addCriterion("bond >", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondGreaterThanOrEqualTo(Float value) {
            addCriterion("bond >=", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondLessThan(Float value) {
            addCriterion("bond <", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondLessThanOrEqualTo(Float value) {
            addCriterion("bond <=", value, "bond");
            return (Criteria) this;
        }

        public Criteria andBondIn(List<Float> values) {
            addCriterion("bond in", values, "bond");
            return (Criteria) this;
        }

        public Criteria andBondNotIn(List<Float> values) {
            addCriterion("bond not in", values, "bond");
            return (Criteria) this;
        }

        public Criteria andBondBetween(Float value1, Float value2) {
            addCriterion("bond between", value1, value2, "bond");
            return (Criteria) this;
        }

        public Criteria andBondNotBetween(Float value1, Float value2) {
            addCriterion("bond not between", value1, value2, "bond");
            return (Criteria) this;
        }

        public Criteria andVideosizeIsNull() {
            addCriterion("videoSize is null");
            return (Criteria) this;
        }

        public Criteria andVideosizeIsNotNull() {
            addCriterion("videoSize is not null");
            return (Criteria) this;
        }

        public Criteria andVideosizeEqualTo(Integer value) {
            addCriterion("videoSize =", value, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeNotEqualTo(Integer value) {
            addCriterion("videoSize <>", value, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeGreaterThan(Integer value) {
            addCriterion("videoSize >", value, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoSize >=", value, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeLessThan(Integer value) {
            addCriterion("videoSize <", value, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeLessThanOrEqualTo(Integer value) {
            addCriterion("videoSize <=", value, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeIn(List<Integer> values) {
            addCriterion("videoSize in", values, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeNotIn(List<Integer> values) {
            addCriterion("videoSize not in", values, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeBetween(Integer value1, Integer value2) {
            addCriterion("videoSize between", value1, value2, "videosize");
            return (Criteria) this;
        }

        public Criteria andVideosizeNotBetween(Integer value1, Integer value2) {
            addCriterion("videoSize not between", value1, value2, "videosize");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysIsNull() {
            addCriterion("closeorderdays is null");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysIsNotNull() {
            addCriterion("closeorderdays is not null");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysEqualTo(Integer value) {
            addCriterion("closeorderdays =", value, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysNotEqualTo(Integer value) {
            addCriterion("closeorderdays <>", value, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysGreaterThan(Integer value) {
            addCriterion("closeorderdays >", value, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("closeorderdays >=", value, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysLessThan(Integer value) {
            addCriterion("closeorderdays <", value, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysLessThanOrEqualTo(Integer value) {
            addCriterion("closeorderdays <=", value, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysIn(List<Integer> values) {
            addCriterion("closeorderdays in", values, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysNotIn(List<Integer> values) {
            addCriterion("closeorderdays not in", values, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysBetween(Integer value1, Integer value2) {
            addCriterion("closeorderdays between", value1, value2, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andCloseorderdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("closeorderdays not between", value1, value2, "closeorderdays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysIsNull() {
            addCriterion("receivedays is null");
            return (Criteria) this;
        }

        public Criteria andReceivedaysIsNotNull() {
            addCriterion("receivedays is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedaysEqualTo(Integer value) {
            addCriterion("receivedays =", value, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysNotEqualTo(Integer value) {
            addCriterion("receivedays <>", value, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysGreaterThan(Integer value) {
            addCriterion("receivedays >", value, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("receivedays >=", value, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysLessThan(Integer value) {
            addCriterion("receivedays <", value, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysLessThanOrEqualTo(Integer value) {
            addCriterion("receivedays <=", value, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysIn(List<Integer> values) {
            addCriterion("receivedays in", values, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysNotIn(List<Integer> values) {
            addCriterion("receivedays not in", values, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysBetween(Integer value1, Integer value2) {
            addCriterion("receivedays between", value1, value2, "receivedays");
            return (Criteria) this;
        }

        public Criteria andReceivedaysNotBetween(Integer value1, Integer value2) {
            addCriterion("receivedays not between", value1, value2, "receivedays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysIsNull() {
            addCriterion("refunddays is null");
            return (Criteria) this;
        }

        public Criteria andRefunddaysIsNotNull() {
            addCriterion("refunddays is not null");
            return (Criteria) this;
        }

        public Criteria andRefunddaysEqualTo(Integer value) {
            addCriterion("refunddays =", value, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysNotEqualTo(Integer value) {
            addCriterion("refunddays <>", value, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysGreaterThan(Integer value) {
            addCriterion("refunddays >", value, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("refunddays >=", value, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysLessThan(Integer value) {
            addCriterion("refunddays <", value, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysLessThanOrEqualTo(Integer value) {
            addCriterion("refunddays <=", value, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysIn(List<Integer> values) {
            addCriterion("refunddays in", values, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysNotIn(List<Integer> values) {
            addCriterion("refunddays not in", values, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysBetween(Integer value1, Integer value2) {
            addCriterion("refunddays between", value1, value2, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefunddaysNotBetween(Integer value1, Integer value2) {
            addCriterion("refunddays not between", value1, value2, "refunddays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysIsNull() {
            addCriterion("refundconfirmdays is null");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysIsNotNull() {
            addCriterion("refundconfirmdays is not null");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysEqualTo(Integer value) {
            addCriterion("refundconfirmdays =", value, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysNotEqualTo(Integer value) {
            addCriterion("refundconfirmdays <>", value, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysGreaterThan(Integer value) {
            addCriterion("refundconfirmdays >", value, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("refundconfirmdays >=", value, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysLessThan(Integer value) {
            addCriterion("refundconfirmdays <", value, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysLessThanOrEqualTo(Integer value) {
            addCriterion("refundconfirmdays <=", value, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysIn(List<Integer> values) {
            addCriterion("refundconfirmdays in", values, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysNotIn(List<Integer> values) {
            addCriterion("refundconfirmdays not in", values, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysBetween(Integer value1, Integer value2) {
            addCriterion("refundconfirmdays between", value1, value2, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andRefundconfirmdaysNotBetween(Integer value1, Integer value2) {
            addCriterion("refundconfirmdays not between", value1, value2, "refundconfirmdays");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusIsNull() {
            addCriterion("shopFreeStatus is null");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusIsNotNull() {
            addCriterion("shopFreeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusEqualTo(Boolean value) {
            addCriterion("shopFreeStatus =", value, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusNotEqualTo(Boolean value) {
            addCriterion("shopFreeStatus <>", value, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusGreaterThan(Boolean value) {
            addCriterion("shopFreeStatus >", value, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("shopFreeStatus >=", value, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusLessThan(Boolean value) {
            addCriterion("shopFreeStatus <", value, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusLessThanOrEqualTo(Boolean value) {
            addCriterion("shopFreeStatus <=", value, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusIn(List<Boolean> values) {
            addCriterion("shopFreeStatus in", values, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusNotIn(List<Boolean> values) {
            addCriterion("shopFreeStatus not in", values, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusBetween(Boolean value1, Boolean value2) {
            addCriterion("shopFreeStatus between", value1, value2, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andShopfreestatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("shopFreeStatus not between", value1, value2, "shopfreestatus");
            return (Criteria) this;
        }

        public Criteria andFreetimeIsNull() {
            addCriterion("freeTime is null");
            return (Criteria) this;
        }

        public Criteria andFreetimeIsNotNull() {
            addCriterion("freeTime is not null");
            return (Criteria) this;
        }

        public Criteria andFreetimeEqualTo(Integer value) {
            addCriterion("freeTime =", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeNotEqualTo(Integer value) {
            addCriterion("freeTime <>", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeGreaterThan(Integer value) {
            addCriterion("freeTime >", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("freeTime >=", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeLessThan(Integer value) {
            addCriterion("freeTime <", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeLessThanOrEqualTo(Integer value) {
            addCriterion("freeTime <=", value, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeIn(List<Integer> values) {
            addCriterion("freeTime in", values, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeNotIn(List<Integer> values) {
            addCriterion("freeTime not in", values, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeBetween(Integer value1, Integer value2) {
            addCriterion("freeTime between", value1, value2, "freetime");
            return (Criteria) this;
        }

        public Criteria andFreetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("freeTime not between", value1, value2, "freetime");
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