package com.fullstack.tarea.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Venta {
	 @	Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int idVenta;
	    private LocalDateTime fecha;
	    @ManyToOne
		private Persona idPersona;
		private Double importe;
		public Venta(int idVenta, LocalDateTime fecha, Persona idPersona, Double importe) {
			this.idVenta = idVenta;
			this.fecha = fecha;
			this.idPersona = idPersona;
			this.importe = importe;
		}
		public Venta() {
		}
		public int getIdVenta() {
			return idVenta;
		}
		public void setIdVenta(int idVenta) {
			this.idVenta = idVenta;
		}
		public LocalDateTime getFecha() {
			return fecha;
		}
		public void setFecha(LocalDateTime fecha) {
			this.fecha = fecha;
		}
		public Persona getIdPersona() {
			return idPersona;
		}
		public void setIdPersona(Persona idPersona) {
			this.idPersona = idPersona;
		}
		public Double getImporte() {
			return importe;
		}
		public void setImporte(Double importe) {
			this.importe = importe;
		}
		
		

}
