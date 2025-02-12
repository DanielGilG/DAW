DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda CHARACTER SET utf8mb4;
USE tienda;

-- TABLA CLIENTES
CREATE TABLE clientes (
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);

-- TABLA PEDIDOS
CREATE TABLE pedidos (
    id_pedido INT PRIMARY KEY AUTO_INCREMENT,
    id_cliente INT,
    fecha DATE NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente) ON DELETE SET NULL
);

-- TABLA PRODUCTOS
CREATE TABLE productos (
    id_producto INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    precio DECIMAL(10,2) NOT NULL
);

-- TABLA DETALLE_PEDIDOS (RELACIÓN ENTRE PEDIDOS Y PRODUCTOS)
CREATE TABLE detalle_pedidos (
    id_detalle INT PRIMARY KEY AUTO_INCREMENT,
    id_pedido INT,
    id_producto INT,
    cantidad INT NOT NULL,
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido) ON DELETE SET NULL,
    FOREIGN KEY (id_producto) REFERENCES productos(id_producto) ON DELETE SET NULL
);

-- INSERTAR DATOS EN CLIENTES
INSERT INTO clientes (nombre, email) VALUES
('Juan Pérez', 'juan@email.com'),
('María López', 'maria@email.com'),
('Carlos Sánchez', 'carlos@email.com'),
('Ana Ruiz', 'ana@email.com'); -- Ana no tiene pedidos

-- INSERTAR DATOS EN PEDIDOS
INSERT INTO pedidos (id_cliente, fecha) VALUES
(1, '2024-02-01'),
(1, '2024-02-05'),
(2, '2024-02-10'),
(3, '2024-02-15'),
(NULL, '2024-02-20'); -- Pedido sin cliente

-- INSERTAR DATOS EN PRODUCTOS
INSERT INTO productos (nombre, precio) VALUES
('Laptop', 1200.00),
('Teclado', 30.00),
('Ratón', 25.00),
('Monitor', 300.00); -- Este producto no ha sido pedido

-- INSERTAR DATOS EN DETALLE_PEDIDOS
INSERT INTO detalle_pedidos (id_pedido, id_producto, cantidad) VALUES
(1, 1, 1), -- Juan compra una Laptop
(1, 2, 2), -- Juan compra 2 Teclados
(2, 3, 1), -- María compra un Ratón
(3, NULL, 1); -- Pedido sin producto
