package com.company.ejemplo1;

public class Guitarra implements InstrumentoMusical{
	
	private Afinar afinar;
	
	public Guitarra(Afinar afinar) {
		super();
		this.afinar = afinar;
	}

	@Override
	public String obtenerSonido() {
		return "sonido de guitarra";
	}

	@Override
	public String obtenerAfinacion() {
		return "Guitarra - " + afinar.afinacion();
	}

}
