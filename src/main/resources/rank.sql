/*
SQLyog v10.2 
MySQL - 5.0.96-community-nt : Database - rankselect
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`rankselect` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Data for the table `share_bean` */

LOCK TABLES `share_bean` WRITE;

insert  into `share_bean`(`id`,`score`,`time`,`title`,`uid`,`info`) values (1,0,NULL,'立项',1,NULL),(2,0,NULL,'关于买房',2,NULL),(3,0,NULL,'历史',3,NULL),(4,0,NULL,'蒸蛋',4,NULL),(5,0,NULL,'忘记了',5,NULL),(6,0,NULL,'tb教学',6,NULL),(7,0,NULL,'直播答题',7,NULL),(8,0,NULL,'马云企业背后',8,NULL),(9,0,NULL,'盒马生鲜',11,NULL),(10,0,NULL,'关于情商',12,NULL),(11,0,NULL,'相信谁',13,NULL);

UNLOCK TABLES;

/*Data for the table `sports_bean` */

LOCK TABLES `sports_bean` WRITE;

UNLOCK TABLES;

/*Data for the table `user_bean` */

LOCK TABLES `user_bean` WRITE;

insert  into `user_bean`(`id`,`flag`,`isout`,`mvp`,`name`,`sex`) values (1,1,'',0,'胡搏超',0),(2,1,'',0,'刘春龙',0),(3,1,'',0,'周盈吉',0),(4,1,'',0,'唐吉',0),(5,1,'',0,'龚强',0),(6,1,'',0,'袁浩文',0),(7,1,'',0,'郭羽仪',0),(8,1,'\0',0,'颜修刚',0),(9,1,'\0',0,'万超',0),(10,1,'\0',0,'邓小涛',0),(11,1,'',0,'魏宁',0),(12,1,'',0,'王鑫磊',0),(13,1,'',0,'蔡双总',0),(14,0,'',0,'戢勇',0),(15,0,'',0,'李兆东',0),(16,1,'',0,'隆蝶',1),(17,1,'',0,'王帅',0),(18,1,'',0,'杨梅',1);

UNLOCK TABLES;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
