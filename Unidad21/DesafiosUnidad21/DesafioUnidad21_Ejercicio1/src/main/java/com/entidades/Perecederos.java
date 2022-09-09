package com.entidades;

public class Perecederos extends Producto{

	private int diasParaExpirar;

	public Perecederos() {
		super();
	}

	public Perecederos(String descripcion, float precio, long cantInventario, int diasParaExpirar) {
		super(descripcion, precio, cantInventario);
		this.diasParaExpirar = diasParaExpirar;
	}
	
	@Override
	public String toString() {
		return "ProductoPerecedero [toString() = " + super.toString() + ", diasParaExpirar=" + diasParaExpirar + "]";
	}

	public int getDiasParaExpirar() {
		return diasParaExpirar;
	}

	public void setDiasParaExpirar(int diasParaExpirar) {
		this.diasParaExpirar = diasParaExpirar;
	}
	
	@Override
	public float calcularValorInventario() {
		if (diasParaExpirar < 10) {
			return (((getPrecio() - (getPrecio() * (DESCUENTO / 100)))  * getCantInventario()));
		} else {
			return (super.calcularValorInventario());
		}
	}
	
}
