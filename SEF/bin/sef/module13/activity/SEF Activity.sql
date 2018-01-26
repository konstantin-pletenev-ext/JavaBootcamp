-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51b-community-nt


--
-- Create schema activity
--

CREATE DATABASE IF NOT EXISTS activity;
USE activity;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` varchar(10) NOT NULL,
  `firstname` varchar(10) NOT NULL,
  `lastname` varchar(10) NOT NULL,
  `salary` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`)
);

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`id`,`firstname`,`lastname`,`salary`) VALUES 
 (1,'John','Doe',2500),
 (2,'Jane','Doe',2300),
 (3,'Scott','Feist',4500),
 (4,'James','Donnell',3000),
 (5,'Michael','Dorn',5000);




--
-- Definition of table `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` varchar(10) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `e_mail` varchar(45) NOT NULL,
  `balance` int(10), 	
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` (`id`,`first_name`,`last_name`,`e_mail`,`balance`) VALUES 
 (1,'John','Doe','JOHN.DOE@FASTMAIL.COM',20000.00),
 (2,'Jane','Doe','JANE.DOE@FASTMAIL.COM',30000.80),
 (3,'Mike','Feist','Mike.Feist@FASTMAIL.COM',23000.50),
 (4,'Clark','Kent','Clark.Kent@FASTMAIL.COM',52000.00),
 (5,'Peter','Donnel','Peter.Donnel@FASTMAIL.COM',130000.90);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;

