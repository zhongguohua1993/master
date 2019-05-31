package com.catt.eomsteam.lsdown.base.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019-05-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_mod_program_setting")
public class ProgramSetting implements Serializable {

  private static final long serialVersionUID = 1L;

  /** 后台程序应用id */
  private String applicationId;

  /** 程序名称 */
  private String programName;

  /** 程序ip */
  private String programIp;

  /** 程序路径 */
  private String programPath;

  /** 程序类型：1、lsst，2、lsinst，3、sendReq，4、doReq */
  private Integer programType;

  /** 程序类型枚举值：1、lsst，2、lsinst，3、sendReq，4、doReq */
  public enum ProgramType {
    LSST(1),
    LSINST(2),
    SEND_REQ(3),
    DO_REQ(4);
    private int value;

    ProgramType(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }
  }
}
