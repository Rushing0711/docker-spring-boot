-- 创建数据库
CREATE DATABASE IF NOT EXISTS dockerdb DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci;
-- 使用数据库
CREATE TABLE `t_user`
(
    `id`          INT(10) UNSIGNED    NOT NULL AUTO_INCREMENT,
    `username`    varchar(50)         NOT NULL DEFAULT '' COMMENT '用户名',
    `password`    varchar(50)         NOT NULL DEFAULT '' COMMENT '密码',
    `sex`         tinyint(4)          NOT NULL DEFAULT '0' COMMENT '性别 0=女 1=男',
    `deleted`     tinyint(4) UNSIGNED NOT NULL DEFAULT '0' COMMENT '删除标志，默认0不删除，1删除',
    `create_time` TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` TIMESTAMP           NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci
  ROW_FORMAT = Dynamic
    COMMENT = '用户表';

# -- 创建数据表
-- 用户表
use dockerdb;
DROP TABLE IF EXISTS `t_user`;
;

select version();