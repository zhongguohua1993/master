package com.catt.eomsteam.lsdown.base.enumerate;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019-06-01
 */
public enum ProgramType implements IEnum<Integer> {
  LSST(1, "目录扫描程序"),
  LSINST(2, "文件扫描程序"),
  SEND_REQ(3, "文件待办发送程序"),
  DO_REQ(4, "文件下载程序");
  private int value;
  private String desc;

  ProgramType(int value, String desc) {
    this.value = value;
    this.desc = desc;
  }

  @Override
  public Integer getValue() {
    return this.value;
  }

  public String getDesc() {
    return this.desc;
  }
}
