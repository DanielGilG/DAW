drop database if exists danielGil;
create database danielGil;
use danielGil;

create table camionero(
	dni char(9) primary key,
    nombre varchar(20) not null,
    apellido1 varchar(20) not null,
    apellido2 varchar(20)
);

insert into camionero(dni, nombre, apellido1)
value(87654321, "Mack","Rust-eze");

drop table if exists camion;
create table camion(
	matricula varchar(10) primary key,
    modelo varchar(30) not null,
    capacidad int not null
);

insert into camion(matricula, modelo, capacidad)
value("8418MCK", "Mack Super-Liner 1985", 10);

drop table if exists conduce;
create table conduce(
	dni char(9) not null references camionero,
	matricula varchar(10) not null references camion
);

drop table if exists ciudad;
create table ciudad(
	cod_ciudad int(8) primary key,
    nombre varchar(20) not null
);

insert into ciudad values(11,"Valencia");

drop table if exists paquete;
create table paquete(
	cod_paquete int primary key,
    descripcion varchar(30) not null,
    cod_ciudad int references ciudad
);

insert into paquete(cod_paquete, descripcion)
value(1, "turrón de chocolate");