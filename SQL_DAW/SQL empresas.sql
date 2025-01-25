drop database if exists empresas;
create database empresas;

drop table if exists empresa;
create table empresa(
	id_empresa int not null primary key,
    CIF int(10) not null,
    nombre varchar(10) not null,
    t_via varchar(10) not null,
    nombre_via varchar(10) not null,
    numero_via int not null,
    telefono int(8) not null
);

drop table if exists proyecto;
create table proyecto(
	id_proyecto int not null primary key,
    f_ini date not null,
    f_fin date not null,
    f_estimada date not null,
    id_empresa int not null references empresa
);

drop table if exists trabajador;
create table trabajador(
	id_trabajador int not null primary key,
    dni varchar(9) not null,
    nombre varchar(10) not null,
    apellido1 varchar(10) not null,
    apellido2 varchar(10),
    rol varchar(5) not null,
    horas int not null,
    id_proyecto int not null references proyecto
);
