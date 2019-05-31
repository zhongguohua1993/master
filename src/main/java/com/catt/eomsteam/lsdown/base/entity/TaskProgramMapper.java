package com.catt.eomsteam.lsdown.base.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhongguohua@gdcattsoft.com
 * @since 2019-05-31
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_mod_task_program_mapper")
public class TaskProgramMapper implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 任务配置id
     */
    private BigDecimal taskSettingId;

    /**
     * 程序配置id
     */
    private BigDecimal programSettingId;


}
