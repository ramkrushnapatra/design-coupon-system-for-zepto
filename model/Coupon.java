package model;

import java.util.ArrayList;
import java.util.List;

public class Coupon {
    private Integer couponId;
    private String couponName;
    private Double discountAmount;
    private List<Rule>rules;

    public List<Rule> getRules() {
        return rules;
    }

    public Coupon(Integer couponId, String couponName, Double discountAmount) {
        this.couponId = couponId;
        this.couponName = couponName;
        this.discountAmount = discountAmount;
        this.rules = new ArrayList<>();
    }

    public void addCouponRule(Rule rule){
        this.rules.add(rule);
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

}
