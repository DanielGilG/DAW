DROP DATABASE IF EXISTS instituto;
CREATE DATABASE instituto CHARACTER SET utf8mb4;

USE instituto;

CREATE TABLE alumno (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
apellido1 VARCHAR(100) NOT NULL,
apellido2 VARCHAR(100),
fecha_nacimiento DATE NOT NULL,
es_repetidor ENUM('sí', 'no') NOT NULL,
teléfono VARCHAR(9)
);

INSERT INTO alumno VALUES(1, 'María', 'Sánchez', 'Pérez', '1990-12-01', 'no',
NULL);

INSERT INTO alumno VALUES(2, 'Juan', 'Sáez', 'Vega', '1998-04-02', 'no',
618253876);

INSERT INTO alumno VALUES(3, 'Pepe', 'Ramírez', 'Gea', '1988-01-03', 'no', NULL
);

INSERT INTO alumno VALUES(4, 'Lucía', 'Sánchez', 'Ortega', '1993-06-13', 'sí',
678516294);

INSERT INTO alumno VALUES(5, 'Paco', 'Martínez', 'López', '1995-11-24', 'no',
692735409);

INSERT INTO alumno VALUES(6, 'Irene', 'Gutiérrez', 'Sánchez', '1991-03-28', 'sí', NULL
);

INSERT INTO alumno VALUES(7, 'Cristina', 'Fernández', 'Ramírez', '1996-09-17',
'no', 628349590);

INSERT INTO alumno VALUES(8, 'Antonio', 'Carretero', 'Ortega', '1994-05-20', 'sí', 612345633);

INSERT INTO alumno VALUES(9, 'Manuel', 'Domínguez', 'Hernández', '1999-07-08',
'no', NULL);

INSERT INTO alumno VALUES(10, 'Daniel', 'Moreno', 'Ruiz', '1998-02-03', 'no',
NULL);
-- Comentario 
select nombre, teléfono from alumno;

-- Ejercicio 1
select * from alumno where id = 1;
-- Ejercicio 2
select * from alumno where teléfono = '692735409';
-- Ejercicio 3
select * from alumno where es_repetidor = 'sí';
-- Ejercicio 4
select * from alumno where es_repetidor = 'no';
-- Ejercicio 5
select * from alumno where fecha_nacimiento < '1993/01/01';
-- Ejercicio 6
select * from alumno where fecha_nacimiento > '1994/01/01';
-- Ejercicio 7
select * from alumno where fecha_nacimiento > '1994/01/01' and es_repetidor = "no";
-- Ejercicio 8
select * from alumno where year(fecha_nacimiento) = 1998;
-- Ejercicio 9
select * from alumno where year(fecha_nacimiento) != 1998 order by fecha_nacimiento;

-- actualizar
update alumno set nombre='Sr Patata' where id = 2;
select * from alumno;

-- borrado
delete from alumno where id = 5;

-- pg28pdf Ejercicio 1
select nombre, reverse(nombre) 
from alumno;

-- Ejercicio 2
select concat(nombre, apellido1), 
reverse(concat(nombre, apellido1)) 
from alumno;

-- Ejercicio 3
select upper(concat(nombre, apellido1)), 
lower(reverse(concat(nombre, apellido1))) 
from alumno;

-- Ejercicio 4
select concat(nombre," ", apellido1) as "name", 
char_length(concat(nombre, apellido1)) as "length", 
length(concat(nombre, apellido1)) as "bytes"
from alumno;

-- Ejercicio 5
select concat(nombre, " ", apellido1, " ", apellido2) as "alumno", 
lower(concat(nombre, ".", apellido1, "@iescelia.org.")) as "email" 
from alumno;

-- Ejercicio 6
select concat(nombre, " ", apellido1, " ", apellido2) as "alumno", 
lower(concat(nombre, ".", apellido1, "@iescelia.org")) as "email", 
concat(reverse(apellido2), year(fecha_nacimiento)) as "contraseña" from alumno;
