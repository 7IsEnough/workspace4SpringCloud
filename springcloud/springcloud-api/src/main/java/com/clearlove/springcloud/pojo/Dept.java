package com.clearlove.springcloud.pojo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author promise
 * @date 2024/3/16 - 23:12
 */
@Data
@NoArgsConstructor
// 链式写法
@Accessors(chain = true)
public class Dept implements Serializable {

  private Long depto;//主键
  private String dname;
  //这个数据数存在哪个数据库的字段微服务，一个服务对应一个数据库，同一个信息可能存在不同的数据库
  private String db_source;

  public Dept(String dname) {
    this.dname = dname;
  }
}
