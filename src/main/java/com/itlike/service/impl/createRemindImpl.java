package com.itlike.service.impl;

import com.itlike.domain.Notify;
import com.itlike.mapper.NotifyMapper;
import com.itlike.service.createRemind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class createRemindImpl implements createRemind {
    @Autowired
    private NotifyMapper notifyMapper;

    @Override
    public int createRemind(int target,  int action, int sender, String content) {
        int i;

        Notify notify=new Notify();
        notify.setMessageContent(content);
        notify.setSender(sender);
        notify.setTarget(target);
        notify.setAction(action);
        i=notifyMapper.insert(notify);

        //插入n条记录，返回影响行数n。（n>=1，n为0时实际为插入失败）
        return i;

    }
}
