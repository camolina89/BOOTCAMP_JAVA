create database posts;
use posts;

create table posts(
id int not null primary key auto_increment,
nombre varchar (50),
fecha date,
contenido varchar (200),
descripcion varchar (200)
);

insert into posts values (null, 'Pamela', '2021-05-12', 'Hola que tal', 'Pamela saluda y hace una pregunta');
insert into posts values (null, 'Carlos', '2021-05-13', 'Muy bien y tú', 'Carlos responde  y  hace una pregunta');
insert into posts values (null, 'Pamela', '2021-05-14', 'Bien', 'Pamela responde.');

select * from posts;	
alter table posts add column titulo varchar (50);
update posts set titulo = 'Primera escena' where id = 1;
update posts set titulo = 'Segunda escena' where id = 2;
update posts set titulo = 'Tercera escena' where id = 3;

insert into posts values (null, 'Pedro', '2021-05-15', 'Quien es Carlos?', 'Pedro hace una pregunta con tono molesto.', 'Cuarta Escena');
insert into posts values (null, 'Pedro', '2021-05-15', 'Pamela, estas allí?', 'Pedro hace tra consulta ya que no le responden.', 'Quinta Escena');
update posts set descripcion = 'Pedro hace otra consulta ya que no le responden.' where id = 5;
delete from posts where id=2;
insert into posts values (null, 'Carlos', '2021-05-15', 'Soy su primo', 'Carlos responde', 'Sexta Escena');
update posts set contenido = 'Soy su primo' where id = 6;



