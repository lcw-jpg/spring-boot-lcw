package com.jk.mapper;

import com.jk.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


    List<User> query1();

    void del(@Param("ids") Integer ids);

    void add(@Param("u") User u);

    User querymenubyid(@Param("id") Integer id);

    void update(User u);
}