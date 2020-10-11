Drop database if exists Books;
Create database Books;
use Books;

drop table if exists book;
create table book (
id int primary key auto_increment,
author char(45) not null,
title varchar(25) not null,
category varchar(20) not null,
descri varchar(250) not null
);

insert into book values (2,"Juan Bartol López","Los pájaros de la cascada",
 "Relatos","Trata sobre los relatos de Bartol, mientras veía unos pájaros a diário");

SELECT * FROM book;