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

import com.fullstack.tarea.model.Producto;
import com.fullstack.tarea.service.IProductoService;

@RestController
@RequestMapping("/Producto")
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping(value = "/listar", produces = "application/json")
	public ResponseEntity<List<Producto>> listar() {		
		List<Producto> lista = new ArrayList<>();
		try {
			lista = service.listar();	
		}catch(Exception e) {
			return new ResponseEntity<List<Producto>>(lista, HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		return new ResponseEntity<List<Producto>>(lista, HttpStatus.OK);
	}
	
	@GetMapping(value = "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> listarId(@PathVariable("id") Integer id) {
		Producto Producto = new Producto();
		try {
			Producto = service.listarId(id);
		} catch (Exception e) {
			return new ResponseEntity<Producto>(Producto , HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<Producto>(Producto, HttpStatus.OK);
	}

	
	@PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> registrar(@RequestBody Producto Producto) {
		int resultado = 0;
		try {
			service.registrar(Producto);
			resultado = 1;
		} catch (Exception e) {
			return new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}

	@PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Producto Producto) {
		int resultado = 0;
		try {
			service.modificar(Producto);
			resultado = 1;
		} catch (Exception e) {
			return new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}

	@DeleteMapping(value = "/eliminar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> eliminar(@PathVariable Integer id) {
		int resultado = 0;
		try {
			service.eliminar(id);
			resultado = 1;
		} catch (Exception e) {
			return new ResponseEntity<Integer>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return new ResponseEntity<Integer>(resultado, HttpStatus.OK);
	}
	
}