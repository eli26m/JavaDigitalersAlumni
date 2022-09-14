package com.entidades;

import com.enumerados.ErrorBanco;
import com.enumerados.TipoCuenta;
import com.excepciones.TipoProductoExcepcion;
import com.utilidades.Formatos;

public class Cuenta extends Producto {
	private TipoCuenta tipo;

	public Cuenta() {
		setNumero(getNumeroGenerado());
	}

	public Cuenta(Integer banco, Integer sucursal, TipoCuenta tipo) throws TipoProductoExcepcion {
		super(banco, sucursal);
		setTipo(tipo);
		setNumero(getNumeroGenerado());

	}

	@Override
	public String toString() {
		return tipo.name() + " [Banco=" + Formatos.getFormato(getBanco(), "BANCO") + ", Sucursal="
				+ Formatos.getFormato(getSucursal(), "BANCO") + ", Numero="
				+ Formatos.getFormato(getNumero(), tipo.name()) + ", " + tipo.getDescripcion() + "]";
	}

	public TipoCuenta getTipo() {
		return tipo;
	}

	public void setTipo(TipoCuenta tipo) throws TipoProductoExcepcion {
		if (!tipo.isDisponible()) {
			throw new TipoProductoExcepcion(ErrorBanco.ERROR_PRODUCTO_NO_DISPONIBLE);
		}
		this.tipo = tipo;
	}
}
