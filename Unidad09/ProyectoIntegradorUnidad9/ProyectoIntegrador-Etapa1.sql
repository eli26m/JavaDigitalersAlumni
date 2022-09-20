-- ETAPA 1
-- 1.1.1
CREATE DATABASE LABORATORIO;
-- 1.1.2
USE LABORATORIO;

-- 1.1.3
CREATE TABLE FACTURAS (
	LETRA CHAR,
	NUMERO INT,
	CLIENTEID INT,
    ARTICULOID INT,
    FECHA DATE,
    MONTO DOUBLE,
    PRIMARY KEY (LETRA, NUMERO)
);

-- 1.1.4
CREATE TABLE ARTICULOS (
	ARTICULOSID INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    PRECIO DOUBLE,
    STOCK INT
);

-- 1.1.5
CREATE TABLE CLIENTES (
	CLIENTEID INT PRIMARY KEY,
	NOMBRE VARCHAR(25),
    APELLIDO VARCHAR(25),
    CUIT CHAR(16),
    DIRECCION VARCHAR(50),
    COMENTARIOS VARCHAR(50)
);

-- 1.1.6
SHOW DATABASES;
-- 1.1.7 / 1.1.8
# SHOW TABLES;
-- 1.1.9
DESC CLIENTES;

-- 1.2.1
ALTER TABLE FACTURAS
CHANGE CLIENTEID IDCLIENTE INT,
CHANGE ARTICULOID IDARTICULO INT,
MODIFY MONTO DOUBLE UNSIGNED;
DESC FACTURAS;

-- 1.2.2
ALTER TABLE ARTICULOS
CHANGE ARTICULOSID IDARTICULO INT,
MODIFY NOMBRE VARCHAR(75),
MODIFY PRECIO DOUBLE UNSIGNED NOT NULL,
MODIFY STOCK INT UNSIGNED NOT NULL;
DESC ARTICULOS;

-- 1.2.3
ALTER TABLE CLIENTES
CHANGE CLIENTEID IDCLIENTE INT,
MODIFY NOMBRE VARCHAR(30) NOT NULL,
MODIFY APELLIDO VARCHAR(35) NOT NULL,
CHANGE COMENTARIOS OBSERVACIONES VARCHAR(255);
DESC CLIENTES;

-- 1.3.1
INSERT INTO FACTURAS
VALUES	('A', 28, 14, 335, '2021-03-18', 1589.50),
		('A', 39, 26, 157, '2021-04-12', 979.75),
        ('B', 8, 17, 95, '2021-04-25', 513.35),
        ('B', 12, 5, 411, '2021-05-03', 2385.70),
        ('B', 19, 50, 157, '2021-05-26', 979.75);
SELECT * FROM FACTURAS;

-- 1.3.2
INSERT INTO ARTICULOS
VALUES	(95, 'Webcam con Micrófono Plug & play', 513.35, 39),
		(157, 'Apple AirPods Pro', 979.75, 152),
        (335, 'Lavasecarropas Automático Samsung', 1589.50, 12),
        (411, 'Gloria Trevi / Gloria / CD+DVD', 2385.70, 2);
SELECT * FROM ARTICULOS;

-- 1.3.3
INSERT INTO CLIENTES
VALUES	(5, 'Santiago', 'González', '23-24582359-9', 'Uriburu 558 - 7°A', 'VIP'),
		(14, 'Gloria', 'Fernández', '23-35965852-5', 'Constitución 323', 'GBA'),
        (17, 'Gonzalo', 'López', '23-33587416-0', 'Arias 2624', 'GBA'),
        (26, 'Carlos', 'García', '23-42321230-9', 'Pasteur 322 - 2°C', 'VIP'),
        (50, 'Micaela', 'Altieri', '23-22885566-5', 'Santamarina 1255', 'GBA');
SELECT * FROM CLIENTES;