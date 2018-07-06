package com.github.dubbo.controller;

import com.github.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/save")
    public Object saveUser() {

        return userService.saveUser();
    }
}
