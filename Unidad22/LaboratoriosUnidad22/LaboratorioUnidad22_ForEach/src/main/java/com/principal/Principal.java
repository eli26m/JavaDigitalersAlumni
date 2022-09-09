package com.principal;

import java.util.Scanner;

import com.entidades.Administrativo;
import com.entidades.Alumno;
import com.entidades.Director;
import com.entidades.Documento;
import com.entidades.Persona;
import com.entidades.Profesor;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Persona[] personas;
		System.out.println("Ingrese cuantas personas ingresara: ");
		int cantPersonas = entrada.nextInt();
		personas = new Persona[cantPersonas];
		String nombre;
		String apellido;
		String tipoDocumento;
		int nroDocumento;
		String fechaNacimiento;
		String fechaCargo;
		int cantCursos;
		String[] listaCursos;
		String carrera;
		float sueldo;
		
		for(int i = 0; i < personas.length; i++) {
			System.out.println("\nIngrese tipo de Persona:\n\t1 - Alumno\n\t2 - Director\n\t3 - Profesor\n\t4 - Administrativo");
			int tipoPersona = entrada.nextInt();
			
			entrada.nextLine();
			System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
			nombre = entrada.nextLine();
			System.out.println("Ingrese el apellido de la persona " + (i + 1) + ":");
			apellido = entrada.nextLine();
			System.out.println("Ingrese el tipo de documento de la persona " + (i + 1) + ":");
			tipoDocumento = entrada.nextLine();
			System.out.println("Ingrese el numero de documento de la persona " + (i + 1) + ":");
			nroDocumento = entrada.nextInt();
			Documento documento = new Documento(tipoDocumento, nroDocumento);
			entrada.nextLine();
			System.out.println("Ingrese la fecha de nacimiento de la persona " + (i + 1) + " (DD/MM/AAAA):");
			fechaNacimiento = entrada.nextLine();
			switch(tipoPersona) {
			case 1:
				System.out.println("Ingrese la fecha de ingreso de la persona " + (i + 1) + " (DD/MM/AAAA):");
				String fechaIngreso = entrada.nextLine();
				
				System.out.println("Ingrese cuantos cursos ingresara para la persona " + (i + 1) + ":");
				cantCursos = entrada.nextInt();
				listaCursos = new String[cantCursos];
				entrada.nextLine();
				for (int j = 0; j < listaCursos.length; j++) {
					System.out.println("Ingrese curso " + (j + 1) + " de la persona " + (i + 1) + ":");
					listaCursos[j] = entrada.nextLine();
				}
				
				personas[i] = new Alumno(nombre, apellido, documento, fechaNacimiento, fechaIngreso, listaCursos);
				break;
			case 2:
				System.out.println("Ingrese la fecha del cargo de la persona " + (i + 1) + " (DD/MM/AAAA):");
				fechaCargo = entrada.nextLine();
				System.out.println("Ingrese el sueldo de la persona " + (i + 1) + ":");
				sueldo = entrada.nextFloat();
				System.out.println("Ingrese la carrera de la persona " + (i + 1) + " (DD/MM/AAAA):");
				carrera = entrada.nextLine();
				
				personas[i] = new Director(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo, carrera);
				break;
			case 3:
				System.out.println("Ingrese la fecha del cargo de la persona " + (i + 1) + " (DD/MM/AAAA):");
				fechaCargo = entrada.nextLine();
				System.out.println("Ingrese el sueldo de la persona " + (i + 1) + ":");
				sueldo = entrada.nextFloat();
					
				System.out.println("Ingrese cuantos cursos ingresara para la persona " + (i + 1) + ":");
				cantCursos = entrada.nextInt();
				listaCursos = new String[cantCursos];
				entrada.nextLine();
				for (int j = 0; j < listaCursos.length; j++) {
					System.out.println("Ingrese curso " + (j + 1) + " de la persona " + (i + 1) + ":");
					listaCursos[j] = entrada.nextLine();
				}
				
				personas[i] = new Profesor(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo, listaCursos);
				break;
			case 4:
				System.out.println("Ingrese la fecha del cargo de la persona " + (i + 1) + " (DD/MM/AAAA):");
				fechaCargo = entrada.nextLine();
				System.out.println("Ingrese el sueldo de la persona " + (i + 1) + ":");
				sueldo = entrada.nextFloat();
				
				personas[i] = new Administrativo(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
				break;
			default: break;
			}
		}
		
		entrada.close();
		
		for (Persona persona : personas) {
			System.out.println();
			System.out.println(persona.indicarTipo());
			System.out.println(persona.toString());
		}
		
	}

}
