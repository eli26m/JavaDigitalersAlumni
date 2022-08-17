USE LABORATORIO;
SET SQL_SAFE_UPDATES = 0;

-- 1
UPDATE CLIENTES_NEPTUNO
SET PAIS = 'USA' WHERE PAIS = 'ESTADOS UNIDOS';
-- 2
UPDATE CLIENTES_NEPTUNO
SET NOMBRECOMPANIA = UPPER(NOMBRECOMPANIA);
-- 3
UPDATE CLIENTES_NEPTUNO
SET CIUDAD = UPPER(CIUDAD), PAIS = UPPER(PAIS);
SELECT * FROM CLIENTES_NEPTUNO;

-- 4
ALTER TABLE EMPLEADOS ADD NOMBRE_EMPLEADO VARCHAR(30) AFTER IDEMPLEADO;
UPDATE EMPLEADOS
SET NOMBRE_EMPLEADO = CONCAT(APELLIDOS, ', ', NOMBRE);
ALTER TABLE EMPLEADOS DROP APELLIDOS, DROP NOMBRE;
SELECT * FROM EMPLEADOS;

-- 5
ALTER TABLE CLIENTES ADD TIPO VARCHAR(3);
UPDATE CLIENTES SET TIPO = 'VIP' WHERE CIUDAD = 'MADRID';
-- 6
ALTER TABLE CLIENTES MODIFY TELEFONO VARCHAR(20);
UPDATE CLIENTES
SET TELEFONO = CONCAT('+34-', TELEFONO) WHERE TELEFONO IS NOT NULL;
SELECT * FROM CLIENTES;

-- 7
ALTER TABLE PRODUCTOS ADD FECHA DATE;
UPDATE PRODUCTOS
SET FECHA = CONCAT_WS(ANO, '-', MES, '-', DIA);
ALTER TABLE PRODUCTOS DROP DIA, DROP MES, DROP ANO;
UPDATE PRODUCTOS
SET ORIGEN = 'ESPAÑA' WHERE ORIGEN = 'ESPANA';
SELECT * FROM PRODUCTOS;

-- 8
ALTER TABLE PRODUCTOS_NEPTUNO MODIFY SUSPENDIDO VARCHAR(2);
UPDATE PRODUCTOS_NEPTUNO
SET SUSPENDIDO = IF(SUSPENDIDO = '0', 'NO', 'SI');
-- 9
UPDATE PRODUCTOS_NEPTUNO
SET PRECIOUNIDAD = ROUND((PRECIOUNIDAD * 1.1), 2);
SELECT * FROM PRODUCTOS_NEPTUNO;

-- 10
UPDATE PROVEEDORES
SET REGION = NULL WHERE REGION = '';
SELECT * FROM PROVEEDORES;

-- 11
UPDATE CLIENTES
SET CIUDAD = CONCAT(UPPER(LEFT(CIUDAD, 1)), LOWER(SUBSTRING(CIUDAD, 2, LENGTH(CIUDAD))));
SELECT * FROM CLIENTES;

-- 12
CREATE TABLE PRODUCTOS_SUSPENDIDOS
SELECT * FROM PRODUCTOS_NEPTUNO WHERE SUSPENDIDO = 'SI';
SELECT * FROM PRODUCTOS_SUSPENDIDOS;
