package com.excepciones;

import com.entidades.ErrorBanco;

public class TipoProductoExcepcion extends Exception {
	
	private static final long serialVersionUID = 1L;
	private int codigo;
	public static ErrorBanco[] errores = { new ErrorBanco(1, "Producto No disponible"),
			new ErrorBanco(2, "Producto Inexistente") };

	public TipoProductoExcepcion(int codigo) {
		super();
		this.codigo = codigo;
	}

	public String getMessage() {
		for (ErrorBanco error : errores) {
			if (codigo == error.getCodigo()) {
				return error.getDescripcion();
			}
		}
		return "Error [" + codigo + "] No Especificado contacte al administrador";
	}
}
