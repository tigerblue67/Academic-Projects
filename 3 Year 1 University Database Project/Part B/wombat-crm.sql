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
-- Table structure for table `wcrm_Company`
--

DROP TABLE IF EXISTS `wcrm_Company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wcrm_Company` (
  `CompanyID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `CompanyName` varchar(255) NOT NULL,
  `Country` varchar(32) NOT NULL,
  `PersonName` varchar(255) NOT NULL,
  `Phone` varchar(128) NOT NULL,
  `Email` varchar(255) NOT NULL,
  PRIMARY KEY (`CompanyID`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wcrm_Company`
--

LOCK TABLES `wcrm_Company` WRITE;
/*!40000 ALTER TABLE `wcrm_Company` DISABLE KEYS */;
INSERT INTO `wcrm_Company` (`CompanyID`, `CompanyName`, `Country`, `PersonName`, `Phone`, `Email`) VALUES
(1, 'Dave''s Database Corporation', 'UK', 'Dave Cutting', '012345678900', 'dave@davesdodgydatabases.com'),
(2, 'Apple Pie Inc', 'USA', 'Annie Apples', '+1-123-555-0100', 'yum@applepieinc.com'),
(3, 'Simplified Silicon Limited', 'UK', 'Dave Davidson', '022145278900', 'dave@simplifiedsilicon.com'),
(4, 'Closets Closets Closets Closets', 'USA', 'Kathleen Klosetfan', '+1-455-555-9122', 'wardrobe@closets.com'),
(5, 'MOHSS', 'NAM', 'Alfred Tjiveze', '+264814329410', 'kunene@mohss.gov.na'),
(6, 'Queen''s Rocketry Club', 'UK', 'Rocket Bob', '02890974998', 'rockets@qub.ac.uk'),
(7, 'Tigers4u', 'LUX', 'Seigfried Sassoon', '+99487623435', 'roar@tigers.com');
/*!40000 ALTER TABLE `wcrm_Company` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Table structure for table `wcrm_Contact`
--

DROP TABLE IF EXISTS `wcrm_Contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wcrm_Contact` (
  `ContactID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `CompanyID` bigint(20) unsigned NOT NULL,
  `Occurred` datetime NOT NULL,
  `Notes` text NOT NULL,
  `ActionNeeded` tinyint(1) NOT NULL DEFAULT '0',
  `Visible` tinyint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ContactID`),
  FOREIGN KEY (`CompanyID`) REFERENCES `wcrm_Company`(`CompanyID`) ON DELETE CASCADE 
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wcrm_Contact`
--

LOCK TABLES `wcrm_Contact` WRITE;
/*!40000 ALTER TABLE `wcrm_Contact` DISABLE KEYS */;
INSERT INTO `wcrm_Contact` (`ContactID`, `CompanyID`, `Occurred`, `Notes`, `ActionNeeded`, `Visible`) VALUES
(1, 1, '2018-02-01 12:30:00', 'Asked about amazing offers - said nothing going at the moment, maybe make contact again in a month. Marked to follow up.', 1, 1),
(2, 2, '2017-09-11 14:32:00', 'No answer', 0, 1),
(3, 2, '2015-11-12 16:23:11', 'Spoke about urgent need for widgets of the red variety', 1, 1),
(4, 3, '2006-03-14 11:17:54', 'Widgets are red, widgets are blue, I bought a widget, now you can too - sales pitch not working', 0, 1),
(5, 3, '2007-04-07 09:38:00', 'Spoke about a super-secret project that must be kept confidential: operation false volcano', 1, 0),
(6, 5, '2008-08-08 10:17:00', 'No widgets needed at the moment', 0, 1),
(7, 7, '2010-11-03 13:22:00', 'Couldn''t talk as a tiger had escaped - follow up', 1, 1),
(8, 7, '2010-11-03 12:19:00', 'It seems the tigers have now taken over most of the building. We don''t do anti-tiger widgets so left them to it.', 0, 1);
/*!40000 ALTER TABLE `wcrm_Contact` ENABLE KEYS */;
UNLOCK TABLES;


/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
