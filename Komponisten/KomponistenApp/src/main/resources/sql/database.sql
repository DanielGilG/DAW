drop database komponisten if exists;
create database komponisten;

create table composer (
	id int not null,
	name varchar(255),
	primary key (id)
);
