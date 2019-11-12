package com.jk.service;


import com.jk.dao.MenuMapper;
import com.jk.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> queryMenu(int pid) {
        List<Menu> list= menuMapper.queryMenu(pid);
        if (list !=null && list.size()>0) {
            for (int i = 0; i < list.size(); i++) {
                List<Menu> menus=queryMenu(list.get(i).getId());
                list.get(i).setChildren(menus);
            }
        }
        return list;
    }

    @Override
    public List<Menu> querymenu() {

        return menuMapper.querymenu();
    }

    @Override
    public void dele(Integer ids) {
        menuMapper.dele(ids);
    }

    @Override
    public void add(Menu m) {
        menuMapper.add(m);
    }

    @Override
    public Menu querymenubyid(Integer id) {

        return menuMapper.querymenubyid(id);
    }

    @Override
    public void update(Menu m) {
        menuMapper.update(m);
    }


}
