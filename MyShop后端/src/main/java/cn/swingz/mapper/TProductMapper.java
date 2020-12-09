package cn.swingz.mapper;

import cn.swingz.entity.TProduct;

import java.util.List;

public interface TProductMapper {
    int deleteByPrimaryKey(Long tpId);

    int insert(TProduct record);

    int insertSelective(TProduct record);

    TProduct selectByPrimaryKey(Long tpId);

    int updateByPrimaryKeySelective(TProduct record);

    int updateByPrimaryKey(TProduct record);

    List<TProduct> selectAll();

    TProduct selectByProductKey(Long pid);
}