package com.jk.controller;

import com.jk.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("toQueryCar")
    public String toqueryCar(HttpServletRequest request){
        return "show";
    }
    @RequestMapping("queryCar")
    @ResponseBody
    public List<Map<String,Object>> queryCarList(){
        List<Map<String,Object>> map1 =carService.queryCar();
        List<Map<String,Object>> map2 =new ArrayList<Map<String,Object>>();

        for (Map<String,Object> map:map1) {
            Map<String,Object> map3=new HashMap<>();
            map3.put("y",map.get("y"));
            map3.put("name",map.get("time"));
            map2.add(map3);
        }

        return map2;
    }
    @RequestMapping("queryCarAll")
    @ResponseBody
    public List<Map<String,Object>> queryCarAll(){

        List<Map<String,Object>> map =carService.queryCarAll();

        List<Map<String,Object>> map2 =new ArrayList<Map<String,Object>>();

        for (Map<String,Object> map1:map) {
            Map<String,Object> map3=new HashMap<>();
            map3.put("name",map1.get("time"));
            map3.put("data",map1.get("counts"));
            map2.add(map3);

        }

        return map;
    }

    @RequestMapping("querycha")
    public String querycha(HttpServletRequest request){
        return "index";
    }

    @RequestMapping("querycar")
    @ResponseBody
    public List<Map<String,Object>> querycar(){
        List<Map<String,Object>> map =carService.querycar();

        List<Map<String,Object>> map2 =new ArrayList<Map<String,Object>>();

        for (Map<String,Object> map1:map) {
            Map<String,Object> map3=new HashMap<>();
            map3.put("name",map1.get("time"));
            map3.put("data",map1.get("counts"));
            map2.add(map3);

        }

        return map;

    }

    @RequestMapping("query")
    public String query(HttpServletRequest request){
        return "list";
    }
    @RequestMapping("queryri")
    @ResponseBody
    public List<Map<String,Object>> queryri(){
        List<Map<String,Object>> map =carService.queryri();

        List<Map<String,Object>> map2 =new ArrayList<Map<String,Object>>();

        for (Map<String,Object> map1:map) {
            Map<String,Object> map3=new HashMap<>();
            map3.put("name",map1.get("time"));
            map3.put("data",map1.get("counts"));
            map2.add(map3);

        }

        return map;

    }

}
