package cn.swingz.mapper;

import cn.swingz.entity.TOrder;

public interface TOrderMapper {
    int deleteByPrimaryKey(Long toId);

    int insert(TOrder record);

    int insertSelective(TOrder record);

    TOrder selectByPrimaryKey(Long toId);

    int updateByPrimaryKeySelective(TOrder record);

    int updateByPrimaryKey(TOrder record);
}