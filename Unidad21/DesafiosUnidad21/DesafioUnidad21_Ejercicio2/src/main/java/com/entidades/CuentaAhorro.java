package com.entidades;

import com.utilidades.Formato;

public class CuentaAhorro extends Producto {

	public CuentaAhorro() {
		super();
		super.setTipo(1);
	}

	public CuentaAhorro(int banco, int sucursal) {
		super(banco, sucursal);
		super.setTipo(1);
	}
	
	@Override
	public String toString() {
		return "CA [toString[] = " + super.toString() + ", numero de producto = " +
				Formato.getFormato(getNumProducto(), getTipo()) +
				"]";
	}
	
}
