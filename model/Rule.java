package model;

import enums.ProductType;
import enums.UserType;

public class Rule {
    private Integer ruleId;
    private String ruleName;
    private ProductType productType;
    private UserType userType;

    public Rule(Integer ruleId, String ruleName, ProductType productType, UserType userType) {
        this.ruleId = ruleId;
        this.ruleName = ruleName;
        this.productType = productType;
        this.userType = userType;
    }

    public Integer getRuleId() {
        return ruleId;
    }

    public void setRuleId(Integer ruleId) {
        this.ruleId = ruleId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
