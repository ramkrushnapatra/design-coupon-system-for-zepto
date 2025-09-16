package service;

import model.Coupon;
import model.Rule;
import model.User;

import java.util.List;
import java.util.Objects;

public class CouponValidator implements RuleManager{
    @Override
    public void checkRule(Coupon coupon, User user){
        List<Rule> ruleList = coupon.getRules();
        boolean ruleValidator = false;
        for(Rule rule:ruleList){
            if(Objects.equals(rule.getUserType(),user.getUserType())){
                ruleValidator = true;
                break;
            }
        }
        if(!ruleValidator){
            throw new RuntimeException("coupon is not valiadte for usertype");
        }
        System.out.println("sucessfully coupon applied");
    }

}
