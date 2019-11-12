package com.jk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.jk.util.ExportExcel;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("users")
    public String users(){
        return "show";
    }

    @RequestMapping("query1")
    @ResponseBody
    public List<User> query(){

        return userService.query1();
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
    @RequestMapping("export")
    public void export(HttpServletResponse response){
        List<User> list= new ArrayList<User>();
        try {
            list = userService.query1();

            //定义表格的标题
            String title ="1905全体车辆信息";
            //定义列名
            String[] rowName={"编号","名称","介绍","价格","日期","类型"};
            //定义工具类要的数据
            List<Object[]>  dataList = new ArrayList<Object[]>();

            //循环数据把数据存放到 List<Object[]>
            for (User user:list) {
                Object[] obj=new Object[rowName.length];
                obj[0]=user.getUserid();
                obj[1]= user.getUname();
                obj[2]=user.getAvg();
                if(user.getSex()==1){
                    obj[3]="男" ;
                }else{
                    obj[3]="女" ;
                }

                dataList.add(obj);
            }
            ExportExcel exportExcel=new ExportExcel(title,rowName,dataList,response);
            exportExcel.export();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
