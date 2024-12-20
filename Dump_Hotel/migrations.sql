CREATE DATABASE hotel;

USE hotel;

CREATE TABLE `admin` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Username` char(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `admin` VALUES (1,'potato','potato','potato');

CREATE TABLE `rooms` (
  `RoomNumber` int DEFAULT NULL,
  `RoomType` varchar(50) NOT NULL,
  `RoomCapacity` varchar(50) DEFAULT NULL,
  `Availability` tinyint(1) NOT NULL DEFAULT '1',
  `PricePerNight` decimal(10,2) NOT NULL,
  `Location` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`RoomNumber`)
);

CREATE TABLE `guests` (
  `id` int NOT NULL AUTO_INCREMENT,
  `GuestName` varchar(100) DEFAULT NULL,
  `GuestPhone` varchar(20) DEFAULT NULL,
  `GuestEmail` varchar(100) DEFAULT NULL,
  `GuestAddress` varchar(200) DEFAULT NULL,
  `GuestCity` varchar(100) DEFAULT NULL,
  `GuestNationality` varchar(50) DEFAULT NULL,
  `PassportNumber` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `reservations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `GuestID` int DEFAULT NULL,
  `RoomNumber` int DEFAULT NULL,
  `CheckInDate` date DEFAULT NULL,
  `CheckOutDate` date DEFAULT NULL,
  `ReservationDate` datetime DEFAULT CURRENT_TIMESTAMP,
  `TotalPrice` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `GuestID` (`GuestID`),
  KEY `RoomNumber` (`RoomNumber`),
  CONSTRAINT `reservations_ibfk_1` FOREIGN KEY (`GuestID`) REFERENCES `guests` (`id`),
  CONSTRAINT `reservations_ibfk_2` FOREIGN KEY (`RoomNumber`) REFERENCES `rooms` (`RoomNumber`)
);


CREATE TABLE `payment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ReservationID` int NOT NULL,
  `Amount` decimal(10,2) NOT NULL,
  `PaymentDate` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ReservationID` (`ReservationID`),
  CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`ReservationID`) REFERENCES `reservations` (`id`) ON DELETE CASCADE
);



