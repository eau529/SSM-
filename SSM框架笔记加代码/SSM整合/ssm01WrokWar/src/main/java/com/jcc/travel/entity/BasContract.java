package com.jcc.travel.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BasContract {
  private String     BasName;
  private BigDecimal money;
  private Date date;
  private Integer BasId;

    public String getBasName() {
        return BasName;
    }

    public void setBasName(String basName) {
        BasName = basName;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getBasId() {
        return BasId;
    }

    public void setBasId(Integer basId) {
        BasId = basId;
    }

    @Override
    public String toString() {
        return "BasContract{" +
                "BasName='" + BasName + '\'' +
                ", money=" + money +
                ", date=" + date +
                ", BasId=" + BasId +
                '}';
    }
}
