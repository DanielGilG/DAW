use jardineria;

-- Ejercicio 1.1 (versión join)
select o.codigo_oficina, pe.fecha_pedido
from oficina o join empleado e on o.codigo_oficina=e.codigo_oficina
join cliente c on c.codigo_empleado_rep_ventas = e.codigo_empleado
join pedido pe on pe.codigo_cliente = c.codigo_cliente
where not year(pe.fecha_pedido) = 2009
group by pe.codigo_pedido;

-- Ejercicio 1.2 (versión subconsulta...Resulta MAL)
from oficina o join empleado e on o.codigo_oficina=e.codigo_oficina
join cliente c on c.codigo_empleado_rep_ventas = e.codigo_empleado
join pedido pe on pe.codigo_cliente = c.codigo_cliente
group by pe.codigo_pedido
having (select pe2.fecha_pedido
	from pedido pe2
	where year(pe2.fecha_pedido) != 2009);

-- Ejercicio 2
select c.codigo_cliente
from cliente c join pedido p on c.codigo_cliente = p.codigo_cliente
join detalle_pedido dp on p.codigo_pedido = dp.codigo_pedido
join producto pro on dp.codigo_producto = pro.codigo_producto
join gama_producto gp on pro.gama = gp.gama
where gp.gama like "Riego" and p.precio_venta > sum(select pro2.precio_venta from producto pro)
group by c.codigo_cliente;

-- Ejercicio 3
select e.codigo_empleado
from empleado e join cliente c on c.codigo_empleado_rep_ventas = e.codigo_empleado
join pedido p on p.codigo_cliente = c.codigo_cliente
where c.limite_credito > 5000
group by e.codigo_empleado; 

-- Ejercicio 4
select reverse(c.nombre_cliente), c.ciudad, count(p.codigo_pedido)
from cliente c join pedido p on c.codigo_cliente = p.codigo_cliente
group by c.codigo_cliente
having c.nombre_cliente like "% _a%"
order by count(p.codigo_pedido) asc;
