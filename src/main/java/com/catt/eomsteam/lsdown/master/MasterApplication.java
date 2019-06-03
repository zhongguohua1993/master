package com.catt.eomsteam.lsdown.master;

import com.catt.common.utils.SpringUtil;
import com.catt.eomsteam.lsdown.master.service.IQueueService;
import com.catt.eomsteam.lsdown.master.service.NewDataTests;
import com.catt.eomsteam.lsdown.master.service.impl.QueueServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
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
    //    Logger logger = LoggerFactory.getLogger(MasterApplication.class);
    SpringApplication.run(MasterApplication.class, args);
    //    NewDataTests bean = SpringUtil.getBean(NewDataTests.class);
    //    bean.select();
    //    logger.info("before");
    //    RunningService lsstRunningService = SpringUtil.getBean(LsstRunningService.class);
    //    ProgramSetting bean = SpringUtil.getBean(ProgramSetting.class);
    //    System.out.println(bean.toString());
    //    lsstRunningService.start();
    //    logger.info("end");
    IQueueService queueService = SpringUtil.getBean(QueueServiceImpl.class);
    queueService.doQueue();
  }
}
