package com;

import java.util.Scanner;

import com.entidades.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		do {
			System.out.println("\nIngrese correo: ");
			usuario.setCorreo(entrada.nextLine());
			System.out.println("Ingrese la clave: ");
			usuario.setClave(entrada.nextLine());
		} while (!usuario.esUsuarioValido());
			
		entrada.close();

	}

}
