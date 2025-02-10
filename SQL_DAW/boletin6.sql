use coches;

select c.cifc, count(v.cifc) as cuentaventas
from VENTA v join CONCESIONARIO c on v.cifc=c.cifc;
join CLIENTE ci on v.cifcl=c.cifcl
group by c.cifc
