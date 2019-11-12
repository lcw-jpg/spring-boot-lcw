package com.jk.controller;

import com.jk.model.Menu;
import com.jk.model.Role;
import com.jk.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;
    @RequestMapping("role")
    public String users(){
        return "list";
    }
    @RequestMapping("queryrole")
    @ResponseBody
    public List<Role> queryrole(){

        return roleService.queryrole();
    }
    @RequestMapping("toEditRoleMenu")
    public String toEditRoleMenu(int rid, Model model){
        model.addAttribute("rid", rid);
        return "rolemenu";
    }
    @RequestMapping("queryRoleMenu")
    @ResponseBody
    public List<Menu> queryRoleMenu(int rid){

        return roleService.queryRoleMenu(-1,rid);
    }
    @RequestMapping("saveRoleMenu")
    @ResponseBody
    public String saveRoleMenu(int rid,String mids){
        roleService.saveRoleMenu(rid,mids);
        return "suc";
    }

}
