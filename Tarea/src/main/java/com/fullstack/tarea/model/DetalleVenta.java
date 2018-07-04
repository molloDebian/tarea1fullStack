package com.fullstack.tarea.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class DetalleVenta {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleVenta;
	//lowerCamelCase
	
	@OneToOne
	private Venta venta;
	
	@ManyToOne
    private Producto producto;
	
	private int cantidad;
	public DetalleVenta() {
	}
	public DetalleVenta(int idDetalleVenta, Venta idVenta, Producto idProducto, int cantidad) {
		this.idDetalleVenta = idDetalleVenta;
		this.venta = idVenta;
		this.producto = idProducto;
		this.cantidad = cantidad;
	}
	public int getIdDetalleVenta() {
		return idDetalleVenta;
	}
	public void setIdDetalleVenta(int idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}
	public Venta getIdVenta() {
		return venta;
	}
	public void setIdVenta(Venta idVenta) {
		this.venta = idVenta;
	}
	public Producto getIdProducto() {
		return producto;
	}
	public void setIdProducto(Producto idProducto) {
		this.producto = idProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
