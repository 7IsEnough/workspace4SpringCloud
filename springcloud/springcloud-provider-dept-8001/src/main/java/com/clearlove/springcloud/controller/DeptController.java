package com.clearlove.springcloud.controller;

import com.clearlove.springcloud.pojo.Dept;
import com.clearlove.springcloud.service.DeptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author promise
 * @date 2024/3/17 - 0:29 提供RestFul服务
 */
@RestController
public class DeptController {

  @Autowired private DeptService service;

  @PostMapping("/dept/add")
  public boolean addDept(Dept dept) {
    return service.addDept(dept);
  }

  @GetMapping("/dept/get/{id}")
  public Dept get(@PathVariable("id") Long id) {
    return service.queryById(id);
  }

  @GetMapping("/dept/list")
  public List<Dept> queryAll() {
    return service.queryAll();
  }
}
