package com.fullstack.tarea.api;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.tarea.model.DetalleVenta;
import com.fullstack.tarea.service.IDetalleVentaService;

@RestController
@RequestMapping("/DetalleVenta")
public class DetalleVentaController {
	
	@Autowired
	private IDetalleVentaService service;
	
	@GetMapping(value = "/listar", produces = "application/json")
	public ResponseEntity<List<DetalleVenta>> listar() {		
		List<DetalleVenta> lista = new ArrayList<>();
		try {
			lista = service.listar();	
		}catch(Exception e) {
			return new ResponseEntity<List<DetalleVenta>>(lista, HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		return new ResponseEntity<List<DetalleVenta>>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value = "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DetalleVenta> listarId(@PathVariable("id") Integer id) {
		DetalleVenta DetalleVenta = new DetalleVenta();
		try {
			DetalleVenta = service.listarId(id);
		} catch (Exception e) {
			return new ResponseEntity<DetalleVenta>(DetalleVenta , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<DetalleVenta>(DetalleVenta, HttpStatus.OK);
	}

	
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> registrar(@RequestBody DetalleVenta DetalleVenta) {
		int resultado = 0;
		try {
			service.registrar(DetalleVenta);
			resultado = 1;
		} catch (Exception e) {
			return new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}



	
}