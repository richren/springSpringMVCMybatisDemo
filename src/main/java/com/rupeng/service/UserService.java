package com.rupeng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rupeng.mapper.UserMapper;
import com.rupeng.pojo.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }
}
