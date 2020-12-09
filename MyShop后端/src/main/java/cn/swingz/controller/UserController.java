package cn.swingz.controller;

import cn.swingz.entity.dto.ResultDTO;
import cn.swingz.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("sayHello")
    public String sayHello(){
        return "hello";
    }

    @RequestMapping("login")
    public ResultDTO login(String userTel,String userPwd){
        return userService.login(userTel,userPwd);
    }
}
