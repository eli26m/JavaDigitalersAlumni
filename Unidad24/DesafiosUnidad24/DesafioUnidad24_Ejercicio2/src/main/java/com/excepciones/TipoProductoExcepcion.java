package com.excepciones;

import com.enumerados.ErrorBanco;

public class TipoProductoExcepcion extends Exception {
	
	private static final long serialVersionUID = 1L;
	private ErrorBanco errorBanco;

	public TipoProductoExcepcion(ErrorBanco errorBanco) {
		super();
		this.errorBanco = errorBanco;
	}

	@Override
	public String getMessage() {
		return errorBanco.getDescripcion();
	}
}
