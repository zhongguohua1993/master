package com.catt.eomsteam.lsdown.master.service.impl;

import com.catt.common.utils.RedisKeyUtil;
import com.catt.common.utils.SystemUtil;
import com.catt.eomsteam.lsdown.base.dao.IQueueDao;
import com.catt.eomsteam.lsdown.base.entity.ProgramSetting;
import com.catt.eomsteam.lsdown.base.entity.TaskInst;
import com.catt.eomsteam.lsdown.master.service.IQueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class QueueServiceImpl implements IQueueService {
  @Autowired IQueueDao queueDao;
  @Resource RedisTemplate<String, List> redisTemplate;

  /** 将任务添加到队列中-按任务类型分队列*/
  @Override
  public void doQueue() {
    List<String> localIPList = SystemUtil.getLocalIPList();
    List<ProgramSetting> programSettingList = queueDao.getProgramSettingList(localIPList);
    for (ProgramSetting programSetting : programSettingList) {
      List<Long> taskIdList = queueDao.getTaskIdList(programSetting);
      List<TaskInst> taskInstList = queueDao.getTaskInstList(taskIdList);
      String taskQueueKey =
          RedisKeyUtil.getTaskQueueKey(
              programSetting.getProgramType().getDesc(),
              programSetting.getProgramIp(),
              programSetting.getProgramPath());
      redisTemplate.boundListOps(taskQueueKey).rightPushAll(taskInstList);
    }
  }
}
