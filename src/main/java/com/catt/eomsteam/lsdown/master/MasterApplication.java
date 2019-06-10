package com.catt.eomsteam.lsdown.master;

import com.catt.common.utils.SpringUtil;
import com.catt.eomsteam.lsdown.base.cache.ICache;
import com.catt.eomsteam.lsdown.base.cache.TaskInstCache;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
      "com.catt.common.*",
      "com.catt.eomsteam.lsdown.base.*",
      "com.catt.eomsteam.lsdown.master.*"
    })
@MapperScan("com.catt.eomsteam.lsdown.base.mapper")
public class MasterApplication {

  public static void main(String[] args) {
    SpringApplication.run(MasterApplication.class, args);
  }
}
