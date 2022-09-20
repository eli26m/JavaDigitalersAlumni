package com.excepciones;

import java.sql.SQLException;
import java.time.LocalDateTime;

import com.entidades.Log;
import com.entidades.Producto;
import com.enumerados.ErrorBanco;
import com.implementaciones.LogImplementacion;

public class TipoProductoExcepcion extends Exception {

	private static final long serialVersionUID = 1L;
	private ErrorBanco errorBanco;

	public TipoProductoExcepcion(ErrorBanco errorBanco, Producto producto) {
		super();
		this.errorBanco = errorBanco;
		crearLogError(producto);
	}

	@Override
	public String getMessage() {
		return errorBanco.getDescripcion();
	}

	private void crearLogError(Producto producto) {

		Log log = new Log(null, LocalDateTime.now(), producto.getClass().toString(), producto.toString(),
				errorBanco.getDescripcion());

		LogImplementacion logImplementacion = new LogImplementacion();
		try {
			logImplementacion.insertar(log);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println(log);
		}

	}

}
