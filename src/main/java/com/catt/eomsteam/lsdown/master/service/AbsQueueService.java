package com.catt.eomsteam.lsdown.master.service;

import com.catt.common.utils.SystemUtil;
import com.catt.eomsteam.lsdown.base.enumerate.ProgramType;
import com.catt.eomsteam.lsdown.utils.RedisKeyUtil;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;
import java.util.Objects;

public abstract class AbsQueueService implements IQueueService {
  private final StringRedisTemplate stringRedisTemplate;

  protected AbsQueueService(StringRedisTemplate stringRedisTemplate) {
    this.stringRedisTemplate = stringRedisTemplate;
  }

  public abstract ProgramType getProgramType();

  public void sendTask(ProgramType programType) {
    List<String> localIPList = SystemUtil.getLocalIPList();
    String userDir = System.getProperty("user.dir");
    for (String ip : localIPList) {
      String taskCacheKey = RedisKeyUtil.getTaskCacheKey(programType, ip, userDir);
      String taskChannelKey = RedisKeyUtil.getTaskChannelKey(programType, ip, userDir);
      BoundListOperations<String, String> listOps = stringRedisTemplate.boundListOps(taskCacheKey);
      List<String> taskInstList = listOps.range(0, listOps.size());
      Objects.requireNonNull(taskInstList)
          .forEach(taskInst -> stringRedisTemplate.convertAndSend(taskChannelKey, taskInst));
    }
  }
}
