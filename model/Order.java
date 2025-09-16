package model;

import service.RuleManager;

public class Order {
    private Integer orderId;
    private Cart cart;
    private double totalAmount;
    private Integer couponId;
    private RuleManager ruleManager;

    public Order(Integer orderId, Cart cart, double totalAmount,RuleManager ruleManager) {
        this.orderId = orderId;
        this.cart = cart;
        this.totalAmount = totalAmount;
        this.ruleManager = ruleManager;
    }

    public  void applyCoupon(Coupon coupon,User user){
        ruleManager.checkRule(coupon,user);
        this.couponId = coupon.getCouponId();
    }

}
