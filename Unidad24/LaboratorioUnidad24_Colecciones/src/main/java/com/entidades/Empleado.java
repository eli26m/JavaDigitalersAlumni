package com.entidades;

import java.util.Date;

public abstract class Empleado extends Persona {

	private Date fechaCargo;
	private Float sueldo;
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nombre, String apellido, Documento documento, Date fechaNacimiento, Date fechaCargo, Float sueldo) {
		super(nombre, apellido, documento, fechaNacimiento);
		this.fechaCargo = fechaCargo;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [" + super.toString() + ", fecha de cargo = " + fechaCargo + ", sueldo = " + sueldo + "]";
	}
	
	public Date getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(Date fechaCargo) {
		this.fechaCargo = fechaCargo;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

}
