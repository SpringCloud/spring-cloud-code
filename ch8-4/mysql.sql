/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.19 : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `zuul_route` */

DROP TABLE IF EXISTS `zuul_route`;

CREATE TABLE `zuul_route` (
  `id` varchar(50) NOT NULL,
  `path` varchar(255) NOT NULL,
  `service_id` varchar(50) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `strip_prefix` tinyint(1) DEFAULT '1',
  `retryable` tinyint(1) DEFAULT '0',
  `enabled` tinyint(1) NOT NULL DEFAULT '1',
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `zuul_route` */

insert  into `zuul_route`(`id`,`path`,`service_id`,`url`,`strip_prefix`,`retryable`,`enabled`,`description`) values ('erer','/baidu/**',NULL,'http://www.baidu.com',1,0,1,'重定向百度');
insert  into `zuul_route`(`id`,`path`,`service_id`,`url`,`strip_prefix`,`retryable`,`enabled`,`description`) values ('pppp','/client/**',NULL,'http://localhost:7070',1,0,1,'url');
insert  into `zuul_route`(`id`,`path`,`service_id`,`url`,`strip_prefix`,`retryable`,`enabled`,`description`) values ('xxxx','/client-a/**','client-a',NULL,1,0,1,'serviceId');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
