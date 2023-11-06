DROP table IF EXISTS empleado;

create table empleado(
	sueldo int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	direccion varchar(250),
	trabajo varchar(250),
	sueldo double auto_increment
);

insert into empleado (nombre, apellido,direccion,dni,fecha)values('Jose','Marin','calle imaginaria 1','Programador','1000', NOW());
insert into empleado (nombre, apellido,direccion,dni,fecha)values('Juan','Lopez','calle imaginaria 2','Programador','1000', NOW());
insert into empleado (nombre, apellido,direccion,dni,fecha)values('Pedro','Guillem','calle imaginaria 3','Programador','1000', NOW());
insert into empleado (nombre, apellido,direccion,dni,fecha)values('Jordi','Martin','calle imaginaria 4','Programador','1000', NOW());
insert into empleado (nombre, apellido,direccion,dni,fecha)values('Jonatan','Vicente','calle imaginaria 5','Programador','1000', NOW());