package com.entidades;

public class Documento {

	private int tipoDocumento;
	private int nroDocumento;
	
	public Documento() {
		super();
	}

	public Documento(int tipoDocumento, int nroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public int getNroDocumento() {
		return nroDocumento;
	}
	
	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	public String obtenerTipo() {
		String tipo = "";
		
		switch(this.getTipoDocumento()) {
		case 1: tipo = "1 - Documento Nacional de Identidad (DNI)"; break;
		case 2: tipo = "2 - Libreta Civica (LC)"; break;
		case 3: tipo = "3 - Libreta de Enrolamiento (LE)"; break;
		case 4: tipo = "4 - Pasaporte (PAS)"; break;
		case 5: tipo = "5 - Cedula de Identidad (CI)"; break;
		default: break;
		}
		
		return tipo;
	}
	
	public String mostrarAtributos() {
		
		return "\nTipo de documento: " + this.obtenerTipo() +
				"\nNumero de documento: " + this.getNroDocumento();
	}
}
