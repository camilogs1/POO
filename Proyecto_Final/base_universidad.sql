-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-11-2021 a las 13:09:24
-- Versión del servidor: 10.4.20-MariaDB
-- Versión de PHP: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `base_universidad`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `ID` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `carrera` varchar(25) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefono` int(11) NOT NULL,
  `activo` varchar(2) DEFAULT 'si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`ID`, `nombre`, `carrera`, `email`, `telefono`, `activo`) VALUES
(1001, 'camiloG', 'ingenieria', 'camilo@amigo.edu.co', 301485, 'si'),
(1002, 'sofia', 'criminologia', 'sofia@amigo.com', 27750, 'si'),
(1006, 'LitosG', 'Fisica', 'litos@amigo.edu.co', 311424, 'no'),
(1008, 'Valentina', 'Psicologia', 'valentina@amigo.edu.co', 65467, 'si');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `ID_materia` int(11) NOT NULL,
  `nombre_materia` varchar(25) NOT NULL,
  `salon` varchar(3) NOT NULL,
  `ID_profesor` int(11) NOT NULL,
  `ID_estudiante` int(11) NOT NULL,
  `activo` varchar(2) DEFAULT 'si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`ID_materia`, `nombre_materia`, `salon`, `ID_profesor`, `ID_estudiante`, `activo`) VALUES
(2301, 'IngenieriaSoftware', '102', 4507, 1006, 'no'),
(2302, 'Python', '305', 4507, 1008, 'si'),
(2311, 'Linux', '402', 4508, 1002, 'si'),
(2345, 'poo', '301', 4509, 1001, 'si'),
(2346, 'bases', '404', 4508, 1002, 'si'),
(2399, 'sistemas', '345', 4508, 1001, 'si');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `ID` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `telefono` int(11) NOT NULL,
  `activo` varchar(2) DEFAULT 'si'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`ID`, `nombre`, `email`, `telefono`, `activo`) VALUES
(4507, 'FreddyM', 'freddym@amigo.edu.co', 6243060, 'no'),
(4508, 'wilsonH', 'wilson@amigo.edu.co', 44850, 'si'),
(4509, 'walter', 'walter@amigo.com', 315678, 'si');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`ID_materia`),
  ADD KEY `ID_profesor` (`ID_profesor`),
  ADD KEY `ID_estudiante` (`ID_estudiante`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`ID`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `materia_ibfk_1` FOREIGN KEY (`ID_profesor`) REFERENCES `profesor` (`ID`),
  ADD CONSTRAINT `materia_ibfk_2` FOREIGN KEY (`ID_estudiante`) REFERENCES `estudiante` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
