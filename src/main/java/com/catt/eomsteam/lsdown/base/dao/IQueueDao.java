package com.catt.eomsteam.lsdown.base.dao;

import com.catt.eomsteam.lsdown.base.entity.ProgramSetting;
import com.catt.eomsteam.lsdown.base.entity.TaskInst;
import com.catt.eomsteam.lsdown.base.entity.TaskProgramMapper;

import java.math.BigDecimal;
import java.util.List;

public interface IQueueDao {
  List<TaskInst> getTaskInstList(List<Long> taskIdList);

  List<ProgramSetting> getProgramSettingList(List<String> localIPList);

  List<Long> getTaskIdList(ProgramSetting programSetting);
}
