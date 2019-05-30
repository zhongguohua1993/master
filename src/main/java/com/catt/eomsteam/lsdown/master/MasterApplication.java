package com.catt.eomsteam.lsdown.master;

import com.catt.common.utils.SpringUtil;
import com.catt.eomsteam.lsdown.base.running.RunningService;
import com.catt.eomsteam.lsdown.master.app.lsst.LsstRunningService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    scanBasePackages = {
      "com.catt.common",
      "com.catt.eomsteam.lsdown.base.*",
      "com.catt.eomsteam.lsdown.master.*"
    })
@MapperScan("com.catt.eomsteam.lsdown.base.mapper")
public class MasterApplication {

  public static void main(String[] args) {
    SpringApplication.run(MasterApplication.class, args);
    RunningService lsstRunningService = SpringUtil.getBean(LsstRunningService.class);
    lsstRunningService.start();
  }
}
