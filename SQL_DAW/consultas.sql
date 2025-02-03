select c.nombre, c.edad
from ciclista c
where c.edad < 30;

select c.nomeq, c.nombre
from maillot m join llevar l on l.codigo = m.codigo
			   join etapa e on e.netapa = l.netapa
			   join ciclista c on c.dorsal = e.dorsal
where (m.color="Amarillo");

