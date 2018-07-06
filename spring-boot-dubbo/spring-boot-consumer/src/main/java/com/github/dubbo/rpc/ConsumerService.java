package com.github.dubbo.rpc;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.dubbo.domain.User;
import org.springframework.stereotype.Component;

/**
 * TODO: Dubbo 服务消费者
 * @Author kai
 * @Date 2018/7/6 10:25
 */
@Component
public class ConsumerService {

    @Reference
    ServerService userService;


    public User saveUser() {
        User user = new User();
        user.setUsername("kai");
        user.setPassword("kai123");
        return userService.saveUser(user);
    }
}
