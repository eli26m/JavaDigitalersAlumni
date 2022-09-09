package com.entidades;

import com.utilidades.Formato;

public class TarjetaCredito extends Producto {
	private Integer codigoSeguridad;

	public TarjetaCredito() {
		setNumero(getNumeroGenerado());
	}

	public TarjetaCredito(Integer banco, Integer sucursal, Integer codigoSeguridad) {
		super(banco, sucursal);
		this.codigoSeguridad = codigoSeguridad;
		setNumero(getNumeroGenerado());
	}

	@Override
	public String toString() {
		return "TarjetaCredito [Banco=" + Formato.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formato.getFormato(getSucursal(), "BANCO") + ", Numero=" + Formato.getFormato(getNumero(), "TC")
				+ ", Codigo de Seguridad=" + Formato.getFormato(getCodigoSeguridad(), "CS") + "]";
	}

	public Integer getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(Integer codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

}