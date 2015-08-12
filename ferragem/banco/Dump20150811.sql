-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ferragem
-- ------------------------------------------------------
-- Server version	5.6.25-enterprise-commercial-advanced-log

create database ferragem;

--
-- Table structure for table `tblacesso`
--

DROP TABLE IF EXISTS `tblacesso`;

CREATE TABLE `tblacesso` (
  `idtblacesso` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`idtblacesso`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `tblacesso`
--

LOCK TABLES `tblacesso` WRITE;
INSERT INTO `tblacesso` VALUES (1,'Inclusão Usuario'),(2,'Alteração Usuario'),(3,'Exclusão Usuario'),(4,'Consulta Usuario');
UNLOCK TABLES;

--
-- Table structure for table `tblcidade`
--

DROP TABLE IF EXISTS `tblcidade`;
CREATE TABLE `tblcidade` (
  `idcidade` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(40) NOT NULL,
  `codMunicipio` varchar(10) DEFAULT NULL,
  `codSiafi` varchar(10) DEFAULT NULL,
  `estado` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`idcidade`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Dumping data for table `tblcidade`
--

LOCK TABLES `tblcidade` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tblcontato`
--

DROP TABLE IF EXISTS `tblcontato`;
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


--
-- Dumping data for table `tblcontato`
--

LOCK TABLES `tblcontato` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tblendereco`
--

DROP TABLE IF EXISTS `tblendereco`;
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


--
-- Dumping data for table `tblendereco`
--

LOCK TABLES `tblendereco` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tblentidade`
--

DROP TABLE IF EXISTS `tblentidade`;
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


--
-- Dumping data for table `tblentidade`
--

LOCK TABLES `tblentidade` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tblferragem`
--

DROP TABLE IF EXISTS `tblferragem`;
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


--
-- Dumping data for table `tblferragem`
--

LOCK TABLES `tblferragem` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tblitemferragem`
--

DROP TABLE IF EXISTS `tblitemferragem`;
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


--
-- Dumping data for table `tblitemferragem`
--

LOCK TABLES `tblitemferragem` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tbllog`
--

DROP TABLE IF EXISTS `tbllog`;
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


--
-- Dumping data for table `tbllog`
--

LOCK TABLES `tbllog` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tblnivel`
--

DROP TABLE IF EXISTS `tblnivel`;
CREATE TABLE `tblnivel` (
  `idtblnivelacesso` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(20) NOT NULL,
  PRIMARY KEY (`idtblnivelacesso`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `tblnivel`
--

LOCK TABLES `tblnivel` WRITE;
	INSERT INTO `tblnivel` VALUES (1,'Administrador');
UNLOCK TABLES;

--
-- Table structure for table `tblnivelacesso`
--

DROP TABLE IF EXISTS `tblnivelacesso`;
CREATE TABLE `tblnivelacesso` (
  `idtblacesso` int(11) NOT NULL,
  `idtblnivelacesso` int(11) NOT NULL,
  PRIMARY KEY (`idtblacesso`,`idtblnivelacesso`),
  KEY `fk_tblacesso_has_tblnivelacesso_tblnivelacesso1_idx` (`idtblnivelacesso`),
  KEY `fk_tblacesso_has_tblnivelacesso_tblacesso1_idx` (`idtblacesso`),
  CONSTRAINT `fk_tblacesso_has_tblnivelacesso_tblacesso1` FOREIGN KEY (`idtblacesso`) REFERENCES `tblacesso` (`idtblacesso`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tblacesso_has_tblnivelacesso_tblnivelacesso1` FOREIGN KEY (`idtblnivelacesso`) REFERENCES `tblnivel` (`idtblnivelacesso`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Dumping data for table `tblnivelacesso`
--

LOCK TABLES `tblnivelacesso` WRITE;
	INSERT INTO `tblnivelacesso` VALUES (1,1);
UNLOCK TABLES;

--
-- Table structure for table `tblpedido`
--

DROP TABLE IF EXISTS `tblpedido`;
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


--
-- Dumping data for table `tblpedido`
--

LOCK TABLES `tblpedido` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tblproduto`
--

DROP TABLE IF EXISTS `tblproduto`;
CREATE TABLE `tblproduto` (
  `idproduto` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL,
  `pesoBarra` float NOT NULL,
  PRIMARY KEY (`idproduto`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `tblproduto`
--

LOCK TABLES `tblproduto` WRITE;
	INSERT INTO `tblproduto` VALUES (1,'verg /38',17),(16,'teste',0);
UNLOCK TABLES;

--
-- Table structure for table `tbltipoendereco`
--

DROP TABLE IF EXISTS `tbltipoendereco`;
CREATE TABLE `tbltipoendereco` (
  `idtbltipoendereco` int(11) NOT NULL,
  `descricao` varchar(20) NOT NULL,
  PRIMARY KEY (`idtbltipoendereco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Dumping data for table `tbltipoendereco`
--

LOCK TABLES `tbltipoendereco` WRITE;

UNLOCK TABLES;

--
-- Table structure for table `tblusuario`
--

DROP TABLE IF EXISTS `tblusuario`;
CREATE TABLE `tblusuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `senha` varchar(12) NOT NULL,
  `idtblnivelacesso` int(11) NOT NULL,
  PRIMARY KEY (`idusuario`,`idtblnivelacesso`),
  KEY `fk_tblusuario_tblnivelacesso1_idx` (`idtblnivelacesso`),
  CONSTRAINT `fk_tblusuario_tblnivelacesso1` FOREIGN KEY (`idtblnivelacesso`) REFERENCES `tblnivel` (`idtblnivelacesso`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;


--
-- Dumping data for table `tblusuario`
--

LOCK TABLES `tblusuario` WRITE;
	INSERT INTO `tblusuario` VALUES (1,'admin','admin',1);
UNLOCK TABLES;

-- Dump completed on 2015-08-11 19:16:53
