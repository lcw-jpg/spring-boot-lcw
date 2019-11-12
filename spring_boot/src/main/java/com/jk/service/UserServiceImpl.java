package com.jk.service;

import com.jk.dao.RoleMapper;
import com.jk.dao.UserMapper;
import com.jk.model.Role;
import com.jk.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<User> query() {
        return userMapper.query();
    }

    @Override
    public void del(Integer ids) {
        userMapper.del(ids);
    }

    @Override
    public List<Role> queryUserRole(Integer uid) {
        //查询所有角色
        List<Role> roles1 =roleMapper.queryRoleAll();
        //查询该用户已有角色ID集合
        List<Integer> roles2=roleMapper.queryRoleBy(uid);
        //双重for循环嵌套 比较
        for (int i = 0; i < roles1.size(); i++) {
            for (int j = 0; j < roles2.size(); j++) {
                System.out.println(roles1.get(i).getRid()+"--"+roles2.get(j));
                if (roles1.get(i).getRid() == roles2.get(j)) {
                    //如果两个角色ID相同 则设置业务字段status 为true
                    roles1.get(i).setStatus("checked");
                }
            }
        }
        return roles1;
    }

    @Override
    public void UserRole(int uid, String rids) {
        userMapper.deleteUserRole(uid);
        String[] ridArr=rids.split(",");
        userMapper.addUserRole(uid,ridArr);
    }

    @Override
    public User queryUserName(String uname) {
        return userMapper.queryUserName(uname);
    }


}
