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
 * @since 2019-05-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_mod_task_inst")
public class TaskInst implements Serializable {

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


}
