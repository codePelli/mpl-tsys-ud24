package com.example.demo.services;
import java.util.List;
import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	
	//Listar todos
	public List<Empleado> listEmpleados();
	
	//Listar por id
	public Empleado empleadoPorId(Integer id); 
	
	//Guardar
	public Empleado saveEmpleado(Empleado empleado);
	
	//Actualizar
	public Empleado updateEmpleado(Empleado empleado);
	
	//Eliminar
	public void eliminarEmpleado(Integer id);

	
}
