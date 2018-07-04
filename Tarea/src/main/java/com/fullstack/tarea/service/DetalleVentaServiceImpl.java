package com.fullstack.tarea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.tarea.dao.IDetalleVentaDAO;
import com.fullstack.tarea.model.DetalleVenta;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{
	
	@Autowired
	private IDetalleVentaDAO dao;

	@Override
	public void registrar(DetalleVenta detvent) {
		dao.save(detvent);		
	}

	

	@Override
	public List<DetalleVenta> listar() {
		return dao.findAll();
	}

	@Override
	public DetalleVenta listarId(Integer id) {	
		return dao.findOne(id);
	}

}