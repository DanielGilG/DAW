use jardineria

-- Ejercicio 1
create user 'admin'@'localhost' identified by 'password'
grant all privileges *.* to admin;

-- Ejercicio 2
grant select, insert, update, delete, on jardineria.* to admin;

-- Ejercicio 3
alter user 'admin'@'localhost' identified by 'newpassword';

-- Ejercicio 4
grant insert, delete, update on jardineria.producto to admin;

-- Ejercicio 5
revoke delete on jardineria.cliente to admin;

-- Ejercicio 6
create user 'analista'@'localhost' identified by 'securepass';
grant select on jardineria.pedido to analista;
