package com.itlike.mapper;

import com.itlike.domain.Produce;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProduceMapper {
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("productId") Integer productId, @Param("activeat") Date activeat);

    int insert(Produce record);

    List<Produce> selectAll();
}