package com.jk.service;

import com.jk.model.User;

import java.util.List;

public interface UserService {
    List<User> query();
    void del(Integer ids);

    void add(User u);

    User querymenubyid(Integer id);

    void update(User u);
}
