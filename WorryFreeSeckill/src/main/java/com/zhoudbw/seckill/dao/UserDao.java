package com.zhoudbw.seckill.dao;

import com.zhoudbw.seckill.entity.User;

public interface UserDao {


    /**
     * 根据id查找用户 (测试环境)
     * @param id
     * @return
     */
    User getUser(int id);

}
