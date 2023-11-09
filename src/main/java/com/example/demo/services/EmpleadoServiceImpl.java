package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dto.Empleado;
import com.example.demo.dao.IEmpeladoDAO;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	
	@Autowired
	IEmpeladoDAO iEmpleadoDAO;

	//Listar todos
		public List<Empleado> listEmpleados(){
			return iEmpleadoDAO.findAll();
		};
		
		//Listar por id
		public Empleado empleadoPorId(Integer id) {
			return iEmpleadoDAO.findById(id).get();
		}; 
		
		//Guardar
		public Empleado saveEmpleado(Empleado empleado) {
			return iEmpleadoDAO.save(empleado);
		};
		
		//Actualizar
		public Empleado updateEmpleado(Empleado empleado) {
			return iEmpleadoDAO.save(empleado);
		};
		
		//Eliminar
		public void eliminarEmpleado(Integer id) {
			iEmpleadoDAO.deleteById(id);
		}

		@GetMapping("/all")
		public List<Empleado> listarEmpleados(){
			return listEmpleados();
		};
}
