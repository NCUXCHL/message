package com.itlike.mapper;

import com.itlike.domain.Notify;

import java.util.Date;
import java.util.List;

public interface NotifyMapper {
    int deleteByPrimaryKey(Integer notifyId);

     int insert(Notify record);

    Notify selectByPrimaryKey(Integer notifyId);

    List<Notify> selectAll();

    int updateByPrimaryKey(Notify record);

    Date selectMaxCreateAt(Integer type);

    List<Notify> selectDate();
}