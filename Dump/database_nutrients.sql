-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: database
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `nutrients`
--

DROP TABLE IF EXISTS `nutrients`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nutrients` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `calories` int DEFAULT NULL,
  `fat` int DEFAULT NULL,
  `carbs` int DEFAULT NULL,
  `protein` int DEFAULT NULL,
  `fiber` int DEFAULT NULL,
  `type` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nutrients`
--

LOCK TABLES `nutrients` WRITE;
/*!40000 ALTER TABLE `nutrients` DISABLE KEYS */;
INSERT INTO `nutrients` VALUES (1,'Baked Beans',239,1,54,12,10,1),(2,'Cooked Lentils',323,13,37,16,15,1),(3,'Apple Juice',117,0,29,0,0,5),(4,'Regular Coffee',2,0,0,0,0,5),(5,'Coffee with Milk',6,0,1,0,0,5),(6,'Soda',187,0,48,0,0,5),(7,'Tea',2,0,1,0,0,5),(8,'Bagel',270,2,53,11,2,1),(9,'Biscuits',212,10,27,4,1,1),(10,'Bread',133,2,25,4,1,1),(11,'Instant Oatmeal',213,3,43,6,4,1),(12,'Toast',68,1,12,2,1,1),(13,'Cheese',96,7,2,5,0,3),(14,'Butter',102,12,0,0,0,2),(15,'Milk',146,8,11,8,0,3),(16,'Yogurt',154,4,17,13,0,3),(17,'Hamburger',272,10,34,12,2,1),(18,'Cheese Pizza',237,10,26,11,2,1),(19,'White Tuna Fish',105,5,0,15,0,3),(20,'Fish',280,13,0,39,0,3),(21,'Apple',72,0,19,0,3,4),(22,'Banana',105,0,27,1,3,4),(23,'Cherrie',74,0,19,1,3,4),(24,'Grape',110,0,29,1,1,4),(25,'Orange',85,0,21,2,4,4),(26,'Strawberry',46,0,11,1,3,4),(27,'Watermelon',46,0,11,1,1,4),(28,'Beef (1/4 Cup)',96,7,0,9,0,3),(29,'Brisket',144,11,0,10,0,3),(30,'Chicken',284,6,0,53,0,3),(31,'Beef Salami',59,5,0,3,0,3),(32,'Almonds',164,14,6,6,3,2),(33,'Peanuts',161,14,5,7,2,2),(34,'Spaghetti',221,1,43,8,3,1),(35,'Pilaf',258,7,44,4,1,1),(36,'Caesar Salad',184,15,7,5,2,4),(37,'Chicken Soup',75,2,9,4,1,1),(38,'Tomato Soup',102,3,18,3,1,1),(39,'Lentil Soup',186,5,27,10,12,1),(40,'Brownie',129,5,21,2,1,1),(41,'Chocolate Cake',340,14,51,5,2,1),(42,'Ice Cream',134,7,16,2,1,1),(43,'Artichokes',60,0,13,4,7,4),(44,'Broccoli',31,0,6,3,2,4),(45,'Carrots',30,0,7,1,2,4),(46,'Cabbage',7,0,2,0,1,4);
/*!40000 ALTER TABLE `nutrients` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-23 23:12:52
