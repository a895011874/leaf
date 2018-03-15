package com.dong.leaf.controller;

import com.alibaba.fastjson.JSONObject;
import com.dong.leaf.model.HttpRes;
import com.dong.leaf.model.User;
import com.dong.leaf.service.inf.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * Create by liudong on 2018/3/15
 */
@RestController
@RequestMapping("user")
@Api("User")
public class UserController {

    @Autowired
    private IUserService userService;

    @ApiOperation(value = "用户登录")
    @PostMapping("/login")
    public HttpRes login(@ApiParam(value = "request")@RequestBody()String request){
        HttpRes httpRes = HttpRes.getHttpRes();

        User loginUser = JSONObject.parseObject(request,User.class);
        String userPhone = loginUser.getPhone();
        String loginPassword = loginUser.getPassword();
        //findByPhone
        User user = userService.findUserByPhone(userPhone);
        if(user!=null){
            String pass = user.getPassword();
            if(Objects.equals(loginPassword,pass)){
                httpRes.setMsg("登陆成功").setState("200");
            }else {
                httpRes.setMsg("登陆失败，用户名密码不正确");
            }
        }else {
            httpRes.setState("400").setMsg("查无此人");
        }

        return httpRes;
    }

    @ApiOperation(value = "注册用户")
    @PostMapping("/register")
    public HttpRes register(@ApiParam(value = "request")@RequestBody()String request){
        HttpRes httpRes = HttpRes.getHttpRes();
        User registerUser = JSONObject.parseObject(request,User.class);
        userService.addUser(registerUser);

        httpRes.setMsg("创建成功").setState("200");
        return httpRes;
    }
}
