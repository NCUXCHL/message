package com.itlike.domain;

import java.util.Date;

public class Produce {
    private Integer userId;

    private Integer productId;

    private Date activeat;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Date getActiveat() {
        return activeat;
    }

    public void setActiveat(Date activeat) {
        this.activeat = activeat;
    }
}