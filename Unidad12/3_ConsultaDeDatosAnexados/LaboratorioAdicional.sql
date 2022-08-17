USE LABORATORIO;
SET SQL_SAFE_UPDATES = 0;

-- 1a
UPDATE PRODUCTOS_NEPTUNO
SET SUSPENDIDO = 'SI' WHERE IDPROVEEDOR = 1;

-- 1b
INSERT INTO PRODUCTOS_SUSPENDIDOS (IDPRODUCTO, NOMBREPRODUCTO, NOMBRECONTACTO, NOMBRECATEGORIA, PRECIOUNIDAD, SUSPENDIDO, IDPROVEEDOR)
SELECT IDPRODUCTO, NOMBREPRODUCTO, NOMBRECONTACTO, NOMBRECATEGORIA, PRECIOUNIDAD, SUSPENDIDO, IDPROVEEDOR
FROM PRODUCTOS_NEPTUNO
WHERE SUSPENDIDO = 'SI';
SELECT * FROM PRODUCTOS_SUSPENDIDOS;

-- 1c
DELETE FROM PRODUCTOS_NEPTUNO WHERE SUSPENDIDO = 'SI';
SELECT * FROM PRODUCTOS_NEPTUNO;