package com.fullstack.tarea.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.tarea.model.Venta;



@Repository
public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}