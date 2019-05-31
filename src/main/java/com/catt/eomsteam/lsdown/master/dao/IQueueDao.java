package com.catt.eomsteam.lsdown.master.dao;

import com.catt.eomsteam.lsdown.base.entity.ProgramSetting;
import com.catt.eomsteam.lsdown.base.entity.TaskInst;
import com.catt.eomsteam.lsdown.base.entity.TaskProgramMapper;

import java.util.List;

public interface IQueueDao {
  List<TaskInst> getTaskInstList(TaskProgramMapper taskProgramMapper);

  List<ProgramSetting> getProgramSettingList();

  List<TaskProgramMapper> getTaskProgramMapperList(ProgramSetting programSetting);
}
