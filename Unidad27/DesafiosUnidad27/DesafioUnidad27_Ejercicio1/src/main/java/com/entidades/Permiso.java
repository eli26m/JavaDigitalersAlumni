package com.entidades;

public class Permiso {
	private String usuario;
	private String modulo;
	private boolean activo;

	public Permiso() {
		super();
	}

	public Permiso(String usuario, String modulo, boolean activo) {
		super();
		this.usuario = usuario;
		this.modulo = modulo;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Permiso [usuario=" + usuario + ", modulo=" + modulo + ", activo=" + activo + "]";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

}
