package com.catt.eomsteam.lsdown.master.service;

import com.catt.eomsteam.lsdown.base.entity.TaskInst;

import java.util.List;

public interface IQueueService {
  void doQueue(List<TaskInst> taskInstList);
}
