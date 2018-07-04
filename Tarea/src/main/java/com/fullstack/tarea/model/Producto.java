package com.fullstack.tarea.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Producto {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
	private String nombre;
	private String marca;
	public Producto(int idProducto, String nombre, String marca) {
		
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.marca = marca;
	}
	public Producto() {
		
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}
