package com.entidades;

import java.util.Arrays;
import java.util.Date;

public class Alumno extends Persona {
	
	private Date fechaIngreso;
	private String[] listaCursos;

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaIngreso, String[] listaCursos) {
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

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public void guardar() {
		System.out.println("Se ha guardado correctamente el Alumno");
	}

	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Alumno");
	}

	public void modificar() {
		System.out.println("Se ha modificado correctamente el Alumno");
	}
	
}
