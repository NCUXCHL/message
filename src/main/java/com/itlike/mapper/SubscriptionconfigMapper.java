package com.itlike.mapper;

import com.itlike.domain.Subscriptionconfig;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubscriptionconfigMapper {
    int deleteByPrimaryKey(@Param("actionid") Integer actionid, @Param("userid") Integer userid);

    int insert(Subscriptionconfig record);

    List<Subscriptionconfig> selectAll();
}