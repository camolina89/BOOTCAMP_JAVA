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
