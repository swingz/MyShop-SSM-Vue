package cn.swingz.mapper;

import cn.swingz.entity.TBisWallet;

public interface TBisWalletMapper {
    int deleteByPrimaryKey(Long tbwId);

    int insert(TBisWallet record);

    int insertSelective(TBisWallet record);

    TBisWallet selectByPrimaryKey(Long tbwId);

    int updateByPrimaryKeySelective(TBisWallet record);

    int updateByPrimaryKey(TBisWallet record);
}