package com.catt.eomsteam.lsdown.base.enumerate;

import com.baomidou.mybatisplus.core.enums.IEnum;

import java.io.Serializable;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019-06-01
 */
public enum ProgramType implements IEnum<Integer> {
  LSST(1, "LSST"),
  LSINST(2, "LSINST"),
  SEND_REQ(3, "SEND_REQ"),
  DO_REQ(4, "DO_REQ");
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
