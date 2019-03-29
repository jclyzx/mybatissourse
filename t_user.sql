/*
Navicat MySQL Data Transfer

Source Server         : 47.106.121.142
Source Server Version : 50633
Source Host           : 47.106.121.142:3306
Source Database       : mange

Target Server Type    : MYSQL
Target Server Version : 50633
File Encoding         : 65001

Date: 2019-03-29 14:55:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(5) NOT NULL DEFAULT '0',
  `username` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('0', 'ywl', 'ywl');
