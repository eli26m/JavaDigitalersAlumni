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
	
	@Override
	public String toString() {
		return "Documento [tipo de documento = " + tipoDocumento + ", numero de documento = " + nroDocumento + "]";
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
	
}
