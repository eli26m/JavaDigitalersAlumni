package com.entidades;

public class Documento {

	private String tipoDocumento;
	private int nroDocumento;
	
	public Documento() {
		super();
	}

	public Documento(String tipoDocumento, int nroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public int getNroDocumento() {
		return nroDocumento;
	}
	
	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	public String mostrarAtributos() {
		return "\nTipo de documento: " + this.getTipoDocumento() +
				"\nNumero de documento: " + this.getNroDocumento();
	}
	
}
