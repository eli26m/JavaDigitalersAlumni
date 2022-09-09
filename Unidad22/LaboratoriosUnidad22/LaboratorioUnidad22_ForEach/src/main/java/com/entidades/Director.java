package com.entidades;

public class Director extends Empleado {

	private String carrera;

	public Director() {
		super();
	}

	public Director(String nombre, String apellido, Documento documento, String fechaNacimiento, String fechaCargo, float sueldo, String carrera) {
		super(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Director [" + super.toString() + ", carrera = " + carrera + "]";
	}
	
	public String indicarTipo() {
		return "tipo = Director, nombre = " + getNombre() + ", apellido = " + getApellido() + "]";
	}
	
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	
	public void guardar() {
		System.out.println("Se ha guardado correctamente el Director");
	}

	public void eliminar() {
		System.out.println("Se ha eliminado correctamente el Director");
	}

	public void modificar() {
		System.out.println("Se ha modificado correctamente el Director");
	}
}
