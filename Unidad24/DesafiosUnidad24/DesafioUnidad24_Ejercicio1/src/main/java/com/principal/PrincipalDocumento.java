package com.principal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.entidades.Parametros;

public class PrincipalDocumento {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Set<Parametros<String, String>> documentos = new HashSet<>();

		while (true) {

			System.out.print("Indique el tipo de documento: ");
			String tipo = teclado.next().toUpperCase();
			System.out.print("Indique la descripcion del " + tipo + " : ");
			String descripcion = teclado.next();

			Parametros<String, String> documento = new Parametros<>(tipo, descripcion);
			boolean documentoAgregado = documentos.add(documento);

			System.out.println((documentoAgregado ? "Se" : "No se") + " agrego el documento: " + documento);

			System.out.print("Desea agregar mas documentos? (S/N): ");
			String continuar = teclado.next();
			if (continuar.equalsIgnoreCase("n")) {
				break;
			}

		}

		System.out.println();
		System.out.println("Lista de Documentos:");

		Iterator<Parametros<String, String>> iterador = documentos.iterator();

		while (iterador.hasNext()) {
			Parametros<String, String> documento = iterador.next();
			System.out.println(documento);
		}

		teclado.close();

	}
}