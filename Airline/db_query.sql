CREATE DATABASE  IF NOT EXISTS `Airline` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `Airline`;
-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: Airline
-- ------------------------------------------------------
-- Server version	5.7.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `CargoAircraft`
--

DROP TABLE IF EXISTS `CargoAircraft`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CargoAircraft` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `passengers` int(10) unsigned zerofill DEFAULT NULL,
  `cargo` int(11) DEFAULT NULL,
  `flyRange` int(11) NOT NULL,
  `fuelConsumption` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `CargoAircraft`
--

LOCK TABLES `CargoAircraft` WRITE;
/*!40000 ALTER TABLE `CargoAircraft` DISABLE KEYS */;
INSERT INTO `CargoAircraft` VALUES (1,'AnJet',0000000000,4100,1220,800),(2,'AN',0000000000,7100,1520,1115),(3,'testJet',0000000000,12300,1000,12511),(4,'testJet',0000000000,12300,1000,12511),(5,'testJet',0000000000,12300,1000,12511),(6,'testJet',0000000000,12300,1000,12511);
/*!40000 ALTER TABLE `CargoAircraft` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PassengerAircraft`
--

DROP TABLE IF EXISTS `PassengerAircraft`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PassengerAircraft` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `passengers` int(11) NOT NULL,
  `cargo` int(11) NOT NULL,
  `flyRange` int(11) NOT NULL,
  `fuelConsumption` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PassengerAircraft`
--

LOCK TABLES `PassengerAircraft` WRITE;
/*!40000 ALTER TABLE `PassengerAircraft` DISABLE KEYS */;
INSERT INTO `PassengerAircraft` VALUES (1,'Aerobus',240,1200,600,530),(2,'Jet',50,700,1200,450);
/*!40000 ALTER TABLE `PassengerAircraft` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'Airline'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-12-08 17:36:23
