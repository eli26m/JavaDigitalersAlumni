package com.principal;

import com.entidades.Cliente;
import com.entidades.Perecederos;
import com.utilidades.Mensaje;

public class Principal {

	public static void main(String[] args) {
		
		Cliente[] clientes = new Cliente[3];
		Perecederos[] perecederos = new Perecederos[10];
		
		clientes[0] = new Cliente(1L, "Octavio", "Robleto", 26548965);
		clientes[1] = new Cliente(2L, "Mariana", "Bracho", 36251478);
		clientes[2] = new Cliente(3L, "Pedro", "Montesino", 36958654);

		perecederos[0] = new Perecederos(1L, "Leche", 5.6f, 10, 5);
		perecederos[1] = new Perecederos(2L, "Queso", 7.6f, 11, 10);
		perecederos[2] = new Perecederos(3L, "Panceta", 6.6f, 2, 51);
		perecederos[3] = new Perecederos(4L, "Jamon", 54.6f, 4, 15);
		perecederos[4] = new Perecederos(5L, "Atun", 57.6f, 10, 2);
		perecederos[5] = new Perecederos(6L, "Bife de Chorizo", 52.6f, 9, 8);
		perecederos[6] = new Perecederos(7L, "Tomate", 8.6f, 8, 11);
		perecederos[7] = new Perecederos(8L, "Cebolla", 596.6f, 25, 8);
		perecederos[8] = new Perecederos(9L, "Queso Crema", 51.6f, 98, 96);
		perecederos[9] = new Perecederos(10L, "Hamburguesa", 15.6f, 11, 4);

		Mensaje.ofertas(clientes, perecederos);
	}

}
