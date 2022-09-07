package com.entidades;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private Documento documento;
	private boolean esMayor;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, Documento documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = (int) (Math.random()*(120-1+1)+1);
		this.esMayor = this.esMayor();
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
	
	public int getEdad() {
		return edad;
	}
	
	public boolean esMayor() {
		esMayor = (edad >= 18) ? true : false;
		return esMayor;
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
							documento.mostrarAtributos() +
							"\nEdad: " +  this.getEdad() +
							"\nEs mayor de edad: " + (this.esMayor() ? "SI" : "NO");
		return mensaje;
	}
	
}
