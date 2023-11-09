DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(250),
	trabajo varchar(250),
	sueldo double
);

insert into empleado (nombre, apellido,direccion,trabajo,sueldo)values('Jose','Marin','calle imaginaria 1','Programador','1000');
insert into empleado (nombre, apellido,direccion,trabajo,sueldo)values('Juan','Lopez','calle imaginaria 2','Programador','1000');
insert into empleado (nombre, apellido,direccion,trabajo,sueldo)values('Pedro','Guillem','calle imaginaria 3','Programador','1000');
insert into empleado (nombre, apellido,direccion,trabajo,sueldo)values('Jordi','Martin','calle imaginaria 4','Programador','1000');
insert into empleado (nombre, apellido,direccion,trabajo,sueldo)values('Jonatan','Vicente','calle imaginaria 5','Programador','1000');