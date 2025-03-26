package com.company.ejemplo1;

public class Violin implements InstrumentoMusical {

	private Afinar afinar;
	
	public Violin() {
		super();
	}
	
	// dependencia por setter
	public void setAfinar(Afinar afinar) {
		this.afinar = afinar;
	}


	@Override
	public String obtenerSonido() {
		return "obteniendo sonido del violin";
	}

	@Override
	public String obtenerAfinacion() {
		return "Violin - " + afinar.afinacion();
	}

}
