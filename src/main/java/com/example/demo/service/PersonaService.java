package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.PersonaDto;

public class PersonaService {

	private List<PersonaDto> personas;

	public PersonaService() {
		super();
		this.personas = new ArrayList<>();

	}

	public String status() {
		return "hola la clase PersonaService esta ok";
	}

	public void imprimirPersona(PersonaDto personaDto) {
		System.out.println(personaDto.getTipoDocumento());
		System.out.println(personaDto.getNumeroDocumento());
		System.out.println(personaDto.getNombres());
		System.out.println(personaDto.getApellidos());
		
	}

	public PersonaDto crearPersona(String tipoDocumento, String numeroDocumento, String nombres, String apellidos) {
		PersonaDto personaDto = new PersonaDto(tipoDocumento, tipoDocumento, nombres, apellidos);
		this.personas.add(personaDto);
		return personaDto;

	}

	public List<PersonaDto> conultarPersonas() {
		return personas;
	}
}
