package com.catt.eomsteam.lsdown.master.service;

import com.catt.eomsteam.lsdown.base.entity.ProgramSetting;
import com.catt.eomsteam.lsdown.base.entity.TaskInst;
import com.catt.eomsteam.lsdown.master.dao.IQueueDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbsQueueService {
  @Autowired IQueueDao queueDao;

  protected abstract ProgramSetting.ProgramType getProgramType();

  protected abstract String getRedisQueueKey();

  protected List<TaskInst> getTastInstList() {

    return null;
  }

  protected void doQueue(List<TaskInst> taskInstList) {}
}
