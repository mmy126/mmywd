package com.aaa.dao;

import com.aaa.Course;
import com.aaa.dao.impl.PorductUserServiceImpl;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 获取SPRINGCLOUD-PORDUCT服务下得
//fallback的前提条件是服务报错，而不是客户端报错，客户端报错比如路径写错是不会触发的
@FeignClient(value = "SPRINGCLOUD-PORDUCT",fallback = PorductUserServiceImpl.class)
public interface PorductUserService {
    @RequestMapping("/user/getUser")
    String getUser();
    @RequestMapping("/DeptfindAll")
    String findAll();
    @RequestMapping("/Deptupdate")
    String update(@RequestParam("deptno")int deptno,
                  @RequestParam("dname")String dname);
    @RequestMapping("/Deptdel")
    String del(@RequestParam("deptno")int deptno);
    @RequestMapping("/Deptadd")
    String add(@RequestParam("deptno")int deptno,
               @RequestParam("dname")String dname);
}
