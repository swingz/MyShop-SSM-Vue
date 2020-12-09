package cn.swingz.mapper;

import cn.swingz.entity.TUserWallet;

public interface TUserWalletMapper {
    int deleteByPrimaryKey(Long tuwId);

    int insert(TUserWallet record);

    int insertSelective(TUserWallet record);

    TUserWallet selectByPrimaryKey(Long tuwId);

    int updateByPrimaryKeySelective(TUserWallet record);

    int updateByPrimaryKey(TUserWallet record);
}