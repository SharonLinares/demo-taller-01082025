package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.PersonaDto;
import com.example.demo.service.PruebaMetodos;

public class PruebaController {

	public static void main(String[] args) {

		PruebaMetodos pruebaMetodos = new PruebaMetodos();

		pruebaMetodos.imprimiendoMensaje();

		pruebaMetodos.saludando("sharon");

		String mensaje = pruebaMetodos.retornandoMensaje();

		System.out.println(mensaje);

		int resultadoSuma = pruebaMetodos.suma(2, 3);
		System.out.println("este es el resultado de la suma: " + resultadoSuma);

		PersonaDto persona = pruebaMetodos.crearPersona("12er", "567", "robin");
		System.out.println(persona.getTipoDocumento());
		System.out.println(persona.getNumeroDocumento());
		System.out.println(persona.getNombres());
		System.out.println();
		System.out.println("*******creando y recorriendo persona******");

		PersonaDto persona1 = new PersonaDto();

		persona1.setTipoDocumento("nie");
		persona1.setNumeroDocumento("123ed");
		persona1.setNombres("diego");

		List<PersonaDto> lista = pruebaMetodos.llenarLista(persona1);

		for (PersonaDto personaDto : lista) {
			System.out.println(personaDto.getTipoDocumento());
			System.out.println(personaDto.getNumeroDocumento());
			System.out.println(personaDto.getNombres());
		}

	}

}
