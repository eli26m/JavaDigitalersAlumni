package com.entidades;

import java.util.Arrays;

public class Alumno extends Persona{

	private String cursos[];
	
	public Alumno() {
		super();
	}
	
	public Alumno(String nombre, String apellido, int edad, Documento documento, String cursos[]) {
		super(nombre, apellido, edad, documento);
		this.cursos = cursos;
	}
	
	public void setCursos(String cursos[]) {
		this.cursos = cursos;
	}
	
	@Override
	public String toString() {
		String mensaje = 	super.toString() + 
							"\nCursos: " + Arrays.toString(cursos);
		return mensaje;
	}
	
}
