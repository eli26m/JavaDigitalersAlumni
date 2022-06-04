import java.util.Scanner;

public class LaboratiorioUnidad4_For_Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		char caracter, caracterAux = 'a';
		int mayor = 0;
		int acumulador;
		
		do {
			System.out.println("Indique la oracion a evaluar (No puede estar vacia):");
			texto = entrada.nextLine();
		} while (texto.isEmpty());
		
		entrada.close();
		
		caracter = texto.charAt(0);
		
		
		for (int i = 0; i < texto.length(); i++) {
			
			caracterAux = texto.charAt(i);
			acumulador = 0;
			
			if (caracterAux == ' ') {
				continue;
			}
			
			for (int j = i; j < texto.length(); j++) {
				
				if (caracterAux == texto.charAt(j)) {
				acumulador++;
				}
			}
		
			if (acumulador > mayor) {
				caracter = caracterAux;
				mayor = acumulador;
			}
			
		}
		
		System.out.println("\n" + texto);
		System.out.println("El caracter " + caracter + " se repite " + mayor + " veces.");

	}

}
