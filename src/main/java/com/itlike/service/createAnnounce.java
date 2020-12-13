package com.itlike.service;

import com.itlike.domain.Notify;
import com.itlike.mapper.NotifyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

public interface createAnnounce {

    public int  createdAnnounce(String content,int sender);

}
