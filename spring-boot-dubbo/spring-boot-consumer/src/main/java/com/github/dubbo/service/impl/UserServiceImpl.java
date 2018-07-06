package com.github.dubbo.service.impl;

import com.github.dubbo.domain.User;
import com.github.dubbo.rpc.ConsumerService;
import com.github.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO: 用户业务侧
 * @Author kai
 * @Date 2018/7/5 18:12
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ConsumerService consumerService;

    @Override
    public User saveUser() {
        return consumerService.saveUser();
    }



}
