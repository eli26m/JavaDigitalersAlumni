package com.entidades;

public class Usuario {

	private String correo;
	private String clave;
	
	public Usuario() {
		super();
	}

	public Usuario(String correo, String clave) {
		super();
		this.correo = correo;
		this.clave = clave;
	}

	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getClave() {
		return clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean esUsuarioValido() {
		String dominio = "@educacionit.com";
		
		if(correo.contains(dominio)) {
			if((clave.substring(0, 1).equals(clave.substring(0, 1).toUpperCase())) && ((clave.contains("*")) || (clave.contains(".")) || (clave.contains("-")) || (clave.contains("_")))) {
				System.out.println("\nBienvenido!");
				return true;
			} else {
				System.out.println("\nClave invalida.");
				return false;
			}
		} else {
			System.out.println("\nCorreo invalido.");
			return false;
		}
	}
	
}
