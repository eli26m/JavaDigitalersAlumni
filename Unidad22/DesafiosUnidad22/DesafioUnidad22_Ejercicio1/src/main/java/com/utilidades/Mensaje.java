package com.utilidades;

import com.entidades.Cliente;
import com.entidades.Perecederos;
import com.entidades.Producto;

public final class Mensaje {
	public static void ofertas(Cliente[] clientes, Perecederos[] perecederos) {

		for (Cliente cliente : clientes) {
			String mensaje = "Hola {nombre}: \nEsta semana tenemos las siguientes ofertas para ti:\n";
			mensaje = mensaje.replace("{nombre}", cliente.getNombre());

			for (Perecederos perecedero : perecederos) {
				if (perecedero.getDiasParaExpirar() <= 10) {
					String oferta = "\t- {descripcion_producto}, Antes: {precio} Despues: {oferta}.\n";
					oferta = oferta.replace("{descripcion_producto}", perecedero.getDescripcion());
					oferta = oferta.replace("{precio}", String.format("%.2f", perecedero.getPrecio()));
					oferta = oferta.replace("{oferta}", String.format("%.2f",(perecedero.getPrecio() - (perecedero.getPrecio() * (Producto.DESCUENTO / 100)))));
					mensaje += oferta;
				}
			}
			System.out.println(mensaje);
		}

	}
}
