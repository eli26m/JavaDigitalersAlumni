package com.principal;

import java.util.ArrayList;
import java.util.List;

import com.comparadores.OrdenProductoNumeroDesc;
import com.entidades.Cuenta;
import com.entidades.Producto;
import com.entidades.TarjetaCredito;
import com.enumerados.ErrorBanco;
import com.enumerados.TipoCuenta;
import com.excepciones.TipoProductoExcepcion;

public class Principal {
	
	public static void main(String[] args) throws TipoProductoExcepcion {

		List<Producto> productosCliente;
		productosCliente = new ArrayList<>();
		try {

			productosCliente.add(new Cuenta(15, 2, TipoCuenta.CC));
			productosCliente.add(new Cuenta(14, 3, TipoCuenta.CC));
			productosCliente.add(new Cuenta(16, 4, TipoCuenta.CC));
			productosCliente.add(new Cuenta(105, 42, TipoCuenta.CA));
			productosCliente.add(new Cuenta(150, 33, TipoCuenta.CA));
			productosCliente.add(new Cuenta(125, 9, TipoCuenta.CA));
			productosCliente.add(new TarjetaCredito(2, 15, 8));
			productosCliente.add(new TarjetaCredito(65, 52, 9));
			productosCliente.add(new TarjetaCredito(87, 74, 89));

			System.out.println("Antes de ordenar:");
			System.out.println();
			for (Producto producto : productosCliente) {
				System.out.println(producto);
			}

			productosCliente.sort(new OrdenProductoNumeroDesc());

			System.out.println();
			System.out.println("Despues de ordenar:");
			System.out.println();
			for (Producto producto : productosCliente) {
				System.out.println(producto);
			}

		} catch (Exception e) {
			throw new TipoProductoExcepcion(ErrorBanco.ERROR_PRODUCTO_INEXISTENTE);
		}

	}
	
}
