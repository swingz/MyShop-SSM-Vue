package cn.swingz.mapper;

import cn.swingz.entity.TUser;

import java.util.Map;

public interface TUserMapper {
    int deleteByPrimaryKey(Long tuId);

    int insert(TUser record);

    int insertSelective(TUser record);

    TUser selectByPrimaryKey(Long tuId);

    int updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser selectByTelAndPwd(Map<String, String> map);
}