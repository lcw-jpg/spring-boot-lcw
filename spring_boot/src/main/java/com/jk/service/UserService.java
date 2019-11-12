package com.jk.service;

import com.jk.model.Role;
import com.jk.model.User;

import java.util.List;

public interface UserService {
    List<User> query();

    void del(Integer ids);

    List<Role> queryUserRole(Integer uid);

    void UserRole(int uid, String rids);

    User queryUserName(String uname);
}
