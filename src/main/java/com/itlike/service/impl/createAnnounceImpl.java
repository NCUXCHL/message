package com.itlike.service.impl;

import com.itlike.domain.Notify;
import com.itlike.mapper.NotifyMapper;
import com.itlike.service.createAnnounce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class createAnnounceImpl implements createAnnounce {


    private NotifyMapper notifyMapper;
    @Override
    public int createdAnnounce(String content,int sender){
        int i;

        Notify notify=new Notify();
        notify.setMessageContent(content);
        notify.setSender(sender);
        i=notifyMapper.insert(notify);
        return i;
    };
}
