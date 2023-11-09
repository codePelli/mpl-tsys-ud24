package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	
	@Autowired
	@Lazy
	IEmpleadoDAO iEmpServ;

	@Override
	public List<Empleado> listEmpleados() {
		// TODO Auto-generated method stub
		return iEmpServ.findAll();
	}

	@Override
	public Empleado empleadoPorId(Integer id) {
		// TODO Auto-generated method stub
		return iEmpServ.findById(id).get();
	}

	@Override
	public Empleado saveEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpServ.save(empleado);
	}

	@Override
	public Empleado updateEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return iEmpServ.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Integer id) {
		// TODO Auto-generated method stub
		iEmpServ.deleteById(id);
	}



}
