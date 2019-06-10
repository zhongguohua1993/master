package com.catt.eomsteam.lsdown.master.service;

import com.catt.eomsteam.lsdown.base.enumerate.ProgramType;

public interface IQueueService {
  void doQueue(ProgramType programType);
}
