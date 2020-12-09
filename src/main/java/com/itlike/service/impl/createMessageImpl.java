package com.itlike.service.impl;

import com.itlike.domain.Notify;
import com.itlike.domain.Usernotify;
import com.itlike.mapper.NotifyMapper;
import com.itlike.mapper.UsernotifyMapper;
import com.itlike.service.createMessage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;
import java.util.Random;

public class createMessageImpl implements createMessage {
    @Autowired
    private NotifyMapper notifyMapper;
    private UsernotifyMapper usernotifyMapper;
    @Override
    public void createMessage(String content, int sender, int receiver) {
        Notify notify=new Notify();
        Usernotify usernotify=new Usernotify();
        Random rand = new Random();
        int n=0;

        int m;

        do{
            m=rand.nextInt(1000000000) + 1;
            notify.setNotifyId(m);
            notify.setMessageContent(content);
            notify.setSender(sender);
            n=notifyMapper.insert(notify);

        }while(n==0);

        usernotify.setNotify(m);
        usernotifyMapper.insert(usernotify);

    }
}
