package com.entidades;

public class NoPerecederos extends Producto{
	
	
	public NoPerecederos() {
		super();
	}

	public NoPerecederos(Long id, String descripcion, float precio, long cantInventario) {
		super(id, descripcion, precio, cantInventario);
	}

	@Override
	public String toString() {
		return "ProductoNoPerecedero [toString() = " + super.toString() + "]";
	}

	public float calcularValorInventario() {
		return (getPrecio() * getCantInventario());
	}
	
}
