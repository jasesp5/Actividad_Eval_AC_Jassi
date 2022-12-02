-- --------------------------------------------------------
-- Host:                         localhost
-- Versión del servidor:         8.0.31 - MySQL Community Server - GPL
-- SO del servidor:              Linux
-- HeidiSQL Versión:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para Telefono_Variaciones
CREATE DATABASE IF NOT EXISTS `Telefono_Variaciones` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `Telefono_Variaciones`;

-- Volcando estructura para tabla Telefono_Variaciones.Telefono
CREATE TABLE IF NOT EXISTS `Telefono` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `fecha_alta` date NOT NULL,
  `fecha_modificacion` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Índice 2` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla Telefono_Variaciones.Telefono: ~4 rows (aproximadamente)
INSERT INTO `Telefono` (`id`, `nombre`, `fecha_alta`, `fecha_modificacion`) VALUES
	(1, 'iphone14', '2022-11-07', '2022-11-27'),
	(2, 's12', '2022-01-01', '2022-11-22'),
	(3, 's10', '2022-11-15', '2022-11-17'),
	(6, 's9', '2022-11-17', NULL);

-- Volcando estructura para tabla Telefono_Variaciones.Variaciones
CREATE TABLE IF NOT EXISTS `Variaciones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `precio` float NOT NULL,
  `stock` int NOT NULL,
  `fecha_alta` date NOT NULL,
  `peso` float NOT NULL,
  `fecha_modificacion` date DEFAULT NULL,
  `telefono_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Índice 3` (`nombre`),
  KEY `FK__Telefono` (`telefono_id`),
  CONSTRAINT `FK__Telefono` FOREIGN KEY (`telefono_id`) REFERENCES `Telefono` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Volcando datos para la tabla Telefono_Variaciones.Variaciones: ~11 rows (aproximadamente)
INSERT INTO `Variaciones` (`id`, `nombre`, `precio`, `stock`, `fecha_alta`, `peso`, `fecha_modificacion`, `telefono_id`) VALUES
	(1, 'iphone14', 32434, 344, '2022-11-15', 234, '2022-11-27', 1),
	(2, 'iphone13  max', 122, 12, '2022-11-17', 123, '2022-11-23', 3),
	(3, 's9 plus', 23, 234, '2022-11-17', 12, '2022-11-17', 6),
	(4, 'iphone11pro', 122, 123, '2022-11-17', 132, NULL, 1),
	(5, 's19', 12, 12, '2022-11-17', 122, NULL, 1),
	(8, 's9 plus 1', 12332, 123, '2022-11-22', 22, NULL, 6),
	(9, 's12', 32, 12, '2022-11-22', 22, NULL, 2),
	(10, 's10 plus', 132, 123, '2022-11-22', 22, NULL, 3),
	(12, 'iphone14 pro max', 123, 123, '2022-11-22', 212, NULL, 1),
	(13, 'iphone12 plus', 12, 12, '2022-11-22', 12, NULL, 1),
	(14, '3fr', 34, 435, '2022-11-23', 22, NULL, 1),
	(15, 's10 14', 12, 1232, '2022-11-27', 1232, NULL, 3);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
