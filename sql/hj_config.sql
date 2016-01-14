/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.99.100
 Source Server Type    : MySQL
 Source Server Version : 50709
 Source Host           : 192.168.99.100
 Source Database       : hj_config

 Target Server Type    : MySQL
 Target Server Version : 50709
 File Encoding         : utf-8

 Date: 01/14/2016 21:09:59 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `demo`
-- ----------------------------
DROP TABLE IF EXISTS `demo`;
CREATE TABLE `demo` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `demo`
-- ----------------------------
BEGIN;
INSERT INTO `demo` VALUES ('1', '哈哈哈');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
