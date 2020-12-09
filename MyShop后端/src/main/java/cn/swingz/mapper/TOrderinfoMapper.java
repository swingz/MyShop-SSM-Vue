package cn.swingz.mapper;

import cn.swingz.entity.TOrderinfo;

import java.util.List;

public interface TOrderinfoMapper {
    int deleteByPrimaryKey(Long toiId);

    int insert(TOrderinfo record);

    int insertSelective(TOrderinfo record);

    TOrderinfo selectByPrimaryKey(Long toiId);

    int updateByPrimaryKeySelective(TOrderinfo record);

    int updateByPrimaryKey(TOrderinfo record);

    void insertOrderInfos(List<TOrderinfo> orderinfos);
}