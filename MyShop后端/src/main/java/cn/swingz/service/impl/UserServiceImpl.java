package cn.swingz.service.impl;

import cn.swingz.common.utils.ResultUtil;
import cn.swingz.entity.TUser;
import cn.swingz.entity.dto.ResultDTO;
import cn.swingz.mapper.TUserMapper;
import cn.swingz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private TUserMapper userMapper;

    @Override
    public ResultDTO<TUser> login(String userTel, String userPwd) {

        Map<String,String> map = new HashMap<>();
        map.put("userTel",userTel);
        map.put("userPwd",userPwd);

        TUser user = userMapper.selectByTelAndPwd(map);
        ResultDTO<TUser> objectResultDTO = null;
        if(user == null){
//            objectResultDTO.setResult(false);
//            objectResultDTO.setMessage("电话号码或密码错误");
            objectResultDTO = ResultUtil.failResult(user,"电话号码或密码错误");
        }else{
            objectResultDTO = ResultUtil.successResult(user,"登录成功");
        }
        System.out.println(objectResultDTO.getResult());
        return objectResultDTO;
    }
}
