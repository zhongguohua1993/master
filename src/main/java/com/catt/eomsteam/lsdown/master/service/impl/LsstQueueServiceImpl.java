package com.catt.eomsteam.lsdown.master.service.impl;

import com.catt.eomsteam.lsdown.base.enumerate.ProgramType;
import com.catt.eomsteam.lsdown.master.service.AbsQueueService;
import com.catt.eomsteam.lsdown.master.service.IQueueService;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class LsstQueueServiceImpl extends AbsQueueService implements IQueueService {

  protected LsstQueueServiceImpl(StringRedisTemplate stringRedisTemplate) {
    super(stringRedisTemplate);
  }

  @Override
  public ProgramType getProgramType() {
    return ProgramType.LSST;
  }

  /** 将任务添加到队列中-按任务类型分队列 */
  @Override
  public void doQueue(ProgramType programType) {
    this.sendTask(this.getProgramType());
  }
}
