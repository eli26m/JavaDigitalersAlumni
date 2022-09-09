package com.entidades;

import com.utilidades.Formato;

public class TarjetaCredito extends Producto {

	private int claveSeguridad;
	
	public TarjetaCredito() {
		super();
		super.setTipo(3);
	}

	public TarjetaCredito(int banco, int sucursal, int claveSeguridad) {
		super(banco, sucursal);
		this.claveSeguridad = claveSeguridad;
		super.setTipo(3);
	}

	public int getClaveSeguridad() {
		return claveSeguridad;
	}

	public void setClaveSeguridad(int claveSeguridad) {
		this.claveSeguridad = claveSeguridad;
	}
	
	@Override
	public String toString() {
		return "TC [toString[] = " + super.toString() + ", numero de producto = " +
				Formato.getFormato(getNumProducto(), getTipo()) +
				", clave de seguridad = " + getClaveSeguridad() +
				"]";
	}
	
}
