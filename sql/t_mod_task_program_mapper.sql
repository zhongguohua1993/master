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

 Date: 31/05/2019 18:07:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_mod_task_program_mapper
-- ----------------------------
DROP TABLE IF EXISTS `t_mod_task_program_mapper`;
CREATE TABLE `t_mod_task_program_mapper`  (
  `id` decimal(10, 0) NOT NULL COMMENT 'id',
  `task_setting_id` decimal(10, 0) NULL DEFAULT NULL COMMENT '任务配置id',
  `program_setting_id` decimal(10, 0) NULL DEFAULT NULL COMMENT '程序配置id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
