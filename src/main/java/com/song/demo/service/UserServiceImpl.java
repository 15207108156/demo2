package com.song.demo.service;

import com.song.demo.dao.UserMapper;
import com.song.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserServiceImpl {
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User regUser(String uerId) {
        return userMapper.regUser(uerId);
    }
}
