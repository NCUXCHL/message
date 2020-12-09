package com.itlike.mapper;

import com.itlike.domain.Usernotify;

import java.util.List;

public interface UsernotifyMapper {
    int deleteByPrimaryKey(Integer usernotifyId);

    int insert(Usernotify record);

    Usernotify selectByPrimaryKey(Integer usernotifyId);

    List<Usernotify> selectAll();

    int updateByPrimaryKey(Usernotify record);
}