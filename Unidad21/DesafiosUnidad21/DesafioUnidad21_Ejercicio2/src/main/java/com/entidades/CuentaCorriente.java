package com.entidades;

import com.utilidades.Formato;

public class CuentaCorriente extends Producto {

	public CuentaCorriente() {
		super();
		super.setTipo(2);
	}

	public CuentaCorriente(int banco, int sucursal) {
		super(banco, sucursal);
		super.setTipo(2);
	}
	
	@Override
	public String toString() {
		return "CC [toString[] = " + super.toString() + ", numero de producto = " +
				Formato.getFormato(getNumProducto(), getTipo()) +
				"]";
	}

}
