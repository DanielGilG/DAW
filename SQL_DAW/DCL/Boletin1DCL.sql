use jardineria

-- Ejercicio 1
create user 'admin'@'localhost' identified by 'password'
grant all privileges on *.* to 'admin'@'localhost';

-- Ejercicio 2
grant select, insert, update, delete on jardineria.* to 'admin'@'localhost';

-- Ejercicio 3
alter user 'admin'@'localhost' identified by 'newpassword';

-- Ejercicio 4
grant alter on jardineria.producto to 'admin'@'localhost';

-- Ejercicio 5
revoke delete on jardineria.producto to 'admin'@'localhost';

-- Ejercicio 6
create user 'analista'@'localhost' identified by 'securepass';
grant select on jardineria.pedido to analista;

-- Ejercicio 7
alter user 'admin'@'localhost' password expire interval 90 day;

-- Ejercicio 8
grant select(estado), update(estado) on jardineria.pedido to 'admin'@'localhost';

-- Ejercicio 10
create user 'cliente1'@'localhost' identified by 'clientepass';
grant select, update on jardineria.pago to 'cliente1'@'localhost'
where codigo_cliente = current_user();

-- Ejercicio 11
alter user bblablablabla account lock;

revoke all privileges on jardineria.pago to blablabla;
