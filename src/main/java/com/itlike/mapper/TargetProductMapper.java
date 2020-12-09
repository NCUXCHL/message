package com.itlike.mapper;

import com.itlike.domain.TargetProduct;
import java.util.List;

public interface TargetProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(TargetProduct record);

    TargetProduct selectByPrimaryKey(Integer productId);

    List<TargetProduct> selectAll();

    int updateByPrimaryKey(TargetProduct record);
}