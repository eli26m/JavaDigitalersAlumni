package com.entidades;

import com.enumerados.TiposDocumento;

public class Documento {

	private TiposDocumento tipoDocumento;
	private Integer nroDocumento;
	
	public Documento() {
		super();
	}

	public Documento(TiposDocumento tipoDocumento2, Integer nroDocumento) {
		super();
		this.tipoDocumento = tipoDocumento2;
		this.nroDocumento = nroDocumento;
	}
	
	@Override
	public String toString() {
		return "Documento [tipo de documento = " + tipoDocumento + ", numero de documento = " + nroDocumento + "]";
	}

	public TiposDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(TiposDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public Integer getNroDocumento() {
		return nroDocumento;
	}
	
	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroDocumento == null) ? 0 : nroDocumento.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documento other = (Documento) obj;
		if (nroDocumento == null) {
			if (other.nroDocumento != null)
				return false;
		} else if (!nroDocumento.equals(other.nroDocumento))
			return false;
		if (tipoDocumento != other.tipoDocumento)
			return false;
		return true;
	}
	
}
