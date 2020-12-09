package cn.swingz.mapper;

import cn.swingz.entity.TSaledproduct;

public interface TSaledproductMapper {
    int deleteByPrimaryKey(Long tpId);

    int insert(TSaledproduct record);

    int insertSelective(TSaledproduct record);

    TSaledproduct selectByPrimaryKey(Long tpId);

    int updateByPrimaryKeySelective(TSaledproduct record);

    int updateByPrimaryKey(TSaledproduct record);
}