package com.xhh.springboot.controller;

import com.xhh.springboot.entity.User;
import com.xhh.springboot.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

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

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User get(@PathVariable Long id){
        return userService.get(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User save(@RequestBody User user){
        userService.save(user);
        return user;
    }

}
