package com.catt.eomsteam.lsdown.base.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.TriggerContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;

import java.util.Date;

//@Lazy(false)
//@Service
//@EnableScheduling
public class TestDynamicCronTask implements SchedulingConfigurer {
  private String cron = "0/2 * * * * ?";

  private void springDynamicCronTask() {
    cron = "0/5 * * * * ?";
  }

  @Override
  public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
    scheduledTaskRegistrar.addTriggerTask(
        () -> {
          // 任务逻辑

        },
        triggerContext -> {
          springDynamicCronTask();
          // 任务触发，可修改任务的执行周期
          CronTrigger trigger = new CronTrigger(cron);
          Date nextExec = trigger.nextExecutionTime(triggerContext);
          return nextExec;
        });
  }
}
