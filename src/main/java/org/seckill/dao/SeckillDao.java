package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;

import java.util.Date;
import java.util.List;

/**
 * Created by ruixj on 17-4-9.
 */
public interface SeckillDao {
    int reduceNumber(@Param("seckillId")long seckillId,@Param("killTime")Date killTime);

    Seckill queryById(long seckillId);

    List<Seckill> queryAll(@Param("offset")int offset, @Param("limit")int limit);
}
