import java.util.Arrays;
import java.util.Scanner;

public class DesafioUnidad19_Ejercicio1 {

	public static void main(String[] args) {
		
		// ingreso de datos:
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de numeros que desea generar: ");
		int cantidad = entrada.nextInt();
		
		entrada.close();
		
		// generar numeros aleatorios:
		int numeros[] = new int[cantidad];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * ((cantidad + 1) - 1)) + 1; // numero aleatorio entre 0 y cantidad
		}

		System.out.println("Numeros: " + Arrays.toString(numeros) + "\n");

		// imprimir siguiendo la condicion pedida:
		for (int i = 0; i < numeros.length; i++) {
			
			if (((numeros[i] % 3) == 0)) {
				System.out.print("Fizz");
				if ((numeros[i] % 5) == 0) {
					System.out.print("Buzz");
				}
				System.out.println("");
			} else if ((numeros[i] % 5) == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(numeros[i]);
			}
			
		}
		
	}

}
