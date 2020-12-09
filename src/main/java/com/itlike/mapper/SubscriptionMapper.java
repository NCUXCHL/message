package com.itlike.mapper;

import com.itlike.domain.Subscription;
import java.util.List;

public interface SubscriptionMapper {
    int deleteByPrimaryKey(Integer subscriptionId);

    int insert(Subscription record);

    Subscription selectByPrimaryKey(Integer subscriptionId);

    List<Subscription> selectAll();

    int updateByPrimaryKey(Subscription record);
}