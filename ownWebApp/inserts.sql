drop database if exists simple_web_app;
create database simple_web_app;
use simple_web_app;

drop table if exists usuario;
create table usuario(
       	id char(2) primary key,
	nombre varchar(20) not null,
	descri varchar(20) not null
);

insert into usuario(id, nombre, descri)
value(01, "Daniel", "Administrador");
