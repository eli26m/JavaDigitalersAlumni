package com.entidades;

import com.utilidades.Formato;

public class Cuenta extends Producto {
	private String tipo;

	public Cuenta() {
		setNumero(getNumeroGenerado());
	}

	public Cuenta(Integer banco, Integer sucursal, String tipo) {
		super(banco, sucursal);
		this.tipo = tipo;
		setNumero(getNumeroGenerado());

	}

	@Override
	public String toString() {
		return "Cuenta [Banco=" + Formato.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formato.getFormato(getSucursal(), "BANCO") + ", Numero=" + Formato.getFormato(getNumero(), tipo)
				+ ", Tipo=" + tipo + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

}