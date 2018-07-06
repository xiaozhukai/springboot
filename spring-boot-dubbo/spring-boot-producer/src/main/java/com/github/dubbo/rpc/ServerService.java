package com.github.dubbo.rpc;


import com.github.dubbo.domain.User;

/**
 * TODO: dubbo 生产者接口
 * @Author kai
 * @Date 2018/7/5 18:12
 */
public interface ServerService {

    User saveUser(User user);
}
