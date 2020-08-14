package aaa.dao;

import aaa.entity.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptDao extends tk.mybatis.mapper.common.Mapper<Dept>{
    @Select("select deptno,dname from dept")
    List<Dept> findAll();
    @Insert("insert into dept (deptno,dname) values (#{deptno},#{dname})")
    int add(Dept d);
    @Update("update dept set dname=#{dname} where deptno=#{deptno}")
    int update(Dept d);
    @Update("delete from Dept where deptno=#{deptno}")
    int del(@Param("deptno") int deptno);
}
