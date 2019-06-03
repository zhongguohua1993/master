package com.catt.eomsteam.lsdown.base;

import com.catt.common.utils.SpringUtil;
import com.catt.eomsteam.lsdown.base.entity.ProgramSetting;
import com.catt.eomsteam.lsdown.base.entity.TaskInst;
import com.catt.eomsteam.lsdown.base.entity.TaskProgramMapper;
import com.catt.eomsteam.lsdown.base.entity.TaskSetting;
import com.catt.eomsteam.lsdown.base.enumerate.ProgramType;
import com.catt.eomsteam.lsdown.base.mapper.ProgramSettingMapper;
import com.catt.eomsteam.lsdown.base.mapper.TaskInstMapper;
import com.catt.eomsteam.lsdown.base.mapper.TaskProgramMapperMapper;
import com.catt.eomsteam.lsdown.base.mapper.TaskSettingMapper;
import com.catt.eomsteam.lsdown.master.MasterApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019/6/2
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MasterApplication.class)
public class NewDataTests {
  @Autowired ProgramSettingMapper programSetting;
  @Autowired TaskInstMapper taskInst;
  @Autowired TaskProgramMapperMapper taskProgramMapper;
  @Autowired TaskSettingMapper taskSetting;

  public TaskSetting addTaskSetting() {
    TaskSetting taskSetting = SpringUtil.getBean(TaskSetting.class);
    taskSetting.setTaskName("test");
    taskSetting.setInDir("/");
    taskSetting.setCityName("gz");
    taskSetting.setProvinceName("gd");
    taskSetting.setOkFlag(1);
    taskSetting.setSaveTable("t_test");
    taskSetting.setOutDir("/");
    taskSetting.setKeepAliveCycle(1);
    taskSetting.setVender("hauwei");
    taskSetting.setGroupName("testGroup");
    this.taskSetting.insert(taskSetting);
    return taskSetting;
  }

  public TaskInst addTaskInst(TaskSetting taskSetting) {
    TaskInst taskInst = SpringUtil.getBean(TaskInst.class);
    taskInst.setTaskName(taskSetting.getTaskName());
    taskInst.setInDir(taskSetting.getInDir());
    taskInst.setCityName(taskSetting.getCityName());
    taskInst.setProvinceName(taskSetting.getProvinceName());
    taskInst.setSaveTable(taskSetting.getSaveTable());
    taskInst.setOutDir(taskSetting.getOutDir());
    taskInst.setVender(taskSetting.getVender());
    taskInst.setGroupName(taskSetting.getGroupName());
    taskInst.setDealDay(20190602);
    taskInst.setOkFlag(1);
    taskInst.setCreateTime(new BigDecimal(20190602));
    taskInst.setUpdateTime(new BigDecimal(20190602));
    this.taskInst.insert(taskInst);
    return taskInst;
  }

  public ProgramSetting addProgramSetting() {
    ProgramSetting programSetting = SpringUtil.getBean(ProgramSetting.class);
    programSetting.setApplicationId("test_program");
    programSetting.setProgramIp("192.168.1.106");
    programSetting.setProgramName("test");
    programSetting.setProgramPath("/test");
    programSetting.setProgramStatus(1);
    programSetting.setProgramType(ProgramType.LSST);
    this.programSetting.insert(programSetting);
    return programSetting;
  }

  public TaskProgramMapper addTaskProgramMapper(
      TaskSetting taskSetting, ProgramSetting programSetting) {
    TaskProgramMapper taskProgramMapper = SpringUtil.getBean(TaskProgramMapper.class);
    taskProgramMapper.setProgramSettingId(programSetting.getId());
    taskProgramMapper.setTaskSettingId(taskSetting.getId());
    this.taskProgramMapper.insert(taskProgramMapper);
    return taskProgramMapper;
  }

  public void add() {
    ProgramSetting programSetting = this.addProgramSetting();
    TaskSetting taskSetting = this.addTaskSetting();
    this.addTaskProgramMapper(taskSetting, programSetting);
    this.addTaskInst(taskSetting);
  }

  @Test
  public void select() {
    List<ProgramSetting> programSettings = this.programSetting.selectList(null);
    programSettings.forEach(System.out::println);
  }
}
