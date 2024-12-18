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
-- Table structure for table `reservations`
--

DROP TABLE IF EXISTS `reservations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservations` (
  `ReservationID` varchar(255) NOT NULL,
  `GuestID` varchar(255) DEFAULT NULL,
  `RoomNumber` int DEFAULT NULL,
  `CheckInDate` date DEFAULT NULL,
  `CheckOutDate` date DEFAULT NULL,
  `ReservationDate` date DEFAULT NULL,
  `NumberOfNights` int DEFAULT NULL,
  `TotalPrice` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`ReservationID`),
  KEY `GuestID` (`GuestID`),
  KEY `RoomNumber` (`RoomNumber`),
  CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`GuestID`) REFERENCES `guests` (`GuestID`),
  CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`RoomNumber`) REFERENCES `rooms` (`RoomNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservations`
--

LOCK TABLES `reservations` WRITE;
/*!40000 ALTER TABLE `reservations` DISABLE KEYS */;
INSERT INTO `reservations` VALUES ('defc3547-fa46-433a-837c-f7a818bfc0d1','81d60b2b-8f76-4712-82f9-7defc95171b6',101,'2024-12-05','2024-12-11','2024-12-17',6,1323.00),('f752bc6b-8c0a-4856-8276-9210eb1b519b','4cee0f3e-25d7-490a-9a3a-7a02b153c2ac',101,'2024-12-10','2024-12-15','2024-12-18',5,1102.50);
/*!40000 ALTER TABLE `reservations` ENABLE KEYS */;
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
