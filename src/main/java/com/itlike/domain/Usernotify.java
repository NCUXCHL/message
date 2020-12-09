package com.itlike.domain;

import java.util.Date;

public class Usernotify {
    private Integer usernotifyId;

    private Integer user;

    private Integer notify;

    private Date createdat;

    private byte[] isread;

    public Integer getUsernotifyId() {
        return usernotifyId;
    }

    public void setUsernotifyId(Integer usernotifyId) {
        this.usernotifyId = usernotifyId;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getNotify() {
        return notify;
    }

    public void setNotify(Integer notify) {
        this.notify = notify;
    }

    public Date getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    public byte[] getIsread() {
        return isread;
    }

    public void setIsread(byte[] isread) {
        this.isread = isread;
    }
}