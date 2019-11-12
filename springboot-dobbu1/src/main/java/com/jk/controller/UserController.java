package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("users")
    public String users(){
        return "show";
    }
    @RequestMapping("query")
    @ResponseBody
    public List<User> query(){

        return userService.query();
    }
    @RequestMapping("del")
    @ResponseBody
    public String del(Integer ids){
        userService.del(ids);

        return null;
    }
    @RequestMapping("addd")
    public String addd(){

        return "add";
    }
    @RequestMapping("add")
    @ResponseBody
    public String add(User u){
        userService.add(u);
        return "1";
    }
    @RequestMapping("xiu")
    public String xiu(Integer id, Model model){
        User u = userService.querymenubyid(id);
        model.addAttribute("u", u);

        return "userupdate";
    }
    @RequestMapping("update")
    @ResponseBody
    public String update(User u){
        userService.update(u);
        return "1";
    }

}
