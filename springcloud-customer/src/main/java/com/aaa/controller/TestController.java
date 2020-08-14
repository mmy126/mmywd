package com.aaa.controller;

import com.aaa.Dept;
import com.aaa.dao.PorductUserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@CrossOrigin
@RestController
public class TestController {
    @Resource
    PorductUserService porductUserService;

    @RequestMapping("test")
    public String test(){
        return porductUserService.getUser();
    }
    @RequestMapping("findAll")
    public String findAll(){
        return porductUserService.findAll();
    }
    @RequestMapping("update")
    public String update(Dept d){
        System.out.println(d);
        return porductUserService.update(d.getDeptno(),d.getDname());
    }
    @RequestMapping("del")
    public String del(int deptno){
        return porductUserService.del(deptno);
    }
    @RequestMapping("add")
    public String add(Dept d){
        System.out.println(d);
        return porductUserService.add(d.getDeptno(),d.getDname());
    }

}
