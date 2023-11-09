package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Empleado;
import com.example.demo.services.EmpleadoServiceImpl;
import com.example.demo.services.IEmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadosController {

	@Autowired
	private EmpleadoServiceImpl empService;
	
	@PostMapping("/add")
	public Empleado insertEmpleado(@RequestBody Empleado empleado) {
		
		return empService.saveEmpleado(empleado);
	}
	
    @GetMapping("/list")
    public List<Empleado> listEmpleados() {
        return empService.listEmpleados();
    }
	
	
	@GetMapping("/{id}")
	public Empleado empleadoPorId(@PathVariable Integer id) {
		
		Empleado empleado_porId= new Empleado();
		
		empleado_porId=empService.empleadoPorId(id);
		
		System.out.println("Empleado por ID: "+empleado_porId);
		
		return empleado_porId;
	}
	
	@PutMapping("/{id}")
	public Empleado updateEmpleado(@PathVariable Integer id,@RequestBody Empleado empleado) {
		
		Empleado empleadoSeleccionado= new Empleado();
		Empleado empleadoUpdated= new Empleado();
		
		empleadoSeleccionado= empService.empleadoPorId(id);
		
		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellido(empleado.getApellido());
		empleadoSeleccionado.setDireccion(empleado.getDireccion());
		empleadoSeleccionado.setTrabajo(empleado.getTrabajo());
		empleadoSeleccionado.setSueldo();
		
		empleadoUpdated = empService.updateEmpleado(empleadoSeleccionado);
		
		System.out.println("El cliente actualizado es: "+ empleadoUpdated);
		
		return empleadoUpdated;
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmpleado(@PathVariable(name="id")Integer id) {
		empService.eliminarEmpleado(id);
		System.out.println("Empleado eliminado");
	}
	
	
}
