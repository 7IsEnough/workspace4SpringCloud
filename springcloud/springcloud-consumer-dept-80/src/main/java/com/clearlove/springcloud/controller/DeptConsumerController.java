package com.clearlove.springcloud.controller;

import com.clearlove.springcloud.pojo.Dept;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author promise
 * @date 2024/3/17 - 18:44
 */
@RestController
public class DeptConsumerController {

  //提供多种便捷访问远程http服务的方法，简单的restful服务模版
  @Autowired
  private RestTemplate restTemplate;

  private static final String REST_URL_PREFIX = "http://localhost:8001";

  @RequestMapping("/consumer/dept/get/{id}")
  public Dept get(@PathVariable("id") Long id){
    return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
  }

  @RequestMapping("/consumer/dept/add")
  public boolean add(Dept dept){
    return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
  }

  @RequestMapping("/consumer/dept/list")
  public List<Dept> list(){
    return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
  }

}
