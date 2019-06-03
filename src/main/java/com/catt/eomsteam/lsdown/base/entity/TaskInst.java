package com.catt.eomsteam.lsdown.base.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.catt.eomsteam.lsdown.base.entity.BaseIdEntity;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhongguohua@gdcattsoft.com
 * @since 2019-06-02
 */
@TableName("t_mod_task_inst")
@Repository
public class TaskInst extends BaseIdEntity {

private static final long serialVersionUID=1L;

    /**
     * 任务配置id
     */
    private Long taskId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 省份
     */
    private String provinceName;

    /**
     * 地市
     */
    private String cityName;

    /**
     * 扫描根目录
     */
    private String inDir;

    /**
     * 输出根目录
     */
    private String outDir;

    /**
     * 任务状态：1-可用，2-初始化，3-关闭，4-异常
     */
    private Integer okFlag;

    /**
     * 数据保存表，可以按周期分表
     */
    private String saveTable;

    /**
     * 任务优先级，同一个后台程序或许有效
     */
    private String priority;

    /**
     * 厂家
     */
    private String vender;

    /**
     * 任务分组
     */
    private String groupName;

    /**
     * 任务时间-月
     */
    private Integer dealMonth;

    /**
     * 任务时间-天
     */
    private Integer dealDay;

    /**
     * 任务时间-小时
     */
    private Integer dealHour;

    /**
     * 任务参数
     */
    private String taskArgs;

    /**
     * 创建时间
     */
    private BigDecimal createTime;

    /**
     *  更新时间
     */
    private BigDecimal updateTime;

    /**
     * 备注信息
     */
    private String remark;


    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getInDir() {
        return inDir;
    }

    public void setInDir(String inDir) {
        this.inDir = inDir;
    }

    public String getOutDir() {
        return outDir;
    }

    public void setOutDir(String outDir) {
        this.outDir = outDir;
    }

    public Integer getOkFlag() {
        return okFlag;
    }

    public void setOkFlag(Integer okFlag) {
        this.okFlag = okFlag;
    }

    public String getSaveTable() {
        return saveTable;
    }

    public void setSaveTable(String saveTable) {
        this.saveTable = saveTable;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getDealMonth() {
        return dealMonth;
    }

    public void setDealMonth(Integer dealMonth) {
        this.dealMonth = dealMonth;
    }

    public Integer getDealDay() {
        return dealDay;
    }

    public void setDealDay(Integer dealDay) {
        this.dealDay = dealDay;
    }

    public Integer getDealHour() {
        return dealHour;
    }

    public void setDealHour(Integer dealHour) {
        this.dealHour = dealHour;
    }

    public String getTaskArgs() {
        return taskArgs;
    }

    public void setTaskArgs(String taskArgs) {
        this.taskArgs = taskArgs;
    }

    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TaskInst{" +
        "taskId=" + taskId +
        ", taskName=" + taskName +
        ", provinceName=" + provinceName +
        ", cityName=" + cityName +
        ", inDir=" + inDir +
        ", outDir=" + outDir +
        ", okFlag=" + okFlag +
        ", saveTable=" + saveTable +
        ", priority=" + priority +
        ", vender=" + vender +
        ", groupName=" + groupName +
        ", dealMonth=" + dealMonth +
        ", dealDay=" + dealDay +
        ", dealHour=" + dealHour +
        ", taskArgs=" + taskArgs +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", remark=" + remark +
        "}";
    }
}
