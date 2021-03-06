create database pokemon_data;
use pokemon_data;

create table pokemon_kanto(
pokedex int not null primary key,
nombre varchar (25),
tipo1 varchar(25),
tipo2 varchar(25)
);

create table mis_pokemones(
id int not null primary key auto_increment,
pokedex int,
fecha_captura date,
lugar varchar (50),
huevo varchar (10),
peso double,
estatura double,
foreign key (pokedex) references pokemon_kanto(pokedex)
);
select * from pokemon_kanto;
select * from mis_pokemones;

select * from pokemon_kanto where pokedex > 50;
select * from pokemon_kanto where tipo1 = 'psiquico' or tipo2 = 'psiquico';
select * from pokemon_kanto limit 22;
select pokedex as 'nro_pokedex',nombre as 'pokename' from pokemon_kanto limit 30;

select count(*) as 'Total de Pokemones en Kanto' from pokemon_kanto;
select tipo2, count(*) as 'Total de Pokemon de segundo tipo Roca' from pokemon_kanto 
where tipo2 = 'roca' group by tipo2;

select tipo2, count(*) as 'Total Tipo' from pokemon_kanto  group by tipo2 order by tipo2;


