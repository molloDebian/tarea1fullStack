package com.fullstack.tarea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.tarea.dao.IPersonaDAO;
import com.fullstack.tarea.model.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaDAO dao;

	@Override
	public void registrar(Persona per) {
		dao.save(per);		
	}

	@Override
	public void modificar(Persona per) {
		dao.save(per);
	
	}

	@Override
	public void eliminar(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Persona> listar() {
		return dao.findAll();
	}

	@Override
	public Persona listarId(Integer id) {	
		return dao.findOne(id);
	}

}