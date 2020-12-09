package cn.swingz.mapper;

import cn.swingz.entity.TBusiness;

public interface TBusinessMapper {
    int deleteByPrimaryKey(Long tbsId);

    int insert(TBusiness record);

    int insertSelective(TBusiness record);

    TBusiness selectByPrimaryKey(Long tbsId);

    int updateByPrimaryKeySelective(TBusiness record);

    int updateByPrimaryKey(TBusiness record);
}