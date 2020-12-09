package cn.swingz.service;

import cn.swingz.entity.TUser;
import cn.swingz.entity.dto.ResultDTO;

public interface IUserService {
    ResultDTO<TUser> login(String userTel, String userPwd);
}
