package com.clearlove.springcloud.service;

import com.clearlove.springcloud.dao.DeptDao;
import com.clearlove.springcloud.pojo.Dept;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author promise
 * @date 2024/3/17 - 0:24
 */
@Service
public class DeptServiceImpl implements DeptService{

  @Autowired
  private DeptDao deptDao;

  @Override
  public boolean addDept(Dept dept) {
    return deptDao.addDept(dept);
  }

  @Override
  public Dept queryById(Long id) {
    return deptDao.queryById(id);
  }

  @Override
  public List<Dept> queryAll() {
    return deptDao.queryAll();
  }
}
