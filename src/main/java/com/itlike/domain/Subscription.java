package com.itlike.domain;

import java.util.Date;

public class Subscription {
    private Integer subscriptionId;

    private Integer targetProduct;

    private Integer action;

    private Integer user;

    private Date createdat;

    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Integer getTargetProduct() {
        return targetProduct;
    }

    public void setTargetProduct(Integer targetProduct) {
        this.targetProduct = targetProduct;
    }

    public Integer getAction() {
        return action;
    }

    public void setAction(Integer action) {
        this.action = action;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }
}