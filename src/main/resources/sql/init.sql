-- ----------(分库分表)--------------
-- 创建ds_0数据库和表
CREATE DATABASE IF NOT EXISTS `ds0`
  DEFAULT CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
USE `ds0`;

CREATE TABLE IF NOT EXISTS `t_order_0` (
  `order_id` BIGINT(20) NOT NULL,
  `user_id`  INT(11)    NOT NULL,
  `status`   VARCHAR(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`order_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_1` (
  `order_id` BIGINT(20) NOT NULL,
  `user_id`  INT(11)    NOT NULL,
  `status`   VARCHAR(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`order_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_item_0` (
  `order_item_id` BIGINT(20) NOT NULL,
  `order_id`      BIGINT(20) NOT NULL,
  `user_id`       INT(11)    NOT NULL,
  PRIMARY KEY (`order_item_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_item_1` (
  `order_item_id` BIGINT(20) NOT NULL,
  `order_id`      BIGINT(20) NOT NULL,
  `user_id`       INT(11)    NOT NULL,
  PRIMARY KEY (`order_item_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

-- 创建ds_1数据库和表
CREATE DATABASE IF NOT EXISTS `ds1`
  DEFAULT CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
USE `ds1`;
CREATE TABLE IF NOT EXISTS `t_order_0` (
  `order_id` BIGINT(20) NOT NULL,
  `user_id`  INT(11)    NOT NULL,
  `status`   VARCHAR(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`order_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_1` (
  `order_id` BIGINT(20) NOT NULL,
  `user_id`  INT(11)    NOT NULL,
  `status`   VARCHAR(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`order_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_item_0` (
  `order_item_id` BIGINT(20) NOT NULL,
  `order_id`      BIGINT(20) NOT NULL,
  `user_id`       INT(11)    NOT NULL,
  PRIMARY KEY (`order_item_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

CREATE TABLE IF NOT EXISTS `t_order_item_1` (
  `order_item_id` BIGINT(20) NOT NULL,
  `order_id`      BIGINT(20) NOT NULL,
  `user_id`       INT(11)    NOT NULL,
  PRIMARY KEY (`order_item_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

-- -----------------数据脱敏-----------------------------
CREATE DATABASE IF NOT EXISTS `encrypt`
  DEFAULT CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;
USE `encrypt`;

CREATE TABLE IF NOT EXISTS `t_customer` (
  `customer_id`     BIGINT(20)  NOT NULL
  COMMENT '客户编号',
  `customer_name`   VARCHAR(20) NOT NULL
  COMMENT '客户姓名',
  `telephone`       VARCHAR(20) NOT NULL
  COMMENT '电话',
  `identity_number` VARCHAR(20) NOT NULL
  COMMENT '身份证号',
  PRIMARY KEY (`customer_id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;