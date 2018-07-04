package com.fullstack.tarea.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.tarea.model.Producto;



@Repository
public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}