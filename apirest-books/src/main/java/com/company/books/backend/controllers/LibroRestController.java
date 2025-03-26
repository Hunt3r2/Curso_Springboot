package com.company.books.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.books.backend.response.CategoriaResponseRest;
import com.company.books.backend.response.LibroResponseRest;
import com.company.books.backend.service.ILibrosService;

@RestController
@RequestMapping("/v1")
public class LibroRestController {
	
	@Autowired
	private ILibrosService service;

	@GetMapping("/libros")
	public ResponseEntity<LibroResponseRest> consultaLibros() {
		ResponseEntity<LibroResponseRest> response = service.buscarLibros();
		return response;
	}
	
	@GetMapping("/libros/{id}")
	public ResponseEntity<LibroResponseRest> consultaPorId(@PathVariable Long id) {
	
		ResponseEntity<LibroResponseRest> response = service.buscarPorId(id);
		return response;
	}
}
