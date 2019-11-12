package com.jk.service;

import com.jk.model.Menu;

import java.util.List;

public interface MenuService {
    List<Menu> queryMenu(int i);


    List<Menu> querymenu();

    void dele(Integer ids);

    void add(Menu m);

    Menu querymenubyid(Integer id);

    void update(Menu m);
}
