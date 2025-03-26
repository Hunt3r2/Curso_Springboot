package com.company.books.backend.service;

import org.springframework.http.ResponseEntity;

import com.company.books.backend.response.LibroResponseRest;

public interface ILibrosService {
	public ResponseEntity<LibroResponseRest> buscarLibros();

	public ResponseEntity<LibroResponseRest> buscarPorId(Long id);

}
