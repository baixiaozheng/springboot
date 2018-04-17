package com.xhh.springboot.controller;

import com.xhh.springboot.entity.User;
import com.xhh.springboot.repository.UserRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author baixiaozheng
 * @desc Controller
 * @date 2018/4/18 上午12:11
 */
@RestController
@RequestMapping("/user")
@EnableAutoConfiguration
public class UserController {

    @Resource(name = "userRepository")
    private UserRepository userRepository;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User get(@PathVariable Long id){
        return userRepository.getById(id);
    }
}
