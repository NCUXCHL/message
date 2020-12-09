package com.itlike.service.impl;

import com.itlike.domain.User;
import com.itlike.mapper.NotifyMapper;
import com.itlike.mapper.UsernotifyMapper;
import com.itlike.service.pullAnnounce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class pullAnnounceImpl implements pullAnnounce {

    @Autowired
    private NotifyMapper notifyMapper;
    private UsernotifyMapper usernotifyMapper;

    @Override
    public void pullAnnounce(User user) {

    }
}
