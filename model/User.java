package model;

import com.sun.jdi.IntegerType;
import enums.UserType;

public class User {
    private Integer userId;
    private String userName;
    private String emailId;
    private UserType userType;

    public User(Integer userId, String userName, String emailId, UserType userType) {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.userType = userType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
