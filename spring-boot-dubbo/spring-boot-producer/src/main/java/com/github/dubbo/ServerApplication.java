package com.github.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO: Spring Boot 应用启动类
 * @Author kai
 * @Date 2018/7/6 10:23
 */
// Spring Boot 应用的标识
@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(ServerApplication.class,args);
    }
}
