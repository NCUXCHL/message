package com.itlike.mapper;

import com.itlike.domain.Actiontype;
import java.util.List;

public interface ActiontypeMapper {
    int deleteByPrimaryKey(Integer actionId);

    int insert(Actiontype record);

    Actiontype selectByPrimaryKey(Integer actionId);

    List<Actiontype> selectAll();

    int updateByPrimaryKey(Actiontype record);
}