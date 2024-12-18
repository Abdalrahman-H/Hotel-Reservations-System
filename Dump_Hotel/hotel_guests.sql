-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: localhost    Database: hotel
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `guests`
--

DROP TABLE IF EXISTS `guests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `guests` (
  `GuestID` varchar(255) NOT NULL,
  `GuestName` varchar(100) DEFAULT NULL,
  `GuestPhone` varchar(20) DEFAULT NULL,
  `GuestEmail` varchar(100) DEFAULT NULL,
  `GuestAddress` varchar(200) DEFAULT NULL,
  `GuestCity` varchar(100) DEFAULT NULL,
  `GuestNationality` varchar(50) DEFAULT NULL,
  `PassportNumber` varchar(50) DEFAULT NULL,
  `GuestType` varchar(50) DEFAULT NULL,
  `RoomNumber` int DEFAULT NULL,
  `CheckInDate` date DEFAULT NULL,
  `CheckOutDate` date DEFAULT NULL,
  `NumberOfDaysOfStayInRoom` int DEFAULT NULL,
  `Fees` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`GuestID`),
  KEY `RoomNumber` (`RoomNumber`),
  CONSTRAINT `guests_ibfk_1` FOREIGN KEY (`RoomNumber`) REFERENCES `roomsinformation` (`RoomNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guests`
--

LOCK TABLES `guests` WRITE;
/*!40000 ALTER TABLE `guests` DISABLE KEYS */;
INSERT INTO `guests` VALUES ('4cee0f3e-25d7-490a-9a3a-7a02b153c2ac','Ali','01012345678','example@gmail.com',' 6th Of October Zone 3 No 251, Cairo','Cairo','Egyptioan','8268048MA','VIP',101,'2024-12-10','2024-12-15',5,1102.50),('81d60b2b-8f76-4712-82f9-7defc95171b6','asdfaasd','dsf','dsaf','asdfadsdf','adsf','adsfa','asdf','VIP',101,'2024-12-05','2024-12-11',6,1323.00);
/*!40000 ALTER TABLE `guests` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-18  8:27:58
