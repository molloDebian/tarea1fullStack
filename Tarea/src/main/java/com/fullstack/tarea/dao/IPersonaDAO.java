package com.fullstack.tarea.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.tarea.model.Persona;


@Repository
public interface IPersonaDAO extends JpaRepository<Persona, Integer>{

}
