-- BORRAR BASE DE DATOS 
drop database if exists DesafioUnidad26_Ejercicio1;

-- CREACION DE LA BASE DE DATOS
create database if not exists DesafioUnidad26_Ejercicio1;

-- USO DE LA BASE DE DATOS 
use DesafioUnidad26_Ejercicio1;

-- CREACION DE LA TABLA PAISES
create table if not exists paises(
	id int auto_increment primary key,
	descripcion varchar(100) not null
);

-- CREACION DE LA TABLA CIUDADES
create table if not exists ciudades(
	id int auto_increment primary key,
	id_pais int not null,
	descripcion varchar(100) not null,
	categoria varchar(100),
	foreign key (id_pais) references paises (id)
);



-- DATOS 

insert into desafioUnidad26_Ejercicio1.paises
(descripcion)
values ('Argentina');


insert into desafioUnidad26_Ejercicio1.ciudades
(id_pais, descripcion, categoria)
values 
(1,'Buenos Aires','Provincia'),
(1,'Catamarca','Provincia'),
(1,'Chaco','Provincia'),
(1,'Chubut','Provincia'),
(1,'Ciudad Autónoma de Buenos Aires','Ciudad Autónoma'),
(1,'Córdoba','Provincia'),
(1,'Corrientes','Provincia'),
(1,'Entre Ríos','Provincia'),
(1,'Formosa','Provincia'),
(1,'Jujuy','Provincia'),
(1,'La Pampa','Provincia'),
(1,'La Rioja','Provincia'),
(1,'Mendoza','Provincia'),
(1,'Misiones','Provincia'),
(1,'Neuquén','Provincia'),
(1,'Rio Negro','Provincia'),
(1,'Salta','Provincia'),
(1,'San Juan','Provincia'),
(1,'San Luis','Provincia'),
(1,'Santa Cruz','Provincia'),
(1,'Santa Fe','Provincia'),
(1,'Santiago del Estero','Provincia'),
(1,'Tierra del Fuego','Provincia'),
(1,'Tucumán','Provincia');


