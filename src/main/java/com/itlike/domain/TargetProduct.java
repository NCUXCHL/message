package com.itlike.domain;

public class TargetProduct {
    private Integer productId;

    private String productName;

    private String prouducttype;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProuducttype() {
        return prouducttype;
    }

    public void setProuducttype(String prouducttype) {
        this.prouducttype = prouducttype == null ? null : prouducttype.trim();
    }
}