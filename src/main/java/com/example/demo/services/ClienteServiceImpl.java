package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Cliente;
import com.example.demo.dao.IClienteDAO;


@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	IClienteDAO iClienteDAO;

	//Listar todos
		public List<Cliente> listarClientes(){
			return iClienteDAO.findAll();
		};
		
		//Listar por id
		public Cliente clienteXID(Integer id) {
			return iClienteDAO.findById(id).get();
		}; 
		
		//Guardar
		public Cliente guardarCliente(Cliente cliente) {
			return iClienteDAO.save(cliente);
		};
		
		//Actualizar
		public Cliente actualizarCliente(Cliente cliente) {
			return iClienteDAO.save(cliente);
		};
		
		//Eliminar
		public void eliminarCliente(Integer id) {
			iClienteDAO.deleteById(id);
		};
}
