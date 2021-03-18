create table personas(
    id int primary key,
    nombre varchar(50),
    altura float,
    fecha_nacimiento date,
    nombre_imagen varchar(100)
);

insert into personas values (1, 'Cristiano Ronaldo', 1.87, '1985-02-05', 'cristiano');
insert into personas values (2, 'Keanu Reeves', 1.86, '1964-09-02', 'keanu');
insert into personas values (3, 'Bill Gates', 1.77, '1955-10-28', 'bill');