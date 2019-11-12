package com.jk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.UserMapper;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> query1() {

        return userMapper.query1();
    }

    @Override
    public void del(Integer ids) {
        userMapper.del(ids);
    }

    @Override
    public void add(User u) {
        userMapper.add(u);
    }

    @Override
    public User querymenubyid(Integer id) {

        return userMapper.querymenubyid(id);
    }

    @Override
    public void update(User u) {
        userMapper.update(u);
    }
}
