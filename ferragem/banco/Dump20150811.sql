-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ferragem
-- ------------------------------------------------------
-- Server version	5.6.25-enterprise-commercial-advanced-log

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
-- Table structure for table `tblacesso`
--

DROP TABLE IF EXISTS `tblacesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblacesso` (
  `idtblacesso` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`idtblacesso`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblacesso`
--

LOCK TABLES `tblacesso` WRITE;
/*!40000 ALTER TABLE `tblacesso` DISABLE KEYS */;
INSERT INTO `tblacesso` VALUES (1,'Inclusão Usuario'),(2,'Alteração Usuario'),(3,'Exclusão Usuario'),(4,'Consulta Usuario');
/*!40000 ALTER TABLE `tblacesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblcidade`
--

DROP TABLE IF EXISTS `tblcidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblcidade` (
  `idcidade` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  `codMunicipio` varchar(10) DEFAULT NULL,
  `codSiafi` varchar(10) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`idcidade`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcidade`
--

LOCK TABLES `tblcidade` WRITE;
/*!40000 ALTER TABLE `tblcidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblcidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblcontato`
--

DROP TABLE IF EXISTS `tblcontato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblcontato` (
  `idtblcontato` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `setor` varchar(45) DEFAULT NULL,
  `observacao` varchar(45) DEFAULT NULL,
  `idcliente` int(11) NOT NULL,
  PRIMARY KEY (`idtblcontato`,`idcliente`),
  KEY `fk_tblcontato_tblcliente1_idx` (`idcliente`),
  CONSTRAINT `fk_tblcontato_tblcliente1` FOREIGN KEY (`idcliente`) REFERENCES `tblentidade` (`idtblcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcontato`
--

LOCK TABLES `tblcontato` WRITE;
/*!40000 ALTER TABLE `tblcontato` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblcontato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblendereco`
--

DROP TABLE IF EXISTS `tblendereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblendereco` (
  `idtblendentrega` int(11) NOT NULL AUTO_INCREMENT,
  `endereco` varchar(45) NOT NULL,
  `idcidade` int(11) NOT NULL,
  `idtipoendereco` int(11) NOT NULL,
  `idtblcliente` int(11) NOT NULL,
  PRIMARY KEY (`idtblendentrega`,`idcidade`,`idtipoendereco`,`idtblcliente`),
  KEY `fk_tblendereco_tblcidade1_idx` (`idcidade`),
  KEY `fk_tblendereco_tbltipoendereco1_idx` (`idtipoendereco`),
  KEY `fk_tblendereco_tblcliente1_idx` (`idtblcliente`),
  CONSTRAINT `fk_tblendereco_tblcidade1` FOREIGN KEY (`idcidade`) REFERENCES `tblcidade` (`idcidade`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblendereco_tblcliente1` FOREIGN KEY (`idtblcliente`) REFERENCES `tblentidade` (`idtblcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblendereco_tbltipoendereco1` FOREIGN KEY (`idtipoendereco`) REFERENCES `tbltipoendereco` (`idtbltipoendereco`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblendereco`
--

LOCK TABLES `tblendereco` WRITE;
/*!40000 ALTER TABLE `tblendereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblendereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblentidade`
--

DROP TABLE IF EXISTS `tblentidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblentidade` (
  `idtblcliente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `fisicoJuridico` tinyint(1) NOT NULL,
  `cnpj` varchar(19) DEFAULT NULL,
  `incricao` varchar(12) DEFAULT NULL,
  `cpf` varchar(12) DEFAULT NULL,
  `rg` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idtblcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblentidade`
--

LOCK TABLES `tblentidade` WRITE;
/*!40000 ALTER TABLE `tblentidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblentidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblferragem`
--

DROP TABLE IF EXISTS `tblferragem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblferragem` (
  `idferragem` int(11) NOT NULL,
  `qtde` int(11) NOT NULL,
  `estriboaltura` double DEFAULT NULL,
  `estribolargura` double DEFAULT NULL,
  `comprimento` double DEFAULT NULL,
  `estriboespaco` double DEFAULT NULL,
  `idpedido` int(11) NOT NULL,
  PRIMARY KEY (`idferragem`,`idpedido`),
  KEY `fk_tblferragem_tblpedido1_idx` (`idpedido`),
  CONSTRAINT `fk_tblferragem_tblpedido1` FOREIGN KEY (`idpedido`) REFERENCES `tblpedido` (`idpedido`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblferragem`
--

LOCK TABLES `tblferragem` WRITE;
/*!40000 ALTER TABLE `tblferragem` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblferragem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblitemferragem`
--

DROP TABLE IF EXISTS `tblitemferragem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblitemferragem` (
  `iditemferragem` int(11) NOT NULL,
  `diametro` varchar(10) NOT NULL,
  `qtdeferro` double NOT NULL,
  `qtdepecas` double NOT NULL,
  `qtdematerial` double NOT NULL,
  `idferragem` int(11) NOT NULL,
  `idproduto` int(11) NOT NULL,
  PRIMARY KEY (`iditemferragem`,`idferragem`,`idproduto`),
  KEY `fk_tblitemferragem_tblferragem1_idx` (`idferragem`),
  KEY `fk_tblitemferragem_tblproduto1_idx` (`idproduto`),
  CONSTRAINT `fk_tblitemferragem_tblferragem1` FOREIGN KEY (`idferragem`) REFERENCES `tblferragem` (`idferragem`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblitemferragem_tblproduto1` FOREIGN KEY (`idproduto`) REFERENCES `tblproduto` (`idproduto`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblitemferragem`
--

LOCK TABLES `tblitemferragem` WRITE;
/*!40000 ALTER TABLE `tblitemferragem` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblitemferragem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbllog`
--

DROP TABLE IF EXISTS `tbllog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbllog` (
  `idlog` int(11) NOT NULL,
  `data` datetime NOT NULL,
  `hora` datetime NOT NULL,
  `idusuario` int(11) NOT NULL,
  `idtblacesso` int(11) NOT NULL,
  PRIMARY KEY (`idlog`,`idusuario`,`idtblacesso`),
  KEY `fk_tbllog_tblusuario1_idx` (`idusuario`),
  KEY `fk_tbllog_tblacesso1_idx` (`idtblacesso`),
  CONSTRAINT `fk_tbllog_tblacesso1` FOREIGN KEY (`idtblacesso`) REFERENCES `tblacesso` (`idtblacesso`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tbllog_tblusuario1` FOREIGN KEY (`idusuario`) REFERENCES `tblusuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbllog`
--

LOCK TABLES `tbllog` WRITE;
/*!40000 ALTER TABLE `tbllog` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbllog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblnivel`
--

DROP TABLE IF EXISTS `tblnivel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblnivel` (
  `idtblnivelacesso` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(20) NOT NULL,
  PRIMARY KEY (`idtblnivelacesso`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblnivel`
--

LOCK TABLES `tblnivel` WRITE;
/*!40000 ALTER TABLE `tblnivel` DISABLE KEYS */;
INSERT INTO `tblnivel` VALUES (1,'Administrador');
/*!40000 ALTER TABLE `tblnivel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblnivelacesso`
--

DROP TABLE IF EXISTS `tblnivelacesso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblnivelacesso` (
  `idtblacesso` int(11) NOT NULL,
  `idtblnivelacesso` int(11) NOT NULL,
  PRIMARY KEY (`idtblacesso`,`idtblnivelacesso`),
  KEY `fk_tblacesso_has_tblnivelacesso_tblnivelacesso1_idx` (`idtblnivelacesso`),
  KEY `fk_tblacesso_has_tblnivelacesso_tblacesso1_idx` (`idtblacesso`),
  CONSTRAINT `fk_tblacesso_has_tblnivelacesso_tblacesso1` FOREIGN KEY (`idtblacesso`) REFERENCES `tblacesso` (`idtblacesso`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblacesso_has_tblnivelacesso_tblnivelacesso1` FOREIGN KEY (`idtblnivelacesso`) REFERENCES `tblnivel` (`idtblnivelacesso`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblnivelacesso`
--

LOCK TABLES `tblnivelacesso` WRITE;
/*!40000 ALTER TABLE `tblnivelacesso` DISABLE KEYS */;
INSERT INTO `tblnivelacesso` VALUES (1,1);
/*!40000 ALTER TABLE `tblnivelacesso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpedido`
--

DROP TABLE IF EXISTS `tblpedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblpedido` (
  `idpedido` int(11) NOT NULL,
  `data` datetime NOT NULL,
  `dataentrega` datetime NOT NULL,
  `idtblcliente` int(11) NOT NULL,
  `idusuario` int(11) NOT NULL,
  PRIMARY KEY (`idpedido`,`idtblcliente`,`idusuario`),
  KEY `fk_tblpedido_tblcliente1_idx` (`idtblcliente`),
  KEY `fk_tblpedido_tblusuario1_idx` (`idusuario`),
  CONSTRAINT `fk_tblpedido_tblcliente1` FOREIGN KEY (`idtblcliente`) REFERENCES `tblentidade` (`idtblcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblpedido_tblusuario1` FOREIGN KEY (`idusuario`) REFERENCES `tblusuario` (`idusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpedido`
--

LOCK TABLES `tblpedido` WRITE;
/*!40000 ALTER TABLE `tblpedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblproduto`
--

DROP TABLE IF EXISTS `tblproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblproduto` (
  `idproduto` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL,
  `pesoBarra` float NOT NULL,
  PRIMARY KEY (`idproduto`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblproduto`
--

LOCK TABLES `tblproduto` WRITE;
/*!40000 ALTER TABLE `tblproduto` DISABLE KEYS */;
INSERT INTO `tblproduto` VALUES (1,'verg /38',17),(16,'teste',0);
/*!40000 ALTER TABLE `tblproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbltipoendereco`
--

DROP TABLE IF EXISTS `tbltipoendereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tbltipoendereco` (
  `idtbltipoendereco` int(11) NOT NULL,
  `descricao` varchar(20) NOT NULL,
  PRIMARY KEY (`idtbltipoendereco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbltipoendereco`
--

LOCK TABLES `tbltipoendereco` WRITE;
/*!40000 ALTER TABLE `tbltipoendereco` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbltipoendereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblusuario`
--

DROP TABLE IF EXISTS `tblusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblusuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `senha` varchar(12) NOT NULL,
  `idtblnivelacesso` int(11) NOT NULL,
  PRIMARY KEY (`idusuario`,`idtblnivelacesso`),
  KEY `fk_tblusuario_tblnivelacesso1_idx` (`idtblnivelacesso`),
  CONSTRAINT `fk_tblusuario_tblnivelacesso1` FOREIGN KEY (`idtblnivelacesso`) REFERENCES `tblnivel` (`idtblnivelacesso`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblusuario`
--

LOCK TABLES `tblusuario` WRITE;
/*!40000 ALTER TABLE `tblusuario` DISABLE KEYS */;
INSERT INTO `tblusuario` VALUES (1,'admin','admin',1);
/*!40000 ALTER TABLE `tblusuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-08-11 19:16:53
