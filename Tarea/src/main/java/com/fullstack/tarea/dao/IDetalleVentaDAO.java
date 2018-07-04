package com.fullstack.tarea.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.tarea.model.DetalleVenta;


@Repository
public interface IDetalleVentaDAO extends JpaRepository<DetalleVenta, Integer>{

}