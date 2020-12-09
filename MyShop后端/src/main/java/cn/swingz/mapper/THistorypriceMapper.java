package cn.swingz.mapper;

import cn.swingz.entity.THistoryprice;

public interface THistorypriceMapper {
    int deleteByPrimaryKey(Long thId);

    int insert(THistoryprice record);

    int insertSelective(THistoryprice record);

    THistoryprice selectByPrimaryKey(Long thId);

    int updateByPrimaryKeySelective(THistoryprice record);

    int updateByPrimaryKey(THistoryprice record);
}