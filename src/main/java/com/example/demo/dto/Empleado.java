package com.example.demo.dto;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	
	//Atributos de la clase
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nombre")
	private String nombre;
	private String apellido;
	private String direccion;
	private String trabajo;
	private double sueldo;
	
	public enum Trabajo{
		programador,  datanalyst, qa
		};
				
	//Constructores de clase
	public Empleado() {
	}
	
	public Empleado(int id, String nombre, String apellido, String direccion, String trabajo, double sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.trabajo = trabajo;
		this.sueldo = sueldo;
		setSueldo();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo() {
		
		if ("programador".equals(trabajo)) {
			sueldo = 100;
		} else if ("datanalyst".equals(trabajo)){
			sueldo = 50;
		} else if ("qa".equals(trabajo)) {
			sueldo = 25;
		} else {
			sueldo = 10;
		}
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", trabajo=" + trabajo + ", sueldo=" + sueldo + "]";
	}


}
