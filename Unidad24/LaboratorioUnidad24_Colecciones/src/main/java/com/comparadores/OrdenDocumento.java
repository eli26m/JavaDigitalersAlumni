package com.comparadores;

import java.util.Comparator;

import com.entidades.Persona;

public class OrdenDocumento implements Comparator<Persona>{
	
	public int compare(Persona persona1, Persona persona2) {
		// como tenemos dos elementos debemos hacer un algoritmo un poco mas complejo
		int tipo = persona1.getDocumento().getTipoDocumento().toString().compareTo(persona2.getDocumento().getTipoDocumento().toString());

		// si los documentos son iguales compara los numeros de lo contrario ordenara primero por la cadena de caracter del tipo
		if (tipo == 0) {
			return persona1.getDocumento().getNroDocumento() - persona2.getDocumento().getNroDocumento();
		}

		return tipo;
	}
	
}
