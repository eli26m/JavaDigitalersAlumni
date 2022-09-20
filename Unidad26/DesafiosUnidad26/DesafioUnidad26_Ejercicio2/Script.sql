-- BORRAR BASE DE DATOS 
drop database if exists DesafioUnidad26_Ejercicio2;

-- CREACION DE LA BASE DE DATOS
create database if not exists DesafioUnidad26_Ejercicio2;

-- USO DE LA BASE DE DATOS 
use DesafioUnidad26_Ejercicio2;

-- CREACION DE LA TABLA LOGS
create table if not exists logs(
	id int auto_increment primary key,
	fecha datetime not null,
	clase varchar(100) not null,
	objeto varchar(100) not null,
	error text not null
);
