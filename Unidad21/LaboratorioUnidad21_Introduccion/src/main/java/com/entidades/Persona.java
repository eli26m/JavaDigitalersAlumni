package com.entidades;

public class Persona {

	public static int contador = 0;
	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private Documento documento;
	private boolean esMayor;
	
	public Persona() {
		super();
		contador++;
		this.id = contador;
	}
	
	public Persona(String nombre, String apellido, int edad, Documento documento) {
		super();
		contador++;
		this.id = contador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.edad = edad;
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
	
	public void setEdad(int edad) {
		this.edad = edad;
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
	
	public int getId() {
		return id;
	}

	public String mostrarDatos() {
		String mensaje = 	"Id: " + this.getId() +
							"\nNombre: " + this.getNombre() + 
							"\nApellido: " + this.getApellido() +
							documento.mostrarAtributos() +
							"\nEdad: " +  this.getEdad() +
							"\nEs mayor de edad: " + (this.esMayor() ? "SI" : "NO");
		return mensaje;
	}
	
}
