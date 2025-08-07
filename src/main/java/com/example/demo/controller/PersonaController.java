package com.example.demo.controller;

import com.example.demo.dto.PersonaDto;
import com.example.demo.service.PersonaService;

public class PersonaController {

	public static void main(String[] args) {

		PersonaService personaService = new PersonaService();

		personaService.status();
		PersonaDto respuestaPersona = personaService.crearPersona("nie345", "1213", "sharon", "linares");
		personaService.imprimirPersona(respuestaPersona);
	}

}
