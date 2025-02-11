use ventas;

-- Ejercicio 1
select c.id, count(p.id)
from comercial c join pedido p on c.id = p.id_comercial
group by p.id
having count(p.id) > 1000;

-- Ejercicio 2
select c.nombre as clientes, count(p.id) as pedidos
from cliente c join pedido p on c.id=p.id_cliente
group by c.id
having count(p.id)>2;

-- Ejercicio 3
select c.id, sum(p.total)
from comercial c join pedido p on c.id=p.id_comercial
group by c.id
having sum(p.total)>5000;

-- Ejercicio 4
select c.id, sum(p.total), count(p.id)
from cliente c join pedido p on c.id=p.id_cliente
group by c.id
having sum(p.total)>1000;

-- Ejercicio 5
select c.id as comercial, count(cl.id) as clientesgestionados
from comercial c join pedido p on c.id=p.id_comercial
join cliente cl on cl.id = p.id_cliente
group by c.id
having count(cl.id) > 2;

-- Ejercicio 6
select c.id, sum(p.total), count(p.id)
from cliente c join pedido p on c.id=p.id_cliente
group by c.id
having sum(p.total)>1500 and count(p.id) > 2;

-- Ejercicio 7
select c.id, sum(p.total), count(p.id)
from comercial c join pedido p on c.id = p.id_comercial
group by c.id having sum(p.total)>1500 and count(p.id)>5;

-- Ejercicio 8
select c.nombre, sum(p.total)
from cliente c join pedido p on c.id=p.id_cliente
group by c.id
having sum(p.total)>1500;

-- Ejercicio 9
select c.id, sum(p.total)
from cliente c join pedido p on c.id=p.id_cliente
group by c.id
having sum(p.total) between 1000 and 3000;

-- Ejercicio 10
select c.nombre, count(p.id), sum(p.total)
from comercial c join pedido p on c.id = p.id_comercial
group by c.id
order by sum(p.total) desc;
