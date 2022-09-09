package com.entidades;

public class NoPerecededos extends Producto{

	public NoPerecededos() {
		super();
	}

	public NoPerecededos(String descripcion, float precio, long cantInventario) {
		super(descripcion, precio, cantInventario);
	}
	
	@Override
	public String toString() {
		return "ProductoNoPerecedero [toString() = " + super.toString() + "]";
	}
}
