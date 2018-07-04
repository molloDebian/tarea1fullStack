package com.fullstack.tarea.service;

import java.util.List;

import com.fullstack.tarea.model.Producto;

public interface IProductoService {
	void registrar(Producto pro);
	void modificar(Producto pro);
	void eliminar(Integer id);
	List<Producto> listar();
	Producto listarId(Integer id);

}
