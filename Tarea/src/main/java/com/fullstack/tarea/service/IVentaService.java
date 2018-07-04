package com.fullstack.tarea.service;

import java.util.List;

import com.fullstack.tarea.model.Venta;

public interface IVentaService {
	void registrar(Venta ven);

	List<Venta> listar();
	Venta listarId(Integer id);
	

}
