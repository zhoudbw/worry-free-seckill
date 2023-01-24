package com.zhoudbw.seckill.service.impl;

import com.zhoudbw.seckill.dao.UserDao;
import com.zhoudbw.seckill.entity.User;
import com.zhoudbw.seckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public User getUser(int id) {
        // 接口.调用方法，内容的执行逻辑
        return userDao.getUser(id);
    }
}
