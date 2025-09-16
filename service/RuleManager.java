package service;

import model.Coupon;
import model.User;

public interface RuleManager {
    void checkRule(Coupon coupon , User user);
}
