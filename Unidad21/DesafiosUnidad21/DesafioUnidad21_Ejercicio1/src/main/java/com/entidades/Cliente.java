package com.entidades;

public class Cliente {

	private String nombre;
	private String apellido;
	private int documento;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, int documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	
	@Override
	public String toString() {
		return "\nCliente [nombre = " + nombre + ", apellido = " + apellido + ", documento = " + documento + "]";
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getDocumento() {
		return documento;
	}
	
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	
}
