package com.zhoudbw.seckill.controller;


import cn.hutool.core.util.StrUtil;

import com.zhoudbw.seckill.entity.User;
import com.zhoudbw.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/seckill")
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/getUser")
    @ResponseBody
    public User getUser(int id) {
        return userService.getUser(id);
    }

}
