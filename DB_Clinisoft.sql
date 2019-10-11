-- MariaDB dump 10.17  Distrib 10.4.6-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: bd_clinisoft
-- ------------------------------------------------------
-- Server version	10.4.6-MariaDB

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `idAdmin` int(11) NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Apellidos` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Contraseña` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Telefono` varchar(12) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idAdmin`)
) ENGINE=InnoDB AUTO_INCREMENT=1140866161 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1140866159,'Maxi','Jimenez','1234','3503458798');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalles_receta`
--

DROP TABLE IF EXISTS `detalles_receta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalles_receta` (
  `idDetalles_Recetas` int(11) NOT NULL AUTO_INCREMENT,
  `Recetas_idRecetas` int(11) NOT NULL,
  `medicamentos_idmedicamentos` int(11) NOT NULL,
  `Observaciones` text COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idDetalles_Recetas`),
  KEY `Recetas_idRecetas` (`Recetas_idRecetas`),
  KEY `medicamentos_idmedicamentos` (`medicamentos_idmedicamentos`),
  CONSTRAINT `detalles_receta_ibfk_1` FOREIGN KEY (`Recetas_idRecetas`) REFERENCES `recetas` (`idRecetas`),
  CONSTRAINT `detalles_receta_ibfk_2` FOREIGN KEY (`medicamentos_idmedicamentos`) REFERENCES `medicamentos` (`idmedicamentos`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_receta`
--

LOCK TABLES `detalles_receta` WRITE;
/*!40000 ALTER TABLE `detalles_receta` DISABLE KEYS */;
INSERT INTO `detalles_receta` VALUES (1,1,1,'TOMAR CADA 8 HORAS');
/*!40000 ALTER TABLE `detalles_receta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `historias_clinicas`
--

DROP TABLE IF EXISTS `historias_clinicas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `historias_clinicas` (
  `idHistorias_Clinicas` int(11) NOT NULL AUTO_INCREMENT,
  `Pacientes_Cedula` int(11) NOT NULL,
  `Medicos_idMedico` int(11) NOT NULL,
  `Fecha_Creación` timestamp(6) NOT NULL DEFAULT current_timestamp(6),
  `Fecha de Actualización` timestamp(6) NOT NULL DEFAULT current_timestamp(6) ON UPDATE current_timestamp(6),
  `Observacion` text COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idHistorias_Clinicas`),
  KEY `Medicos_idMedico` (`Medicos_idMedico`),
  KEY `Pacientes_Cedula` (`Pacientes_Cedula`),
  CONSTRAINT `historias_clinicas_ibfk_1` FOREIGN KEY (`Medicos_idMedico`) REFERENCES `medicos` (`idMedico`),
  CONSTRAINT `historias_clinicas_ibfk_2` FOREIGN KEY (`Pacientes_Cedula`) REFERENCES `pacientes` (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `historias_clinicas`
--

LOCK TABLES `historias_clinicas` WRITE;
/*!40000 ALTER TABLE `historias_clinicas` DISABLE KEYS */;
/*!40000 ALTER TABLE `historias_clinicas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horarios`
--

DROP TABLE IF EXISTS `horarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horarios` (
  `Fecha` date NOT NULL,
  `Hora` time NOT NULL,
  `medicamentos_idmedicamentos` int(11) NOT NULL,
  `Recetas_idRecetas` int(11) NOT NULL,
  `idHorario` int(11) NOT NULL AUTO_INCREMENT,
  `pacientes_cedula` int(11) NOT NULL,
  PRIMARY KEY (`idHorario`),
  KEY `Recetas_idRecetas` (`Recetas_idRecetas`),
  KEY `medicamentos_idmedicamentos` (`medicamentos_idmedicamentos`),
  KEY `pacientes_cedula` (`pacientes_cedula`),
  CONSTRAINT `horarios_ibfk_1` FOREIGN KEY (`Recetas_idRecetas`) REFERENCES `recetas` (`idRecetas`),
  CONSTRAINT `horarios_ibfk_2` FOREIGN KEY (`medicamentos_idmedicamentos`) REFERENCES `medicamentos` (`idmedicamentos`),
  CONSTRAINT `horarios_ibfk_3` FOREIGN KEY (`pacientes_cedula`) REFERENCES `pacientes` (`Cedula`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horarios`
--

LOCK TABLES `horarios` WRITE;
/*!40000 ALTER TABLE `horarios` DISABLE KEYS */;
INSERT INTO `horarios` VALUES ('2019-01-01','08:00:00',1,1,1,1);
/*!40000 ALTER TABLE `horarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamentos`
--

DROP TABLE IF EXISTS `medicamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicamentos` (
  `idmedicamentos` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `laboratorio` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idmedicamentos`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamentos`
--

LOCK TABLES `medicamentos` WRITE;
/*!40000 ALTER TABLE `medicamentos` DISABLE KEYS */;
INSERT INTO `medicamentos` VALUES (1,'Acetaminofen','Procaps'),(2,'Dolex','Glaxosmithkline Colombia'),(3,'Aspirina','Bayer'),(4,'Cebion','mk'),(5,'Naproxeno','Universal');
/*!40000 ALTER TABLE `medicamentos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicos`
--

DROP TABLE IF EXISTS `medicos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `medicos` (
  `idMedico` int(11) NOT NULL AUTO_INCREMENT,
  `Cedula` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Nombres` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Apellidos` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Contraseña` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Telefono` varchar(12) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idMedico`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicos`
--

LOCK TABLES `medicos` WRITE;
/*!40000 ALTER TABLE `medicos` DISABLE KEYS */;
INSERT INTO `medicos` VALUES (1,'1140866159','Max Jake','Jimenez Perozo','maximus','3503458798'),(2,'2154851','Josela','Tobon','1234','36587855'),(3,'15150516','Diego','Maestre','124','55444'),(4,'1140866159','Max Jake','Jimenez Perozo','maximus','3503458798');
/*!40000 ALTER TABLE `medicos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pacientes`
--

DROP TABLE IF EXISTS `pacientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pacientes` (
  `Cedula` int(11) NOT NULL,
  `Nombres` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Apellidos` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Contraseña` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Estado` varchar(45) COLLATE utf8_spanish_ci NOT NULL DEFAULT 'Sano',
  `Enfermedad` varchar(45) COLLATE utf8_spanish_ci DEFAULT 'Ninguna',
  PRIMARY KEY (`Cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pacientes`
--

LOCK TABLES `pacientes` WRITE;
/*!40000 ALTER TABLE `pacientes` DISABLE KEYS */;
INSERT INTO `pacientes` VALUES (1,'Jesus','Herrera','menchu','2001-01-05','Sano','Ninguna'),(2,'Richard','Vidal','123456789','2000-01-01','Sano','Ninguna'),(3,'Arturo','Vidal','123456789','2000-01-01','Sano','Ninguna'),(4,'Pepe','Ramos','123456789','2000-01-01','Sano','Ninguna'),(5,'Jose','Herrera','menchu','2001-01-05','Sano','Ninguna'),(10651644,'Jesus','Herrera','menchu','2001-01-05','Sano','Ninguna'),(1140866159,'Max Jake','Jimenez Perozo','SENA2019','1993-12-21','Sano','Ninguna');
/*!40000 ALTER TABLE `pacientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recetas`
--

DROP TABLE IF EXISTS `recetas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `recetas` (
  `idRecetas` int(11) NOT NULL AUTO_INCREMENT,
  `Pacientes_Cedula` int(11) NOT NULL,
  `Medicos_idMedico` int(11) NOT NULL,
  `Fecha_Inicio` date NOT NULL,
  `Fecha_Fin` date NOT NULL,
  PRIMARY KEY (`idRecetas`),
  KEY `Pacientes_Cedula` (`Pacientes_Cedula`),
  KEY `Medicos_idMedico` (`Medicos_idMedico`),
  CONSTRAINT `recetas_ibfk_1` FOREIGN KEY (`Pacientes_Cedula`) REFERENCES `pacientes` (`Cedula`),
  CONSTRAINT `recetas_ibfk_2` FOREIGN KEY (`Medicos_idMedico`) REFERENCES `medicos` (`idMedico`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recetas`
--

LOCK TABLES `recetas` WRITE;
/*!40000 ALTER TABLE `recetas` DISABLE KEYS */;
INSERT INTO `recetas` VALUES (1,1,1,'2019-01-01','2019-08-01');
/*!40000 ALTER TABLE `recetas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-10 20:21:03
