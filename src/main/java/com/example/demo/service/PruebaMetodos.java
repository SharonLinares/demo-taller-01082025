package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.PersonaDto;

public class PruebaMetodos {

	private List<PersonaDto> personas;

	public PruebaMetodos() {
		super();
		this.personas = new ArrayList<>();
	}

	public void imprimiendoMensaje() {
		System.out.println("prueba metodo 1, no retorna no recibe");
	}

	public void saludando(String nombre) {
		System.out.println("saludando a la persona: " + nombre);
	}

	public String retornandoMensaje() {
		return "pronando metodo 3";
	}

	public int suma(int num1, int num2) {
		return num1 + num2;
	}

	public PersonaDto crearPersona(String tipoDocumento, String numeroDocumento, String nombres) {
		PersonaDto personaDto = new PersonaDto();
		personaDto.setTipoDocumento(tipoDocumento);
		personaDto.setNumeroDocumento(numeroDocumento);
		personaDto.setNombres(nombres);
		return personaDto;

	}

	public List<PersonaDto> llenarLista(PersonaDto personaDto) {
		this.personas.add(personaDto);
		return personas;
	}
	
	
	

}
