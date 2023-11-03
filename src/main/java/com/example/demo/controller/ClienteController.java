package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Cliente;
import com.example.demo.services.ClienteServiceImpl;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	ClienteServiceImpl clienteServideImpl;
	
	@GetMapping("/all")
	public List<Cliente> listarClientes(){
		return clienteServideImpl.listarClientes();
	}
	
	
	@PostMapping("/add")
	public Cliente salvarCliente(@RequestBody Cliente cliente) {
		
		return clienteServideImpl.guardarCliente(cliente);
	}
	
	
	@GetMapping("/{id}")
	public Cliente clienteXID(@PathVariable(name="id") Integer id) {
		
		Cliente cliente_xid= new Cliente();
		
		cliente_xid=clienteServideImpl.clienteXID(id);
		
		System.out.println("Cliente XID: "+cliente_xid);
		
		return cliente_xid;
	}
	
	@PutMapping("/{id}")
	public Cliente actualizarCliente(@PathVariable(name="id")Integer id,@RequestBody Cliente cliente) {
		
		Cliente cliente_seleccionado= new Cliente();
		Cliente cliente_actualizado= new Cliente();
		
		cliente_seleccionado= clienteServideImpl.clienteXID(id);
		
		cliente_seleccionado.setNombre(cliente.getNombre());
		cliente_seleccionado.setApellido(cliente.getApellido());
		cliente_seleccionado.setDireccion(cliente.getDireccion());
		cliente_seleccionado.setDni(cliente.getDni());
		cliente_seleccionado.setFecha(cliente.getFecha());
		
		cliente_actualizado = clienteServideImpl.actualizarCliente(cliente_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ cliente_actualizado);
		
		return cliente_actualizado;
	}
	
	@DeleteMapping("/{id}")
	public void eliminarCliente(@PathVariable(name="id")Integer id) {
		clienteServideImpl.eliminarCliente(id);
		System.out.println("Cliente eliminado");
	}
	
	
}