drop database komponisten if exists;
create database komponisten;

use komponisten;

create table composer (
	id int not null,
	name varchar(255),
	primary key (id)
);

insert into composer 
values (1, "J.S Bach");
