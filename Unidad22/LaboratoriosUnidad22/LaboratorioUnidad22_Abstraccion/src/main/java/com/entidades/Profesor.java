package com.entidades;

import java.util.Arrays;

public class Profesor extends Empleado {

	private String[] listaCursos;

	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellido, Documento documento, String fechaNacimiento, String fechaCargo, float sueldo, String[] listaCursos) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.listaCursos = listaCursos;
	}
	
	@Override
	public String toString() {
		return "Profesor [" + super.toString() + ", lista de cursos = " + Arrays.toString(listaCursos) + "]";
	}
	
	public String indicarTipo() {
		return "tipo = Profesor, nombre = " + getNombre() + ", apellido = " + getApellido() + "]";
	}

	public String[] getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(String[] listaCursos) {
		this.listaCursos = listaCursos;
	}
	
}
