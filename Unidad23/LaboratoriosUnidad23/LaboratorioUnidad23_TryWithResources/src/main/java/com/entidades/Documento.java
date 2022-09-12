package com.entidades;

public class Documento {

	private String tipoDocumento;
	private Integer nroDocumento;
	
	public Documento() {
		super();
	}

	public Documento(String tipoDocumento, Integer nroDocumento) {
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
	
	public Integer getNroDocumento() {
		return nroDocumento;
	}
	
	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
}
