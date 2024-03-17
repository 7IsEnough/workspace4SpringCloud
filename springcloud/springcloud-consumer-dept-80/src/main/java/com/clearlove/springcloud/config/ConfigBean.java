package com.clearlove.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author promise
 * @date 2024/3/17 - 18:47
 */
@Configuration
public class ConfigBean {

  @Bean
  public RestTemplate restTemplate(){
    return new RestTemplate();
  }


}
