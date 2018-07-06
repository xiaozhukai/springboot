package com.github.dubbo.service;

import com.github.dubbo.domain.User;
import org.springframework.stereotype.Service;


@Service
public interface UserService{
    User saveUser();
}
