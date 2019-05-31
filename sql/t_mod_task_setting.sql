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

 Date: 31/05/2019 18:07:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_mod_task_setting
-- ----------------------------
DROP TABLE IF EXISTS `t_mod_task_setting`;
CREATE TABLE `t_mod_task_setting`  (
  `id` decimal(16, 0) NOT NULL COMMENT 'id',
  `task_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务名称',
  `province_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '省份',
  `city_name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地市',
  `in_dir` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '扫描根目录',
  `out_dir` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '输出根目录',
  `ok_flag` tinyint(2) NULL DEFAULT NULL COMMENT '任务状态：1-开启，2-关闭，3-异常',
  `save_table` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据保存表，可以按周期分表',
  `keep_alive_cycle` tinyint(4) NULL DEFAULT NULL COMMENT '任务存活周期，默认0',
  `priority` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务优先级，同一个后台程序或许有效',
  `vender` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '厂家',
  `group_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务分组',
  `task_args` varchar(2048) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '任务参数',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_mod_task_setting
-- ----------------------------
INSERT INTO `t_mod_task_setting` VALUES (100000000, 'test', 'gd', 'gz', '/', '/', 2, 't_test', 0, '1', NULL, 'test', NULL);

SET FOREIGN_KEY_CHECKS = 1;
