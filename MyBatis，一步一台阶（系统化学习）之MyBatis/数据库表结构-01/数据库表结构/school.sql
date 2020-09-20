/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.26-log : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis`;

/*Table structure for table `mybatis_class_tbl` */

DROP TABLE IF EXISTS `mybatis_class_tbl`;

CREATE TABLE `mybatis_class_tbl` (
  `class_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(50) DEFAULT NULL,
  `teacher_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `mybatis_class_tbl` */

insert  into `mybatis_class_tbl`(`class_id`,`class_name`,`teacher_id`) values (1,'取经班',1),(2,'相声班',2);

/*Table structure for table `mybatis_student_tbl` */

DROP TABLE IF EXISTS `mybatis_student_tbl`;

CREATE TABLE `mybatis_student_tbl` (
  `student_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `student_name` varchar(50) DEFAULT NULL,
  `student_sex` tinyint(4) DEFAULT NULL,
  `birthday` varchar(50) DEFAULT NULL,
  `height` double DEFAULT NULL,
  `weight` double DEFAULT NULL,
  `class_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `mybatis_student_tbl` */

insert  into `mybatis_student_tbl`(`student_id`,`student_name`,`student_sex`,`birthday`,`height`,`weight`,`class_id`) values (1,'孙悟空',1,'2020-02-25',160,110,1),(2,'猪八戒',1,'2020-02-24',200,4000,1),(3,'沙僧',1,'2020-02-25',220,300,1),(4,'岳云鹏',1,'1985-02-26',180,140,2),(5,'张云雷',1,'1992-01-11',180,140,2),(7,'李四',1,'1991-02-28',178,140,1);

/*Table structure for table `mybatis_teacher_tbl` */

DROP TABLE IF EXISTS `mybatis_teacher_tbl`;

CREATE TABLE `mybatis_teacher_tbl` (
  `teacher_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `teacher_name` varchar(50) DEFAULT NULL,
  `teacher_sex` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`teacher_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `mybatis_teacher_tbl` */

insert  into `mybatis_teacher_tbl`(`teacher_id`,`teacher_name`,`teacher_sex`) values (1,'唐僧',1),(2,'郭德纲',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
