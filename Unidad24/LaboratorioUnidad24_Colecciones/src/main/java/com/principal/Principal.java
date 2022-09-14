package com.principal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.comparadores.OrdenDocumento;
import com.entidades.Administrativo;
import com.entidades.Alumno;
import com.entidades.Director;
import com.entidades.Documento;
import com.entidades.Persona;
import com.entidades.Profesor;
import com.enumerados.TiposDocumento;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Set<Persona> personas = new HashSet<>();
		List<Persona> listaPersonas = new ArrayList<>();

		
		System.out.println("Ingrese cuantas personas ingresara: ");
		int cantPersonas = entrada.nextInt();
		
		for(int i = 0; i < cantPersonas; i++) {
			
			String nombre;
			String apellido;
			TiposDocumento tipoDocumento;
			Integer nroDocumento;
			Date fechaNacimiento;
			Date fechaCargo;
			int cantCursos = 0;
			String carrera;
			Float sueldo;
			
			Persona persona = null;
			
			
			System.out.println("\nIngrese tipo de Persona:\n\t1 - Alumno\n\t2 - Director\n\t3 - Profesor\n\t4 - Administrativo");
			int tipoPersona = entrada.nextInt();
			
			entrada.nextLine();
			System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
			nombre = entrada.nextLine();
			System.out.println("Ingrese el apellido de la persona " + (i + 1) + ":");
			apellido = entrada.nextLine();
			
			while (true) {
				System.out.print("Ingrese el Tipo de Documento de la persona " + (i + 1) + ": ");

				try {
					tipoDocumento = TiposDocumento.valueOf(entrada.next().toUpperCase());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
			
			System.out.println("Ingrese el numero de documento de la persona " + (i + 1) + ":");
			nroDocumento = entrada.nextInt();
			Documento documento = new Documento(tipoDocumento, nroDocumento);
			System.out.println("Ingrese la fecha de nacimiento de la persona " + (i + 1));
			fechaNacimiento = obtenerFecha();
			switch(tipoPersona) {
			case 1:
				System.out.println("Ingrese la fecha de ingreso de la persona " + (i + 1));
				Date fechaIngreso = obtenerFecha();
				
				System.out.println("Ingrese cuantos cursos ingresara para la persona " + (i + 1) + ":");
				cantCursos = entrada.nextInt();
				
				persona = new Alumno(nombre, apellido, documento, fechaNacimiento, fechaIngreso, agregarCursos(cantCursos));
				break;
			case 2:
				System.out.println("Ingrese la fecha del cargo de la persona " + (i + 1));
				fechaCargo = obtenerFecha();
				System.out.println("Ingrese el sueldo de la persona " + (i + 1) + ":");
				sueldo = entrada.nextFloat();
				System.out.println("Ingrese la carrera de la persona " + (i + 1));
				carrera = entrada.nextLine();
				
				persona = new Director(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo, carrera);
				break;
			case 3:
				System.out.println("Ingrese la fecha del cargo de la persona " + (i + 1));
				fechaCargo = obtenerFecha();
				System.out.println("Ingrese el sueldo de la persona " + (i + 1) + ":");
				sueldo = entrada.nextFloat();
					
				System.out.println("Ingrese cuantos cursos ingresara para la persona " + (i + 1) + ":");
				cantCursos = entrada.nextInt();
				
				persona = new Profesor(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo, agregarCursos(cantCursos));
				break;
			case 4:
				System.out.println("Ingrese la fecha del cargo de la persona " + (i + 1));
				fechaCargo = obtenerFecha();
				System.out.println("Ingrese el sueldo de la persona " + (i + 1) + ":");
				sueldo = entrada.nextFloat();
				
				persona = new Administrativo(nombre, apellido, documento, fechaNacimiento, fechaCargo, sueldo);
				break;
			default: break;
			}
			
			personas.add(persona);
		}
		
		entrada.close();
		
		listaPersonas.addAll(personas);
		listaPersonas.sort(new OrdenDocumento());

		
		System.out.println("Personas Ordenadas:");
		for (Persona persona : listaPersonas) {
			System.out.println();
			System.out.println(persona.indicarTipo());
			System.out.println(persona.toString());
		}
		
	}
	
	@SuppressWarnings("deprecation")
	private static Date obtenerFecha() {
		int anio = 0, mes = 0, dia = 0;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("Ingrese el anio:");
				anio = entrada.nextInt();
				break;
			} catch (Exception e) {
				System.err.println("Debe ingresar un dato valido: " + e.getMessage());
			}
		}
		
		while(true) {
			try {
				System.out.println("Ingrese el mes en numero (ej: 1 para enero, 12 para diciembre): ");
				mes = entrada.nextInt();
				if (mes < 1 || mes > 12) {
					throw new Exception("Los meses deben estar comprendidos entre 1 y 12.");
				}
				break;
			} catch (Exception e) {
				System.err.println("Debe ingresar un dato valido: " + e.getMessage());
			}
		}
		
		while(true) {
			try {
				System.out.println("Ingrese el dia: ");
				dia = entrada.nextInt();
				if (dia < 1) {
					throw new Exception("Los dias deben ser un numero positivo.");
				} else {
					if (mes == 2) {
						if (dia > 28) {
							throw new Exception("El mes 2 posee un maximo de 28 dias.");
						}
					} else if ((dia > 30) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
						throw new Exception("Los dias para estos meses deben estar comprendidos entre 1 y 30.");
					} else if (dia > 31) {
						throw new Exception("Los dias para estos meses deben estar comprendidos entre 1 y 31.");
					}
				}
				break;
			} catch (Exception e) {
				System.err.println("Debe ingresar un dato valido: " + e.getMessage());
			}
		}
		
		return new Date(anio - 1900, mes - 1, dia);
	}

	private static String[] agregarCursos(int cantidad){
		String[] cursos = new String[cantidad];
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < cursos.length; i++) {
			System.out.println("Ingrese curso " + (i + 1) + " de la persona " + (i + 1) + ":");
			cursos[i] = entrada.nextLine();
		}
		
		return cursos;
	}
}