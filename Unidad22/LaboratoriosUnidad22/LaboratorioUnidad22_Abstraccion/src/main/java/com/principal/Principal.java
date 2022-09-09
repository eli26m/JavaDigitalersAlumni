package com.principal;

import java.util.Scanner;

import com.entidades.Alumno;
import com.entidades.Documento;
import com.entidades.Profesor;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Alumno[] alumnos;
		Profesor[] profesores;
		
		// Carga de alumnos:
		System.out.println("Ingrese cuantos alumnos ingresara: ");
		int cantAlumnos = entrada.nextInt();
		alumnos = new Alumno[cantAlumnos];
		
		entrada.nextLine();
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("\nIngrese el nombre del alumno " + (i + 1) + ":");
			String nombre = entrada.nextLine();
			System.out.println("Ingrese el apellido del alumno " + (i + 1) + ":");
			String apellido = entrada.nextLine();
			System.out.println("Ingrese el tipo de documento del alumno " + (i + 1) + ":");
			String tipoDocumento = entrada.nextLine();
			System.out.println("Ingrese el numero de documento del alumno " + (i + 1) + ":");
			int nroDocumento = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Ingrese la fecha de nacimiento del alumno " + (i + 1) + " (DD/MM/AAAA):");
			String fechaNacimiento = entrada.nextLine();
			System.out.println("Ingrese la fecha de ingreso del alumno " + (i + 1) + " (DD/MM/AAAA):");
			String fechaIngreso = entrada.nextLine();
			
			System.out.println("Ingrese cuantos cursos ingresara para el alumno " + (i + 1) + ":");
			int cantCursos = entrada.nextInt();
			String[] listaCursos = new String[cantCursos];
			entrada.nextLine();
			for (int j = 0; j < listaCursos.length; j++) {
				System.out.println("Ingrese curso " + (j + 1) + " del alumno " + (i + 1) + ":");
				listaCursos[j] = entrada.nextLine();
			}
			
			Documento documento = new Documento(tipoDocumento, nroDocumento);
			alumnos[i] = new Alumno(nombre, apellido, documento, fechaNacimiento, fechaIngreso, listaCursos);
		}
		
		// Carga de profesores:
			System.out.println("\nIngrese cuantos profesores ingresara: ");
			int cantProfesores = entrada.nextInt();
			profesores = new Profesor[cantProfesores];
				
			entrada.nextLine();
			for (int i = 0; i < profesores.length; i++) {
				System.out.println("\nIngrese el nombre del profesor " + (i + 1) + ":");
				String nombre = entrada.nextLine();
				System.out.println("Ingrese el apellido del profesor " + (i + 1) + ":");
				String apellido = entrada.nextLine();
				System.out.println("Ingrese el tipo de documento del profesor " + (i + 1) + ":");
				String tipoDocumento = entrada.nextLine();
				System.out.println("Ingrese el numero de documento del profesor " + (i + 1) + ":");
				int nroDocumento = entrada.nextInt();
				entrada.nextLine();
				System.out.println("Ingrese la fecha de nacimiento del profesor " + (i + 1) + " (DD/MM/AAAA):");
				String fechaNacimiento = entrada.nextLine();
				System.out.println("Ingrese la fecha del cargo del profesor " + (i + 1) + " (DD/MM/AAAA):");
				String fechaCargo = entrada.nextLine();
				System.out.println("Ingrese el sueldo del profesor " + (i + 1) + ":");
				float sueldo = entrada.nextFloat();
					
				System.out.println("Ingrese cuantos cursos ingresara para el profesor " + (i + 1) + ":");
				int cantCursos = entrada.nextInt();
				String[] listaCursos = new String[cantCursos];
				entrada.nextLine();
				for (int j = 0; j < listaCursos.length; j++) {
					System.out.println("Ingrese curso " + (j + 1) + " del profesor " + (i + 1) + ":");
					listaCursos[j] = entrada.nextLine();
			}
					
				Documento documento = new Documento(tipoDocumento, nroDocumento);
				profesores[i] = new Profesor(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo, listaCursos);
		}
		
		entrada.close();
		
		System.out.println("\nALUMNOS:");
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i].toString());
		}
		
		System.out.println("\nPROFESORES:");
		for (int i = 0; i < profesores.length; i++) {
			System.out.println(profesores[i].toString());
		}
		
	}

}
