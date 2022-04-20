create database peliculas;
use peliculas;

create table repartos (
	id int not null primary key auto_increment,
	pelicula_id int,
    actores text
);

select * from peliculas;
select * from reparto_corregido;

select id from peliculas where pelicula = 'Titanic';
select * from reparto_corregido where pelicula_id = 2;

select count(*) as 'Cantidad de Peliculas' from reparto_corregido where actores = 'Harrison Ford' limit 100;
select pelicula, anio_estreno from peliculas where anio_estreno between 1990 and 1999 order by pelicula;
select pelicula, length(pelicula) as 'longitud titulo' from peliculas;
select pelicula, length(pelicula) as 'longitud' from peliculas order by length(pelicula) desc limit 1;
