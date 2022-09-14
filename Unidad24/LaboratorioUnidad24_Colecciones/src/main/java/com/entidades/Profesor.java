package com.entidades;

import java.util.Arrays;
import java.util.Date;

public class Profesor extends Empleado {

	private String[] listaCursos;

	public Profesor() {
		super();
	}

	public Profesor(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo, Float sueldo, String[] listaCursos) {
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
	
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Profesor");
	}

	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Profesor");
	}

	public void modificar() {
		System.out.println("Se ha modificado correctamente el Profesor");
	}
	
}
