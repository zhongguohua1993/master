/*
 Navicat Premium Data Transfer

 Source Server         : 本机MySQL
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : lsdown3.0

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 30/05/2019 21:27:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_mod_task_inst
-- ----------------------------
DROP TABLE IF EXISTS `t_mod_task_inst`;
CREATE TABLE `t_mod_task_inst`  (
  `id` bigint(16) NOT NULL COMMENT 'id',
  `task_id` bigint(16) NULL DEFAULT NULL COMMENT '任务配置id',
  `task_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务名称',
  `province_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省份',
  `city_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地市',
  `in_dir` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '扫描根目录',
  `out_dir` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '输出根目录',
  `ok_flag` tinyint(2) NULL DEFAULT NULL COMMENT '任务状态：1-可用，2-初始化，3-关闭，4-异常',
  `save_table` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据保存表，可以按周期分表',
  `priority` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务优先级，同一个后台程序或许有效',
  `vender` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '厂家',
  `group_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务分组',
  `deal_month` int(6) NULL DEFAULT NULL COMMENT '任务时间-月',
  `deal_day` int(8) NULL DEFAULT NULL COMMENT '任务时间-天',
  `deal_hour` int(10) NULL DEFAULT NULL COMMENT '任务时间-小时',
  `task_args` varchar(2048) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务参数',
  `create_time` decimal(15, 0) NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` decimal(15, 0) NULL DEFAULT NULL COMMENT ' 更新时间',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `主键索引`(`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
