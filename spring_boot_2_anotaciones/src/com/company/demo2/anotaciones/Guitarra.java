package com.company.demo2.anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Guitarra implements InstrumentoMusical {

	@Autowired
	private Afinar afinar;
	
	@Override
	public String obtenerSonido() {
		return "Obteniendo sonido de la guitarra";
	}

	@Override
	public String obtenerAfinacion() {
		return "Guitarra - " + afinar.afinacion();
	}

}
