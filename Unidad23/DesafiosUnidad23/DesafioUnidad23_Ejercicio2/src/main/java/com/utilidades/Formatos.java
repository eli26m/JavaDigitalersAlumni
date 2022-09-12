package com.utilidades;

public class Formatos {
	
	public static String FORMATO_CUENTA;
	public static String FORMATO_CBU;
	public static String FORMATO_TC;
	public static String FORMATO_BANCO_SUCURSAL;
	public static String FORMATO_CODIGO_SEGURIDAD_TC;
	static {
		FORMATO_CUENTA = "###-#-#####/#";
		FORMATO_CBU = "######## ##############";
		FORMATO_TC = "#### #### #### ####";
		FORMATO_BANCO_SUCURSAL = "####";
		FORMATO_CODIGO_SEGURIDAD_TC = "###";
	}

	public static String getFormato(Integer numero, String tipo) {
		String formato = "";
		switch (tipo.toUpperCase()) {
		case "CC":
		case "CA":
			formato = getNumero(numero, FORMATO_CUENTA);
			break;
		case "CBU":
			formato = getNumero(numero, FORMATO_CBU);
			break;
		case "TC":
			formato = getNumero(numero, FORMATO_TC);
			break;
		case "BANCO":
		case "SUCURSAL":
			formato = getNumero(numero, FORMATO_BANCO_SUCURSAL);
			break;
		case "CS":
			formato = getNumero(numero, FORMATO_CODIGO_SEGURIDAD_TC);
			break;
		default:
			break;
		}
		return formato;
	}

	private static String getNumero(Integer numero, String formato) {
		int cantidadCeros = contarCaracteres(formato);
		String numeroCadena = String.format("%0" + cantidadCeros + "d", numero);
		String numeroFinal = "";
		int indiceNumeroCadena = 0;

		for (int i = 0; i < formato.length(); i++) {
			numeroFinal += formato.charAt(i);
			if (formato.charAt(i) == '#') {
				numeroFinal = numeroFinal.replace("#", String.valueOf(numeroCadena.charAt(indiceNumeroCadena)));
				indiceNumeroCadena++;
			}
		}

		return numeroFinal;
	}

	private static int contarCaracteres(String formato) {
		int cantidad = 0;
		for (int i = 0; i < formato.length(); i++) {
			if (formato.charAt(i) == '#') {
				cantidad++;
			}
		}
		return cantidad;
	}

}