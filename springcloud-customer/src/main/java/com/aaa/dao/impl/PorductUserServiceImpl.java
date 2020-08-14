package com.aaa.dao.impl;

import com.aaa.dao.PorductUserService;
import org.springframework.stereotype.Component;

@Component
public class PorductUserServiceImpl implements PorductUserService {
    @Override
    public String getUser(){
        return "没有查到用户信息";
    }
    @Override
    public String findAll(){
        return "<h2 style='text-align:center'>查询服务器报错</h2>";
    }
    @Override
    public String update(int deptno,String dname){
        return "<h2 style='text-align:center'>修改服务期报错</h2>";
    }
    @Override
    public String del(int deptno){
        return "<h2 style='text-align:center'>删除服务器报错</h2>";
    }
    @Override
    public String add(int deptno,String dname){
        return "<h2 style='text-align:center'>添加服务器报错</h2>";
    }

}
