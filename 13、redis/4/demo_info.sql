/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : ehcache

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-12-04 13:53:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demo_info
-- ----------------------------
DROP TABLE IF EXISTS `demo_info`;
CREATE TABLE `demo_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `state` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of demo_info
-- ----------------------------
INSERT INTO `demo_info` VALUES ('18', '张三', '123456', '0');
INSERT INTO `demo_info` VALUES ('16', '张三', '123456', '0');
INSERT INTO `demo_info` VALUES ('17', '张三', '123456', '0');
