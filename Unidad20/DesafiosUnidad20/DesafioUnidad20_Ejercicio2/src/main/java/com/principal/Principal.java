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
			System.out.println("\nIngrese nombre de la persona " + (i + 1) + ": ");
			entrada.nextLine();
			String nombre = entrada.nextLine();
			System.out.println("Ingrese apellido de la persona " + (i + 1) + ": ");
			String apellido = entrada.nextLine();
			System.out.println("Ingrese tipo de documento de la persona " + (i + 1) + ": \n\t1 - Documento Nacional de Identidad (DNI)\n\t2 - Libreta Civica (LC)\n\t3 - Libreta de Enrolamiento (LE)\n\t4 - Pasaporte (PAS)\n\t5 - Cedula de Identidad (CI)");
			int tipoDocumento = entrada.nextInt();
			
			if ((tipoDocumento < 1) || (tipoDocumento > 5)) {
				System.out.println("Tipo de documento invalido. Vuelva a ingresar los datos con el tipo correcto.");
				i = i - 1;
				continue;
			}
			
			System.out.println("Ingrese numero de documento de la persona " + (i + 1) + ": ");
			int numeroDocumento = entrada.nextInt();
			
			Documento documento = new Documento(tipoDocumento, numeroDocumento);
			personas[i] = new Persona(nombre, apellido, documento);
		
			for (int j = 0; j < i; j++) {
				if ((personas[j].getDocumento().getTipoDocumento() == personas[i].getDocumento().getTipoDocumento()) && (personas[j].getDocumento().getNroDocumento() == personas[i].getDocumento().getNroDocumento())) {
					System.out.println("\nPersona repetida. Esta persona ya fue ingresada como Persona " + (j + 1) + ".");
					i = i - 1;
				}
			}
			
		}
		
		entrada.close();
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("\n" + personas[i].mostrarDatos());
		}
	}

}
