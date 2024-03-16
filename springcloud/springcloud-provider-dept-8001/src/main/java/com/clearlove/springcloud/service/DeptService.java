package com.clearlove.springcloud.service;

import com.clearlove.springcloud.pojo.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author promise
 * @date 2024/3/17 - 0:23
 */
public interface DeptService {


  public boolean addDept(Dept dept);


  public Dept queryById(@Param("deptno") Long id);

  public List<Dept> queryAll();

}
