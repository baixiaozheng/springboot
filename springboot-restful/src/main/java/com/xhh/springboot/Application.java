package com.xhh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author baixiaozheng
 * @desc Spring Boot 应用启动类
 * @date 2018/4/17 下午11:29
 */

@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "com.xhh.springboot")
public class Application {
    public static void main(String[] args) {
        // 程序启动入口
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(Application.class,args);
    }
}
