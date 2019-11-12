package com.jk.dao;

import com.jk.model.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
   /* int deleteByPrimaryKey(Integer rid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);*/

    List<Role> queryrole();

    List<Role> queryRoleAll();

    List<Integer> queryRoleBy(@Param("uid") Integer uid);
}