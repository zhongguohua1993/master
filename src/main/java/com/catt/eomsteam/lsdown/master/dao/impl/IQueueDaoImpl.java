package com.catt.eomsteam.lsdown.master.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.catt.common.utils.ObjectUtil;
import com.catt.eomsteam.lsdown.base.entity.ProgramSetting;
import com.catt.eomsteam.lsdown.base.entity.TaskInst;
import com.catt.eomsteam.lsdown.base.entity.TaskProgramMapper;
import com.catt.eomsteam.lsdown.base.mapper.ProgramSettingMapper;
import com.catt.eomsteam.lsdown.base.mapper.TaskInstMapper;
import com.catt.eomsteam.lsdown.base.mapper.TaskProgramMapperMapper;
import com.catt.eomsteam.lsdown.master.dao.IQueueDao;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

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
  public List<TaskInst> getTaskInstList(List<Long> taskIdList) {
    this.taskInst.selectList(
        new QueryWrapper<TaskInst>()
            .lambda()
            .eq(TaskInst::getOkFlag, 1)
            .in(ObjectUtil.isEmpty(taskIdList), TaskInst::getTaskId, taskIdList)
            .orderByAsc(TaskInst::getPriority)
            .orderByDesc(TaskInst::getDealDay));
    return null;
  }

  /**
   * 查询程序列表
   *
   * @return
   */
  @Override
  public List<ProgramSetting> getProgramSettingList(List<String> localIPList) {
    return this.programSetting.selectList(
        new QueryWrapper<ProgramSetting>()
            .lambda()
            .eq(ProgramSetting::getProgramStatus, 1)
            .in(ProgramSetting::getProgramIp, localIPList));
  }

  @Override
  public List<Long> getTaskIdList(ProgramSetting programSetting) {
    return this.taskProgramMapper
        .selectList(
            new QueryWrapper<TaskProgramMapper>()
                .lambda()
                .select(TaskProgramMapper::getTaskSettingId)
                .eq(TaskProgramMapper::getProgramSettingId, programSetting.getId()))
        .stream()
        .map(TaskProgramMapper::getTaskSettingId)
        .collect(Collectors.toList());
  }
}
