-- Jardineria joins
-- Ejercicio 1
select c.nombre_cliente
from cliente c
where c.limite_credito = (select max(c2.limite_credito)
			  from cliente c2);

-- Ejercicio 1 
select c.nombre_cliente
from cliente c
where c.limite_credito <= all(select max(c2.limite_credito)
			  from cliente c2);

-- Ejercicio 3
/*
select e.nombre, e.apellodo1, e.apellido2
from empleado e
where e.codigo_jefe = select (e2.codigo_empleado from empleado e2 where e2.nombre = "Alberto" and e2.apellido="Soria");
*/

-- Ejercicio 4
select e.nombre, e.apellido1
from empleado e
where e.codigo_empleado not in (select codigo_empleado_rep_ventas
				from cliente);

-- Ejercicio 5
select c.nombre_cliente
from cliente c
where c.codigo_cliente in (select p.codigo_cliente
			from pago p);
		


select c.nombre_cliente
from cliente c join pago p on p.codigo_cliente = c.codigo_cliente;


-- Ejercicio 6 (DURO) con joins

-- Ejercicio 7 
/*
select c.nombre_cliente
from cliente c join 
*/

-- Ejercicio 8
select distinct(p.nombre)
from producto p
where exists (select d.codigo_producto
		from detalle_pedido d
		where d.codigo_producto=p.codigo_producto);



-- Ejercicio 10
select c.nombre_cliente
from cliente c join pedido p on c.codigo_cliente = p.codigo_cliente
where year(p.fecha_pedido) = 2008;

use ciclismo;

select nomeq, count(nombre)
from ciclista 
group by nomeq having count(nombre) > 5;

-- Ejercicio 2
select count(e.netapa)
from ciclista c join etapa e on c.dorsal = e.dorsal
group by c.nombre
having count(e.netapa) > 1;

-- Ejercicio 3
select categoria, count(p.nompuerto)
from puerto p
group by categoria
having count (p.nompuerto)>2;


-- Ejercicio 4
select c.nombre, sum(e.km)
from ciclista c join etapa e on c.dorsal = e.dorsal
group by c.nombre
having count(e.netapa)>=2;


-- Ejercicio 5 (agrupado y cadenas)
select count(*) /* la clave primaria */
from ciclista c
group by (c.nomeq)
having c.nomeq like "M%";


-- Ejercicio 7
select count(*)
from ciclista c join etapa e on c.dorsal = e.dorsal
group by e.netapa;
