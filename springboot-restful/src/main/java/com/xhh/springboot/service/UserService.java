package com.xhh.springboot.service;

import com.xhh.springboot.entity.User;

public interface UserService {
    User get(Long id);

    User save(User user);

    User findByName(String name);
}
