package com.example.demo.services;
import java.util.List;
import com.example.demo.dto.Cliente;

public interface IClienteService {
	
	//Listar todos
	public List<Cliente> listarClientes();
	
	//Listar por id
	public Cliente clienteXID(Integer id); 
	
	//Guardar
	public Cliente guardarCliente(Cliente cliente);
	
	//Actualizar
	public Cliente actualizarCliente(Cliente cliente);
	
	//Eliminar
	public void eliminarCliente(Integer id);

	
}
