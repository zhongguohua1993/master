package com.catt.eomsteam.lsdown.master.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.catt.common.utils.SystemUtil;
import com.catt.eomsteam.lsdown.base.entity.ProgramSetting;
import com.catt.eomsteam.lsdown.base.entity.TaskInst;
import com.catt.eomsteam.lsdown.base.entity.TaskProgramMapper;
import com.catt.eomsteam.lsdown.base.mapper.ProgramSettingMapper;
import com.catt.eomsteam.lsdown.base.mapper.TaskInstMapper;
import com.catt.eomsteam.lsdown.base.mapper.TaskProgramMapperMapper;
import com.catt.eomsteam.lsdown.master.dao.IQueueDao;
import org.apache.commons.lang3.SystemUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.List;

@Repository
public class IQueueDaoImpl implements IQueueDao {
  private final ProgramSettingMapper programSetting;
  private final TaskProgramMapperMapper taskProgramMapper;
  private final TaskInstMapper taskInst;

  public IQueueDaoImpl(
      ProgramSettingMapper programSetting,
      TaskProgramMapperMapper taskProgramMapper,
      TaskInstMapper taskInst) {
    this.programSetting = programSetting;
    this.taskProgramMapper = taskProgramMapper;
    this.taskInst = taskInst;
  }

  @Override
  public List<TaskInst> getTaskInstList(TaskProgramMapper taskProgramMapper) {
    return null;
  }

  /**
   * 查询程序列表
   *
   * @return
   */
  @Override
  public List<ProgramSetting> getProgramSettingList() {
    List<String> localIPList = SystemUtil.getLocalIPList();
    File userDir = SystemUtils.getUserDir();
    return this.programSetting.selectList(
        new QueryWrapper<ProgramSetting>()
            .lambda()
            .in(ProgramSetting::getProgramIp, localIPList)
            .eq(ProgramSetting::getProgramPath, userDir.getAbsolutePath()));
  }

  @Override
  public List<TaskProgramMapper> getTaskProgramMapperList(ProgramSetting programSetting) {
    return null;
  }
}
