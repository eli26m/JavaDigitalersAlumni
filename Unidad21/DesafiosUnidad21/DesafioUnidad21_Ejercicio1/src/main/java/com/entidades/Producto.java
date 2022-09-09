package com.entidades;

public class Producto {

	public static Float DESCUENTO = 30f;
	private String descripcion;
	private float precio;
	private long cantInventario;
	
	public Producto() {
		super();
	}

	public Producto(String descripcion, float precio, long cantInventario) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.cantInventario = cantInventario;
	}
	
	@Override
	public String toString() {
		return "Producto [descripcion = " + descripcion + ", precio = " + precio + ", cantidad = " + cantInventario + "]";
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public long getCantInventario() {
		return cantInventario;
	}
	
	public void setCantInventario(long cantInventario) {
		this.cantInventario = cantInventario;
	}
	
	public float calcularValorInventario() {
		return (precio * cantInventario);
	}
	
}
