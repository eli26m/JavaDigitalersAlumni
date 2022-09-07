package com.entidades;

public class Persona {

	private String nombre;
	private String apellido;
	private Documento documento;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, Documento documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
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
	
	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String mostrarDatos() {
		String mensaje = 	"Nombre: " + this.getNombre() + 
							"\nApellido: " + this.getApellido() +
							documento.mostrarAtributos();
		return mensaje;
	}
	
}
