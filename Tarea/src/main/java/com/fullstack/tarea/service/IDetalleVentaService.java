package com.fullstack.tarea.service;

import java.util.List;

import com.fullstack.tarea.model.DetalleVenta;

public interface IDetalleVentaService {
	void registrar(DetalleVenta detven);

	List<DetalleVenta> listar();
	DetalleVenta listarId(Integer id);

}
