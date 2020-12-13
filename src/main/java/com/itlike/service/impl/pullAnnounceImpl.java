package com.itlike.service.impl;

import com.itlike.domain.Notify;
import com.itlike.domain.User;
import com.itlike.mapper.NotifyMapper;
import com.itlike.mapper.UsernotifyMapper;
import com.itlike.service.pullAnnounce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;


public class pullAnnounceImpl implements pullAnnounce {


    private NotifyMapper notifyMapper;
    private UsernotifyMapper usernotifyMapper;

    public void setNotifyMapper(NotifyMapper notifyMapper) {
        this.notifyMapper = notifyMapper;
    }

    public NotifyMapper getNotifyMapper() {
        return notifyMapper;
    }

    @Override
    public List<Notify> PullAnnounce() {
        /*Date date;
        date=notifyMapper.selectMaxCreateAt(1);*/
        List<Notify> notifies=notifyMapper.selectDate();
        return notifies;
    }


}
