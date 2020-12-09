package cn.swingz.mapper;

import cn.swingz.entity.TSalingproduct;

public interface TSalingproductMapper {
    int deleteByPrimaryKey(Long tpId);

    int insert(TSalingproduct record);

    int insertSelective(TSalingproduct record);

    TSalingproduct selectByPrimaryKey(Long tpId);

    int updateByPrimaryKeySelective(TSalingproduct record);

    int updateByPrimaryKey(TSalingproduct record);
}