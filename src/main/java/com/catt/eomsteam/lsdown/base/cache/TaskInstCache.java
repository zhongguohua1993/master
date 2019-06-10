package com.catt.eomsteam.lsdown.base.cache;

import com.alibaba.fastjson.JSON;
import com.catt.common.utils.SystemUtil;
import com.catt.eomsteam.lsdown.base.entity.ProgramSetting;
import com.catt.eomsteam.lsdown.base.entity.TaskInst;
import com.catt.eomsteam.lsdown.master.dao.IQueueDao;
import com.catt.eomsteam.lsdown.utils.RedisKeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

@Service
@EnableScheduling
public class TaskInstCache implements ICache {
  private final IQueueDao queueDao;
  private final StringRedisTemplate stringRedisTemplate;

  public TaskInstCache(IQueueDao queueDao, StringRedisTemplate stringRedisTemplate) {
    this.queueDao = queueDao;
    this.stringRedisTemplate = stringRedisTemplate;
  }

  /** 初始化任务列表缓存 缓存本机任务 */
  @Override
  public void initCache() {
    List<String> localIPList = SystemUtil.getLocalIPList();
    List<ProgramSetting> programSettingList = queueDao.getProgramSettingList(localIPList);
    for (ProgramSetting programSetting : programSettingList) {
      List<Long> taskIdList = queueDao.getTaskIdList(programSetting);
      List<TaskInst> taskInstList = queueDao.getTaskInstList(taskIdList);
      String taskQueueKey =
          RedisKeyUtil.getTaskCacheKey(
              programSetting.getProgramType(),
              programSetting.getProgramIp(),
              programSetting.getProgramPath());
      // 清空缓存列表
      stringRedisTemplate.delete(taskQueueKey);
      stringRedisTemplate
          .boundListOps(taskQueueKey)
          .rightPushAll(taskInstList.stream().map(JSON::toJSONString).toArray(String[]::new));
    }
  }

  /** 刷新任务队列缓存 每5分钟检测一次刷新标识 */
  @Override
  @Scheduled(cron = "0 0/5 * * * ?")
  public void refreshCache() {
    String refreshKey = RedisKeyUtil.getTaskCacheRefreshKey();
    /*获取任务实例刷新标识并重置为0*/
    if (Integer.valueOf(
            Objects.requireNonNull(stringRedisTemplate.opsForValue().getAndSet(refreshKey, "0")))
        == 1) {
      this.initCache();
    }
  }

  /** 立即刷新缓存-前端页面有使用 */
  @Override
  public void refreshCacheNow() {
    this.initCache();
  }
}
