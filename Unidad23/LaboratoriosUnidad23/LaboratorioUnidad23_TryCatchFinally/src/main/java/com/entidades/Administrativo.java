package com.entidades;

import java.sql.Date;

public class Administrativo extends Empleado {

	public Administrativo() {
		super();
	}

	public Administrativo(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo, float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
	}

	@Override
	public String toString() {
		return "Administrativo [" + super.toString() + "]";
	}
	
	public String indicarTipo() {
		return "tipo = Administrativo, nombre = " + getNombre() + ", apellido = " + getApellido() + "]";
	}
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Administrativo");
	}

	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Administrativo");
	}

	public void modificar() {
		System.out.println("Se ha modificado correctamente el Administrativo");
	}
}
