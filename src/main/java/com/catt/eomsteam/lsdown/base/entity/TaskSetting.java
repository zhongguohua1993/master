package com.catt.eomsteam.lsdown.base.entity;

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
@TableName("t_mod_task_setting")
@Repository
public class TaskSetting extends BaseIdEntity {

private static final long serialVersionUID=1L;

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
     * 任务状态：1-开启，2-关闭，3-异常
     */
    private Integer okFlag;

    /**
     * 数据保存表，可以按周期分表
     */
    private String saveTable;

    /**
     * 任务存活周期，默认0
     */
    private Integer keepAliveCycle;

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
     * 任务参数
     */
    private String taskArgs;


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

    public Integer getKeepAliveCycle() {
        return keepAliveCycle;
    }

    public void setKeepAliveCycle(Integer keepAliveCycle) {
        this.keepAliveCycle = keepAliveCycle;
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

    public String getTaskArgs() {
        return taskArgs;
    }

    public void setTaskArgs(String taskArgs) {
        this.taskArgs = taskArgs;
    }

    @Override
    public String toString() {
        return "TaskSetting{" +
        "taskName=" + taskName +
        ", provinceName=" + provinceName +
        ", cityName=" + cityName +
        ", inDir=" + inDir +
        ", outDir=" + outDir +
        ", okFlag=" + okFlag +
        ", saveTable=" + saveTable +
        ", keepAliveCycle=" + keepAliveCycle +
        ", priority=" + priority +
        ", vender=" + vender +
        ", groupName=" + groupName +
        ", taskArgs=" + taskArgs +
        "}";
    }
}
