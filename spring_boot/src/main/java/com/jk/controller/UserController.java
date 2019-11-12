package com.jk.controller;

import com.jk.model.Role;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
    @RequestMapping("toUserRole")
    public String toUserRole(Integer uid, Model model){
        model.addAttribute("uid", uid);
        List<Role> rolelist=userService.queryUserRole(uid);
        model.addAttribute("roles", rolelist);

        return "userrole";
    }
    @RequestMapping("UserRole")
    @ResponseBody
    public String UserRole(int uid,String rids){
        userService.UserRole(uid,rids);
        return "suc";
    }
    @RequestMapping("toLogin")
    @ResponseBody
    public String toLogin(String code, HttpSession session, User user){

        User u=userService.queryUserName(user.getUname());
        if(u==null){
            return "用户不存在！";
        }
        if(u!=null&&!u.getPwd().equals(user.getPwd())){
            return "密码错误！";
        }
        session.setAttribute("user", u);
        return "登录成功！";
    }

    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }
    @RequestMapping("login")
    public String login(){
        return "login";
    }

}
