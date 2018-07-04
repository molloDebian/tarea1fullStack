package com.fullstack.tarea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.tarea.dao.IVentaDAO;
import com.fullstack.tarea.model.Venta;

@Service
public class VentaServiceImpl implements IVentaService{
	
	@Autowired
	private IVentaDAO dao;

	@Override
	public void registrar(Venta ven) {
		dao.save(ven);		
	}

	

	@Override
	public List<Venta> listar() {
		return dao.findAll();
	}

	@Override
	public Venta listarId(Integer id) {	
		return dao.findOne(id);
	}

}