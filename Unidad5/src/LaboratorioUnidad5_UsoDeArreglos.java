import java.util.Scanner;
import java.util.Arrays;

public class LaboratorioUnidad5_UsoDeArreglos {

	public static void main(String[] args) {
		
		// INGRESO DE DATOS:
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Indique la cantidad de numeros aleatorios a generar:");
		int amountNum = entrada.nextInt();
		System.out.println("Indique el numero maximo a generar por cada aleatorio:");
		int numberMax = entrada.nextInt();
		
		entrada.close();
		
		// GENERAR NUMERO ALEATORIO:
		int randomNumbers[] = new int [amountNum];
		
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers [i] = (int) (Math.random()* numberMax) + 1;
		}
		
		// COMPROBAR SI SON PRIMOS:
		System.out.println("");
		for (int i = 0; i < randomNumbers.length; i++) {
			
			boolean isPrime = false;
			
			// el uno es neutro, y el dos es primo, lo tomamos como excepciones:
			if (randomNumbers[i] == 1) {
				System.out.println("El numero " + randomNumbers[i] + " es neutro.");
				continue;
			}
			
			if (randomNumbers[i] == 2) {
				System.out.println("El numero " + randomNumbers[i] + " es primo.");
				continue;
			}
			
			for (int j = 2; j < randomNumbers[i]; j++) {
				if (randomNumbers[i] % j == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
				
			if (isPrime) {
				System.out.println("El numero " + randomNumbers[i] + " es primo.");
			} else {
				System.out.println("El numero " + randomNumbers[i] + " no es primo.");
			}
				
		}
		
		System.out.println("\nNumeros generados:" + Arrays.toString(randomNumbers));

	}

}
