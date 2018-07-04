package com.fullstack.tarea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.tarea.dao.IProductoDAO;
import com.fullstack.tarea.model.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoDAO dao;

	@Override
	public void registrar(Producto pro) {
		dao.save(pro);		
	}

	@Override
	public void modificar(Producto pro) {
		dao.save(pro);
	
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Producto> listar() {
		return dao.findAll();
	}

	@Override
	public Producto listarId(Integer id) {	
		return dao.findOne(id);
	}

}
