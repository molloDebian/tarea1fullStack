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

import com.fullstack.tarea.model.Venta;
import com.fullstack.tarea.service.IVentaService;

@RestController
@RequestMapping("/Venta")
public class VentaController {
	
	@Autowired
	private IVentaService service;
	
	@GetMapping(value = "/listar", produces = "application/json")
	public ResponseEntity<List<Venta>> listar() {		
		List<Venta> lista = new ArrayList<>();
		try {
			lista = service.listar();	
		}catch(Exception e) {
			return new ResponseEntity<List<Venta>>(lista, HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		return new ResponseEntity<List<Venta>>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value = "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Venta> listarId(@PathVariable("id") Integer id) {
		Venta Venta = new Venta();
		try {
			Venta = service.listarId(id);
		} catch (Exception e) {
			return new ResponseEntity<Venta>(Venta , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Venta>(Venta, HttpStatus.OK);
	}

	
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> registrar(@RequestBody Venta Venta) {
		int resultado = 0;
		try {
			service.registrar(Venta);
			resultado = 1;
		} catch (Exception e) {
			return new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}


	
}