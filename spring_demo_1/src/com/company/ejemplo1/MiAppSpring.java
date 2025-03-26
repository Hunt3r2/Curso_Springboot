package com.company.ejemplo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAppSpring {

	public static void main(String[] args) {
		
		//cargar configuracion de Spring desde un archivo xml
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		InstrumentoMusical instrumento = context.getBean("miInstrumento", InstrumentoMusical.class);
		
		System.out.println(instrumento.obtenerSonido());
		
		System.out.println(instrumento.obtenerAfinacion());
		
		Violin violin = context.getBean("miViolin", Violin.class);
		
		System.out.println(violin.obtenerSonido());
		System.out.println(violin.obtenerAfinacion());
		
		context.close();

	}

}
