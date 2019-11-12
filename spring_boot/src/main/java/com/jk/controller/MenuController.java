package com.jk.controller;

import com.jk.model.Menu;
import com.jk.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;
    @RequestMapping("querytree")
    @ResponseBody
    public List<Menu> querytree(HttpServletRequest request){

        return menuService.queryMenu(-1);
    }
    @RequestMapping("menu")
    public String users(){
        return "quan";
    }
    @RequestMapping("querymenu")
    @ResponseBody
    public List<Menu> querymenu(){

        return menuService.querymenu();
    }
    @RequestMapping("dele")
    @ResponseBody
    public String dele(Integer ids){
        menuService.dele(ids);

        return null;
    }
    @RequestMapping("addd")
    public String addd(){

        return "addmenu";
    }
    @RequestMapping("add")
    @ResponseBody
    public String add(Menu m){
        menuService.add(m);
        return "1";
    }
    @RequestMapping("xiu")
    public String xiu(Menu m, Model model){
        m=menuService.querymenubyid(m.getId());
        model.addAttribute("m", m);

        return "menuupdate";
    }
    @RequestMapping("update")
    @ResponseBody
    public String update(Menu m){
        menuService.update(m);
        return "1";
    }
}
