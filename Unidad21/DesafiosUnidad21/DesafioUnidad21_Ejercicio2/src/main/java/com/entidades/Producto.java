package com.entidades;

public class Producto {

	private static long numProducto = 0;
	private static int tipo = 0;
	
	private int banco;
	private int sucursal;
	
	public Producto() {
		super();
		numProducto++;
	}
	
	public Producto(int banco, int sucursal) {
		super();
		this.banco = banco;
		this.sucursal = sucursal;
		numProducto++;
	}
	
	@Override
	public String toString() {
		return "Producto [banco = " + banco + ", sucursal = " + sucursal + "]";
	}
	
	public int getBanco() {
		return banco;
	}
	
	public void setBanco(int banco) {
		this.banco = banco;
	}
	
	public int getSucursal() {
		return sucursal;
	}
	
	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}
	
	public long getNumProducto() {
		return numProducto;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public static void setTipo(int tipo) {
		Producto.tipo = tipo;
	}
}
