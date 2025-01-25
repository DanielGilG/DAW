drop database if exists docencia;
create database docencia;
use docencia;
drop table if exists decano;
create table decano(
	dni char(9) not null primary key,
    nombre varchar(20) not null,
    ap1 varchar(20) not null,
    ap2 varchar(20)
);

drop table if exists facultad;
create table facultad(
	cod_facultad int not null primary key,
    nombre varchar(20) not null,
	dni char(9) not null references decano
);

drop table if exists docente;
create table docente(
	dni char(9) not null primary key,
    nombre varchar(20) not null,
    ap1 varchar(20) not null,
    ap2 varchar(20),
	cod_facultad int not null references facultad
);

drop table if exists asignatura;
create table asignatura(
	cod_asig int not null primary key,
    nombre varchar(20)
);

drop table if exists imparte;
create table imparte(
	cod_asig int not null references asignatura,
    dni char(9) not null references docente,
    primary key(cod_asig, dni)
);