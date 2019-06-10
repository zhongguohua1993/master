package com.catt.eomsteam.lsdown.base.running.impl;

import com.catt.common.utils.SpringUtil;
import com.catt.eomsteam.lsdown.base.cache.ICache;
import com.catt.eomsteam.lsdown.base.cache.TaskInstCache;
import com.catt.eomsteam.lsdown.base.running.IRunningService;
import com.catt.eomsteam.lsdown.master.service.IQueueService;
import org.springframework.stereotype.Service;

@Service
public class TaskInstManagerService implements IRunningService {
  private ICache taskInstCache;
  private IQueueService queueService;

  public TaskInstManagerService(IQueueService queueService) {
    this.taskInstCache = SpringUtil.getBean(TaskInstCache.class);
    this.queueService = queueService;
  }

  @Override
  public void start() {
    /*启动设置任务列表缓存*/
    this.taskInstCache.initCache();
    //    queueService.doQueue();
  }
}
