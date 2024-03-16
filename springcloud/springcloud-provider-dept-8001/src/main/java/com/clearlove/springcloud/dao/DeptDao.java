package com.clearlove.springcloud.dao;

import com.clearlove.springcloud.pojo.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author promise
 * @date 2024/3/17 - 0:17
 */
@Mapper
public interface DeptDao {

  public boolean addDept(Dept dept);


  public Dept queryById(@Param("deptno") Long id);

  public List<Dept> queryAll();

}
