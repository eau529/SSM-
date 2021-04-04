package com.jcc.traval.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class User implements Serializable {
    private Integer userId ;
    private String userCode ;
    private String name ;
    private BigDecimal salary ;
    private Date birth ;
    private String departId ;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userCode='" + userCode + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", birth=" + birth +
                ", departId='" + departId + '\'' +
                '}';
    }
}
