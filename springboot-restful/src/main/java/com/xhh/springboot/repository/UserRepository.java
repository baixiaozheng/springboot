package com.xhh.springboot.repository;

import com.xhh.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




/**
 * @author baixiaozheng
 * @desc dao
 * @date 2018/4/18 上午12:08
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);

    User findByName(String name);

    User getById(Long id);
}
