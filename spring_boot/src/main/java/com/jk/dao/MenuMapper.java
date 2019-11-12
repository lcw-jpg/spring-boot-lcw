package com.jk.dao;

import com.jk.model.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuMapper {
 /*   int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);*/


    List<Menu> queryMenu(@Param("pid") int pid);

    List<Menu> querymenu();

    void dele(@Param("ids")Integer ids);

    void add(@Param("m")Menu m);

    Menu querymenubyid(@Param("id")Integer id);

    void update(Menu m);

    List<Menu> querymenutree(@Param("pid")int pid);

    List<Integer> querymenuByrid(@Param("rid")int rid);


    void deleteMenuByrid(int rid);

    void saveRoleMenu(@Param("rid")int rid, @Param("mids")String[] mids);
}