package com.comparadores;

import java.util.Comparator;

import com.entidades.Persona;

public class OrdenEdadDesc implements Comparator<Persona> {

	@Override
	public int compare(Persona persona1, Persona persona2) {
		return persona1.getFechaNacimiento().compareTo(persona2.getFechaNacimiento());
	}

}
