-- BORRAR BASE DE DATOS 
drop database if exists DesafioUnidad29_Ejercicio2;

-- CREACION DE LA BASE DE DATOS
create database if not exists DesafioUnidad29_Ejercicio2;

-- USO DE LA BASE DE DATOS 
use DesafioUnidad29_Ejercicio2;

-- CREACION DE LA TABLA USUARIOS
create table if not exists usuarios(
	correo varchar(255) not null primary key,
	clave varchar(100) not null
);


insert into usuarios (correo,clave) values 
('user1@educacionit.com','user1.1234'),
('user2@educacionit.com','user2.1235'),
('user3@educacionit.com','user3.1236');