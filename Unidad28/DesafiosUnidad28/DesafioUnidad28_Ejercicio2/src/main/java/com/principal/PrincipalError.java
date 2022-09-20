package com.principal;

import com.entidades.TarjetaCredito;
import com.enumerados.ErrorBanco;
import com.excepciones.TipoProductoExcepcion;

public class PrincipalError {
	public static void main(String[] args) {
		try {

			TarjetaCredito tarjetaCredito = new TarjetaCredito(120, 1, 256);
			throw new TipoProductoExcepcion(ErrorBanco.ERROR_DESCONOCIDO, tarjetaCredito);
		} catch (TipoProductoExcepcion e) {
			e.printStackTrace();
		}
	}
}
