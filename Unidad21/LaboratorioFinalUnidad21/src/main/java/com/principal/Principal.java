package com.principal;

import java.util.Scanner;

import com.entidades.Alumno;
import com.entidades.Documento;
import com.entidades.Persona;

public class Principal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Cuantos alumnos ingresara?: ");
		int cantidadAlumnos = entrada.nextInt();
		Alumno alumnos[] = new Alumno[cantidadAlumnos];
		entrada.nextLine();
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("\nIngrese Nombre del alumno " + (i + 1) + ": ");
			String nombre = entrada.nextLine();
			System.out.println("Ingrese Apellido del alumno " + (i + 1) + ": ");
			String apellido = entrada.nextLine();
			System.out.println("Ingrese tipo de documento del alumno " + (i + 1) + ": ");
			String tipoDocumento = entrada.nextLine();
			System.out.println("Ingrese numero de documento del alumno " + (i + 1) + ": ");
			int numeroDocumento = entrada.nextInt();
			System.out.println("Ingrese la edad del alumno " + (i + 1) + ": ");
			int edad = entrada.nextInt();
			
			System.out.println("\nIngrese cuantos cursos ingresara para el alumno " + (i + 1) + ": ");
			int cantidadCursos = entrada.nextInt();
			String cursos[] = new String[cantidadCursos];
			entrada.nextLine();
			for (int j = 0; j < cursos.length; j++) {
				System.out.println("Ingrese curso " + (j + 1) + ": ");
				cursos[j] = entrada.nextLine();
			}
			
			Documento documento = new Documento(tipoDocumento, numeroDocumento);
			alumnos[i] = new Alumno(nombre, apellido, edad, documento, cursos);
		
		}
		
		entrada.close();
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("\n" + alumnos[i].toString());
		}
		
		System.out.println("\nNumero de alumnos ingresado: " + Persona.contador);
	}

}
