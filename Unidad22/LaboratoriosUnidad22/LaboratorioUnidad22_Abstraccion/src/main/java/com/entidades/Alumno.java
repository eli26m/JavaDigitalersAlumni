package com.entidades;

import java.util.Arrays;

public class Alumno extends Persona {
	
	private String fechaIngreso;
	private String[] listaCursos;

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido, Documento documento, String fechaNacimiento, String fechaIngreso, String[] listaCursos) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaIngreso = fechaIngreso;
		this.listaCursos = listaCursos;
	}

	@Override
	public String toString() {
		return "Alumno [" + super.toString() + ", fecha de ingreso = " + fechaIngreso + ", lista de cursos = " + Arrays.toString(listaCursos) + "]";
	}
	
	public String indicarTipo() {
		return "tipo = Alumno, nombre = " + getNombre() + ", apellido = " + getApellido() + "]";
	}
	
	public String[] getListaCursos() {
		return listaCursos;
	}

	public void setListaCursos(String[] listaCursos) {
		this.listaCursos = listaCursos;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
}
