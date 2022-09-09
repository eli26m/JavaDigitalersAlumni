package com.entidades;

public class Administrativo extends Empleado {

	public Administrativo() {
		super();
	}

	public Administrativo(String nombre, String apellido, Documento documento, String fechaNacimiento, String fechaCargo, float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
	}

	@Override
	public String toString() {
		return "Administrativo [" + super.toString() + "]";
	}
	
	public String indicarTipo() {
		return "tipo = Administrativo, nombre = " + getNombre() + ", apellido = " + getApellido() + "]";
	}
	
}
