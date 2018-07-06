package com.github.dubbo.rpc.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.dubbo.domain.User;
import com.github.dubbo.rpc.ServerService;

/**
 * TODO: 生产者实现类
 * @Author kai
 * @Date 2018/7/5 18:12
 */
@Service
public class ServerServiceImpl implements ServerService {

    @Override
    public User saveUser(User user) {
        user.setId(1);
        System.out.println(user.toString());
        return user;
    }
}
