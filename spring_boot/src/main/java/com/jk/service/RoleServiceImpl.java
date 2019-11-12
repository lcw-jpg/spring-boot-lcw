package com.jk.service;

import com.jk.dao.MenuMapper;
import com.jk.dao.RoleMapper;
import com.jk.model.Menu;
import com.jk.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Role> queryrole() {

        return roleMapper.queryrole();
    }

    @Override
    public List<Menu> queryRoleMenu(int pid, int rid) {
        //根据PID查询所有子节点列表
        List<Menu> menu1=menuMapper.querymenutree(pid);
        /*		查询该角色已有的所有权限ID集合-----查询角色中间表*/
        List<Integer> rolemenu=menuMapper.querymenuByrid(rid);
        if (menu1!=null && menu1.size() >0) {
            //循环该列表
            for (int i = 0; i < menu1.size(); i++) {
//		4.在循环体内 将当前元素的id 作为pid 调用当前方法本身 进行递归
                List<Menu> menu2=queryRoleMenu(menu1.get(i).getId(),rid);
//			5.如果能够查到子节点列表 则将该列表放到 children属性中
                menu1.get(i).setChildren(menu2);
                for (int j = 0; j < rolemenu.size(); j++) {
                    if (menu2.size() <=0 && menu1.get(i).getId() == rolemenu.get(j)) {
                        menu1.get(i).setChecked(true);
                    }
                }
            }
        }
        return menu1;
    }

    @Override
    public void saveRoleMenu(int rid, String mids) {
        menuMapper.deleteMenuByrid(rid);

        menuMapper.saveRoleMenu(rid,mids.split(","));
    }


}
