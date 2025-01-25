drop database if exists viajes;
create database viajes;
use viajes;

drop table if exists cliente;
create table cliente(
	DNI char(9) not null primary key,
    nombre char(8) not null,
    ap1 varchar(20) not null,
    ap2 varchar(20),
    t_via varchar(20) not null,
    numero_via int not null,
    nombre_via varchar(20) not null,
    telefono int not null
);

drop table if exists viaje;
create table viaje(
	id_viaje int not null primary key,
    plazas int not null,
    t_total int not null
);

drop table if exists reserva;
create table reserva(
	DNI char(9) not null references cliente,
	id_viaje int not null references viaje,
    primary key (DNI, id_viaje)
);

drop table if exists avion;
create table avion(
	id_avion int not null primary key,
    plazas int not null,
    companyia varchar(20)
);

drop table if exists vuelo;
create table vuelo(
	IATA varchar(20) not null,
    id_avion int not null references avion,
    id_aeropuerto_aterriza int not null references avion,
    id_aeropuerto_despega int not null references avion,
    f_aterriza date not null,
    f_despega date not null
);

drop table if exists aeropuerto;
create table aropuerto(
	id_aeropuerto int not null primary key,
    nombre varchar(20) not null,
    localidad varchar(20) not null
);

