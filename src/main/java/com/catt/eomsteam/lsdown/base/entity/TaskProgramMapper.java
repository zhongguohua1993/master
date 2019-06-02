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
@TableName("t_mod_task_program_mapper")
@Repository
public class TaskProgramMapper extends BaseIdEntity {

private static final long serialVersionUID=1L;

    /**
     * 任务配置id
     */
    private Long taskSettingId;

    /**
     * 程序配置id
     */
    private Long programSettingId;


    public Long getTaskSettingId() {
        return taskSettingId;
    }

    public void setTaskSettingId(Long taskSettingId) {
        this.taskSettingId = taskSettingId;
    }

    public Long getProgramSettingId() {
        return programSettingId;
    }

    public void setProgramSettingId(Long programSettingId) {
        this.programSettingId = programSettingId;
    }

    @Override
    public String toString() {
        return "TaskProgramMapper{" +
        "taskSettingId=" + taskSettingId +
        ", programSettingId=" + programSettingId +
        "}";
    }
}
