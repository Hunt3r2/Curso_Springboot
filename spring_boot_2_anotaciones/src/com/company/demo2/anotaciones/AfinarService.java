package com.company.demo2.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class AfinarService implements Afinar {

	@Override
	public String afinacion() {
		return "obteniendo la afinacion del instrumento";
	}

}
