package com.principal;

import java.util.Scanner;

import com.entidades.Documento;
import com.entidades.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Persona personas[];
		System.out.println("Cuantas personas ingresara?: ");
		int cantidadPersonas = entrada.nextInt();
		personas = new Persona[cantidadPersonas];
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("\nIngrese Nombre de la persona " + (i + 1) + ": ");
			entrada.nextLine();
			String nombre = entrada.nextLine();
			System.out.println("Ingrese Apellido de la persona " + (i + 1) + ": ");
			String apellido = entrada.nextLine();
			System.out.println("Ingrese tipo de documento de la persona " + (i + 1) + ": ");
			String tipoDocumento = entrada.nextLine();
			System.out.println("Ingrese numero de documento de la persona " + (i + 1) + ": ");
			int numeroDocumento = entrada.nextInt();
			
			Documento documento = new Documento(tipoDocumento, numeroDocumento);
			personas[i] = new Persona(nombre, apellido, documento);
		
		}
		
		entrada.close();
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("\n" + personas[i].mostrarDatos());
		}
	}

}
