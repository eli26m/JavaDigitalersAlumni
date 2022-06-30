import java.util.Scanner;

public class LaboratorioUnidad2_String {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una oracion:");
		String text01 = entrada.nextLine();
		System.out.println("Ingrese otra oracion:");
		String text02 = entrada.nextLine();
		
		entrada.close();
		
		System.out.println("\nOracion 1: " + text01);
		System.out.println("Oracion 2: " + text02);

		System.out.println("\nLas oraciones son iguales (usando ==)? -> " + (text01 == text02));
		/* 	
		 	En Java, los operadores relacionales comparan bit a bit
			y en los objetos se compara no el valor, sino la posición
			de memoria, por lo que si comparamos dos cadenas de texto
			introducidas por el teclado con el operador relación ==,
			nos devolverá false. Java nos entrega un método equals
			que solventa este problema.
		*/
		System.out.println("\nLas oraciones son iguales (usando equals)? -> " + text01.equalsIgnoreCase(text02));
		System.out.println("\nOracion 1 en mayusculas -> " + text01.toUpperCase());
		System.out.println("Oracion 2 en mayusculas -> " + text02.toUpperCase());
		System.out.println("\nOracion 1 en minusculas -> " + text01.toLowerCase());
		System.out.println("Oracion 2 en minusculas -> " + text02.toLowerCase());
		
		String primerLetra01 = text01.substring(0, 1).toUpperCase();
		String restoDeLetras01 = text01.substring(1).toLowerCase();
		System.out.println("\nPrimera letra de la oracion 1 en mayuscula -> " + primerLetra01 + restoDeLetras01);
	
		String primerLetra02 = text02.substring(0, 1).toUpperCase();
		String restoDeLetras02 = text02.substring(1).toLowerCase();
		System.out.println("Primera letra de la oracion 2 en mayuscula -> " + primerLetra02 + restoDeLetras02);
	
		System.out.println("\nOraciones unidas por una coma -> " + String.join(", ", text01, text02));
	}

}
