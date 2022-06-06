---------------------------------------------------------------------------------------------------
-- CREA LABASE DE DATOS ---------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------
CREATE DATABASE `hulk_store`
---------------------------------------------------------------------------------------------------
--AL INICIAR EL API LAS TABLAS SE CREAN AUTOMATICAMENTE -------------------------------------------
--CREA LA VISTA -----------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------

CREATE VIEW hs_vwstock as
SELECT T2.tip_id, T2.tip_nombre,T2.pro_image,T2.pro_id,T2.pro_nombre,T2.pro_valor,T2.ingreso, IFNULL(T1.vendido,0) AS vendido, (T2.ingreso - IFNULL(T1.vendido,0)) AS disponible FROM 
(
	SELECT p.pro_id,SUM(iv.itv_unidad) AS vendido  
	FROM hs_item_venta iv
	INNER JOIN hs_item_producto ip ON ip.itp_id = iv.itp_id
	INNER JOIN hs_producto p ON p.pro_id =ip.pro_id 
	GROUP BY p.pro_id
)AS T1
RIGHT JOIN (
	SELECT  p.pro_id,p.pro_nombre,p.pro_image, p.pro_valor ,p.tip_id, tp.tip_nombre  ,SUM(IFNULL(ip.itv_unidad,0)) AS ingreso  
	FROM hs_item_producto ip 
	RIGHT JOIN hs_producto p ON p.pro_id =ip.pro_id
	RIGHT JOIN hs_tipo_producto tp ON tp.tip_id =p.tip_id 
	GROUP BY p.pro_id
) AS T2 ON T1.pro_id =T2.pro_id 


---------------------------------------------------------------------------------------------------
-- INGRESA DATA DE PRUEBA  ------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------
INSERT INTO hulk_store.hs_tipo_producto
( tip_nombre, tip_fecha, tip_estado, tip_sigla)
VALUES
('VASO', now(), 'ACTIVE', 'VS'),
('TASA', now(), 'ACTIVE', 'TS'),
('CAMISETA', now(), 'ACTIVE', 'CAM'),
('COMIC', now(), 'ACTIVE', 'COM'),
('JUGUETE', now(), 'ACTIVE', 'JGT'),
('ACCESORIO', now(), 'ACTIVE', 'ACS');


INSERT INTO hulk_store.hs_producto
(pro_nombre, pro_valor, tip_id, pro_fecha, pro_estado)
VALUES
('HEROE DC FULL COLOR', 10.5, 1, now(), 'ACTIVE'),
('HEROE MARVEL COLOR', 10.75, 1, now(), 'ACTIVE'),
('HEROE DC FULL COLOR', 12.40, 2, now(), 'ACTIVE'),
('HEROE MARVEL FULL COLOR', 12.50, 2, now(), 'ACTIVE'),
('HEROE DC ESTAMPADO FULL COLOR', 25.9, 3, now(), 'ACTIVE'),
('HEROE MARVEL ESTAMPADO FULL COLOR', 25.7, 3, now(), 'ACTIVE'),
('COMIC A4', 6.0, 4, now(), 'ACTIVE'),
('COMIC A3', 15.9, 4, now(), 'ACTIVE'),
('ESCUDO C.A', 30.0, 5, now(), 'ACTIVE'),
('ESPADA JEDAY', 37, 5, now(), 'ACTIVE'),
('LLAVERO HEROE DC', 2, 6, now(), 'ACTIVE'),
('LLAVERO HEROE MARVEL', 2, 6, now(), 'ACTIVE');


INSERT INTO hulk_store.hs_item_producto
( itp_serie, itp_fecha, pro_id, itv_unidad, itp_estado)
VALUES
("0001", now(), 1,25, 'ACTIVO'),
("0002", now(), 2,25, 'ACTIVO'),
("0003", now(), 3,25, 'ACTIVO'),
("0004", now(), 4,25, 'ACTIVO'),
("0005", now(), 5,25, 'ACTIVO'),
("0006", now(), 6,25, 'ACTIVO'),
("0007", now(), 7,25, 'ACTIVO'),
("0008", now(), 8,25, 'ACTIVO'),
("0009", now(), 9,25, 'ACTIVO'),
("0010", now(), 10,25, 'ACTIVO'),
("0011", now(), 11,25, 'ACTIVO'),
("0012", now(), 12,25, 'ACTIVO');


INSERT INTO hulk_store.hs_item_producto
( itp_serie, itp_fecha, pro_id, itv_unidad, itp_estado)
VALUES
("0013", now(), 1,15, 'ACTIVO'),
("0014", now(), 2,5, 'ACTIVO'),
("0015", now(), 3,2, 'ACTIVO'),
("0016", now(), 4,7, 'ACTIVO'),
("0017", now(), 5,23, 'ACTIVO'),
("0018", now(), 6,14, 'ACTIVO'),
("0019", now(), 7,11, 'ACTIVO'),
("0020", now(), 8,9, 'ACTIVO'),
("0021", now(), 9,3, 'ACTIVO'),
("0022", now(), 10,1, 'ACTIVO'),
("0023", now(), 11,4, 'ACTIVO'),
("0024", now(), 12,9, 'ACTIVO');


-- CREACION VENTA 

INSERT INTO hulk_store.hs_cliente
(cli_nombre,cli_apellido, cli_dni, cli_email, cli_password, cli_direccion, cli_pais, cli_postal, cli_estado, cli_fecha)
VALUES('Nombre1', 'Apellido1', '0987654321', 'email1@dom.com', '12345', 'direccion1', 'Ecuador', '0233', 'ACTIVO', now()),
('Nombre2', 'Apellido2', '0918273645', 'email2@dom.com', '12345', 'direccion2', 'Ecuador', '1226', 'ACTIVO', now());


INSERT INTO hulk_store.hs_tarjeta_cliente
(tac_tipo, tac_numero, tac_code, tac_fecha, cli_id, tac_estado)
VALUES('VISA', 'xxxxx', 'xxxxx', now(), 1, 'ACTIVO'),
('VISA', 'xxxxx', 'xxxxx', now(), 2, 'ACTIVO');

INSERT INTO hulk_store.hs_pago
(pag_referencia, pag_valor_compra, pag_valor_adicional, pag_valor_total, tac_id, pag_fecha, pag_estado)
VALUES('00001', 1.0 ,2, 0, 1, now(), 'PAGADO');


INSERT INTO hulk_store.hs_venta
(ven_numero, pag_id, ven_fecha, ven_estado)
VALUES('12323',1 ,now() ,'ACTIVO' );

INSERT INTO hulk_store.hs_item_venta
(itp_id, ven_id, itv_unidad, itv_valor_unidad, itv_valor_total, itv_fecha, itv_estado)
VALUES(7, 1, 3, 6, 18, now(), 'ACTIVO'),
(7, 1, 3, 6, 18, now(), 'ACTIVO'),
(16, 1, 3, 12.5, 37.5, now(), 'ACTIVO'),
(11, 1, 6, 2, 12, now(), 'ACTIVO');

