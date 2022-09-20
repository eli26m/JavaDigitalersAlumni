-- BORRAR BASE DE DATOS 
-- drop database if exists DesafioUnidad27_Ejercicio1;

-- CREACION DE LA BASE DE DATOS
create database if not exists DesafioUnidad27_Ejercicio1;

-- USO DE LA BASE DE DATOS 
use DesafioUnidad27_Ejercicio1;

-- CREACION DE LA TABLA PERMISOS
create table if not exists permisos(
	usuario varchar(100) not null,
	modulo char(10) not null,
	activo boolean not null default 0,	
	primary key (usuario, modulo)
);

-- DATOS
insert into desafioUnidad27_Ejercicio1.permisos
(usuario, modulo)
values 
('usuario_prueba@educacionit.com','MODULO_01'),
('usuario_prueba@educacionit.com','MODULO_02'),
('usuario_prueba@educacionit.com','MODULO_03'),
('usuario_prueba@educacionit.com','MODULO_04'),
('usuario_prueba@educacionit.com','MODULO_05'),
('usuario_prueba@educacionit.com','MODULO_06'),
('usuario_prueba@educacionit.com','MODULO_07'),
('usuario_prueba@educacionit.com','MODULO_08'),
('usuario_prueba@educacionit.com','MODULO_09'),
('usuario_prueba@educacionit.com','MODULO_10'),
('usuario_prueba@educacionit.com','MODULO_11'),
('usuario_prueba@educacionit.com','MODULO_12'),
('usuario_prueba@educacionit.com','MODULO_13'),
('usuario_prueba@educacionit.com','MODULO_14'),
('usuario_prueba@educacionit.com','MODULO_15'),
('usuario_prueba@educacionit.com','MODULO_16'),
('usuario_prueba@educacionit.com','MODULO_17'),
('usuario_prueba@educacionit.com','MODULO_18'),
('usuario_prueba@educacionit.com','MODULO_19'),
('usuario_prueba@educacionit.com','MODULO_20');
