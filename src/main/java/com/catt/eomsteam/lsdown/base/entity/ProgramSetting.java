package com.catt.eomsteam.lsdown.base.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.catt.eomsteam.lsdown.base.entity.BaseIdEntity;
import com.catt.eomsteam.lsdown.base.enumerate.ProgramType;
import org.springframework.stereotype.Repository;

/**
 * @author zhongguohua@gdcattsoft.com
 * @since 2019-06-02
 */
@TableName("t_mod_program_setting")
@Repository
public class ProgramSetting extends BaseIdEntity {

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
  private ProgramType programType;

  /** 程序状态：1、开启，2：停止 */
  private Integer programStatus;

  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public String getProgramName() {
    return programName;
  }

  public void setProgramName(String programName) {
    this.programName = programName;
  }

  public String getProgramIp() {
    return programIp;
  }

  public void setProgramIp(String programIp) {
    this.programIp = programIp;
  }

  public String getProgramPath() {
    return programPath;
  }

  public void setProgramPath(String programPath) {
    this.programPath = programPath;
  }

  public ProgramType getProgramType() {
    return programType;
  }

  public void setProgramType(ProgramType programType) {
    this.programType = programType;
  }

  public Integer getProgramStatus() {
    return programStatus;
  }

  public void setProgramStatus(Integer programStatus) {
    this.programStatus = programStatus;
  }

  @Override
  public String toString() {
    return "ProgramSetting{"
        + "applicationId="
        + applicationId
        + ", programName="
        + programName
        + ", programIp="
        + programIp
        + ", programPath="
        + programPath
        + ", programType="
        + programType.getDesc()
        + ", programStatus="
        + programStatus
        + "}";
  }
}
