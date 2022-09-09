package com.utilidades;

public class Formato {

	public static String getFormato(long numProducto, int tipo) {
		String numProductoString = "";
		String formato = "";
		int contador = 0;
		
		switch(tipo) {
		case 1:
		case 2:
				for(int i = 0; i < numProductoString.length(); i++) {
					contador++;
				}
				if (contador < 10) {
					numProductoString = String.format(("%010d"), numProducto);
				}
				formato = numProductoString.substring(0,3) + "#" + numProductoString.substring(3, 4) + "#" + numProductoString.substring(4, 9) + "/" + numProductoString.substring(9, 10);
				break;
		case 3: 
				contador = 0;
				for(int i = 0; i < numProductoString.length(); i++) {
					contador++;
				}
				if (contador < 16) {
					numProductoString = String.format(("%016d"), numProducto);
				}
				formato = numProductoString.substring(0,4) + " " + numProductoString.substring(4, 8) + " " + numProductoString.substring(8, 12) + " " + numProductoString.substring(12, 16);
				break;
		default: break;
		}
		
		return formato;
	}
	
}
