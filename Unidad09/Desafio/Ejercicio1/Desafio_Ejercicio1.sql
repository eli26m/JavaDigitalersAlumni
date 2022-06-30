CREATE DATABASE BONUS_TRACK;
USE BONUS_TRACK;

/*
CREATE TABLE AGENDA (
	IDCONTACTO INT UNSIGNED PRIMARY KEY,
    NOMBRE VARCHAR(20) NOT NULL,
    APELLIDO VARCHAR(15) NOT NULL,
    DOMICILIO VARCHAR(50),
    TELEFONO INT NOT NULL
);
*/

SHOW TABLES;
DESC AGENDA;

ALTER TABLE AGENDA
ADD MAIL VARCHAR(50) NOT NULL;

INSERT INTO AGENDA
VALUES	(2, 'Maria', 'Aguirre', 'Mendoza 1345', 4425896, 'maraguirre@gmail.com'),
		(10, 'Juan', 'Díaz', 'San Juan 456', 4489615, 'diaz_juan@gmail.com'),
        (7, 'Carla', 'Sánchez', 'Avenida Armenia 3421', 4412694, 'carlaasanchez90@gmail.com'),
        (13, 'Juliana', 'Romero', 'Buenos Aires 1022', 4475614, 'juliana_27@gmail.com');
SELECT * FROM AGENDA;