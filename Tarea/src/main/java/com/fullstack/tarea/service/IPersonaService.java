package com.fullstack.tarea.service;

import java.util.List;

import com.fullstack.tarea.model.Persona;

public interface IPersonaService {
	
	void registrar(Persona per);
	void modificar(Persona per);
	void eliminar(Integer id);
	List<Persona> listar();
	Persona listarId(Integer id);

}
