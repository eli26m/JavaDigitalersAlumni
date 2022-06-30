CREATE DATABASE LIBRERIA;
USE LIBRERIA;

CREATE TABLE autores (
	autor_id VARCHAR(11),
    apellido VARCHAR(40),
    nombre VARCHAR(20),
    telefono VARCHAR(12),
    direccion VARCHAR(40),
    ciudad VARCHAR(20),
    provincia CHAR(2),
    c_postal CHAR(5),
    estado TINYINT(1)
);

CREATE TABLE ventas (
	local_id CHAR(4),
    factura_nro VARCHAR(20),
    fecha DATETIME,
    cantidad SMALLINT,
    forma_pago VARCHAR(12),
    libro_id VARCHAR(6)
);

CREATE TABLE locales (
	local_id CHAR(4),
    nombre VARCHAR(40),
    direccion VARCHAR(40),
    ciudad VARCHAR(20),
    provincia CHAR(2),
    c_postal CHAR(5)
);

CREATE TABLE editoriales (
	editorial_id CHAR(4),
    nombre VARCHAR(40),
    ciudad VARCHAR(20),
    provincia CHAR(2),
    pais VARCHAR(30)
);

CREATE TABLE libros (
	libro_id VARCHAR(6),
    titulo VARCHAR(80),
    categoria CHAR(12),
    editorial_id CHAR(4),
    precio DOUBLE,
    comentarios VARCHAR(200),
    fecha_publicacion DATETIME
);

CREATE TABLE libroautor (
	autor_id VARCHAR(11),
    libro_id VARCHAR(6)
);

CREATE TABLE empleados (
	empleado_id CHAR(9),
    nombre VARCHAR(20),
    apellido VARCHAR(30),
    puesto_id SMALLINT,
    editorial_id CHAR(4),
    fecha_ingreso DATETIME
);

CREATE TABLE puestos (
	puesto_id SMALLINT,
    descripcion VARCHAR(50)
);

ALTER TABLE autores ADD PRIMARY KEY(autor_id);
ALTER TABLE editoriales ADD PRIMARY KEY(editorial_id);
ALTER TABLE empleados ADD PRIMARY KEY(empleado_id);
ALTER TABLE libroautor ADD PRIMARY KEY(autor_id, libro_id);
ALTER TABLE libros ADD PRIMARY KEY(libro_id);
ALTER TABLE locales ADD PRIMARY KEY(local_id);
ALTER TABLE puestos ADD PRIMARY KEY(puesto_id);
ALTER TABLE ventas ADD PRIMARY KEY(local_id, factura_nro, libro_id);