-- se crea la tabla directorio

CREATE TABLE directorioTelefonico(
id int not null primary key auto_increment,
nombre varchar (50),
apellidos varchar (50),
celular int,
direccion varchar (250),
fechaNacimiento date
);

CREATE TABLE agenda (
id int not null primary key auto_increment,
alias varchar(25),
directorio_id int,
foreign key (directorio_id ) references directorioTelefonico(id)
);

