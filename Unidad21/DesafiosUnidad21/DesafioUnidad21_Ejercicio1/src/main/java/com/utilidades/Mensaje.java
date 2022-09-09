package com.utilidades;

import com.entidades.Cliente;
import com.entidades.Perecederos;
import com.entidades.Producto;

public class Mensaje {

	public static void ofertas(Cliente[] clientes, Perecederos[] productos) {

		for (int i = 0; i < clientes.length; i++) {
			String mensaje = "Hola {nombre}: \nEsta semana tenemos las siguientes ofertas para ti:\n";
			mensaje = mensaje.replace("{nombre}", clientes[i].getNombre());

			for (int j = 0; j < productos.length; j++) {
				if (productos[j].getDiasParaExpirar() <= 10) {
					String oferta = "\t- {descripcion_producto}, Antes: {precio} Despues: {oferta}.\n";
					oferta = oferta.replace("{descripcion_producto}", productos[j].getDescripcion());
					oferta = oferta.replace("{precio}", String.format("%.2f", productos[j].getPrecio()));
					oferta = oferta.replace("{oferta}", String.format("%.2f",(productos[j].getPrecio() - (productos[j].getPrecio() * (Producto.DESCUENTO / 100)))));
					mensaje += oferta;
				}
			}
			System.out.println(mensaje);
		}

	}
	
}
