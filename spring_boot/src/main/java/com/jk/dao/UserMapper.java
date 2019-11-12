package com.jk.dao;

import com.jk.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<User> query();

    void del(Integer ids);

    void deleteUserRole(int uid);

    void addUserRole(@Param("uid") int uid, @Param("rids")String[] ridArr);

    User queryUserName(@Param("un") String uname);

    /*int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);*/



}