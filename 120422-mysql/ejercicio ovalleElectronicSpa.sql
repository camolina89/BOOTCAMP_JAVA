CREATE DATABASE ovalleElectronicsSpa ;
USE ovalleElectronicsSpa;

CREATE TABLE productos(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR (50),
    fecha_creacion DATE,
    proveedor VARCHAR (50),
    categoria VARCHAR (50)
);

CREATE TABLE ventas(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    cliente VARCHAR (100),
    metodo_pago VARCHAR (50),
    referencia INT,
    fecha DATE,
    id_producto INT NOT NULL,
    FOREIGN KEY (id_producto) REFERENCES productos(id)
);
SELECT * FROM productos;
INSERT INTO productos VALUES (null, 'HP 14" SSD256 RAM8', '2022-04-13', 'Aliexpress', 'Notebook'),
(null, 'HP 15" HDD500 RAM4', '2022-04-10', 'Aliexpress', 'Notebook'),
(null, 'Lenovo Legion 15" SSD500 RAM16', '2022-04-13', 'Amazon', 'Notebook Gamer');
DELETE FROM productos WHERE id = 1;
DELETE FROM ventas WHERE id = 1;
SELECT * FROM ventas;
INSERT INTO ventas VALUES (null, 'Alexis Sanchez', 'Efectivo', 7777, '2015-06-20', 4),
(null, 'Eduardo Vargas', 'Credito', 111111, '2016-01-15', 3),
(null, 'Margarita Chávez', 'Efectivo', 554488, '2021-11-31', 2),
(null, 'Marcelo Salas', 'Efectivo', 11, '2011-01-15', 4);