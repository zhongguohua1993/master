package com.catt.eomsteam.lsdown.base;

import com.catt.eomsteam.lsdown.base.entity.TaskSetting;
import com.catt.eomsteam.lsdown.base.mapper.TaskSettingMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {

  @Test
  public void contextLoads() {}

  @Autowired private TaskSettingMapper taskSettingMapper;

  @Test
  public void testSelect() {
    System.out.println(("----- selectAll method test ------"));
    List<TaskSetting> userList = taskSettingMapper.selectList(null);
    userList.forEach(System.out::println);
  }
}
