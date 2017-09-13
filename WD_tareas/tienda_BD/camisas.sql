create database tiendita;

use tiendita;

create table camisa(
idCamisa varchar(3) not null primary key,
nombre varchar(30),
costo int(100),
cantidad int(100)
);

alter table camisa 
add column cantidad int(100);
drop table camisa;
desc camisa;


insert into camisa values("c1", "roja",100, 30);

insert into camisa values("c2", "blanca", 200, 30);

insert into camisa values("c3", "cuadros",300, 30);

insert into camisa values("c4", "aqua", 400, 30);

insert into camisa values("c5", "negra_alas",500, 30);

insert into camisa values("c6", "negra",600, 30);

select * from camisa;