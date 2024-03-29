package com.entidades;

public abstract class Empleado extends Persona {

	private String fechaCargo;
	private float sueldo;
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nombre, String apellido, Documento documento, String fechaNacimiento, String fechaCargo, float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [" + super.toString() + ", fecha de cargo = " + fechaCargo + ", sueldo = " + sueldo + "]";
	}
	
	public String getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(String fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
