package aaa.controller;

import aaa.dao.DeptDao;
import aaa.entity.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin
@Controller
public class DeptController {
    @Resource
    DeptDao dd;
    @RequestMapping("DeptfindAll")
    @ResponseBody
    public List<Dept> findAll(){
        System.out.println("findAll");
        return dd.findAll();
    }

    @RequestMapping("DeptselectAll")
    @ResponseBody
    public List<Dept> selectAll(){
        System.out.println("SelectALL");
        return dd.selectAll();
    }
    @RequestMapping("Deptupdate")
    @ResponseBody
    public int update(Dept c){
        System.out.println("update:"+c);
        return dd.update(c);
    }


    @RequestMapping("Deptdel")
    @ResponseBody
    public int del(int deptno){
        System.out.println("del:"+deptno);
        return dd.del(deptno);
    }
    @RequestMapping("Deptadd")
    @ResponseBody
    public int add(Dept d){
        System.out.println("add:"+d);
        return dd.add(d);
    }
}
